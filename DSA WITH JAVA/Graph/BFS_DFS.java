import java.util.*;

public class BFS_DFS {

    static void bfs(int[][] g, char[] v, char start) {
        boolean[] visited = new boolean[v.length];
        Queue<Integer> q = new LinkedList<>();

        int s = indexOf(v, start);
        visited[s] = true;
        q.add(s);

        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(v[u] + " ");

            for (int i = 0; i < v.length; i++) {
                if (g[u][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println();
    }

    static void dfs(int[][] g, char[] v, char start) {
        boolean[] visited = new boolean[v.length];
        Stack<Integer> s = new Stack<>();

        int startIndex = indexOf(v, start);
        s.push(startIndex);

        System.out.print("DFS: ");
        while (!s.isEmpty()) {
            int u = s.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(v[u] + " ");

                for (int i = v.length - 1; i >= 0; i--) {
                    if (g[u][i] == 1 && !visited[i])
                        s.push(i);
                }
            }
        }
        System.out.println();
    }

    static int indexOf(char[] v, char c) {
        for (int i = 0; i < v.length; i++)
            if (v[i] == c)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vertices count: ");
        int n = sc.nextInt();

        char[] vertices = new char[n];
        int[][] graph = new int[n][n];

        System.out.print("Vertices: ");
        for (int i = 0; i < n; i++)
            vertices[i] = sc.next().charAt(0);

        System.out.print("Edges count: ");
        int e = sc.nextInt();

        for (int i = 0; i < e; i++) {
            char u = sc.next().charAt(0);
            char v = sc.next().charAt(0);
            int ui = indexOf(vertices, u);
            int vi = indexOf(vertices, v);
            graph[ui][vi] = graph[vi][ui] = 1;
        }

        System.out.print("Start vertex: ");
        char start = sc.next().charAt(0);

        bfs(graph, vertices, start);
        dfs(graph, vertices, start);
        sc.close();
    }
}
