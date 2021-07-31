package Tree;

import java.util.ArrayList;

public class MyTree {
	private MyNode root;
	private int treesize = 0;
	MyTree(){
		this.root = null;
		this.treesize =0;
	}
	MyTree(Object e){
		this.root = new MyNode(e);
		this.root.setChildren(new ArrayList<MyNode>());
		this.treesize = 1;
	}
	public int size() {
		return this.treesize;
	}
	public MyNode root() {
		return this.root;
	}
	public ArrayList<MyNode> children(MyNode v) {
		return v.children();
	}
	public boolean isExternal(MyNode v) {
		return v.children().isEmpty();
	}
	//root��� element�� e�� �ٲٱ�
	public MyNode addRoot(Object e) {
		MyNode temp = this.root;
		root.setElement(e);
		return temp;
	}
	//root��忡 child����߰�
	public MyNode addNode(Object e) {
		MyNode morechild = new MyNode(e);
		this.root.children().add(morechild);
		morechild.setParent(this.root);
		this.treesize++;
		return morechild;
	}
	//��� v�� child �߰�
	public MyNode addChild(MyNode v, Object e) {
		MyNode morechild = new MyNode(e);
		v.children().add(morechild);
		morechild.setParent(v);
		this.treesize++;
		return morechild;
	}
	//��� v�� index�����ؼ� child �߰�
	public MyNode addChild(MyNode v, int i, Object e) {
		MyNode morechild = new MyNode(e);
		v.children().add(i,morechild);
		morechild.setParent(v);
		this.treesize++;
		return morechild;
	}
	//��� v�� children list���� index i�� element�� e������ Node�� set
	public MyNode setChild(MyNode v, int i, Object e) {
		MyNode newnode = new MyNode(e);
		v.children().set(i, newnode);
		return newnode;
	}
	//��� v�� index child Node�� ���� 
	public MyNode removeChild(MyNode v, int i) {
		MyNode temp = v.children().get(i);
		v.children().remove(i);
		this.treesize--;
		return temp;
	}
}
