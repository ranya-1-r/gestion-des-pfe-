import java.util.ArrayList;

public class Etudiant extends personne{
    private String cne;
    private String filiere;
    private ArrayList<PFE>pfe=new ArrayList<PFE>();
    public Etudiant(String nom, String prenom, long tele, String e_mail,String cne,String filiere) {
        super(nom, prenom, tele, e_mail);
        this.cne=cne;
        this.filiere=filiere;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public ArrayList<PFE> getPfe() {
        return pfe;
    }

    public void setPfe(ArrayList<PFE> pfe) {
        this.pfe = pfe;
    }
}
