import java.util.ArrayList;

public class Jury {
    private ArrayList<Prof>jury;

    public Jury(ArrayList<Prof> jury){
        if(jury.size()>=3){
            this.jury=jury;
        }
    }

    public void afficheJury() {
        System.out.println("la jury :");
        for (int i = 0; i < jury.size(); i++) {
            System.out.println(jury.get(i));;


        }
    }
}
