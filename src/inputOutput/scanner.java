package inputOutput;
import java.util.Scanner;
public class scanner {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//for int = nextInt, for float = nextFloat
        System.out.println(s);
    }
}
