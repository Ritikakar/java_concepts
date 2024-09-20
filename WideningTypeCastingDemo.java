package main;

public class WideningTypeCastingDemo {
    
    public static void main(String []args){

        byte byteValue = 127;
        System.out.println("original Byte value : " +byteValue);
        
        //byte to short
        short shortValue = byteValue;
        System.out.println("byte to short: "+shortValue);

        //short to char
        //note: this is not direct widening conversion as char is unsigned
        //we will use a positive short value to demonstrate
        short positiveShort = 65;
        char charValue = (char)positiveShort;
        System.out.println("short to char: "+charValue);

        //char to int
        int intFromChar = charValue;
        System.out.println("int from char: "+intFromChar);

        char unicodeCharacters = '\u00F4';
        System.out.println(unicodeCharacters);


    }
}
