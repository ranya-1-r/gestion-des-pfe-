import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("El Hamdaoui","Ranya",50640922,"ranyaelhamdaoui19@gmail.com","H136373866","IDDL");
        Etudiant etudiant2 = new Etudiant("hamouchi ","wissl",65467868,"wissl@gmail.com","H789476321","IDDL");

        //Les profs
        Prof prof1 = new Prof("Fahim","Mohamed",612354897,"prof1@gmail.com",1000000000,"PH");
        Prof prof3 = new Prof("Bahi","Salim",687543219,"prof3@gmail.com",4,"PES");
        Prof prof4 = new Prof("BahiL","Salima",687578219,"prof4@gmail.com",5,"PH");
        Prof prof5 = new Prof("Nafili","Karima",986524567,"prof5@gmail.com",6,"PES");

        //Le jury
        ArrayList<Prof> membreDeJury = new ArrayList<>();
        membreDeJury.add(prof1);
        membreDeJury.add(prof4);
        membreDeJury.add(prof3);

        Jury jury1 = new Jury(membreDeJury);
        Jury jury2 = new Jury(new ArrayList<>(Arrays.asList(prof1,prof5,prof4)));

        //Les livrable1
        Rapport rapport1 = new Rapport(65,"Français","insert text here","Rapport de stage de l'Application de gestion des PFE");
        CodeSource codeSource1 = new CodeSource("text","java");

        ArrayList<livrable> livrable1 = new ArrayList<>();
        livrable1.add(rapport1);
        livrable1.add(codeSource1);

        Rapport rapport2 = new Rapport(50,"English","insert text here","Rapport stage de l'Application des gestions de banque");
        CodeSource codeSource2 = new CodeSource("text", "PHP");

        //Les pfe
        PFE pfe1 = new PFE(etudiant1,"Gestion pfe", LocalDate.of(2023,12,03),"Bruh.inc",15.5,prof1,livrable1);
        pfe1.affecterjury(jury1);
        PFE pfe2 = new PFE(etudiant2,"Gestion banque", LocalDate.of(2023,12,04),"Bruh2.inc",15.5,prof3, new ArrayList<>(Arrays.asList(rapport2,codeSource2)));
        pfe2.affecterjury(jury2);

        //Affichage de toutes les infos
        //affichage les info d'etudiant 1 /ses pfe /membre de jury
        System.out.println(""+pfe1);
        System.out.println("########################################");
        jury1.afficheJury();
        System.out.println("############### Livrable ###############");
        pfe1.printalllivrable();
        System.out.println("//////////////////////////////////////////");

        //affichage les info d'etudiant 2 /ses pfe /membre de jury

        System.out.println(""+pfe2);
        System.out.println("########################################");
        jury2.afficheJury();
        System.out.println("############### Livrable ###############");
        pfe2.printalllivrable();
    }
}
