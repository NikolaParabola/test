import java.util.*;

public class BMI {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj swoja wage w kg: ");
        double waga = in.nextDouble();

        System.out.print("Podaj swoj wzrost w m: ");
        double wzrost = in.nextDouble();


        double BMI = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI wynosi: " + BMI + ".");

    }
}


