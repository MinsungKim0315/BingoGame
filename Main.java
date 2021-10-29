package bingoGame_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	//main function
	public static void main(String[] args) {
		try {
			ready();
			start_end();
		}catch (InputMismatchException e) {
			System.out.println("insert only integer!!");
			System.out.println("restart program");
		}
	}


	static void ready() {
		BingoBoard set_user = new User();
		BingoBoard set_com = new Com();
		int board_con = count();
		if(board_con != 4 && board_con != 5)
		{
			System.out.println("insert only 4 or 5 !!");
			System.out.println("restart program");
			System.out.println("\n");
			ready();
		}
		else
		{
			System.out.println("\n");
			int subject = subject();
			if(subject != 1 && subject != 2 && subject != 3 && subject != 4 && subject != 5)
			{
				System.out.println("choose numbers on the list !!");
				System.out.println("restart program");
				System.out.println();
				ready();
			}
			else
			{
				set_user.setmap(board_con, subject);
				set_com.setmap(board_con, subject);
			}
		}

	}


	static void start_end() {

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("game start!");
		System.out.println();

		while(User.exit == 1)
		{
			Com.com_mapview(Com.Com_board); //showing com's bingo board
			User.user_mapview(User.User_board); //showing unser's bingo board
			User.user_word(); //insert user's number
			Com.com_mapset(Com.Com_board); //update com's number
			if(!User.word.equalsIgnoreCase("exit"))
			{
				Com.com_word(); //print com's list
			}
			User.user_mapset(User.User_board); //update user's number
		}

		if(User.exit == 0)
		{
			if(User.user_win == true && Com.com_win == true)
			{
				Com.com_mapview(Com.Com_board); 
				User.user_mapview(User.User_board); 
				Result.draw(); 
			}
			if(User.user_win == true)
			{
				Com.com_mapview(Com.Com_board); 
				User.user_mapview(User.User_board); 
				Result.user_result();
			}
			if(Com.com_win == true)
			{
				Com.com_mapview(Com.Com_board); 
				User.user_mapview(User.User_board); 
				Result.com_result();
			}
			if(User.word.equalsIgnoreCase("exit"))
			{
				System.out.println("exit program.");
			}
		}
	}

	static int count() {
		System.out.print("choose the size of the bingo board (ex : 4 or 5) : ");

		int board_con = in.nextInt();

		return board_con;
	}

	static int subject() {
		System.out.println("☆☆☆choose a event☆☆☆");
		System.out.println("choose the number of a event you want to play");
		System.out.println("(1) country name[Asia]   (2) country name[Europe]   (3) snacks   (4) brand   (5) singer");

		System.out.print("choose : ");
		int subject = in.nextInt();

		System.out.println();
		return subject;
	}

}