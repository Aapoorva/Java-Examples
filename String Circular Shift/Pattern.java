import java.io.*;
class Pattern{
	public static void main(String args[]){
		String s,s1,s2;
		char temp;
		int i;
		
		Console con = System.console();

		System.out.println("Input a word");
		s = con.readLine();
		s1 = null;
		s2 = s;
		while(!s.equals(s1)){
			s1 = s2.substring(1) + s2.charAt(0);
			System.out.println(s1);
			s2 = s1;
		}
	}
}