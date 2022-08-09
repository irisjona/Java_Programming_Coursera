import edu.duke.*;

public class WordPlay {

    public boolean isVowel(char ch) {
        //set boolean to false as default
        boolean result = false;
        //Make a string with vowels
        String vowels = "AEIOU";
        //check if character is in vowel string bij using indexOf
        int index = vowels.indexOf(ch);
        //check if index is not -1, then set boolean to true
        if (index != -1) {
            result = true;
        }
        return result;
    }
    
    public void testIsVowel() {
     char ch = 'F';
     boolean result = isVowel(ch);
     System.out.println(ch + " is a vowel? " + result);
     
     ch = 'U';
     result = isVowel(ch);
     System.out.println(ch + " is a vowel? " + result);
     
     ch = 'V';
     result = isVowel(ch);
     System.out.println(ch + " is a vowel? " + result);
     
     ch = 'A';
     result = isVowel(ch);
     System.out.println(ch + " is a vowel? " + result);
     
    }
    
    public String replaceVowels(String phrase, char ch) {
     //copy the String phrase into the string replacedPhrase
     StringBuilder replacedCh = new StringBuilder(phrase);
     String upperPhrase = phrase.toUpperCase();
     //for each character in the String replacedPhrase
     for (int i = 0; i < replacedCh.length(); i++) {
     //Check if the character is a vowel, use method isVowel
     System.out.println(upperPhrase.charAt(i));
     boolean isVowel = isVowel(upperPhrase.charAt(i));
     System.out.println(isVowel);
     //If character is a vowel, 
        if (isVowel == true) {
            //replace at the index the char with 'ch'
            replacedCh.setCharAt(i, ch);
        }
    }
     return replacedCh.toString();
    }
    
    public void testReplaceVowels() {
    String phrase = "Hello World";
    char ch = '*';
    String replaceCh = replaceVowels(phrase, ch);
    System.out.println("old string was: " + phrase + " new string is: " + replaceCh);
    }
    
    public String emphasize(String phrase, char ch) {
     StringBuilder newPhrase = new StringBuilder(phrase);
     String upperPhrase = phrase.toUpperCase();
     String lowerPhrase = phrase.toLowerCase();
     
     //for each character in the String 
        for (int i = 0; i < newPhrase.length(); i++) {
        //put char found at the index of i in uppercase and lowercase in variable
        char lowercase = lowerPhrase.charAt(i);
        char uppercase = upperPhrase.charAt(i);
        
        //check if lowercase or uppercase is equal to ch
        if (lowercase == ch || uppercase == ch) {
            //if this is true
            //check if the i is an even number
            if (i % 2 == 0) {
                newPhrase.setCharAt(i, '*');
            }
            //if the i is an odd number
            else {
                newPhrase.setCharAt(i, '+');
            }
        }
        }
     
     return newPhrase.toString();
    }
    
    public void testEmphasize() {
    String phrase = "dna ctgaaactga";
    char ch = 'a';
    String result = emphasize(phrase, ch);
    System.out.println("old string: " + phrase + " and the result: " + result);
    
    phrase = "Mary Bella Abracadabra";
    ch = 'a';
    result = emphasize(phrase, ch);
    System.out.println("old string: " + phrase + " and the result: " + result);
    }
    
    
}
