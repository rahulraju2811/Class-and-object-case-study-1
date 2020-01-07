package polymorphism;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	int coalPieces;
	float hairStrand;
	 String coalMsg;
	int result;


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		machine m = new machine();

		int result;
		int n = s.nextInt();
		float m1 = s.nextFloat();
		String k = s.next();
		

		//m.setCoalPieces(n)//m.setHairStrand(n);


		//result = m.produceShoePolish(m.getCoalPieces());
		//result = m.produceShoePolish(m.getHairStrand());
		System.out.println(m.produceShoePolish(n));
		System.out.println(m.produceShoePolish(m1));
		System.out.println(m.produceShoePolish(k));
		

		//System.out.println(result);

	}

}