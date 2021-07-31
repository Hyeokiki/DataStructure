package Tree2;

public class MyBinTree extends MyTree {
	MyBinTree() {
		super();
	}
	MyBinTree(Object e){
		super(e);
	}
	
	public boolean isEmpty() {
		if(super.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isRoot(MyBinNode v) {
		if(v.parent()==null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isInternal(MyBinNode v) {
		if(this.isExternal(v)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isExternal(MyBinNode v) {
		if(this.hasLeft(v)||this.hasRight(v)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public MyBinNode root () {
		return (MyBinNode)super.root();
	}
	
	public MyBinNode parent (MyBinNode v) {
		return (MyBinNode)v.parent();
	}
	
	public MyBinNode left(MyBinNode v) {
		return (MyBinNode)v.children().get(0);
	}
	
	public MyBinNode right(MyBinNode v) {
		return (MyBinNode)v.children().get(1);
	}
	
	public boolean hasLeft(MyBinNode v) {
		if(v.children().get(0) == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean hasRight(MyBinNode v) {
		if(v.children().get(1) == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public MyBinNode addRoot(Object e) {
		MyBinNode temp = new MyBinNode(e);
		super.addRoot(temp);
		return temp;
	}
	
	public MyBinNode addNode(Object e) {
		MyBinNode addN = new MyBinNode(e);
		return addN;
	}
	
	public MyBinNode insertLeft (MyBinNode v, Object e) {
		if(!this.hasLeft(v)) {
			MyBinNode newchild = (MyBinNode)super.setChild(v, 0, e);
			return newchild;
		}
		return null;
	}
	
	public MyBinNode insertRight (MyBinNode v, Object e) {
		if(!this.hasRight(v)) {
			MyBinNode newchild = (MyBinNode)super.setChild(v, 1, e);
			return newchild;
		}
		return null;
	}
	
	public Object replace(MyBinNode v, Object e) {
		Object temp = v.element();
		v.setElement(e);
		return temp;
	}
	
	public MyBinNode remove(MyBinNode v) throws TwoChildrenException {
		if(this.isExternal(v)) {
			v = null;
			return v;
		}
		else {
			if(this.hasLeft(v)&&this.hasRight(v)) {
				throw new TwoChildrenException("child 2명을 가지고 있어서 remove불가능");
			}
			else if(this.hasLeft(v)){
				MyBinNode vparent = (MyBinNode)v.parent();
				MyBinNode vchild = (MyBinNode)v.children().get(0);
				vparent.children().set(0, vchild);
				vchild.setParent(vparent);
			}
			else if(this.hasRight(v)) {
				MyBinNode vparent = (MyBinNode)v.parent();
				MyBinNode vchild = (MyBinNode)v.children().get(1);
				vparent.children().set(1, vchild);
				vchild.setParent(vparent);
			}
		}
		return v;
	}
	
	public void attach(MyBinNode v, MyBinNode t1, MyBinNode t2) throws NotExternalException {
		if(this.isExternal(v)) {
			this.insertLeft(v, t1.element());
			this.insertLeft(v, t2.element());
		}
		else {
			throw new NotExternalException("External Node가 아님.");
		}
	}
	
	public class TwoChildrenException extends Exception{
		TwoChildrenException(String msg){
			super(msg);
		}
	}
	
	public class NotExternalException extends Exception{
		NotExternalException(String msg){
			super(msg);
		}
	}
}
