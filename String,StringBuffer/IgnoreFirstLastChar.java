import java.util.Scanner;

public class IgnoreFirstLastChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		System.out.println(str.substring(1,len-1));
	}

}
