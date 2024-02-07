
/**
 * This program gets a double and returns the corresponding temp in celsius and 
 * fahrenheit it also takes a temp in C or F and converts it to the other(F to C and vis versa)
 * The program takes four total temps and compares them to eachother.
 * @author Katelyn Junker
 * @version 10/24/2022
 */
import java.util.Scanner;

public class Temperature {
    private double degree;
    private char scale;

    // 4 types of Overloaded Constructors

    public Temperature() {
        setDegree('C');
        setDegree(0.0);
    }

    public Temperature(double degree) {
        setDegree('C');
        setDegree(degree);
    }

    public Temperature(char scale) {
        setDegree(scale);
        setDegree(0.0);
    }

    public Temperature(double degree, char scale) {
        setDegree(scale);
        setDegree(degree);
    }

    /**
     * @return the degree
     */
    public double getDegreeInCelsius() {
        if (scale == 'C') {
            return degree;
        } else {
            return (degree - 32) * ((float) 5 / (float) 9);
        }
    }

    /**
     * @return the degree
     */
    public double getDegreeInFahrenheit() {
        if (scale == 'F') {
            return degree;
        } else {
            return (degree * 1.8) + 32;
        }
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(double degree) {
        this.degree = degree;
    }

    /**
     * @param scale the scale to set
     */
    public void setDegree(char scale) {
        this.scale = scale;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(double degree, char scale) {
        this.degree = degree;
        this.scale = scale;
    }

    public boolean equals(Temperature obj) {
        if (scale == 'C') {
            return obj.getDegreeInCelsius() == degree;
        } else {
            return obj.getDegreeInFahrenheit() == degree;
        }
    }

    public boolean isLessThan(Temperature obj) {
        if (scale == 'C') {
            return degree < obj.getDegreeInCelsius();
        } else {
            return degree < obj.getDegreeInFahrenheit();
        }
    }

    public boolean isGreaterThan(Temperature obj) {
        if (scale == 'C') {
            return degree > obj.getDegreeInCelsius();
        } else {
            return degree > obj.getDegreeInFahrenheit();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double degree;
        char scale;

        Temperature t1 = new Temperature();
        System.out.printf("The first Temperature has been created using the default constructor which sets\n");
        System.out.printf("the degree to a deafault vakue of %.1f and the scale to a default value of %c.\n",
            t1.getDegreeInCelsius(), 'C');
        System.out.printf("The first Temperature is %.2f C.\n", t1.getDegreeInCelsius());
        System.out.printf("The first Temperature is %.2f F.\n", t1.getDegreeInFahrenheit());
        System.out.printf("Set the degree (a number) and the scale (F or C) of the first Temperature.\n");
        System.out.printf("First set the degree: ");
        degree = sc.nextDouble();
        System.out.printf("Now set the scale: ");
        scale = sc.next().charAt(0);
        t1.setDegree(degree, scale);
        System.out.printf("Now the first Temperature is %.2f C.\n", t1.getDegreeInCelsius());
        System.out.printf("which is %.2f F.\n", t1.getDegreeInFahrenheit());

        System.out.println();

        System.out.printf("The second Temperature has been created using the constructor with a double argument.\n");
        System.out.printf("Which set degree to this argument and the scale to a default value of C.\n");
        System.out.printf("In my code, I passed 32 to the double argument. So\n");
        Temperature t2 = new Temperature(32);
        System.out.printf("The second Temperature is %.2f C.\n", t2.getDegreeInCelsius());
        System.out.printf("The second Temperature is %.2f F.\n", t2.getDegreeInFahrenheit());
        System.out.printf("Set the degree (a number) and the scale (F or C) of the first Temperature.\n");
        System.out.printf("First set the degree: ");
        degree = sc.nextDouble();
        System.out.printf("Now set the scale: ");
        scale = sc.next().charAt(0);
        t2.setDegree(degree, scale);
        System.out.printf("The second Temperature is %.2f C.\n", t2.getDegreeInCelsius());
        System.out.printf("The second Temperature is %.2f F.\n", t2.getDegreeInFahrenheit());

        System.out.println();

        System.out.printf("The third Temperature has been created using the constructor which sets\n");
        System.out.printf("the degree to a default value of 0.0 and the scale to the argument.\n");
        System.out.printf("I passed F to the argument. So\n");
        Temperature t3 = new Temperature('F');
        System.out.printf("The third Temperature is %.2f F.\n", t3.getDegreeInFahrenheit());
        System.out.printf("which is %.2f C.\n", t3.getDegreeInCelsius());
        System.out.printf("Set the degree (a number) and the scale (F or C) of the first Temperature.\n");
        System.out.printf("First set the degree: ");
        degree = sc.nextDouble();
        System.out.printf("Now set the scale: ");
        scale = sc.next().charAt(0);
        t3.setDegree(degree, scale);
        System.out.printf("The third Temperature is %.2f C.\n", t3.getDegreeInCelsius());
        System.out.printf("which is %.2f F.\n", t3.getDegreeInFahrenheit());

        System.out.println();

        System.out.printf("The fourth Temperature has been created using the constructor which sets\n");
        System.out.printf("the degree to double argument and the scale to char argument.\n");
        System.out.printf("I passed 98.6 and 'F' to the arguments. So\n");
        Temperature t4 = new Temperature(98.6, 'F');
        System.out.printf("The fourth Temperature is %.2f C.\n", t4.getDegreeInCelsius());
        System.out.printf("The fourth Temperature is %.2f F.\n", t4.getDegreeInFahrenheit());
        System.out.printf("Set the degree (a number) and the scale (F or C) of the first Temperature.\n");
        System.out.printf("First set the degree: ");
        degree = sc.nextDouble();
        System.out.printf("Now set the scale: ");
        scale = sc.next().charAt(0);
        t4.setDegree(degree, scale);
        System.out.printf("The fourth Temperature is %.2f C.\n", t4.getDegreeInCelsius());
        System.out.printf("which is %.2f F.\n", t4.getDegreeInFahrenheit());

        System.out.println();

        System.out.println("In order of creation the Temperatures in Celsius are: ");
        System.out.printf("%.2f", t1.getDegreeInCelsius());
        System.out.printf(", %.2f", t2.getDegreeInCelsius());
        System.out.printf(", %.2f", t3.getDegreeInCelsius());
        System.out.printf(", %.2f\n", t4.getDegreeInCelsius());

        System.out.println();

        System.out.println("In order of creation the Temperatures in Fahrenheit are: ");
        System.out.printf("%.2f", t1.getDegreeInFahrenheit());
        System.out.printf(", %.2f", t2.getDegreeInFahrenheit());
        System.out.printf(", %.2f", t3.getDegreeInFahrenheit());
        System.out.printf(", %.2f\n", t4.getDegreeInFahrenheit());

        Temperature t[] = { t1, t2, t3, t4 };
        String names[] = { "first", "second", "third", "fourth" };

        for (int i = 0; i < t.length; i++) {
            System.out.println();
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].equals(t[j])) {
                    System.out.printf("The %s Temperature is equal to the %s\n", names[i], names[j]);
                } else {
                    System.out.printf("The %s Temperature is not equal to the %s\n", names[i], names[j]);
                }

                if (t[i].isLessThan(t[j])) {
                    System.out.printf("The %s Temperature is less than the %s\n", names[i], names[j]);
                } else {
                    System.out.printf("The %s Temperature is not less than the %s\n", names[i], names[j]);
                }

                if (t[i].isGreaterThan(t[j])) {
                    System.out.printf("The %s Temperature is greater than the %s\n", names[i], names[j]);
                } else {
                    System.out.printf("The %s Temperature is not greater than the %s\n", names[i], names[j]);
                }
                System.out.println();
            }
        }
    }

}

