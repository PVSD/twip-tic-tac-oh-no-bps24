package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        System.out.println("What version would you like to play\n" +
                "Enter 1: Player vs Player\n" +
                "Enter 2: Player vs Computer\n" +
                "Enter 3: Computer vs Player\n" +
                "Enter 4: Computer vs Computer");
        int version = kb.nextInt();

        char[] b={' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char a1='X';
        char a2='O';

        if(version==1) board.game1(b,a1,a2);





    }
}


