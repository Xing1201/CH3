import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_21 {

	public static void main(String[] args) throws IOException {
		System.out.println("�п�J�r��");
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		String str1=br1.readLine();
		System.out.println("�п�J�n�s�W���r��");
		String str2=br1.readLine();
		StringBuffer sb=new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println("�b�u"+str1+"�v��s�W�u"+str2+"�v���ܡA�N�|�ܦ��o�Ӧr�u"+sb+"�v");
	}

}
