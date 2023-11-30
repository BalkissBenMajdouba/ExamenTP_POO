package exmaneTP1;

public class ResultatOral  implements Resultat {
	private char appréciation;
	
	public char getAppréciation() {
		return appréciation;
	}

	public void setAppréciation(char appréciation) {
		this.appréciation = appréciation;
	}
	@Override
	public int compareTo(Resultat r) {
		char c='A';
		int cc=100;
		 if(r instanceof ResultatOral) {
			 if(this.getAppréciation()== 'A') {
				 cc= 0;
			 }
			 else  if(this.getAppréciation()=='B') {
				 cc= 1;
			 }
			 else if(this.getAppréciation()=='C')
				 cc= -1;
		 } else throw new IllegalArgumentException("error type mismatch ");
		return cc ;
		
	}
	@Override
	public String toString() {
	return "appreciation :"+this.getAppréciation();
}

}
