
public  class Sum {
	int x;
	int y;
	public void sum(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("The addtion reslut = "+(x+y));
	}
public static void main(String[] args) {
	Sum s=new Sum();
	s.sum(798, 8665);
	s.sum(77,87);
}
}
