package app;

public class MyString {

	private String value;
	
	public MyString(){
		
	}
	public MyString(String value){
		this.value = value;
	}
	
	public String Reverse(String value){
		String result ="";
		for(int x = this.value.length()-1; x>0; x--){
			result+= this.value.charAt(x);
		}
		return result;
		
		
	}
	
	public String reverse(){
		return value;
		
	}
	@Override
	public String toString(){
		return this.value;
	}

	public int length(){
		return this.value.length();
	}
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
