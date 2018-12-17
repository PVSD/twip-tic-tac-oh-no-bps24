package com.company;

/**
 * Created by bs482 on 12/17/18.
 */
public class board {

    public board()
    {}

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
        System.out.print(a);
    }

    public static void firstboard()
    {
        System.out.print(" 0 | 1 | 2 \n-----------\n 3 | 4 | 5 \n-----------\n 6 | 7 | 8 \n\n");
    }


}
