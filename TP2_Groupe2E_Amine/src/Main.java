import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quel exercice? Saisissez : ");
            System.out.println("1.  Discriminant");
            System.out.println("2.  Parité d'un nombre");
            System.out.println("3.  Calcul d'extremum");
            System.out.println("4.  Egalité d'une chaine de caractere");
            System.out.println("5.  Factorielle");
            System.out.println("6.  Compte à rebours");
            System.out.println("7.  Table de multiplication");
            System.out.println("8.  Division d'entiers");
            System.out.println("9.  Regle gradué");
            a = scanner.nextInt();
            switch (a){
                case 1:
                    discriminant();
                    break;
                case 2:
                    parite();
                    break;
                case 3 :
                    max();
                    break;
                case 4:
                    egaliteStr();
                    break;
                case 5:
                    factorielle();
                    break;
                case 6:
                    countdown();
                    break;
                case 7:
                    tableMultiplication();
                    break;
                case 8:
                    division();
                    break;
                case 9:
                    regle();
                    break;}
            }while (a <= 0 || a>9);

    }

    public static void discriminant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b,2) -4 * a * c);
        if (delta < 0){
            System.out.println("Ce polynome n'a pas de racine reelle");

        }
        else if (delta == 0){
            int xzero = -b / 2 * a;
            System.out.println("Ce polynome a une racine réelle : x0 = " + xzero);
        }
        else{
            float xun = (float) ((-b - Math.sqrt(delta))/ 2 * a);
            float xdeux = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("Ce polynome a 2 racines réelles : x1 = " + xun + " et x2 = " + xdeux);

        }

    }



    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier ");
        int res = scanner.nextInt();
        if(res%2 == 0 ){
            System.out.println(res + " est un nombre pair");
        }
        else{
            System.out.println(res + " est un nombre impair");
        }

    }

    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le 1er entier ");
        int a = scanner.nextInt();
        System.out.println("Saisissez le 2eme entier ");
        int b = scanner.nextInt();

        if (a-b > 0){
            int max = a;
            System.out.println(max + " est le plus grand entre " + a + " et " + b);
        }
        else {
            int max = b;
            System.out.println(max +  " est le plus grand entre " + a + " et " + b);
        }
    }

    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le 1er entier ");
        int a = scanner.nextInt();
        System.out.println("Saisissez le 2eme entier ");
        int b = scanner.nextInt();

        if (a-b > 0){
            int min = b;
            System.out.println(min + " est le plus petit entre " + a + " et " + b);
        }
        else {
            int min = a;
            System.out.println(min +  " est le plus petit entre " + a + " et " + b);
        }
    }

    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez la premiere chaine de caractere ");
        String a = scanner.nextLine();
        System.out.println("Saisissez la deuxieme chaine de caractere ");
        String b = scanner.nextLine();
        if (a.equals(b)){
            System.out.println("Les chaines de  caracteres sont les memes");
        }
        else {
            System.out.println("Les chaines de caracteres sont différentes");
        }
    }

    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ");
        int n = scanner.nextInt();
        int factorielle = 1;
        for(int i = 1; i<=n; i++){
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);

    }

    public static void countdown(){
        int count = 10;
        for(int i=0; i<=count; i++ ){
            System.out.println(count -i );
        }
        System.out.println("boum");
    }

    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ");
        int x = scanner.nextInt();
        int xcarre = x * x;
        System.out.println("X² = " + xcarre);

    }

    public static void tableMultiplication(){
        for(int i =1; i<=10; i++){
            for(int j=1; i<=10; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le numérateur : ");
        int num = scanner.nextInt();
        int denominateur = 0;
        do{
            System.out.println("Saisir un dénominateur non nul ");
            denominateur = scanner.nextInt();

        }while(denominateur ==0);
        int res = num / denominateur;
        System.out.println(num + " divisé par " + denominateur + " = " + res);
    }


    public  static void regle(){
        Scanner scanner = new Scanner(System.in);
       int longueur;
        do {
            System.out.println("Saisir une valeur entiere strictement positive");
            longueur = scanner.nextInt();
        }while (longueur <=0);
        String regle = "";
        for(int i = 1; i<= longueur; i++){
            String tiret = "-";
            regle = regle +tiret;
        }
        System.out.println( regle);
    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
    }
}

