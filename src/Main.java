import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Scanner scan = new Scanner(System.in);


        int choix;

        do {
            System.out.println("entrez 1 pour ajouter un livre");
            System.out.println("entrez 2 pour afficher les livres");
            System.out.println("entrez 3 pour modifier ");
            System.out.println("entrez 4 pour rechercher un livre");
            System.out.println("entrez 5 pour supprimer un livre ");
            System.out.println("entrez 6 pour la racine carre");
            System.out.println("entrez 7 pour la factorielle ");
            System.out.println("entrez 8 pour Quitter \n");


            choix = scan.nextInt();
            scan.nextLine();
            if (choix == 8) {
                System.out.println("au revoir");
                break;
            }


            switch (choix) {
                case 1:
                    System.out.println("entrez le isbn de livre");
                    String isbn = scan.nextLine();
                    System.out.println("entrez le titre de livre");
                    String titre = scan.nextLine();
                    System.out.println("entrez le nom d'auteur ");
                    String auteur = scan.nextLine();
                    System.out.println("livre disponible ou non ");
                    boolean isdispo = scan.nextBoolean();
                    library.AjouteLivre(new Livre(titre, auteur, isbn, isdispo));


                    break;
                case 2:
                    library.afficherLivre();
                    break;



                default:
                    System.out.println("choix indisponible");
                    break;
            }


        }while (choix!=0);




    }
}