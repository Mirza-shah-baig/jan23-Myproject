
public class Program1Swap {
	public static void main(String[]args) {
		String Name1="hello";
		String Name2="hi";
		System.out.println("before swapping Name1="+Name1);
		System.out.println("before swapping Name2="+Name2);
		Name2=Name2+Name1;
		Name1=Name2.substring(0,Name2.length()-Name1.length());
		Name2=Name2.substring(Name1.length());
		System.out.println("after swapping");
		System.out.println(Name1);
		System.out.println(Name2);
	}

}
