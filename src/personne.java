public class personne {
    private String nom;
    private String prenom;
    private long tele;
    private String E_mail;

    public personne(String nom, String prenom, long tele, String e_mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
        E_mail = e_mail;
    }
    public boolean equals(Object object1,Object object2){
        if(object1.getClass()==object2.getClass()){
            personne p1=(personne) object1;
            personne p2=(personne) object2;
            return p1.nom .equals(p2.nom)&& p1.prenom.equals(p2.prenom)&& p1.tele== p2.tele&& p1.E_mail.equals(p2.E_mail);
        }else {
            return false;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public long getTele() {
        return tele;
    }

    public void setTele(long tele) {
        this.tele = tele;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }


}
