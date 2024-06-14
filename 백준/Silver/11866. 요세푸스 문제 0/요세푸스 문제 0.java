import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) { q.add(i); }

        StringBuilder sb = new StringBuilder("<");
        int currIdx = 0;
        
        while (!q.isEmpty()) {
            currIdx += k - 1;
            if (currIdx > q.size() - 1) { currIdx %= q.size(); }

            if (q.size() == 1) {
                sb.append(q.get(currIdx) + ">");
            } else {
                sb.append(q.get(currIdx) + ", ");
            }
            q.remove(currIdx);
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
