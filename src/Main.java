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

                case 3:
                    System.out.println("entrez l' isnb du livre a modifié ");
                    String isnbmod = scan.nextLine();


                    System.out.println("qu'est ce que vous voulez modifier exactement  ");
                    System.out.println("entrez 1 pour modifier le titre ");
                    System.out.println("entrez 2 pour modifier l'auteur ");
                    System.out.println("entrez 3 pour modifier la disponibilité");

                    int choixmod = scan.nextInt();
                    scan.nextLine();

                   if(choixmod==1 || choixmod==2){
                       System.out.println("entrez la modification  :  ");
                       String nwtt = scan.nextLine();


                       library.modifierLivre(isnbmod,nwtt,choixmod);

                   }else{
                       System.out.println("entrez la modification  :  ");
                       boolean nwbool = scan.nextBoolean();

                       library.modifierLivre(isnbmod,nwbool,choixmod);

                   }


                    break;
                case 4 :
                    System.out.println("Rechercher   :  ");
                    String vall = scan.nextLine();
//aa
                    library.RechercherLivre(vall);



                    break;
                case 5 :
                    System.out.println("isbn a supprimé   :  ");
                    String supnbr = scan.nextLine();

                    library.SupprimerLivre(supnbr);
                    break;



                default:
                    System.out.println("choix indisponible");
                    break;


            }


        }while (choix!=0);




    }
}