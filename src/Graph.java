import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int v;
    private LinkedList<Integer>[] adj;

    //生成顶点
    public Graph(int v) {
        this.v = v;
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    //生成边
    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }

    //广度优先搜索
    public void bfs(int s, int t) {
        if (s == t) return;
        boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] pre = new int[v];
        for (int i = 0; i < v; i++) {
            pre[i] = -1;
        }
        while (queue.size() != 0) {
            int w = queue.poll();
            for (int i = 0; i < adj[w].size(); i++) {
                int q = adj[w].get(i);
                if (!visited[q]) {
                    pre[i] = w;
                    if (q == t) {
                        print(pre, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }

    }

    //遍历方法
    private void print(int[] pre, int s, int t) {
        if (pre[t] != -1 && t ！=s){

        }
    }
}
