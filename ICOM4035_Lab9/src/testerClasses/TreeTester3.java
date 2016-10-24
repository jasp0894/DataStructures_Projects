package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class TreeTester3 {

	public static void main(String[] args) {
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 
		
		// display content as a tree
		Utils.displayTree("The original binary tree is: ", t); 


		// build the same tree but as a general tree....
		LinkedTree<Integer> t2 = Utils.buildExampleTreeAsLinkedTree(); 
		Utils.displayTree("Same tree as a general tree is: ", t2); 
		
		
		//The representations are different because the first one will use the overwritten method done in exercise 3 and the last one 
		//will use the original method to display the tree content
	}

}
