package hackerRank.thirtyDays;
//https://www.hackerrank.com/challenges/30-binary-trees/tutorial
//https://www.journaldev.com/23059/level-order-traversal-breadth-first-tree
//https://www.techiedelight.com/level-order-traversal-binary-tree/

import java.util.*;
import java.io.*;

class NodeNew{
	NodeNew left,right;
    int data;
    NodeNew(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23BSTLevelOrderTraversal{

	static void levelOrder(NodeNew root){
		//Write your code here
		//InOrder
		/*
		 * if(root !=null) { levelOrder( root.left); System.out.println(root.data);
		 * levelOrder( root.right ); }
		 */
		Queue<NodeNew> q = new LinkedList<>();
		if(root !=null) {
			q.add(root);
			while(!q.isEmpty()) {
				NodeNew n = q.remove();
				System.out.print(n.data+" ");
				if(n.left!=null) {
					q.add(n.left);
				}
				if(n.right!=null) {
					q.add(n.right);
				}
			}
		}
	}

public static NodeNew insert(NodeNew root,int data){
        if(root==null){
            return new NodeNew(data);
        }
        else{
        	NodeNew cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            NodeNew root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}