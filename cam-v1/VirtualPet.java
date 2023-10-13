/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    private int hunger = 0;   // how hungry the pet is.
    private int tiredness = 0;
    private int score = 0;
    
    
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
            score = score + 2;
            face.setMessage("He sinks it! The score is now " + score + ".");
            face.setImage("swish"); 
        } else {
            score = score + 0;
            face.setMessage("He missed! The score stays at " + score + ".");
            face.setImage("miss"); 
        }
    }

    public void godzillaShoot3(){
        face.setImage("gshoots");
        face.setMessage("He shoots!");
        takeABeat(2000);
        int shot = (int)(Math.random()*2)+1; //1 - 2
        if(shot == 1){
            score = score + 3;
            face.setMessage("He sinks a 3! The score is now " + score + ".");
            face.setImage("swish"); 
        } else {
            score = score + 0;
            face.setMessage("He missed! The score stays at " + score + ".");
            face.setImage("miss");
        }
    }

    public void dunk(){
        score = score + 2;
        face.setMessage("The score is now " + score + "!");
        face.setImage("dunk");
    }

    public void gdribble(){
        face.setImage("gdribble");
    }

    

} // end Virtual Pet
