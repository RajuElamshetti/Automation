package march6;

public class Raju {
int a,b,c;
static double x,y,z;
public static void division()
{
	x=6578;
	y=908;
	z=x/y;
	System.out.println(z);
}
public void multiplication()
{
	a=4765;
	b=987;
	c=a*b;
	System.out.println(c);
}

	public static void main(String[] args) {
		Raju.division();    //calling static method with class name
		Raju x=new Raju();  //creating referance object for class to call non-static methood
		x.multiplication();

	}

}
