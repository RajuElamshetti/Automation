package march3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="hello";
String str2="testing";
if (str1.equals(str2))
{
	System.out.println("strings are equal");
}
else {
	try
	{
		throw new Error ("strings are not equal");
	}
	catch (Throwable t)
	{
		System.out.println(t.getMessage());
	}
}


	}

}
