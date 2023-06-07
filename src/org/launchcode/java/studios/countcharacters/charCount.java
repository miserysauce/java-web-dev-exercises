package org.launchcode.java.studios.countcharacters;
import java.io.CharArrayReader;
import java.util.HashMap;
import java.util.Map;
public class charCount {
    static void countChars(String inputString){

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] stringArray = inputString.toUpperCase().toCharArray();
        for (char c: stringArray){
            //if letter is not alphabetic, continue
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            if (charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            } else{
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry countData : charCountMap.entrySet()){
            System.out.println(countData.getKey()+ ": "+ countData.getValue());
        }
    }
    public static void main(String[] args){
        String hiddenFiguresText = "If the product of two terms is zero then common sense says at least " +
                "one of the two terms has to be zero to start with. So if you move all the terms over to " +
                "one side, you can put the quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        countChars(hiddenFiguresText);
    }
}








//    static void main(String[] args){
//
//        char[] charactersArray= hiddenFiguresText.toCharArray();
//        HashMap<Character, Integer> charactersHashMap = new HashMap<>();
//        for(char c : charactersHashMap){
//            if (charactersHashMap.containsKey(c)){
//                charactersHashMap.put(c, charactersHashMap.get(c)+1);
//            }
//        }
//    }
