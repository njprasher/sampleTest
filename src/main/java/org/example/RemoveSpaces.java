package org.example;

public class RemoveSpaces {
        public static void main(String[] args) {
            String str = "India    Is My    Country";
            //1st way
            String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
            System.out.println(noSpaceStr);
            //2nd way
            char[] strArray = str.toCharArray();
            StringBuilder string = new StringBuilder();
            for (char c : strArray) {
                if ((c != ' ') && (c != '\t')) {
                    string.append(c);
                }
            }
            String noSpaceStr2 = string.toString();
            System.out.println(noSpaceStr2);
        }
    }