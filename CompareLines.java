import java.util.Comparator;
import java.util.Scanner;

public class CompareLines{

    static class Line{
        private Point point1;
        private Point point2;

        private static double calculateDistanceOfLine(Point point1, Point point2){
            return Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
        }

        public Line(Point point1, Point point2) {
            this.point1 = point1;
            this.point2 = point2;
        }

        public Point getPoint1() {
            return point1;
        }

        public void setPoint1(Point point1) {
            this.point1 = point1;
        }

        public Point getPoint2() {
            return point2;
        }

        public void setPoint2(Point point2) {
            this.point2 = point2;
        }
    }

    static class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
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
        Line line1 = new Line(new Point(l1X1,l1Y1),new Point(l1X2,l1Y2));

        System.out.println("Please enter details of line 2:");
        System.out.print("x1: ");
        int l2X1 = sc.nextInt();
        System.out.print("y1: ");
        int l2Y1 = sc.nextInt();
        System.out.print("x2: ");
        int l2X2 = sc.nextInt();
        System.out.print("y2: ");
        int l2Y2 = sc.nextInt();
        Line line2 = new Line(new Point(l2X1,l2Y1),new Point(l2X2,l2Y2));

        Double distance1 = Line.calculateDistanceOfLine(line1.point1,line1.point2);
        Double distance2 = Line.calculateDistanceOfLine(line2.point1, line2.point2);
        switch (distance1.compareTo(distance2)){
            case -1:
                System.out.println("Line 2 is greater");
            case 0:
                System.out.println("Lines are equal");
            case 1:
                System.out.println("Line 1 is greater");

        }
    }

}
