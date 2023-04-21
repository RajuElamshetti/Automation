package march4;

public class equalsignorance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="testing";
		String b="testing";
		String c="TESTING";
		String d="testing";
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		System.out.println(a.equals(b));
		System.out.println(b.equalsIgnoreCase(c));
		

	}

}
