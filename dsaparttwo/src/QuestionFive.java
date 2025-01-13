//5. Reverse Words in a Sentence
//        Problem Statement
//        ------------------
//        Create an algorithm that takes a string of multiple words and returns the same string with the words in reversed order.
//        i/p -> I am Joel.   o/p -> Joel. am I

import java.util.Scanner;
public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.println("enter a string");
        sentence = sc.nextLine();

        String[] words= sentence.split(" ");
        StringBuilder reverse=new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            reverse.append(words[i]).append(" ");
        }
        System.out.println("reversed sentence \n "+ reverse);

    }
}