import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] array = new double[20];
        double quit = 99999;

        System.out.println("Please enter twenty values:");
        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            double val = sc. nextDouble();
            if (val == quit) {
                break;
            }
            array[i] = val;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + ", ");
        }
    }
}