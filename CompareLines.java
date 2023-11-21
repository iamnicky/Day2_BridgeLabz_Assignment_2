import java.util.Comparator;
import java.util.Scanner;

public class CompareLines{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter details of line 1:");
        System.out.print("x1: ");
        int l1X1 = sc.nextInt();
        System.out.print("y1: ");
        int l1Y1 = sc.nextInt();
        System.out.print("x2: ");
        int l1X2 = sc.nextInt();
        System.out.print("y2: ");
        int l1Y2 = sc.nextInt();

        System.out.println("Please enter details of line 2:");
        System.out.print("x1: ");
        int l2X1 = sc.nextInt();
        System.out.print("y1: ");
        int l2Y1 = sc.nextInt();
        System.out.print("x2: ");
        int l2X2 = sc.nextInt();
        System.out.print("y2: ");
        int l2Y2 = sc.nextInt();

        Double distance1 = calculateDistanceOfLine(l1X1, l1Y1, l1X2, l1Y2);
        Double distance2 = calculateDistanceOfLine(l2X1, l2Y1, l2X2, l2Y2);
        switch (distance1.compareTo(distance2)){
            case -1:
                System.out.println("Line 2 is greater");
            case 0:
                System.out.println("Lines are equal");
            case 1:
                System.out.println("Line 1 is greater");

        }
    }
    private static double calculateDistanceOfLine(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}
