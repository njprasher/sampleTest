package org.example.qacheck;

import java.util.HashMap;
import java.util.Map;

public class sample {
    public static void main(String[] args) {

        String SentenceCheck="This is a a This Computer"; //Sentence to be checked
        String[] words=SentenceCheck.split(" "); //get all words of sentence in an Array
        //reversing the words in a sentence
        System.out.println("Sentence : " +SentenceCheck);
        System.out.print("Reversed Sentence : ");
        for (int i = words.length - 1; i >= 0; i--) {//looping through the array of words of Sentence in Reverse order
            System.out.print(words[i] + " "); //Formatting the System.out.print to look like a sentence
        }
        System.out.print("\n");

        HashMap<String, Integer> MapOfWords= new HashMap<>();//a hashmap of string and integer - can be used to store word and its count in sentence
        //count word occurrence in SentenceCheck
        for (String word : words) { //looping via forEach
            if (MapOfWords.containsKey(word)) //check if word is present in hashmap as Key
                MapOfWords.put(word, MapOfWords.get(word) + 1); //if present then increment its count by 1, count is represented by Value of Hashmap for Key
            else
                MapOfWords.put(word, 1); //if not present in Hashmap Keep its Value as 1
            }
        for (Map.Entry<String, Integer> entry : MapOfWords.entrySet()) {//Iterating through the Hashmap to get words and their count
            String word = entry.getKey(); //word
            Integer count = entry.getValue(); //count
            if(count>1){//if count more than 1
                System.out.println("\"" + word + "\" is " + count +" times"); //print this String
            } else System.out.println("\"" + word + "\" is " + count +" time");//else - print this String
        }
        }


}
