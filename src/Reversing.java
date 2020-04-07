
public class Reversing {

	public static void main(String[] args) {
		
		String input="selenium";
		String output ="";
		
		char arr[]=input.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			output+=arr[i];
		}
		
		System.out.println(output);
	}
}
