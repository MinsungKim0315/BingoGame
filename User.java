package bingoGame_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class User implements BingoBoard {
	
	static Scanner in = new Scanner(System.in);
	
	static String[][] User_board;
	static String word;
	
	static int board_con; //how many bingo boxes to insert things
	static int subject; //the number of the event
	static int exit = 1; //whether end the game or not
	static int bingocnt; //number of bingos
	static boolean user_bingo; //checking whether user made a bingo
	static boolean user_win = false; //checking whether the user won
	
	static List<String> coun_asia = Arrays.asList(Com.country_asia); 
	static List<String> coun_europe = Arrays.asList(Com.country_europe); 
	static List<String> snack = Arrays.asList(Com.snack); 
	static List<String> brand = Arrays.asList(Com.brand); 
	static List<String> singer = Arrays.asList(Com.singer); 
	
	static List<String> remove = new ArrayList<String>(); //deduplication
	
	
	public void setmap(int board_con, int subject) {
		setboard_con(board_con);
		setsubject(subject);
		User_board = user_mapin();
	}
	
	
	static void setboard_con(int board_con) {
		User.board_con = board_con;
	}
	
	
	static void setsubject(int subject) {
		User.subject = subject;
	}
	
	static String[][] user_mapin() {
		
		if(subject == 1)
		{
			System.out.println("＃list of asian country names#");
			for(int i=0; i < Com.country_asia.length; i++)
			{
				System.out.print(Com.country_asia[i] + "\t");
				if((i+1) % 5 == 0)
				{
					System.out.println();
				}
			}
		}
		else if(subject == 2)
		{
			System.out.println("＃list of European country names＃");
			for(int i=0; i < Com.country_europe.length; i++)
			{
				System.out.print(Com.country_europe[i] + "\t");
				if((i+1) % 5 == 0)
				{
					System.out.println();
				}
			}
		}
		else if(subject == 3)
		{
			System.out.println("＃list of names of snacks＃");
			for(int i=0; i < Com.snack.length; i++)
			{
				System.out.print(Com.snack[i] + "\t");
				if((i+1) % 5 == 0)
				{
					System.out.println();
				}
			}
		}
		else if(subject == 4)
		{
			System.out.println("＃list of names of brands＃");
			for(int i=0; i < Com.brand.length; i++)
			{
				System.out.print(Com.brand[i] + "\t");
				if((i+1) % 5 == 0)
				{
					System.out.println();
				}
			}
		}
		else if(subject == 5)
		{
			System.out.println("＃list of names of singers＃");
			for(int i=0; i < Com.singer.length; i++)
			{
				System.out.print(Com.singer[i] + "\t");
				if((i+1) % 5 == 0)
				{
					System.out.println();
				}
			}
		}
		System.out.println("\n");

		
		String[][] board = new String[board_con][board_con];
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				System.out.print("[ " + board[i][j] + " ]");
			}
			System.out.println();
		}
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				System.out.print("(" + (i + 1) + ", " + (j + 1) + ")" + " insert : ");
				String user_in = in.next();
				if(subject == 1)
				{
					if(coun_asia.contains(user_in) && !remove.contains(user_in))
					{
						remove.add(user_in);
						board[i][j] = user_in;
					}
					else
					{
						System.out.println("can't use it");
						j--;
					}
				}
				if(subject == 2)
				{
					if(coun_europe.contains(user_in) && !remove.contains(user_in))
					{
						remove.add(user_in);
						board[i][j] = user_in;
					}
					else
					{
						System.out.println("can't use it");
						j--;
					}
				}
				if(subject == 3)
				{
					if(snack.contains(user_in) && !remove.contains(user_in))
					{
						remove.add(user_in);
						board[i][j] = user_in;
					}
					else
					{
						System.out.println("cna't use it");
						j--;
					}
				}
				if(subject == 4)
				{
					if(brand.contains(user_in) && !remove.contains(user_in))
					{
						remove.add(user_in);
						board[i][j] = user_in;
					}
					else
					{
						System.out.println("can't use it");
						j--;
					}
				}
				if(subject == 5)
				{
					if(singer.contains(user_in) && !remove.contains(user_in))
					{
						remove.add(user_in);
						board[i][j] = user_in;
					}
					else
					{
						System.out.println("can't use it");
						j--;
					}
				}
			}
		}
		System.out.println("\n");
		return board;
	}
	

	static void user_mapview(String[][] board) {
		
		System.out.println("\n");
		if(board_con == 4)
		{
			System.out.println("\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■User's bingo board■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
		else if(board_con == 5)
		{
			System.out.println("\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■User's bingo board■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		}
		
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board.length; j++)
			{
				System.out.printf("\t[" + board[i][j] + "]      \t");
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
	
	static void user_word() {
		System.out.println();
		System.out.print("insert word : ");
		word = in.next();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("the word user inserted : " + word);
		
	}
	

	static void user_mapset(String[][] board)
	{
		if(subject == 1)
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board.length; j++)
				{
					if(board[i][j].equals(Com.coun_asia_rand) || board[i][j].equals(word))
					{
						board[i][j] = "X";
					}
					else if(word.equalsIgnoreCase("exit"))
					{
						exit = 0;
					}
				}
			}
		}
		else if(subject == 2)
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board.length; j++)
				{
					if(board[i][j].equals(Com.coun_europe_rand) || board[i][j].equals(word))
					{
						board[i][j] = "X";
					}
					else if(word.equalsIgnoreCase("exit"))
					{
						exit = 0;
					}
				}
			}
		}
		else if(subject == 3)
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board.length; j++)
				{
					if(board[i][j].equals(Com.snack_rand) || board[i][j].equals(word))
					{
						board[i][j] = "X";
					}
					else if(word.equalsIgnoreCase("exit"))
					{
						exit = 0;
					}
				}
			}
		}
		else if(subject == 4)
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board.length; j++)
				{
					if(board[i][j].equals(Com.brand_rand) || board[i][j].equals(word))
					{
						board[i][j] = "X";
					}
					else if(word.equalsIgnoreCase("exit"))
					{
						exit = 0;
					}
				}
			}
		}
		else if(subject == 5)
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board.length; j++)
				{
					if(board[i][j].equals(Com.singer_rand) || board[i][j].equals(word))
					{
						board[i][j] = "X";
					}
					else if(word.equalsIgnoreCase("exit"))
					{
						exit = 0;
					}
				}
			}
		}
		

		if(user_bingocheck(board) >= 3 && user_bingocheck(board) > Com.com_bingocheck(Com.Com_board))
		{
			user_win = true;
			User.exit = 0;
		}
	}
	

	static int user_bingocheck(String[][] board) {
		
		bingocnt = 0;
		
		for(int i = 0; i < board.length; i++)
		{
			int wcount = 0;
			int hcount = 0;
			for(int j = 0; j < board.length; j++)
			{
				if(board[i][j].equals("X"))
				{
					user_bingo = true;
					if(user_bingo == true)
					{
						wcount++;
					}
				}
				if(board[j][i].equals("X"))
				{
					user_bingo = true;
					if(user_bingo == true)
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
	
		int crosscnt = 0; //왼쪽 위에서 오른쪽 아래로 대각선
		int rcrosscnt = 0; //오른쪽 위에서 왼쪽 아래로 대각선
		
		for(int i = 0; i < board.length; i++)
		{
			
			if(board[i][i].equals("X"))
			{
				user_bingo = true;
				if(user_bingo == true)
				{
					crosscnt++;
				}
			}
			if(board[i][(board.length-1) - i].equals("X"))
			{
				user_bingo = true;
				if(user_bingo == true)
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