package com.elis.tris1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tris 
{
	static Scanner in;
	static String[] board;
	static String turno;

	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		board = new String[9];
		turno = "X";
		String vincitore = null;
		populateEmptyBoard();

		System.out.println("BENVENUTO NEL GIOCO DEL TRIS A 2 GIOCATORI");
		System.out.println("--------------------------------");
		printBoard();
		System.out.println("X gioca per primo. Inserire il numero dello slot dove posizionare la X:");

		while (vincitore == null) 
		{
			int numInput;
			
			try 
			{
				numInput = in.nextInt();
				
				if (!(numInput > 0 && numInput <= 9)) 
				{
					System.out.println("Inserimento errato; reinserire il numero dello slot:");
					continue;
				}
			} 
			
			catch (InputMismatchException e) 
			{
				System.out.println("Inserimento errato; reinserire il numero dello slot:");
				continue;
			}
			
			if (board[numInput-1].equals(String.valueOf(numInput))) {
				board[numInput-1] = turno;
				if (turno.equals("X")) {
					turno = "O";
				} else {
					turno = "X";
				}
				printBoard();
				vincitore = cercaVincitore();
			} else {
				System.out.println("Lo slot e' gia' occupato; reinserire il numero dello slot:");
				continue;
			}
		}
		
		if (vincitore.equalsIgnoreCase("patta")) 
		{
			System.out.println("E' patta! Grazie per aver giocato.");
		} 
		
		else 
		{
			System.out.println("Congratulazioni! " + vincitore + " hai vinto! Grazie per aver giocato.");
		}
	}

	static String cercaVincitore() 
	{
		for (int a = 0; a < 8; a++) 
		{
			String line = null;
			
			switch (a) 
			{
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			
			if (line.equals("XXX")) 
			{
				return "X";
			} 
			
			else if (line.equals("OOO")) 
			{
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) 
		{
			if (Arrays.asList(board).contains(String.valueOf(a+1))) 
			{
				break;
			}
			
			else if (a == 8) return "patta";
		}

		System.out.println("E' il turno di " + turno + ". Inserire il numero dello slot dove posizionare " + turno + ":");
		return null;
	}

	static void printBoard() 
	{
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	static void populateEmptyBoard() 
	{
		for (int a = 0; a < 9; a++) 
		{
			board[a] = String.valueOf(a+1);
		}
	}
}