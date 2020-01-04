package pack;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Scanner s = new Scanner(System.in);
		DataInputStream ds = new DataInputStream(System.in);
		Machine m = new Machine();
		
		int result;
		//int n = s.nextInt();
		//float n = s.nextFloat();
		String n = ds.readLine();
		
		//m.setCoalPieces(n);
		//m.setHairStrand(n);
		m.setCoalMsg(n);
		
		//result = m.produceShoePolish(m.getCoalPieces());
		//result = m.produceShoePolish(m.getHairStrand());
		result = m.produceShoePolish(m.getCoalMsg());
		
		System.out.println(result);
		
	}

}
