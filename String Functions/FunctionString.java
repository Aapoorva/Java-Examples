import java.io.*;
class FunctionString{
	public static void main(String args[]){
		String s1 = "a bcd a";
		System.out.println(s1.length());
		System.out.println("APOORVA".length());

		String s2 = s1.replace('a','j');
		System.out.println(s2);

		String s3 = s1.trim();
		System.out.println(s3.length());

		String s4 = "abcdeabfghabxsd";
		System.out.println(s4.startsWith("ascd"));

		String s5 = s4.toUpperCase();
		System.out.println(s5);

		System.out.println(s5.charAt(2));

		String s8 = s4.substring(3);
		System.out.println(s8);
		System.out.println(s4.substring(5,20));

		System.out.println(s4.indexOf("ABC"));
		System.out.println(s4.indexOf("ab"));
		System.out.println(s4.indexOf("ab",3));
		System.out.println(s4.indexOf("ab",5));
		System.out.println(s4.lastIndexOf("ab"));
		System.out.println(s4.lastIndexOf("ab",13));

		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s5));
	}
}