package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class TreeTester4 {

	public static void main(String[] args) { 
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		//the traversal is in order. It is so because, the fillIterable method has been 
		//overwritten, so the JVM will not call the original one. 
		
		//The super class method would be called if the comments are placed again.
		
	}

}
