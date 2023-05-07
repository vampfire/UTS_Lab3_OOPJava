/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package No_2;

// Java Program to reverse a String
// without using inbuilt String function
import java.util.regex.Pattern;

public class ReverseWord {

	// Method to reverse words of a String
	static String reverseWords(String str)
	{

		// Specifying the pattern to be searched
		Pattern pattern = Pattern.compile("\\s");

		// splitting String str with a pattern
		// (i.e )splitting the string whenever their
		// is whitespace and store in temp array.
		String[] temp = pattern.split(str);
		String result = "";

		// Iterate over the temp array and store
		// the string in reverse order.
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
	}

	// Driver methods to test above method
	public static void main(String[] args)
	{
		String s1 = "Pemrograman Berorientasi Objek";
		System.out.println(reverseWords(s1));

	}
}
