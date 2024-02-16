package fairy_tale_characters;


import world.*;

public class Robin extends PersonCharacter {

    public Robin(String name, Shoes shoes){
        super(name, shoes);
    }

    public void whatDidYouPutOn (){
        System.out.println(getName() + " натянул " + getShoes().getDescription());
    }
}
