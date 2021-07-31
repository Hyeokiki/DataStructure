package Tree;


public class week06main {
	int indentnum = 0;
	public static void main(String[] args) {
		
		//숙제1
		MyTree pretree = new MyTree("Make Money Fast!");
		MyNode Node1 = pretree.addNode("1. Motivaations");
		MyNode Node2 = pretree.addNode("2. Methods");
		MyNode Node3 = pretree.addNode("References");
		
		MyNode Node1_1 = pretree.addChild(Node1, "1.1 Greed");
		MyNode Node1_2 = pretree.addChild(Node1, "1.2 Avidity");
		
		MyNode Node2_1 = pretree.addChild(Node2, "2.1 Stock Fraud");
		MyNode Node2_2 = pretree.addChild(Node2, "2.2 Ponzi Scheme");
		MyNode Node2_3 = pretree.addChild(Node2, "2.3 Bank Robbery");
		
		int indentnum = 0;//indentation을 위한 변수
		System.out.println("===========숙제 1)===========");
		preOrder(pretree.root(), indentnum);
	
		//숙제2
		MyTree posttree = new MyTree("cs16/");
		MyNode Node4 = posttree.addNode("homeworks/");
		MyNode Node5 = posttree.addNode("programs/");
		MyNode Node6 = posttree.addNode("todo.txt(1K)");
		
		MyNode Node4_1 = posttree.addChild(Node4, "h1c.doc(3K)");
		MyNode Node4_2 = posttree.addChild(Node4, "h1nc.doc(2K)");
		
		MyNode Node5_1 = posttree.addChild(Node5, "DDR.java(10K)");
		MyNode Node5_2 = posttree.addChild(Node5, "Stocks.java(25K)");
		MyNode Node5_3 = posttree.addChild(Node5, "Robot.java(20K)");
		
		System.out.println("===========숙제 2)===========");
		postOrder(posttree.root());
		
	}
	
	public static void preOrder(MyNode mnode, int n) {
		
		//indentation을 위한 for문
		for(int j=0; j<n; j++) {
			System.out.print(" ");
		}
		
		System.out.println(mnode.element());	
		
		if(mnode.children().size()>0) {
			n++;
			for(int i=0;i<mnode.children().size();i++) {
				preOrder(mnode.children().get(i), n);
			}
		}
		else {
			return;
		}
	}
	
	public static int postOrder(MyNode mnode) {
		
		if(mnode.children().size()>0) {
			int n = 0;
			for(int i=0;i<mnode.children().size();i++) {
				n += postOrder(mnode.children().get(i));
			}
			String ele = (String)mnode.element();
			System.out.println(ele+" = "+n+"KB");
			return n;
		}
		
		else {
			String s1 = (String)mnode.element();
			//숫자부분만 잘라서 integer로 바꾼다음 변수 n에 대입
			int n = Integer.parseInt(s1.substring(s1.indexOf("(")+1 , s1.indexOf("K")));
			return n;
		}

	}
}
