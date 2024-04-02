public class CommonStringMethods {

    public static void main(String[] args) {

        //startWith and endWith methods

        String [] words = {"Funk", "Chunk", "Furry", "becanotor"};

        //startsWith method
        for (String theWord: words ){
            if (theWord.toLowerCase().startsWith("fu"))
            System.out.println(theWord+ " Starts with fu");
        }

        //endsWith Method
        for (String theWord : words) {
            if (theWord.toLowerCase().endsWith("nk"))
            System.out.println(theWord + " Ends with the suffic 'nk', ");
        }
        
    }
}
