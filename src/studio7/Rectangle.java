public class Rectangle {

    private double height;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double initHeight, double initWidth) {
        height = initHeight;
        width = initWidth;
        area = height*width;
        perimeter = ((2*height) + (2*width));

    }

    public boolean isBigger(Rectangle r2) {
        if (area > r2.area) {
            return true;
        } else {
            return false;
    }
}
    public boolean isSquare() {
        if (height == width) {
            return true;
        } else {
            return false;
    }
} 

public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 5);
    Rectangle r2 = new Rectangle(2,3);
    System.out.println(r1.isSquare());
    System.out.println(r1.isBigger(r2));
}

}
