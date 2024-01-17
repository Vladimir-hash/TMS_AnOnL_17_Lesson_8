package figures;

public class Rectangle extends Figures{
    public Rectangle(int firstSide, int secondSide) {
        super(firstSide, secondSide);
    }
    public double perimentr() {
        return ((firsSide + secondSide)* 2);
    }
    public double square() {
        return (firsSide * secondSide);
    }


}
