package inputOutput;

public class format {
    public static void main(String [] args) {
        int x = 100, y = 200;
        System.out.format("Value of x is %d\n", x); //%d is a place holder for int
        float z = (float) Math.PI;
        System.out.println(y);
        System.out.format("%.2f\n",z);
        System.out.format("%5.2f\n",z); //leading spaces if extra characters can be present
        System.out.format("%05.2f\n",z); //fill the leading spaces with 0
        System.out.printf("x = %d, y = %d",x,y);
    }
}
