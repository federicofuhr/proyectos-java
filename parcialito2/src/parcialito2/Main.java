package parcialito2;

public class Main {

	
	public static void main(String[] args) {
		
		General a = new General();
		General b = new SegundoNivelA();
		General c = new PrimerNivelB();
		
		System.out.println(a.metUno());
		System.out.println(a.metDos());
		System.out.println(a.metValor());
		
		System.out.println(b.metUno());
		System.out.println(b.metDos());
		System.out.println(b.metValor());

		//b.metTres();
		
		System.out.println(c.metUno());
		System.out.println(c.metDos());
		System.out.println(c.metValor());
	
		//c.metCinco();
		
		a = b;
		b = c;
		
		((SegundoNivelA)a).metTres();


		
		PrimerNivelA pA = new PrimerNivelA();
		pA.metUno();
		pA.metDos();
		pA.metTres();
		pA.metValor();
		
		PrimerNivelB pB = new PrimerNivelB();
		pB.metUno();
		pB.metDos();
		pB.metCinco();
		pB.metValor();
		
		SegundoNivelA sA = new SegundoNivelA();
		sA.metUno();
		sA.metDos();
		sA.metTres();
		sA.metCuatro();
		sA.metValor();
		((PrimerNivelA)sA).metUno();
		
		SegundoNivelB sB = new SegundoNivelB();
		sB.metUno();
		sB.metDos();
		sB.metCinco();
		sB.metValor();
		((PrimerNivelB)sB).metUno();
		
		a=sB;
	//	sB = b;
		
		
	}
}