package world;

public  class LastString {
    private static boolean correct;

    public static String setCorrect(boolean correct){
        LastString.correct = correct;
        if (!correct){
            return "последняя строчка будет неправильной";
        }
        else{
            return "последняя строчка будет правильной";
        }
    }
    public static boolean getCorrect(){
        return correct;
    }


    public  static String desription (){
       if (getCorrect()) return " последняя строчка будет правильной, ";
       return " последняя строчка будет неправильной, ";
    }
}