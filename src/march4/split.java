package march4;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company="hcl@wipro@tcs@deloite@calliber@";
		String arrayvar[]=company.split("@");
		System.out.println(arrayvar[3]);
		for (String each:arrayvar)
		{
			System.out.println(each);
		}
	}}