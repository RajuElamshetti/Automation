package march2;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cars=new ArrayList<String>();
cars.add("tata");
cars.add("hyundri");
cars.add("maruthi");
cars.add("audi");
System.out.println(cars.size());
System.out.println(cars.get(3));
for (int i=0;i<cars.size();i++)
{
	System.out.println(cars.get(i));
}
	}

}
 