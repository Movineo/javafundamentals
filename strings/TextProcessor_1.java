package strings;
//backward strings 


public class TextProcessor_1 {
    public static void main(String[] args) {
        reverseString ("Hello Movine");

    }
    public static void reverseString(String text){
        for(int i=text.length()-1; i >=0; i--){
            System.out.print(text.charAt(i));

        }

    }

    
}
