public class Point {

    // Attributes:
    private int x;
    private int y;

    // 2-parameter constructor:
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 1-parameter constructor:
    public Point(int num) {
        x = num;
        y = num;
    }

    // no parameter constructor:
    public Point() {
        x = 0;
        y = 0;
    }

    // Getter methods:
    public int getX() {return x;}
    public int getY() {return y;}

    // Setter methods:
    public void setX(int x) {this.x=x;}
    public void setY(int y) {this.y=y;}

    // Other methods:

    public String coordinate() {return "(" + x + ", " + y + ")";}

    public String quadrant() {

        if (x>0) {
            if (y>0) {
                return "I";
            } else if (y<0) {
                return "IV";
            }

            return "on an axis"; // if here, y must be zero
        } else if (x<0) {
            if (y>0) {
                return "II";
            } else if (y<0) {
                return "III";
            }

            return "on an axis"; // if here, y must be zero
        } else if (y!=0) { // if here, x must be zero
            return "on an axis";
        }

        return "origin"; // if here, x AND y must be zero
    }
}
