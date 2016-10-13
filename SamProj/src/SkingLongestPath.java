 /* 
 * @author shivam.maharshi
 */
import java.util.*;

public class SkingLongestPath {

	// O(V+E)
	public static void find(int[][] graph, int v) {
		Stack<Integer> stack = TopologicalSorting.sort(graph);
		int[] dis = new int[graph.length];
		Arrays.fill(dis, Integer.MIN_VALUE);
		dis[v] = 0; // Set as source.
		while (!stack.isEmpty()) {
			int ver = stack.pop();
			if (dis[ver] != Integer.MIN_VALUE) {
				for (int i = 0; i < graph.length; i++) {
					if (graph[ver][i] != 0) {
						if (dis[i] < graph[ver][i] + dis[ver]) {
							dis[i] = graph[ver][i] + dis[ver];
						}
					}
				}
			}
		}
		for (int d : dis)
			System.out.print(d + " ");
	}

	public static void main(String[] args) {
		/*
		 
		  4 4 
4 8 7 3 
2 5 9 3 
6 3 2 5 
4 4 1 6

		 
		 */
		
		int[][] graph = { { 4,4 }, { 4, 8, 7, 3 }, { 2, 5, 9, 3 }, { 6, 3, 2, 5 },
				{ 4, 4, 1, 6} };
		find(graph, 1);
	}

}