import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {

    static int n, main, sub;
    static long cnt;
    static int[] students;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 입력
        n = Integer.parseInt(br.readLine());
        students = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        main = Integer.parseInt(st.nextToken());
        sub = Integer.parseInt(st.nextToken());

        // 풀이
        cnt += n; // 총감독관 수 더하고 시작

        for (int num : students) {
            num -= main; // 총감독관이 담당하는 학생 빼기
            if (num <= 0) continue; // 담당할 학생 수 없는 경우 종료
            cnt += (long)Math.ceil((double) num / sub); // 부감독관 수
        }

        // 출력
        bw.write(cnt + "");

        br.close();
        bw.flush();
        bw.close();
    }
}