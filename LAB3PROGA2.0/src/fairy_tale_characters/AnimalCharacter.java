package fairy_tale_characters;

import actions.*;
import world.*;


public abstract class AnimalCharacter extends Character implements Moving, Singing {
    private String whatOnFace;
    private boolean ready;
    public AnimalCharacter(String name){
        super(name);
    }

    public boolean getReady(){return ready;}
    public String getWhatOnFace(){return  whatOnFace;}

    public void setReady(boolean ready){this.ready = ready;}
    public void setWhatOnFace(String whatOnFace){this.whatOnFace = whatOnFace;}

    public abstract void understand(Reason reason);
    public abstract void see(Shoes shoes);
    public abstract void thinkAbout(Reason reason);
}
