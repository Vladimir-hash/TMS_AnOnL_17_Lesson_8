import figures.Circle;
import figures.Figures;
import figures.Rectangle;
import figures.Triangle;

import java.lang.reflect.Array;


public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(7);
        System.out.println(circle1.perimentr());
        System.out.println(circle1.square());

        Circle circle2 = new Circle(10);
        System.out.println(circle2.perimentr());
        System.out.println(circle2.square());

        Triangle triangle = new Triangle(5,6,7);
        System.out.println(triangle.perimentr());
        System.out.println(triangle.square());

        Rectangle rectangle1 = new Rectangle(6,10);
        System.out.println(rectangle1.perimentr());
        System.out.println(rectangle1.square());

        Rectangle rectangle2 = new Rectangle(3,10);
        System.out.println(rectangle2.perimentr());
        System.out.println(rectangle2.square());

        Figures[] summ = {rectangle1,rectangle2,triangle,circle1, circle2};
        double sum = 0;
        for (Figures abuse : summ) {
            sum += abuse.perimentr();
        }
        System.out.println(sum);

    }
}