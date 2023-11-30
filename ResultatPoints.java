package exmaneTP1;

public class ResultatPoints implements Resultat {
	int nbPoint;

	public int getNbPoint() {
		return nbPoint;
	}

	public void setNbPoint(int nbPoint) {
		this.nbPoint = nbPoint;
	}
	@Override
	public int compareTo(Resultat r) {
		int c=100;
		 if(r instanceof ResultatOral) {
			 if(this.getNbPoint()==((ResultatPoints)r).getNbPoint()) {
				 c= 0;
			 }
			 else  if(this.getNbPoint()>((ResultatPoints)r).getNbPoint()) {
				 c= 1;
			 }
			 else 
				 c= -1;
		 }else throw new IllegalArgumentException("error type mismatch ");
		return c ;
		
	}
	@Override
	public String toString() {
		return "nombre de points  :"+this.getNbPoint();
	}
	
}
