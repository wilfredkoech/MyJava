import java.util.Scanner;
public class MyJava{
	public static void main(String args[]){
		long a,status =1, num=3;
		System.out.println("enter the number to find its prime to...");
		Scanner tri=new Scanner(System.in);
		a=tri.nextInt();
		if(a>0){
			for(int count=2;count<=a;){
				for(int j=2;j<=Math.sqrt(num);j++){
					if(num%j==0){
						status=0;
						break;
					}
				}
				if(status !=0){
					System.out.println(num);
					count++;
				}
				status=1;
				num++;
			}
		}
	}
}