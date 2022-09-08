// Program to find the longest word in the text file

import java.io.*;
import java.util.*;
public class LongestWord {
	public String findLongestWord() throws FileNotFoundException {
		String longestWord = "";
		String current;
		Scanner sc = new Scanner(new File("C:\\Users\\ARSHAD\\longestword.txt"));
		
		while(sc.hasNext()) {
			current = sc.next();
			if(current.length() > longestWord.length()) {
				longestWord = current;
			}
		}
		System.out.print("Longest Word: "+longestWord);
		return longestWord;
	}
	public static void main(String[] args) throws FileNotFoundException{
		LongestWord lw = new LongestWord();
		lw.findLongestWord();
	}

}
