package figures;

public class Triangle extends Figures{
    private double firsSide, secondSide, thirdSide;
    public Triangle(double firstSide, double secondSide, double thirdSide ) {
        this.firsSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    @Override
    public double perimentr() {
        return (this.firsSide + this.secondSide + this.thirdSide);
    }

    @Override
    public double square() {
        double demiRadius = (this.firsSide + this.secondSide + this.thirdSide) / 2;
        double result = Math.sqrt(demiRadius * (demiRadius - this.firsSide)
                * (demiRadius - this.secondSide ) * (demiRadius - this.thirdSide));
        return result;
    }
}
