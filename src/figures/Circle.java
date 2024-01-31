package figures;

import static java.lang.Math.pow;

public class Circle extends Figures {
    private double  radius;
    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public double perimentr() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public double square() {
        return(2 * Math.PI * pow(this.radius, 2) );
    }
}
