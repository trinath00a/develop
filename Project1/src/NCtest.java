
import java.util.ArrayList;
public class NCtest {

	public static void main(String[] args) {
		System.out.println("hi");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(34);
		for(int i=1;i>50;i++) {
			if(i%2==0) {
				al.add(i);}	
			System.out.println(al);
		}

	}

}
