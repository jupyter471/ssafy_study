import java.util.*;
import java.io.*;

public class Swea_1231_중위순회 {
    static char[] tree;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int t = 1; t <= T; t++) {
            sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            //배열로 트리 표현
            tree = new char[N+1];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int idx = Integer.parseInt(st.nextToken());
                char ch = st.nextToken().charAt(0);
                tree[idx] = ch;
            }

            inOrder(N+1,1);
            System.out.printf("#%d %s\n",t,sb);
        }
    }
    static void inOrder(int size, int node) {
        if (node < size) {
            //왼쪽 쭉 가기
            inOrder(size, node * 2);
            //가운데 출력
            sb.append(tree[node]);
            //오른쪽 쭉 가기
            inOrder(size, node * 2 + 1);
        }
    }
}
