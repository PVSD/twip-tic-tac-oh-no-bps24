package com.company;

public class game {

    public static void g1(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.playerMove(c, z1);
            if(board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins");
                return;
            }

            board.playerMove(c, z2);
            if(board.check(c, z2))
            {
                System.out.println("\nPlayer 2 wins");
                return;
            }
        }
        board.playerMove(c, z1);
        if(board.check(c, z1)) System.out.print("\nPlayer 1 wins");
        else System.out.println("\nDraw");
    }

    public static void g2(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins");
                return;
            }
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer wins");
                return;
            }
        }

        board.playerMove(c, z1);
        if (board.check(c, z1)) System.out.print("\nPlayer 1 wins");
        else System.out.println("\nDraw");
    }

    public static void g3(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer wins");
                return;
            }
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins");
                return;
            }
        }
        board.compmove(c,z1,z2);
        if(board.check(c,z2)) System.out.println("\nComputer wins");
        else System.out.println("\nDraw");
    }
}
