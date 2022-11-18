// taha burak sahin
//Write a program which reads two natural numbers, w and h, and then prints a rectangle with width w and height h

package task5;
public class practice4 { static void printRectangle(int h, int w) {
    for (int i = 0; i < h; i++)
    {
        System.out.println();
        for (int j = 0; j < w; j++)
        {
            if (i == 0 || i == h-1 ||
                    j== 0 || j == w-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }
}
    public static void main(String args[])
    {
        int h = 4, w = 5;
        printRectangle(h, w) ;
    }
}
