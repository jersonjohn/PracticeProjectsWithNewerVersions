import java.util.*;

class Node {
	int data;
	int weight;
}

class Graph {
	int V;
	MyLinkedList[] lists;
	
	public Graph(int V) {
		this.V = V;
		this.lists = new MyLinkedList[V];
		
		for(int i=0;i<V;i++)
			lists[i] = new MyLinkedList();
	}
	
	void addEdge(int u, int v, int weight) {
		Node node = new Node();
		node.data = v;
		node.weight = weight;
		lists[u].add(node);
	}
	
	void printGraph() {
		int i = 0;
		for(MyLinkedList l : lists) {
			System.out.print(i++ + " : ");
			for(Node node : l)
				System.out.print(node.data + "(" + node.weight + ") ");
			System.out.println();
		}
	}
	
	void topologicalSortUtil(int u, boolean[] visited, LinkedList<Integer> res) {
		visited[u] = true;
				
		for(Node node : lists[u]) {
			if(!visited[node.data]) 
				topologicalSortUtil(node.data,visited,res);
		}
		
		res.addFirst(u);
	}
	
	LinkedList<Integer> topologicalSort() {
		boolean[] visited = new boolean[V];
		LinkedList<Integer> res = new LinkedList<Integer>();
		
		for(int i=0;i<V;i++) {
			if(!visited[i])
				topologicalSortUtil(i,visited,res);				
		}
		
		return res;

	}
	
	void printLongestDistances(int s) {
		int[] dist = new int[V];
		int[] parent = new int[V];
		
		for(int i=0;i<V;i++) {
			dist[i] = Integer.MIN_VALUE;
			parent[i] = -1;
		}
		
		dist[s] = 0;
		
		LinkedList<Integer> res = topologicalSort();
	
		for(Integer node : res) {
			for(Node neighbour : lists[node]) {
				if(dist[neighbour.data] < dist[node] + neighbour.weight) {
					dist[neighbour.data] = dist[node] + neighbour.weight;
					parent[neighbour.data] = node;
				}
			}
		}
		
		for(int i=0;i<V;i++) {
			if(dist[i] == Integer.MIN_VALUE)
				System.out.print(i + " : INF\tPath : ");
			else
				System.out.print(i + " : " + dist[i] + "\tPath : ");
			
			Stack<Integer> st = new Stack<Integer>();	
			int j = i;
			while(parent[j] != -1) {
				st.push(j);
				j = parent[j];
			}
			
			if(dist[i] != Integer.MIN_VALUE)
				st.push(s);
			
			while(!st.isEmpty())
				System.out.print(st.pop() + " ");
			System.out.println();
		}
	}
}

class SkiingLongtestPathFindingCalss extends LinkedList<Node> {
}

class LongestPathInADAG {
	public static void main(String[] args) {
		int V = 6;
		Graph g = new Graph(V);
		
		/*
		 
		  4 4 
4 8 7 3 
2 5 9 3 
6 3 2 5 
4 4 1 6

		 
		 */
		
		g.addEdge(4,4);
		g.addEdge(4,8,7,3);
		g.addEdge(2,5,9,3);
		g.addEdge(6,3,2,5);
		g.addEdge(4,4,1,6);
		
		
		System.out.println("Graph:");
		g.printGraph();
		
		int s = 1;
		System.out.println("\nsource:" + s);
		System.out.println("Distances:");
		g.printLongestDistances(s);
	}
}