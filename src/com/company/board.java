package com.company;

import java.util.Scanner;

/**
 * Created by bs482 on 12/17/18.
 */
public class board {

    public board()
    {}

    public static int a;

    public static void makeBoard(char b[])
    {
        String a = "";
        for (int j = 0; j < 3; j++)
        {
            for(int k=0; k<3; k++)
            {
                a+=" ";
                a+=b[3*j+k];
                a+=" ";
                if(k==2) break;
                a+="|";
            }
            if(j!=2) a+="\n-----------\n";
        }
        System.out.print(a+"\n");
    }

    public static void firstboard()
    {
        System.out.print(" 0 | 1 | 2 \n-----------\n 3 | 4 | 5 \n-----------\n 6 | 7 | 8 \n\n");
    }

    public static void playerMove(char [] c, char z)
    {
        Scanner kb = new Scanner(System.in);

        while(true)
        {
            System.out.println("\nPlayer 1 enter a number");
            a=kb.nextInt();

            if(c[a]==' ')
            {
                c[a]=z;
                board.makeBoard(c);
                break;
            }
            else System.out.println("Enter an open region.");
        }
    }

    public static boolean check (char [] c, char z)
    {
        if (c[0] == z && c[3] == z && c[6] == z
                ||c[1] == z && c[4] == z && c[7] == z
                ||c[2] == z && c[5] == z && c[8] == z
                ||c[0] == z && c[1] == z && c[2] == z
                ||c[3] == z && c[4] == z && c[5] == z
                ||c[6] == z && c[7] == z && c[8] == z
                ||c[0] == z && c[4] == z && c[8] == z
                ||c[2] == z && c[4] == z && c[6] == z)
            return true;
        else return false;
    }

    public static void game1(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<5;i++)
        {
            board.playerMove(c, z1);
            if(board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins");
                break;
            }

            board.playerMove(c, z2);
            if(board.check(c, z2))
            {
                System.out.println("\nPlayer 2 wins");
                break;
            }
        }
    }

    public static void game2(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<5;i++)
        {
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {

                System.out.print("\nPlayer 1 wins");
                break;
            }
            board.compmove2(c,z1,z2);
        }

    }

    public static void compmove2(char[]c, char z1, char z2)
    {
        if(c[])
    }

}
