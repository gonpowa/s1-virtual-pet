import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        VirtualPet p = new VirtualPet();
        p.exercise();
        takeABeat(1000);
        p.feed();
        takeABeat(4000);
        p.exercise();
        String ans = getResponse("How was your day?");
        System.out.println(ans);

        p.feed();

        p.exercise();

        p.dunk();
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
