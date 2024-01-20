import java.time.LocalDate;
import java.util.ArrayList;

public class PFE {
    private Etudiant etudiant;
    private  String sujet;
    private LocalDate date;
    private String nomEntreprise;
    private double moyenne;
    private ArrayList<livrable> livrables;
    private Prof prof;
    private  Jury jury;

    public PFE(Etudiant etudiant, String sujet, String date, String nomEntreprise, double moyenne, ArrayList<livrable> livrables, Prof prof, Jury jury) {
        this.etudiant = etudiant;
        this.sujet = sujet;
        this.date = LocalDate.parse(date);
        this.nomEntreprise = nomEntreprise;
        this.moyenne = moyenne;
        this.livrables = livrables;
        this.prof = prof;
        this.jury = jury;
    }

    public PFE(Etudiant etudiant, String applicationDeGestionDePfe, LocalDate date, String atos, double moyenne, Prof livrables, ArrayList<livrable> prof1) {

    }


    public void printalllivrable(){
        for(livrable l:livrables){
            l.print();
        }
    }
    public void affecterjury(Jury jury){
        this.jury=jury;
    }


}


