package march2;

public class two_dimensional {

	public static void main(String[] args, int j) {
		// TODO Auto-generated method stub
		String str [][]=new String [4][2];
		str [0][0]="admin1";
		str [0][1]="test1";
		str [1][0]="admin2";
		str [1][1]="test2";
		str [2][0]="admin3";
		str [2][1]="test3";
		str [3][0]="admin4";
		str [3][1]="test4";
		System.out.println(str.length);
		System.out.println(str[0].length);
		System.out.println(str[3][1]);
		for (int i=0;i<str.length;i++);
		{
			for (int i=0;j<str[i].length;j++)
			{
				System.out.println(str[i][j]+"\t");
				{
					System.out.println();
				}
			}


		}


	}

}
