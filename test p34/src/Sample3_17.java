import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_17 {

	public static void main(String[] args) throws IOException{
		System.out.println("�п�J�@�Ӿ��");
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br1.readLine());
		
		System.out.println("�z��J���Ʀr�O"+num);
	}

}
