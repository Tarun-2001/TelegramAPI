import java.util.*;
class Prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2; i<n; i++){
			if(n%2==0){
				flag=true;
				break;
			}
		}
		if(flag) System.out.println("Not prime ");
		else System.out.println("Prime");
	}
}