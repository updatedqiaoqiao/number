package number;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		while(number>0)
		{
			number/=10;
			count++;
			System.out.println("number="+number+" count="+count);
		}
		System.out.println(count);
	}

}
