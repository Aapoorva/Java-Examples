import java.io.*;
class UseNewStack{
	public static void main(String[] args) {

		Console con = System.console();
		NewStack s = new NewStack();

		System.out.print("No. of elements in stack : ");
		int n = Integer.parseInt(con.readLine());

		System.out.println("Enter "+n+" values");
		for(int i=0 ; i<n ; i++){
			String d = con.readLine();
			s.push(d);
		}


		System.out.println("Elements of stack");
		try{
			while(!s.empty())
				System.out.println(s.pop());

			//System.out.println(s.pop());

		}
		catch(UnderFlowException e){
			System.out.println("Error : "+e.getMessage());
		}
	}
}