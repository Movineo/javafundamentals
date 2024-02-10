package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I LOVE TEST AUTOMATION UNIVERSITY");
        

    }
    /**
     * splits a string into an aaray by tokening it
     * counts words and print them
     * 
     * 
     */
    public static void countWords(String text) {
        var words = text.split (" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d", numberOfWords);
        System.out.println(message);

        for(int i =0; i < numberOfWords; i++){
            System.out.println(words);

        }
       //for (String word: words){
        //   System.outprintlin(word);
      // }

    }
    
}
