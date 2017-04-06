import java.util.Scanner;

public class fibonnaci {
	public static void main (String args[]) {
	
	 Scanner s = new Scanner(System.in);
        int b =0;
	int c =1;
	int a =s.nextInt();
		
	ArrayList<String> result = new ArrayList<String>();
		
        result.add(Integer.toString(c));
	for(int i =1 ; i<=a; i++){
	System.out.print(c+" ");
	c=c+b;
	b=c-b;
        
        result.add(Integer.toString(c));
        }
        Collections.reverse(result);
        System.out.println("Reverse : "+result);
	}
}
