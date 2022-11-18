//taha burak sahin
//Write a program which reads an odd natural number n and writes on the console
//a symmetric ‘kite’ consisting of asterisks

package task5;
public class practice3
{ public static void printStars ( int n)
{
    int i, j;
    for (i = 0; i < n; i++) {

        for (j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main (String args[])
    {
        int n = 5;
        printStars(n);
    }
}
