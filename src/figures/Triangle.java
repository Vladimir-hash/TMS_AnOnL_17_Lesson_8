package figures;

public class Triangle extends Figures{
    public Triangle(int firstSide, int secondSide, int thirdSide ) {
        super(firstSide, secondSide, thirdSide);
    }
    @Override
    public double perimentr() {
        return (this.firsSide + this.secondSide + this.thirdSide);
    }

    @Override
    public double square() {
        int demiRadius = (this.firsSide + this.secondSide + this.thirdSide) / 2;
        double result = Math.sqrt(demiRadius * (demiRadius - this.firsSide)
                * (demiRadius - this.secondSide ) * (demiRadius - this.thirdSide));
        return result;
    }
}
