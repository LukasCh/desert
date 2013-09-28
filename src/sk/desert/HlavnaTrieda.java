package sk.desert;

import java.util.Scanner;
import sk.desert.triedy.Clovek;

public class HlavnaTrieda {
	public static void main(String[] args) {
		
		Scanner consoleReader = new Scanner(System.in);
		Clovek clovek1 = new Clovek();	
		System.out.println("Zadaj meno cloveka: ");
		clovek1.meno = consoleReader.nextLine();
		System.out.println("Zadaj prezvisko cloveka: ");
		clovek1.priezvisko = consoleReader.nextLine();
		System.out.println("Zadaj vek cloveka: ");
		clovek1.vek = Integer.parseInt(consoleReader.nextLine());
		consoleReader.close();
		System.out.println(clovek1.meno + " " + clovek1.priezvisko + " " + clovek1.vek);		
	}
}
