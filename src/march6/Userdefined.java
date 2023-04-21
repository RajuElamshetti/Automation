package march6;

import java.awt.image.SampleModel;

import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.text.Style;

public class Userdefined {
	public static void addition (int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static  String verify_string(String str1,String str2)
	{
		String res=" ";
		if (str1.equalsIgnoreCase(str2))
		{
			res="strings are equal";
		}
		else {
			res="strings are not equal";
		}
		return res;

	}

	public static void main(String[] args) {
		Userdefined.addition(856,765);
		String results=Userdefined.verify_string("Hello","tygh");
		System.out.println(results);






	}

}
