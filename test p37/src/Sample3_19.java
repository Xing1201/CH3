import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_19 {

	public static void main(String[] args)throws IOException {
		System.out.println("�п�J�^��r��");
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br1.readLine();
		String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		
		System.out.println("�ഫ���j�g�ɬ�"+stru);
		System.out.println("�ഫ���j�g�ɬ�"+strl);
	}

}
