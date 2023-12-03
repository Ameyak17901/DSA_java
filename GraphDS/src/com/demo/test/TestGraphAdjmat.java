package com.demo.test;

import java.util.Scanner;

import com.demo.beans.GraphDS;

public class TestGraphAdjmat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the vertices");
		int n = sc.nextInt();
		GraphDS g = new GraphDS(n);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1,3);
		g.addEdge(2, 3);
		
		g.displayMat();
		
		g.bfsTraversal(0);
		System.out.println();
		System.out.println("dfs traversal");
		g.dfsTraversal(0);

	}

}
