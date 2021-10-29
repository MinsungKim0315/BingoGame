package bingoGame_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Com implements BingoBoard {

	static Scanner in = new Scanner(System.in);
	
	static String[][] Com_board; //com's bingo board
	static String coun_asia_rand; //random pick from the list of Asian countries
	static String coun_europe_rand; //random pick from the list of European countries
	static String snack_rand; //random pick from the list of snacks
	static String brand_rand; //random pick from the list of brands
	static String singer_rand; //random pick from the list of group of singers
	
	static int board_con; 
	static int subject; 
	static int bingocnt; 
	static boolean com_bingo; 
	static boolean com_hide; 
	static boolean com_win = false; 
	
	static String[] country_asia = {
			"South Korea", "China", "Japan", "Vietnam", "Thailand",
			"Taiwan", "Philippines", "Sri Lanka", "Indonesia", "Nepal",
			"Ottoman", "Jordan", "Laos", "Lebanon", "India",
			"Siria", "Mongolia", "Maldive Islands", "Malaysia", "Iran",
			"irac", "Myanmar", "Kazakhstan", "catarrh", "Cambodia",
			"Bhutan", "Turkey", "Bahrain", "Pakistan", "North Korea"
	};
	
	static String[] country_europe = {
			"Greece", "Sweden", "Netherland", "Swiss", "Norway",
			"Slovakia", "Slovania", "Denmark", "Germany", "Iceland",
			"Russia", "Romania", "Ireland", "England", "Austria",
			"Ukraine", "Italy", "Czech Republic", "Croatia", "Protugal",
			"Bulgaria", "Estonia", "Belarus", "San Marino", "Serbia"
	};
	
	//과자
	static String[] snack = {
			"Saltines", "David Sunflower Seeds", "Raisinets", "welch's Fruit Snacks", "Mike and Ike",
			"Corn Nuts", "Popchips", "Newtons", "Trolli", "Donettes",
			"Better Cheddar", "Swiss Rolls", "Club Cracker", "Junior Mints", "Honey Maid Grahams",
			"Pez", "Cheese Balls", "Dove Promises", "Hostess Pies", "E.L. Fudge",
			"Nerds", "Rold Gold Pretzles", "Twizzlers", "Red Vines", "Mounds",
			"Fruit Roll Ups", "Oreo", "Cheetos", "Goldfish", "Pringles"
	};
	

	static String[] brand = {
			"Nike", "Louis Vuitton", "Hermes", "Gucci", "Zalando",
			"Adidas", "Tiffany & Co.", "Zara", "H&M", "Cartier",
			"Lululemon", "Moncler", "Chanel", "Rolex", "Patek Philippe",
			"Prada", "Uniqlo", "Chow Tai Fook", "Swarovski", "Burberry",
			"Polo Ralph Lauren", "Tom Ford", "The North Face", "Levi’s", "Victoria’s Secret",
			"New Balance", "Michael Kors", "Skechers", "Under Armour", "Dior"
	};
	

	static String[] singer = {
			"Freddie Mercury", "Michael Jackson", "Whitney Houston", "Adele", "BTS",
			"Stevie Wonder", "Elton John", "Ariana Grande", "Taylor Swift", "Lady Gaga",
			"Selena Gomez", "Ed Sheeran", "Justin Bieber", "Bruno Mars", "Katy Perry",
			"Frank Sinatra", "Kelly Clarkson", "Jay-Z", "Rihanna", "Paul McCartney",
			"Adam Levine", "Billie Eilish", "Bruce Springsteen", "Beyonce Knowles", "Marvin Gaye",
			"Black Pink", "Dua Lipa", "Shawn Mendes", "Harry Styles", "Camila Cabello"
	};
	

	public void setmap(int board_con, int subject) {
		setboard_con(board_con);
		setsubject(subject);
		Com_board = com_randin();
	}
	

	static void setboard_con(int board_con) {
		Com.board_con = board_con;
	}
	

	static void setsubject(int subject) {
		Com.subject = subject;
	}
	

	static String[][] com_randin() {
		
		String[][] board = new String[board_con][board_con];
		
		if(subject == 1)
		{
			


			Set<String> list = new HashSet<String>();
			for(int i = 0; i < board_con; i++)
			{
				for(int j = 0; j < board_con; j++)
				{
					int tmp = (int) (Math.random() * country_asia.length);
					
					while(list.contains(country_asia[tmp]))
					{
						tmp = (int) (Math.random() * country_asia.length);
					}
					board[i][j] = country_asia[tmp];
					list.add(country_asia[tmp]);
				}
			}
		}
		else if(subject == 2)
		{
			Set<String> list = new HashSet<String>();
			for(int i = 0; i < board_con; i++)
			{
				for(int j = 0; j < board_con; j++)
				{
					int tmp = (int) (Math.random() * country_europe.length);
					
					while(list.contains(country_europe[tmp]))
					{
						tmp = (int) (Math.random() * country_europe.length);
					}
					board[i][j] = country_europe[tmp];
					list.add(country_europe[tmp]);
				}
			}
		}
		else if(subject == 3)
		{
			
			Set<String> list = new HashSet<String>();
			for(int i = 0; i < board_con; i++)
			{
				for(int j = 0; j < board_con; j++)
				{
					int tmp = (int) (Math.random() * snack.length);
					
					while(list.contains(snack[tmp]))
					{
						tmp = (int) (Math.random() * snack.length);
					}
					board[i][j] = snack[tmp];
					list.add(snack[tmp]);
				}
			}
		}
		else if(subject == 4)
		{

			Set<String> list = new HashSet<String>();
			for(int i = 0; i < board_con; i++)
			{
				for(int j = 0; j < board_con; j++)
				{
					int tmp = (int) (Math.random() * brand.length);
					
					while(list.contains(brand[tmp]))
					{
						tmp = (int) (Math.random() * brand.length);
					}
					board[i][j] = brand[tmp];
					list.add(brand[tmp]);
				}
			}
		}
		else if(subject == 5)
		{
			Set<String> list = new HashSet<String>();
			for(int i = 0; i < board_con; i++)
			{
				for(int j = 0; j < board_con; j++)
				{
					int tmp = (int) (Math.random() * singer.length);
					
					while(list.contains(singer[tmp]))
					{
						tmp = (int) (Math.random() * singer.length);
					}
					board[i][j] = singer[tmp];
					list.add(singer[tmp]);
				}
			}
		}
		else
		{
			//
		}
		return board;
	}
	

	static void com_mapview(String[][] board)
	{
		String[][] hide = new String[board_con][board_con];
		if(board_con == 4)
		{
			System.out.println("\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■Com's bingo board■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
		else if(board_con == 5)
		{
			System.out.println("\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■Com's bingo board■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				hide[i][j] = " ";
				if(board[i][j].equals("X"))
				{
					com_hide = true;
					if(com_hide == true)
					{
						hide[i][j] = "X";
						System.out.printf("\t[" + hide[i][j] + "]      \t");
					}
				}
				else
				{
					System.out.printf("\t[" + hide[i][j] + "]      \t");
				}
			}
			System.out.println();
		}
		if(board_con == 4)
		{
			System.out.println("\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
		else if(board_con == 5)
		{
			System.out.println("\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
	}
	

	static void com_mapset(String[][] board)
	{
		for(int i = 0; i < board_con; i++)
		{
			for(int j = 0; j < board_con; j++)
			{
				
				int tmp_1 = (int) (Math.random() * board_con);
				int tmp_2 = (int) (Math.random() * board_con);
				
				if(subject == 1)
				{
					coun_asia_rand = board[tmp_1][tmp_2];
					if(coun_asia_rand.equals(User.word))
					{
						tmp_1 = (int) (Math.random() * board_con);
						tmp_2 = (int) (Math.random() * board_con);
						coun_asia_rand = board[tmp_1][tmp_2];
					}
					if(board[tmp_1][tmp_2].equals("X"))
					{
						j--;
					}
				}
				else if(subject == 2)
				{
					coun_europe_rand = board[tmp_1][tmp_2];
					if(coun_europe_rand.equals(User.word))
					{
						tmp_1 = (int) (Math.random() * board_con);
						tmp_2 = (int) (Math.random() * board_con);
						coun_europe_rand = board[tmp_1][tmp_2];
					}
					if(board[tmp_1][tmp_2].equals("X"))
					{
						j--;
					}
				}
				else if(subject == 3)
				{
					snack_rand = board[tmp_1][tmp_2];
					if(snack_rand.equals(User.word))
					{
						tmp_1 = (int) (Math.random() * board_con);
						tmp_2 = (int) (Math.random() * board_con);
						snack_rand = board[tmp_1][tmp_2];
					}
					if(board[tmp_1][tmp_2].equals("X"))
					{
						j--;
					}
				}
				else if(subject == 4)
				{
					brand_rand = board[tmp_1][tmp_2];
					if(brand_rand.equals(User.word))
					{
						tmp_1 = (int) (Math.random() * board_con);
						tmp_2 = (int) (Math.random() * board_con);
						brand_rand = board[tmp_1][tmp_2];
					}
					if(board[tmp_1][tmp_2].equals("X"))
					{
						j--;
					}
				}
				else if(subject == 5)
				{
					singer_rand = board[tmp_1][tmp_2];
					if(singer_rand.equals(User.word))
					{
						tmp_1 = (int) (Math.random() * board_con);
						tmp_2 = (int) (Math.random() * board_con);
						singer_rand = board[tmp_1][tmp_2];
					}
					if(board[tmp_1][tmp_2].equals("X"))
					{
						j--;
					}
				}
			}
		}
		
		if(subject == 1)
		{
			coun_asia_start(Com_board, coun_asia_rand);
		}
		else if(subject == 2)
		{
			coun_europe_start(board, coun_europe_rand);
		}
		else if(subject == 3)
		{
			snack_start(board, snack_rand);
		}
		else if(subject == 4)
		{
			brand_start(board, brand_rand);
		}
		else if(subject == 5)
		{
			singer_start(board, singer_rand);
		}
		
    //checking you is the winner
		if(com_bingocheck(board) >= 3 && Com.com_bingocheck(Com.Com_board) > User.user_bingocheck(User.User_board))
		{
			com_win = true;
			User.exit = 0;
		}
	}
	
	static void com_word() {
		System.out.println();
		System.out.print("the word the com inserted : ");
		if(subject == 1)
		{
			System.out.print(coun_asia_rand);
		}
		else if(subject == 2)
		{
			System.out.print(coun_europe_rand);
		}
		else if(subject == 3)
		{
			System.out.print(snack_rand);
		}
		else if(subject == 4)
		{
			System.out.print(brand_rand);
		}
		else if(subject == 5)
		{
			System.out.print(singer_rand);
		}
		System.out.println();
	}
	
	static String coun_asia_start(String[][] board, String coun_asia_rand) {
		
		for(int i = 0; i < board_con; i++)
		{
			for(int j = 0; j < board_con; j++)
			{
				if(board[i][j].equals(coun_asia_rand) || board[i][j].equals(User.word))
				{
					board[i][j] = "X";
				}
			}
		}
		System.out.println();
		return coun_asia_rand;
	}
	
	static String coun_europe_start(String[][] board, String coun_europe_rand) {
		
		for(int i = 0; i < board_con; i++)
		{
			for(int j = 0; j < board_con; j++)
			{
				if(board[i][j].equals(coun_europe_rand) || board[i][j].equals(User.word))
				{
					board[i][j] = "X";
				}
			}
		}
		System.out.println();
		return coun_europe_rand;
	}

	static String snack_start(String[][] board, String snack_rand) {
		
		for(int i = 0; i < board_con; i++)
		{
			for(int j = 0; j < board_con; j++)
			{
				if(board[i][j].equals(snack_rand) || board[i][j].equals(User.word))
				{
					board[i][j] = "X";
				}
			}
		}
		System.out.println();
		return snack_rand;
	}

	static String brand_start(String[][] board, String brand_rand) {
		
		for(int i = 0; i < board_con; i++)
		{
			for(int j = 0; j < board_con; j++)
			{
				if(board[i][j].equals(brand_rand) || board[i][j].equals(User.word))
				{
					board[i][j] = "X";
				}
			}
		}
		System.out.println();
		return brand_rand;
	}
	
	static String singer_start(String[][] board, String singer_rand) {
		
		for(int i = 0; i < board_con; i++)
		{
			for(int j = 0; j < board_con; j++)
			{
				if(board[i][j].equals(singer_rand) || board[i][j].equals(User.word))
				{
					board[i][j] = "X";
				}
			}
		}
		System.out.println();
		return singer_rand;
	}
	
	static int com_bingocheck(String[][] board) {

		bingocnt = 0;
		
		for(int i = 0; i < board.length; i++)
		{
			int wcount = 0;
			int hcount = 0;
			for(int j = 0; j < board.length; j++)
			{
				if(board[i][j].equals("X"))
				{
					com_bingo = true;
					if(com_bingo == true)
					{
						wcount++;
					}
				}
				if(board[j][i].equals("X"))
				{
					com_bingo = true;
					if(com_bingo == true)
					{
						hcount++;
					}
				}
			}
			if(wcount == board.length)
			{
				bingocnt++;
			}
			if(hcount == board.length)
			{
				bingocnt++;
			}
		}
	
		int crosscnt = 0; 
		int rcrosscnt = 0; 
		
		for(int i = 0; i < board.length; i++)
		{
			
			if(board[i][i].equals("X"))
			{
				com_bingo = true;
				if(com_bingo == true)
				{
					crosscnt++;
				}
			}
			if(board[i][(board.length-1) - i].equals("X"))
			{
				com_bingo = true;
				if(com_bingo == true)
				{
					rcrosscnt++;
				}
			}
		}
		if(crosscnt == board.length)
		{
			bingocnt++;
		}
		if(rcrosscnt == board.length)
		{
			bingocnt++;
		}
		
		return bingocnt;
	}
	
}