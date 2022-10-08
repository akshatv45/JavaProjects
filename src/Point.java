public class Point {
    int x;
    int y;
}
class Test{
    public static void main (String [] args) {
        Point P1 = new Point();
        P1.x = 10;
        P1.y = 20;
        Point P2 = P1;
        P2.x = 30;
        System.out.println(P1.x);
        System.out.println(P2.x);
    }
}
