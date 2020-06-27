package matricejava;

import java.util.Random;

public class matrice {
	int X[][]=null;
	int t;
	Boolean V=false;

	
	public matrice(int a) {
		this.t=a;	
		X= new int[a][a];
		int dia=0;
		int in=1;
		int su=1;
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i==j) 
					X[i][j]=dia++;
				if(i>j) 
					X[i][j]=in++;
				if(i<j) 
					X[i][j]=su++;
		    }
			
		}
		
	}
	
	
	public matrice(matrice patrieSup,matrice patrieInf,matrice diagonale) {
		if(patrieSup.X.length==patrieInf.X.length && patrieInf.X.length==diagonale.X.length) {
			
		this.t=patrieSup.X[0].length;	
		X= new int[t][t];
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				if(i==j)X[i][j]=diagonale.X[i][j];	
				if(i>j)X[i][j]=patrieInf.X[i][j];
				if(i<j)X[i][j]=patrieSup.X[i][j]; 		
		    }
		}
		}else System.out.println(" "); 
		
	}

	
	public diag diagonale() {
		if(!V) {
		int tab[][]=new int[X[0].length][X[0].length];
		for(int i=0;i<X[0].length;i++) {
			for(int j=0;j<X.length;j++) {
				if(i==j) {tab[i][j]=X[i][j];}
				else {tab[i][j]=0;};
		    }	
		}
		return new diag(tab);
		}else {
			return null;
		}
	}

	
	public int sommediagonal() {
		if(!V) {
		int [][]diag=this.diagonale().X.clone();
		int somme=0;
		for(int i=0;i<diag.length;i++)
			for(int j=0;j<diag.length;j++)
				if(i==j)
					somme=somme+diag[i][j];
		System.out.println(" somme diagonale est : "+somme);
		return somme;
		}else {
			
			return 0;
		}
	}

	
	public inf partieinferieur(){

		if(!V) {
			int [][]tab=new int[X.length][X.length];
			for(int i=0;i<X[0].length;i++) {
				for(int j=0;j<X.length;j++) {
					if(i>j) {
						tab[i][j]=X[i][j];
						
					}
					else {
						
						tab[i][j]=0;
					}
					
				}
				
				
			}
			
			return new inf(tab);
		}
		else {
		
			return null;
		}
		
		
	}
	
	
	public sup partiesuperieur(){  
		if(!V) {
		int [][]tab=new int[X.length][X.length];
		for(int i=0;i<X[0].length;i++) {
			for(int j=0;j<X.length;j++) {
				if(i<j) {
					tab[i][j]=X[i][j];
				}
				else {
					tab[i][j]=0;
				}
				
			}
			
		}
		return new sup(tab);
		}
		else {
			
			return null;
		}
	}
	
	
	public int Sommematrice(){
		if(!V) {
		int somme=0;
		for(int i=0;i<X[0].length;i++) 
			for(int j=0;j<X.length;j++)
				somme=somme+X[i][j];
		System.out.println("La somme est : "+somme);		
		return somme;
		}else {
			
			return 0;
		}
	}
	
	
	public void resutltat() {
		System.out.println();
		for(int i=0;i<X.length;i++) {
			for(int j=0;j<X[i].length;j++) {
				
				if(i==j) 
					System.out.print(X[i][j]+" ");
				
				if(i>j) 
					System.out.print(X[i][j]+" ");
				
				if(i<j) 
					System.out.print(X[i][j]+" ");
				
				
		    }
			System.out.println();
		
	}
		System.out.println();
	}
	
	public void creuse() {
		System.out.println("la matrice Creuse ");
		Random h = new Random();
		Random k = new Random();
		for(int i=0;i<t-1;i++) 
			for(int j=0;j<t-1;j++) 	
				X[h.nextInt(t)][h.nextInt(t)]=0;
	}
	
	
	
	public void linearisation() {
		System.out.println("linéarisation de la matrice");
		V=true;
		int A[][] = X;
		int Mat[][];
		int L = 0; 
        for (int i = 0; i < X.length; i++)  
        { 
            for (int j = 0; j < X[i].length; j++)  
            { 
                if (X[i][j] != 0)  
                { 
                	L++; 
                } 
            } 
        }
        
        Mat=A;
        X=new int[3][L];
        int v=0;
        for (int i = 0; i < Mat.length; i++)  
        { 
            for (int j = 0; j < Mat[i].length; j++)  
            { 
                if (Mat[i][j] != 0)  
                { 
                	X[0][v]=Mat[i][j];
                	X[1][v]=i;
                	X[2][v]=j;
                	v++;
                } 
            } 
        }
        
		
	}
	
	public void delinearisation() {
		System.out.println("délinéarisation de la matrice");
		V=false;
		int A[][]= X;
		int Mat[][]=A;
		X=new int[t][t];
        for (int i = 0; i < t; i++)  
            for (int j = 0; j < t; j++)  
                         X[i][j]=0;
        for (int i = 0; i < Mat[0].length; i++) 
        	X[Mat[1][i]][Mat[2][i]]=Mat[0][i];
	}
	

}





