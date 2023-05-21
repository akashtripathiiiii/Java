package introduction;

import java.util.*;

public class Input {

	public static void main(String[] args) {
		// we take input by importing scanner class
		//System.out -  for output
		//System.in -  for input
		Scanner sc = new Scanner(System.in);
		// sc is user defined scanner class object, in place of sc we can take any name
		//next() - function of Scanner class and take only one token, eg if you input "Hello world" then it will only print "Hello". To print whole line we have to use nextLine()
		String name = sc.next();
		System.out.print(name);
//		String name2 = sc.nextLine();
//		System.out.println(name2);

	}

}
