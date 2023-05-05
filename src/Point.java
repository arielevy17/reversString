public class Point {
    public double x;
    public double y;

    public void print(Point p1){   // הדפסת ערכי הנקודה
        System.out.println(p1.x);
        System.out.println(p1.y);
    }

    public Point change(int newX, int newY){  ///שינוי ערך בנקודה
        Point newPoint= new Point();
        x = newX;
        y = newY;
        return newPoint;
    }

    public  double distanse(Point p1) {     //מרחק בין 2 נקודות
        double distance;
        return distance= Math.sqrt((Math.pow( x - p1.x,2)) + (Math.pow( y - p1.y,2)));
    }


    public  boolean equal(Point p1) {    //  בדיקה האם ערכי 2 נקודות זהים
       if (p1.x == x && p1.y == y) {
           return true;
       }
       else {
           return false;
       }
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x=3;
        p1.y=54;
        Point p2 = new Point();
        p2.x=4;
        p2.y=3;
        Point p3 = new Point();
        p3.x= 3;
        p3.y= 56;
        Point p4 = new Point();
        p4.x=222;
        p4.y = 222;


        /// ניסויים   :
        p1.change(222,222);
        p1.print(p1);
        System.out.println(p1.equal(p4));
        System.out.println(p1.distanse(p3));
        p3.print(p3);


    }
    }

