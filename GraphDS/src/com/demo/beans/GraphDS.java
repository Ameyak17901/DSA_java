package com.demo.beans;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphDS {
	private boolean[][] adjmat;
	private int vertices;
	
	public GraphDS(int v) {
		vertices = v;
		adjmat = new boolean[vertices][vertices];
	}
	
	
	public void addEdge(int i, int j) {
		adjmat[i][j] = true;
		adjmat[j][i] = true;
	}
	
	public void removeEdge(int i, int j) {
		adjmat[i][j] = false;
		adjmat[j][i] = false;
	}
	
	public void bfsTraversal(int s) {
		boolean[] visited = new boolean[vertices];
		Queue<Integer> q = new LinkedList<>();
		Arrays.fill(visited, false);
		
		visited[s] = true;
		q.add(s);
		while(!q.isEmpty()) {
		int path = q.poll();
		System.out.print(path + " ");
		for(int i = 0; i < adjmat[path].length; i++)
        {
            if (adjmat[path][i] && (!visited[i]))
            {
                 
                // Push the adjacent node to
                // the queue
                q.add(i);

                // Set
                visited[i] = true;
            }
        }
		}
	}
	
	public void dfsTraversal(int s) {
		boolean[] visited = new boolean[vertices];
		Stack<Integer> st = new Stack<>();
		Arrays.fill(visited, false);
		visited[s] = true;
		st.push(s);
		System.out.println(s);
		while(!st.isEmpty()) {
			boolean flag = false;
			int path = st.peek();
			for(int i=0; i<adjmat[path].length; i++) {
				if(adjmat[path][i] && (!visited[i])) {
					st.push(i);
					System.out.println(i);
					visited[i] = true;
					flag = true;
					break;
				}
			}
			if(!flag) {
				st.pop();
			}
		}
	}
	
	public void displayMat() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<adjmat.length; i++) {
			for(int j=0; j<adjmat[i].length; j++) {
				sb.append((adjmat[i][j] ? 1 : 0) + "\t");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
