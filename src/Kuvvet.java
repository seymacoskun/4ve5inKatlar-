import java.util.Scanner;

public class Kuvvet {

	public static void main(String[] args) {
		int sinir;
		Scanner inp = new Scanner(System.in);
		System.out.println("Siniri giriniz: ");
		sinir=inp.nextInt();
		System.out.println("");
		
		System.out.println("Sinira kadar olan 4�n katlar�:");
		for(int i=1; i<=sinir; i*=4) {
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("Sinira kadar olan 5in katlar�:");
		for(int j=1; j<=sinir; j*=5) {
			System.out.println(j);
		}
	}

}
