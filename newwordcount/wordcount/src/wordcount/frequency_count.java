package wordcount;

import java.util.Scanner;

public class frequency_count {
	public static void main(String[] args) {
		//FileInputStream s = new FileInputStream("c://users/phani/Desktop/ashok.txt");
		//String s ="APPLE";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c =s.toCharArray();
		int sz = c.length;
		int i = 0,j = 0, counter = 0;
		
		for(i = 0; i< sz; ++i) {
			counter = 0;
			for(j = 0; j< sz; ++j) {
				if(j < i && c[i]==c[j]) {
					break;
				}
				if (c[j]==c[i]) {
					counter++;
				}
				if(j == sz-1) {
					System.out.println("the charecter " + c[i]+ "=" + counter + "times");
				}
			}
		}
	}

}
