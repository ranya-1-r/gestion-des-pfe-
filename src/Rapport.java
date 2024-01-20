public class Rapport implements livrable{
    private int nomrePage;
    private String langue;
    private String contenue;
    private String titre;
    public Rapport(int nomrePage, String langue, String contenue, String titre) {
        this.nomrePage = nomrePage;
        this.langue = langue;
        this.contenue = contenue;
        this.titre = titre;
    }
    public int getNomrePage() {
        return nomrePage;
    }
    public void setNomrePage(int nomrePage) {
        this.nomrePage = nomrePage;
    }
    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public String getContenue() {
        return contenue;
    }
    public void setContenue(String contenue) {
        this.contenue = contenue;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    @Override
    public void print() {
        System.out.println("le titre  "+this.titre);
        System.out.println("le contenue  "+this.contenue);
    }
}
