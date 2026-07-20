package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBR {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		String name = br.readLine();
		
		System.out.println("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Entered Name: " + name + " Entered age: " +age);
		br.close();
		
	}

}
