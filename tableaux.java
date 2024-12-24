import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Challenge 1:

        public static void inverse () {
            Scanner sc = new Scanner(System.in);

            System.out.println("Donner les 5 nombres entiers :");

            int[] nombres = new int[5];
            for (int i = 0; i < 5; i++) {
                nombres[i] = sc.nextInt();
            }

            System.out.println("Les nombres dans l'ordre inverse sont :");
            for (int i = 4; i >= 0; i--) {
                System.out.println(nombres[i]);
            }

            sc.close();
        }

        // Challenge 2:
        public static void decimale () {
            Scanner scanner = new Scanner(System.in);

            double[] tableau = new double[10];

            System.out.println("entrer 10 nombres decimaux:");
            for (int i = 0; i < 10; i++) {
                tableau[i] = scanner.nextDouble();
            }

            double somme = 0;
            for (int i = 0; i < 10; i++) {
                somme += tableau[i];
            }
            double moyenne = somme / 10;

            System.out.println("La somme des nombres est: " + somme);
            System.out.println("La moyenne des nombres est: " + moyenne);

            scanner.close();
        }
    }
}
