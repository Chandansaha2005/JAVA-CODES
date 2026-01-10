import java.util.*;

public class BFS_DFS {

    static int id(char[] v, char c) {
        for (int i = 0; i < v.length; i++)
            if (v[i] == c)
                return i;
        return -1;
    }

    static void bfs(int[][] g, char[] v, char s) {
        boolean[] vis = new boolean[v.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(id(v, s));
        vis[q.peek()] = true;

        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(v[u] + " ");
            for (int i = 0; i < v.length; i++)
                if (g[u][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
        }
        System.out.println();
    }

    static void dfs(int[][] g, char[] v, char s) {
        boolean[] vis = new boolean[v.length];
        Stack<Integer> st = new Stack<>();
        st.push(id(v, s));

        System.out.print("DFS: ");
        while (!st.isEmpty()) {
            int u = st.pop();
            if (vis[u])
                continue;
            vis[u] = true;
            System.out.print(v[u] + " ");
            for (int i = v.length - 1; i >= 0; i--)
                if (g[u][i] == 1 && !vis[i])
                    st.push(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] v = new char[n];
        int[][] g = new int[n][n];

        for (int i = 0; i < n; i++)
            v[i] = sc.next().charAt(0);

        int e = sc.nextInt();
        while (e-- > 0) {
            int a = id(v, sc.next().charAt(0));
            int b = id(v, sc.next().charAt(0));
            g[a][b] = g[b][a] = 1;
        }

        char s = sc.next().charAt(0);
        bfs(g, v, s);
        dfs(g, v, s);
        sc.close();
    }
}
