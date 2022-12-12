package Uris.zadaci;

public class Kolekcije {
	
	public static void main (String[] args) {
		
		//Zadatak1
		int [] niz = {4,5,6,7,8};
		for (int i =niz.length - 1; i<=0; i--) {
			System.out.println(niz [i ] + " ");
		}
		
		//Zadatak2
		int [] niz1 = {4,20,33,222,88,5};
		if (niz1 [2] > niz1 [3]) {
			System.out.println("Treci element je veci od cetvrtog za: " + (niz1 [2] - niz [3]));
		}else {
			System.out.println("Cetvrti element je veci od treceg za: " + (niz1 [2] - niz1 [3]));
		}
		
		//Zadatak3
		int niz2 [] = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;
		while (i <= niz.length - 1) {
			System.out.println(niz2 [i] *5 + " ");
			i++;
			
			//ili ovaj nacin sa for petljom
			
		int niz3 []= {11,12,13,14,15,16,17,18,19,20};
		for(int i1= 0; i1 < niz3.length; i1++) {
			niz3 [i1]*=5;
			System.out.println(niz3[i1]);
		}
		}
	}
}


