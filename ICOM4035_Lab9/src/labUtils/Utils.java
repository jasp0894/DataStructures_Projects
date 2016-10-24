package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		
		//add root
		Position<Integer> r, q;
		
		r= t.addRoot(4);
		
		//add left child
		r = t.addChild(r, 9);
		
		//add left
		t.addChild(r,7);
		
		//add right
		t.addChild(r,10);
		
		//get root
		r = t.root();
		//add right child to root
		r = t.addChild(r, 20);
		
		//add left
		q = t.addChild(r, 15);
		
		//add left 
		t.addChild(q, 12);
		
		//add right
		q = t.addChild(q, 17);
		
		//add left to last node
		t.addChild(q, 19);
		
		//add right child to root's right child
		r = t.addChild(r, 21);
		
		//add right child
		r = t.addChild(r, 40);
		
		//add left child
		t.addChild(r, 30);
		
		//add right child
		t.addChild(r, 45);
		
		
		//System.out.println(recPOBuild(t, t.root(), 0));
		
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		
		Position<Integer> r,q;
		
		r= t.addRoot(4);
		
		//add left child
		r = t.addLeft(r, 9);
		
		//add left
		t.addLeft(r,7);
		
		//add right
		t.addRight(r,10);
		
		//get root
		r = t.root();
		//add right child to root
		r = t.addRight(r, 20);
		
		//add left
		q = t.addLeft(r, 15);
		
		//add left 
		t.addLeft(q, 12);
		
		//add right
		q = t.addRight(q, 17);
		
		//add left to last node
		t.addLeft(q, 19);
		
		//add right child to root's right child
		r = t.addRight(r, 21);
		
		//add right child
		r = t.addRight(r, 40);
		
		//add left child
		t.addLeft(r, 30);
		
		//add right child
		t.addRight(r, 45);
		
		
		
		
		return t; 
	}
	
	/*private static <E> String recPOBuild(LinkedTree<E> t, Position<E> p, int l){
		String s = "";
		
		if(t.isInternal(p)){
			s += printParallelLines(l) + "__("+p.getElement()+")"; //initially l=0
			for(Position<E> w: t.children(p))
				s+= recPOBuild(t, w,l+1) + "";
				
			
		}else
			 s = printParallelLines(l)+ "__("+p.getElement()+")";
		
		
		
		return s;
	}

	private static String printParallelLines(int lines){
		String tmp  ="";
		if(lines==0) return tmp;
		for (int i = 0; i < lines; i++) {
			tmp += "\t|";
		}
		tmp +="\n";
		tmp += tmp;
		
		return tmp;
	}*/

}
