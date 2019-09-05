package C21_22;

import java.util.*;
import java.io.*;

public class boj5639 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BinaryTree tree = new BinaryTree(Integer.parseInt(br.readLine()));
		String s = "";
		while((s = br.readLine()) != null && s.length() != 0) {
			tree = tree.addTree(tree, Integer.parseInt(s));
		}
		postorder(tree);
		System.out.println(sb);
	}
	
	private static void postorder(BinaryTree tree) {
		if(tree.left != null)	postorder(tree.left);
		if(tree.right != null)	postorder(tree.right);
		sb.append(tree.data + "\n");
	}
}

class BinaryTree{
	int data;
	BinaryTree left;
	BinaryTree right;
	public BinaryTree(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTree addTree(BinaryTree tree, int val) {
		BinaryTree curTree = null;
		if(tree == null) return new BinaryTree(val);
		if(tree.data > val) {
			curTree = addTree(tree.left, val);
			tree.left = curTree;
		} else if (tree.data < val) {
			curTree = addTree(tree.right, val);
			tree.right = curTree;
		}
		return tree;
	}
}