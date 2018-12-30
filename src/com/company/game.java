package com.company;

public class game {

    private static void g1(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.playerMove(c, z1);
            if(board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins\n");
                return;
            }

            board.playerMove2(c, z2);
            if(board.check(c, z2))
            {
                System.out.println("\nPlayer 2 wins\n");
                return;
            }
        }
        board.playerMove(c, z1);
        if(board.check(c, z1)) System.out.print("\nPlayer 1 wins\n");
        else System.out.println("\nDraw\n");
    }

    public static void g2(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins\n");
                return;
            }
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer wins\n");
                return;
            }
        }

        board.playerMove(c, z1);
        if (board.check(c, z1)) System.out.print("\nPlayer 1 wins\n");
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
                System.out.println("\nComputer wins\n");
                return;
            }
            board.playerMove(c, z1);
            if (board.check(c, z1))
            {
                System.out.print("\nPlayer 1 wins\n");
                return;
            }
        }
        board.compmove(c,z1,z2);
        if(board.check(c,z2)) System.out.println("\nComputer wins\n");
        else System.out.println("\nDraw\n");
    }

    public static void g4(char [] c, char z1, char z2)
    {
        board.firstboard();
        for(int i=0; i<4;i++)
        {
            board.compmove(c,z1,z2);
            if(board.check(c,z2))
            {
                System.out.println("\nComputer 1 wins\n");
                return;
            }
            board.compmove(c, z2, z1);
            if (board.check(c, z1))
            {
                System.out.print("\nComputer 2 wins\n");
                return;
            }
        }
        board.compmove(c,z1,z2);
        if(board.check(c,z2)) System.out.println("\nComputer 1 wins\n");
        else System.out.println("\nDraw\n");
    }
}
