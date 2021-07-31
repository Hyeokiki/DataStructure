package Tree2;

import java.util.ArrayList;


public class MyTree {
	private MyNode root;
	private int treesize = 0;
	public MyTree(){
		this.root = null;
		this.treesize =0;
	}
	public MyTree(Object e){
		this.root = new MyBinNode(e);
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
	//root노드 element를 e로 바꾸기
	public MyNode addRoot(Object e) {
		MyNode temp = this.root;
		this.root = new MyBinNode(e);
		return temp;
	}
	//root노드에 child노드추가
	public MyNode addNode(Object e) {
		MyNode morechild = new MyNode(e);
		morechild.setParent(this.root);
		this.root.children().add(morechild);
		this.treesize++;
		return morechild;
	}
	//노드 v에 child 추가
	public MyNode addChild(MyNode v, Object e) {
		MyNode morechild = new MyNode(e);
		v.children().add(morechild);
		morechild.setParent(v);
		this.treesize++;
		return morechild;
	}
	//노드 v에 index지정해서 child 추가
	public MyNode addChild(MyNode v, int i, Object e) {
		MyNode morechild = new MyBinNode(e);
		morechild.setParent(v);
		v.children().add(i,morechild);
		this.treesize++;
		return morechild;
	}
	//노드 v의 children list에서 index i에 element를 e를가진 Node로 set
	public MyNode setChild(MyNode v, int i, Object e) {
		MyNode newnode = new MyBinNode(e);
		newnode.setParent(v);
		v.children().set(i, newnode);
		return newnode;
	}
	//노드 v의 index child Node를 제거 
	public MyNode removeChild(MyNode v, int i) {
		MyNode temp = (MyNode) v.children().remove(i);
		this.treesize--;
		return temp;
	}
}