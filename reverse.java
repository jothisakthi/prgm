
public class rverseno {
	public static void main(String args[]){
	int n=1234;
	int r=0;
	int sum=0;
	while(n!=0)
	{
	 r=r*10+n%10;
	 n=n/10;
	}
	 while(r!=0)
	 {
		 int a=r;
	 
		 while(a!=0)
		 {
			int i=a%10;
					
			 sum=sum+i;
			a=a/10;
		 }
		 r=r/10;
	 }
		 System.out.println(sum);
	
	}
}
