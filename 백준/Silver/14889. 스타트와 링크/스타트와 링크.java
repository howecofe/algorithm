import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    static int N, ans, teamSize;
    static int[] tgt;
    static int[] src;
    static int[][] S;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        teamSize = N / 2;
        ans = Integer.MAX_VALUE;

        src = new int[N];
        tgt = new int[teamSize];
        S = new int[N][N];

        for (int i = 0; i < N; i++) {
            src[i] = i;
        }

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(arr[j]);
            }
        }

        // 풀이
        comb(0, 0);

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void comb(int tgtIdx, int srcIdx) {
        if (tgtIdx == teamSize) {
            ans = Math.min(ans, calcDiff(tgt));
            return;
        }

        if (srcIdx == N) return;

        tgt[tgtIdx] = src[srcIdx];
        comb(tgtIdx + 1, srcIdx + 1);
        comb(tgtIdx, srcIdx + 1);
    }

    static int calcDiff(int[] team) {
        List<Integer> team1 = new ArrayList<>();
        List<Integer> team2 = new ArrayList<>();

        for (int t : team) team1.add(t);
        for (int i = 0; i < N; i++) {
            if (!team1.contains(i)) team2.add(i);
        }

        int power1 = calcPower(team1);
        int power2 = calcPower(team2);

        return Math.abs(power1 - power2);
    }

    static int calcPower(List<Integer> players) {
        int power = 0;
        for (int i = 0; i < teamSize - 1; i++) {
            for (int j = i + 1; j < teamSize; j++) {
                int p1 = players.get(i);
                int p2 = players.get(j);
                power += S[p1][p2] + S[p2][p1];
            }
        }
        return power;
    }
}