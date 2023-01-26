
public class Rev {

	public static void main(String[] args) {
		String str="Hi trinath";
	char []ch=str.toCharArray();
	String rev1=" ";
	for(int i=ch.length-1;i>=0;i--) {
		//System.out.println(ch[i]);
		rev1+=ch[i];
	}
	System.out.println(rev1);
		
	
	}

}
