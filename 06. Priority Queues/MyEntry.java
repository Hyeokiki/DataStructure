package week09;

public class MyEntry implements Entry{
	private Object key;
	private Object value;
	
	public MyEntry() {
		this.key = null;
		this.value = null;
	}
	
	public MyEntry(Object k, Object v) {
		this.key = k;
		this.value = v;
	}
	
	public void setKey(Object k) {
		this.key = k;
	}
	
	public void setValue(Object v) {
		this.value = v;
	}
	
	public Object getKey() {
		return this.key;
	}
	
	public Object getValue() {
		return this.value;
	}
}
