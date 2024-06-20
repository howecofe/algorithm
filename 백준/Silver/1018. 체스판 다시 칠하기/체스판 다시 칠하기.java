import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1. 보드판을 입력값으로 채운다.
        String[][] board = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = arr[j];
            }
        }

        // 2. 맨 왼쪽 위 요소가 흰색인 8 * 8 보드판을 만든다.
        String[][] wBoard = createBoard("W");

        // 3. 맨 왼쪽 위 요소가 검은색인 8 * 8 보드판을 만든다.
        String[][] bBoard = createBoard("B");

        // 4. 현재 보드판과 2, 3 보드판을 비교하여 요소가 다른 것을 카운팅한다.
        int minCnt = 65;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                // 만들 수 있는 8 * 8 보드판의 모든 요소 순회하며 비교
                int wCnt = 0, bCnt = 0;
                for (int row = i; row < i + 8; row++) {
                    for (int col = j; col < j + 8; col++) {
                        if (!board[row][col].equals(wBoard[row - i][col - j])) wCnt++;
                        if (!board[row][col].equals(bBoard[row - i][col - j])) bCnt++;
                    }
                }
                minCnt = Math.min(minCnt, Math.min(wCnt, bCnt));
            }
        }

        // 5. 최소값을 출력한다.
        bw.write(minCnt + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static String[][] createBoard(String startColor) {
        int row = 8, col = 8;

        String[][] board = new String[row][col];

        for (int i = 0; i < row; i++) {
            String color = startColor;
            for (int j = 0; j < col; j++) {
                board[i][j] = color;
                color = color.equals("W") ? "B" : "W";
            }
            startColor = startColor.equals("W") ? "B" : "W";
        }

        return board;
    }
}
