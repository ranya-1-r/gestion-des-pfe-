public class CodeSource implements livrable{
    private String contenue;
    private String langageProgrammation;

    public CodeSource(String contenue, String langageProgrammation) {
        this.contenue = contenue;
        this.langageProgrammation = langageProgrammation;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public String getLangageProgrammation() {
        return langageProgrammation;
    }

    public void setLangageProgrammation(String langageProgrammation) {
        this.langageProgrammation = langageProgrammation;
    }

    @Override
    public void print() {
        System.out.println("la langage de programmation utilise est "+this.langageProgrammation);

    }
}
