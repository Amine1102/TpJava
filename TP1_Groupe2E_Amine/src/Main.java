import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        volume();
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le 1er entier : ");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le 2eme entier : ");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " et " + deuxiemeEntier + " est égale à " + somme);

    }
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le 1er nombre : ");
        float premierNb = scanner.nextInt();
        System.out.println("Veuillez saisir le 2eme nombre : ");
        float deuxiemeNb = scanner.nextInt();
        float result = premierNb / deuxiemeNb;
        System.out.println("La division de " + premierNb + " par " + deuxiemeNb + " est égale à " + result);
    }

    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Longueur : ");
        double longueur = scanner.nextDouble();

        System.out.println("Largeur : ");
        double largeur = scanner.nextDouble();

        System.out.println("Hauteur : ");
        double hauteur = scanner.nextDouble();

        double result = longueur * largeur * hauteur;

        System.out.println("Le volume de votre pavé droit est " + result);

    }

    public static void unTruc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
// On saisit ’11’
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation");
// Parce que le caractere newline n’a pas ete lu, c’est lui qui va se
// retrouver dans la variable operation
// Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();

    }
}