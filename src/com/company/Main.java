package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What version would you like to play\n" +
                "Enter 1: Player vs Player\n" +
                "Enter 2: Player vs Computer\n" +
                "Enter 3: Computer vs Computer");
        int version = kb.nextInt();

        char[] b={' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};


        board.firstboard();

        while(true)
        {
            System.out.println("Player 1 enter a number");
            if(b[kb.nextInt()]==' ');
            {
                
            }
            board.makeBoard(b);

        }



    }
}


