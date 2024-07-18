import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    static int chicken, beer, cola, cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        chicken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        cola = Integer.parseInt(st.nextToken()); // 치킨 한마리당 2개씩
        beer = Integer.parseInt(st.nextToken()); // 1개씩

        // 풀이
        int eatableCnt = beer + cola / 2;
        cnt = chicken < eatableCnt? chicken : eatableCnt;

        // 출력
        bw.write(cnt + "");

        br.close();
        bw.flush();
        bw.close();
    }
}