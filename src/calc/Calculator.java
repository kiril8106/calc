package calc;

import static java.lang.String.format;

public class Calculator {
    double add(double first, double second) {
        double result = first + second;
        System.out.println(format("%f +%f=%f", first, second, result));
        return result;
    }

}