package Tree2;

public class week07main {
	public static void main(String[] args) {
		MyBinTree tree = new MyBinTree("+");
		MyBinNode multipleNode1 = tree.insertLeft(tree.root(), "*");
 		MyBinNode multipleNode2 = tree.insertRight(tree.root(), "*");
 		
 		MyBinNode node2_1 = tree.insertLeft(multipleNode1, "2");
 		MyBinNode minusNode =  tree.insertRight(multipleNode1, "-");
 		MyBinNode node2_3 = tree.insertLeft(multipleNode2, "3");
 		MyBinNode node2_4 = tree.insertRight(multipleNode2, "2");
 		
 		MyBinNode node3_1 = tree.insertLeft(minusNode, "3");
 		MyBinNode node3_2 = tree.insertRight(minusNode, "1");

 		InOrder(tree, tree.root());
 		System.out.println(" = "+PostOrder(tree, tree.root()) );
	}
	public static void InOrder(MyBinTree tree, MyBinNode root) {
			if(tree.hasLeft(root)) {
				System.out.print("(");
				InOrder(tree, root.left());
			}
			System.out.print(root.element());	
			if(tree.hasRight(root)) {
				InOrder(tree, root.right());
				System.out.print(")");
			}
			
		}
	public static int PostOrder(MyBinTree tree, MyBinNode root) {
		if(tree.isExternal(root)) {
			int num = Integer.parseInt((String)root.element());
			return num;
		}
		else {
			int leftnum = PostOrder(tree, root.left());
			int rightnum = PostOrder(tree, root.right());
			if(root.element()=="+") {
				return leftnum+rightnum;
			}
			else if(root.element()=="*") {
				return leftnum*rightnum;
			}
			else if(root.element()=="+") {
				return leftnum+rightnum;
			}
			else if(root.element()=="-") {
				return leftnum-rightnum;
			}
			else {
				System.out.println("연산할 수 없습니다.");
				return -1;
			}
		}
	}
}
