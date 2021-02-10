
import java.util.Scanner;
class ShortestDistance{
	public static void main(String args[]){
		
	Scanner sc=new Scanner(System.in);
	
	String min;
	
	System.out.println("Travel A-B");

	int a=sc.nextInt();

	System.out.println("Travel B-C");

	
	int b=sc.nextInt();

	System.out.println("Travel A-C");

	int c=sc.nextInt();

	System.out.println("Travel C-D");

	int d=sc.nextInt();
	
	int e=(a+b+c+d)/4;
	
	if((a<b)&&(a<c))
	
		min="A";
	else
		if((b<c)&&(c<a)) 
			
			
			min="B";
		
		else
		
			min="C";
	
	if(a-e>0)
		System.out.println(min + "Time Take Travel for A-D"+":"+(a-e));
	
	if(b-e>0)
		
		System.out.println(min+" Time Take Travel for B-C"+(b-e));
	
	if(c-e>0)
		
		System.out.println(min+" Time Take Travel for A-C"+min+(c-e));
	
	if(d-e>0)
		
		System.out.println(min+" Time Take Travel for C-D"+min+(d-e));
	
		System.out.println("Travel From A-D with Minimum cost of  " + 45);
	
	}
	
}