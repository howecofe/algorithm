import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] arr = new int[31];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i = 1; i <= 30; i++) {
			if (arr[i] == 0) System.out.println(i);
		}
		
		br.close();
	}

}
