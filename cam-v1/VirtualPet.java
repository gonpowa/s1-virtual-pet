/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    public VirtualPetFace face;
    private int hunger = 0;   // how hungry the pet is.
    private int tiredness = 0;
    private int Gscore = 0;
    private int Bscore = 0;
    
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
    }
    
    public void takeABeat(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }  catch(Exception e){

        }
    }

    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
        if (tiredness < 4){
            face.setMessage("need water");
            face.setImage("ecstatic");
        }
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void godzillaShoot2(){
        face.setImage("gshoots");
        face.setMessage("He shoots!");
        takeABeat(2000);
        int shot = (int)(Math.random()*3)+1; //1 - 3
        if(shot == 1 || shot == 2) {
            Gscore = Gscore + 2;
            face.setMessage("He sinks it! Godzilla's score is now " + Gscore + ".");
            face.setImage("swish"); 
        } else {
            Gscore = Gscore + 0;
            face.setMessage("He missed! Godzilla's score stays at " + Gscore + ".");
            face.setImage("miss"); 
        }
    }

    public void godzillaShoot3(){
        face.setImage("gshoots");
        face.setMessage("He shoots!");
        takeABeat(2000);
        int shot = (int)(Math.random()*2)+1; //1 - 2
        if(shot == 1){
            Gscore = Gscore + 3;
            face.setMessage("He sinks a 3! Godzilla's score is now " + Gscore + ".");
            face.setImage("swish"); 
        } else {
            Gscore = Gscore + 0;
            face.setMessage("He missed! Godzilla's score stays at " + Gscore + ".");
            face.setImage("miss");
        }
    }

    public void BarkleyShoot2(){
        face.setImage("bshoot");
        face.setMessage("He shoots!");
        takeABeat(2000);
        int shot = (int)(Math.random()*3)+1; //1 - 3
        if(shot == 1 || shot == 2) {
            Bscore = Bscore + 2;
            face.setMessage("He sinks it! Barkley's score is now " + Bscore + ".");
            face.setImage("swish"); 
        } else {
            Bscore = Bscore + 0;
            face.setMessage("He missed! Barkley's score stays at " + Bscore + ".");
            face.setImage("miss"); 
        }
    }

    public void BarkleyShoot3(){
        face.setImage("bshoot");
        face.setMessage("He shoots!");
        takeABeat(2000);
        int shot = (int)(Math.random()*2)+1; //1 - 2
        if(shot == 1){
            Bscore = Bscore + 3;
            face.setMessage("He sinks a 3! Barkley's score is now " + Bscore + ".");
            face.setImage("swish"); 
        } else {
            Bscore = Bscore + 0;
            face.setMessage("He missed! Barkley's score stays at " + Bscore + ".");
            face.setImage("miss");
        }
    }

    public void BarkleyDunk(){
        face.setImage("bdunk");
        face.setMessage("WHAT A DUNK BY BARKLEY!!");
        Bscore = Bscore +1;
        takeABeat(3000);
    }

    public void Barkleyscores(){
        String ans = getResponse("Do you want Barkley to SHOOT or DUNK? type '1' for SHOOT or '2' for DUNK");
        if (ans == "1") {
            BarkleyShoot3();
        } else {
            BarkleyDunk();
        }
    }

    // public void dunk(){
    //     score = score + 2;
    //     face.setMessage("The score is now " + score + "!");
    //     face.setImage("dunk");
    // }

    public void gdribble(){
        face.setImage("gdribble");
    }

    public void bdribble(){
        face.setImage("bdribbles");
    }

    public String getResponse(String q) {
        JOptionPane.showMessageDialog(new JFrame(), q);
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            "Your Message",
            "Your Title",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }
    

} // end Virtual Pet
