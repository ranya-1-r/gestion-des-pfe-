import java.util.ArrayList;
public class Prof extends personne{
    private  int grad;
    private String cin;
   // private ArrayList<PFE>pfe=new ArrayList<PFE>();
    public Prof(String nom, String prenom, long tele, String e_mail,int grad,String cin) {
        super(nom, prenom, tele, e_mail);
        this.cin=cin;
        this.grad=grad;
    }
    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
