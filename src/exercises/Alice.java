package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceString = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Integer index;
        Integer length;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        searchTerm = input.next().toLowerCase();
        input.close();
        index = aliceString.indexOf(searchTerm);
        length = searchTerm.length();
         System.out.println("Search term was found: " + aliceString.toLowerCase().contains(searchTerm)+"\n" +
                 "Search term index: " + index + "\n"+
                 "Search term length: " + length);
         String newSentence = aliceString.replace(searchTerm, "");
         System.out.println(newSentence);

    }

}
