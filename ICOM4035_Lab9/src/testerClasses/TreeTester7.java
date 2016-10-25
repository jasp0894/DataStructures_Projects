package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class TreeTester7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedBinaryTree<String> t = new LinkedBinaryTree<>(), t1 = new LinkedBinaryTree<>();

		// add nodes and data to the tree
		Position<String> p = t.addRoot("ROOT");
		t.addLeft(p, "Rosa");
		p = t.addRight(p, "Maria");
		Position<String> ptd1 = p; // saved for future test of remove
		Position<String> p1 = t.addLeft(p, "Juana");
		p1 = t.addRight(p1, "Lola");
		p1= t.addLeft(p1, "Pepote");
		p1 = t.addRight(p1, "Manolo");
		p1 = t.addLeft(p1, "Eligio");
		Position<String> ptd2 = p1; // saved for future test of remove
		t.addRight(p1, "Eda");
		t.addLeft(p1, "Deborah");
	

		Utils.displayTree("Original t", t);

		// make a clone of t
		try {
			t1 = t.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.displayTree("Clone of t", t1);

		String removedElement = t.remove(ptd1);
		Utils.displayTree("Tree t after removing " + removedElement, t);
		Utils.displayTree("Clone of t", t1);

		String removedElement2 = t.remove(ptd2);
		Utils.displayTree("Tree t after removing " + removedElement2, t);
	}

}
