package javaapplication23;

/**
 *
 * @author Sinaa
 */
public class First {
    public double digit = 1;
    public static double num = 2;
    private double x = 1;

    public double getDigit() {
        return digit;
    }

    public void setDigit(double digit) {
        this.digit = digit;
    }

    public static double getNum() {
        return num;
    }

    public static void setNum(double num) {
        First.num = num;
    }

    public First() {
        this(4);
    }
    public First(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    
    
   
    
}
