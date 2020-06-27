package matricejava;

public class diag extends matrice {
	public diag(int a){
		super(a);
		for(int i=0;i<X.length;i++)
			for(int j=0;j<X[i].length;j++)
				if(i<j || i>j)
					X[i][j]=0; 	
	}
	
	public diag(int b[][]) {
		super(b.length);
		for(int i=0;i<b.length;i++)
			for(int j=0;j<b[i].length;j++)
				if(i<j || i>j)
					X[i][j]=0;
				else 
					X[i][j]=b[i][j];
	}
	


}