// taha burak sahin
//Write a program which finds the greatest common divisor (GCD) of two numbers
//read from the user.
package task5;
public class practice2 { public static int euclid(int x, int y) {
    if (x == 0 || y == 0) {
        return 1;
    }
    if (x < y) {
        int t = x;
        x = y;
        y = t;
    }
    if (x % y == 0) {
        return y;
    } else {
        return euclid(y, x % y);
    }
}

    public static void main(String[] args) {
        System.out.println("result: " + euclid(48, 24));
        System.out.println("result: " + euclid(125463, 9658));
    }
}
