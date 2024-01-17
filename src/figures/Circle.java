package figures;

import static java.lang.Math.pow;

public class Circle extends Figures {
    public final static double pi = 3.14;

    public Circle (int radius) {
        super(radius);
    }

    @Override
    public double perimentr() {
        return (2 * pi * this.radius);
    }

    @Override
    public double square() {
        return(2 * pi * pow(this.radius, 2) );
    }
}
