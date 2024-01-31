package figures;

public class Rectangle extends Figures{
    private double firsSide, secondSide;
    public Rectangle(double firstSide, double secondSide) {
     this.firsSide = firstSide;
     this.secondSide= secondSide;
    }

    @Override
    public double perimentr() {
        return ((firsSide + secondSide)* 2);
    }
    @Override
    public double square() {
        return (firsSide * secondSide);
    }


}
