public class Runner {
    public Runner(){
        VirtualPet p = new VirtualPet();
        p.exercise();
        p.feed();
        
        try {
            Thread.sleep(1000);
        } catch(Exception e) {

        }

        p.feed();

        p.exercise();
    }

    public void takeABeat(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }  catch(Exception e){
            
        }
    }

    public static void main(String[] args) {
        VirtualPet p = new VirtualPet();
        p.exercise();
    }
}
