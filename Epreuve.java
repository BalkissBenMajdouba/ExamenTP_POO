package exmaneTP1;

 class IllegalStateException extends Exception{
	IllegalStateException(String msg){
		super(msg);
	}
}
public class Epreuve {
	String denomination;
	boolean etat;
	int nbE;
	Candidat TabE[];
	Epreuve(String denomination, int max){
		TabE = new Candidat [max];
		this.denomination=denomination;
	}
	@Override
	public String toString() {
	    String s=getClass().getSimpleName() + ", denomination " + denomination + ", etat " + etat + " ,noms candidats: ";
	    String ss="";
	    for(int i = 0; i < nbE; i++) {
	        ss += TabE[i].getNon()+ " ";
	    }return s + ss;
	}

	
	void ajoutCandidat(Candidat a) {
	    if (!estTerminee() && nbE<TabE.length) {
	        TabE[nbE]=a;
	        nbE++;
	    } else {
	        System.out.println("pas d'espace");
	    }
	}
	    
	void terminer() {
	    etat = true;
	}

	boolean estTerminee() {
		return etat;
	}
	Resultat getRecord() {
		
		Resultat r1=TabE[0].getResultat();
		
		for(int i=0;i<nbE;i++) {
			if(TabE[i].getResultat().compareTo(r1)==1) {
				r1=TabE[i].getResultat();
				
			}
		}
		return r1;
		}
		
		Candidat getVinqueur() {
			Candidat ccc=null;
			if(estTerminee()) {
				for(int i=0; i<nbE;i++) {
					if(TabE[i].getResultat().compareTo(getRecord())==0) {
						ccc=TabE[i];
					}
				}
				
			}
			return ccc;
		}
		void fixeResultat(int id, Resultat r) throws IllegalStateException {
		    if (!estTerminee()) {
		        boolean found = false;
		        for (int i = 0; i < nbE; i++) {
		            if (TabE[i].getId() == id) {
		                TabE[i].setResultat(r);
		                found = true;
		            }
		        }

		        if (!found) {
		            throw new IllegalStateException("Candidat non trouvé");
		        }
		    } else {
		        throw new IllegalStateException("terminé");
		    }
		}

		  
		Resultat getResultat(int id) {
			for(int i =0 ; i<nbE ; i++) {
				if(TabE[i].getId()==id) {
					return TabE[i].getResultat();
				}
			}
			return null;
		}
	
	
}
