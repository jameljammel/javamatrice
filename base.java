package matricejava;

public class base {

	public static void main(String[] args) {
		matrice m= new matrice(5);
		m.resutltat();
		
		
		matrice superieur= new sup(5);
		superieur.resutltat();
		
		matrice inferieur= new inf(5);
		inferieur.resutltat();
		
		matrice diagonale= new diag(5);
		diagonale.resutltat();
		
		
		superieur=m.partiesuperieur();
		superieur.resutltat();
		
				
		
		inferieur=m.partieinferieur();
		inferieur.resutltat();
		
		diagonale=m.diagonale();
		diagonale.resutltat();
		
		
		matrice B=new matrice(inferieur,superieur,diagonale);
		B.resutltat();
		
		
		B.creuse();
		B.resutltat();
		
		
		B.linearisation();
		B.resutltat();
		
		B.delinearisation();
		B.resutltat();
		
		
		B.Sommematrice();
	
		B.sommediagonal();
		
		
		
		
	}
}
