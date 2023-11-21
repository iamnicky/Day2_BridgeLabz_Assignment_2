import java.util.Scanner;

public class LengthOfLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the x1 and y1 coordinate");
        int x1 =  sc.nextInt();
        int y1 =  sc.nextInt();
        System.out.println("Please enter the x2 and y2 coordinate");
        int x2 = sc.nextInt();
        int y2 =  sc.nextInt();

        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The distance between coordinates "+x1+","+y1+" and "+x2+","+y2+" is: "+distance);
    }
}
