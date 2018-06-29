
package eeee;
import java.io. *;
public class eminem {

	public static void main(String[] args) throws IOException
	{
		System.out.println("정수입력");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int num1 = num%2;
		if(num1==0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
		
		
	
		
	}
}
		
