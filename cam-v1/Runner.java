import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        VirtualPet p = new VirtualPet();
        JOptionPane.showMessageDialog(new JFrame(), "Godzilla and Charles Barkley and playing each other in a basketball 1v1. Godzilla starts with the ball.");
        p.gdribble();
        takeABeat(2000);
        p.godzillaShoot3();
        p.face.setImage("Barkley has the ball.");
        takeABeat(1);
        p.bdribble();
        takeABeat(2999);
        p.face.setMessage("Barkey dribbles past Godzilla, he sees the net.");
        takeABeat(4000);
        p.Barkleyscores();
        takeABeat(3000);
        // String ans = getResponse("How was your day?");
        // System.out.println(ans);
    }

    public String getResponse(String q) {
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            "Your Message",
            "Your Title",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public void takeABeat(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }  catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new Runner();
        // VirtualPet p = new VirtualPet();
        // p.exercise();
    }
}
