import java.net.Socket;

import javax.sound.midi.Soundbank;

public class CommonStringMethods {

    public static void main(String[] args) {
        // startsWithMethod();
        findCharacters();

    }

    static void startsWithMethod() {
        // startWith and endWith methods

        String[] words = { "Funk", "Chunk", "Furry", "becanotor" };

        // startsWith method
        for (String theWord : words) {
            if (theWord.toLowerCase().startsWith("fu"))
                System.out.println(theWord + " Starts with fu");
        }

        // endsWith Method
        for (String theWord : words) {
            if (theWord.toLowerCase().endsWith("nk"))
                System.out.println(theWord + " Ends with the suffic 'nk', ");
        }

    }

    static void findCharacters() {
        // find characters in a string
        //// returns -1 if the character or a substring does not exist

        String str = "HogwartsSchoolOfMagicandWizards";

        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('s', 15));

        //Find a substring
        System.out.println(str.indexOf("Mag"));
        System.out.println(str.indexOf("Mog", 14));

        String str2 = "Bacon";
        String str3 = " Monster";

        //concatenation
        System.out.println(str2.concat(str3));

        //replace method
        System.out.println(str2.replace("Ba", "Fal"));

        //String to upperCase
        System.out.println(str.toUpperCase());
        System.out.println(str3.toUpperCase());

    }
}
