package HelloWorld;

public class HelloWorld {
public static void main(String[] args) {
    System.out.println(new Greetings().hello());
    System.out.println(new Movine().Hello());

    String first = "My name is Movine Odhiambo".split(" ")[3];
    System.out.println(first);

    String [ ] parts = "one two three".split(" ");
    String  A = parts [0];

    System.out.println(A);

    String replace = "one two three ".replace(" two ", " to");
    System.out.println(replace);

    String sentense = " I love myself";
    String sentense2 = sentense.concat(" and I am proud of muself");
    System.out.println(sentense2);
    String sentene3 = sentense.replace("love","hate");
    System.out.println(sentene3);


    
    char[] chars = {'h', 'e', 'l', 'l' , 'o'};
    String hello = new String(chars);
    System.out.println(hello);
    
    boolean Strartswith = "one two three".startsWith("one");
    System.out.println(Strartswith);

    float f = 3.14f;
    System.out.println(f);

    int x = 10;
    int y =  20;
    int z = x + y;
    System.out.println(z);
    

    // byte takes values from -128 to 127 (8 bits/ 1 byte/ 2^-7 --- 2^7-1)
    byte b = -128;
    System.out.println(b);

    // short takes values from -32768 to 32767 (16 bits/ 2 bytes/ 2^-15 --- 2^15-1)
    short s = 32767;
    System.out.println(s);

    // long takes values from -2^63 to 2^63-1 (64 bits/ 8 bytes/ 2^-63 --- 2^63-1)
    long i = 8848848484949l;
    System.out.println(i);

    //conversion of character to an ascii value
    char c = 'A';
    int ascii = c;
    System.out.println(ascii);


}
}