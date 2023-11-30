package exmaneTP1;

public class Main2 {

	 public static void main(String[] args) {
		 try {
	        Epreuve e = new Epreuve("POO", 10);
	        Candidat c = new Candidat(1, "Ahmed");
	        Candidat c2 = new Candidat(2, "Sara");
	        ResultatOral ro = new ResultatOral();
	        ResultatPoints rp = new ResultatPoints();
	        e.ajoutCandidat(c);
	        e.ajoutCandidat(c2);
	        e.fixeResultat(1, ro);
	        e.fixeResultat(2, rp);

	        System.out.println(e);
	        e.terminer();
	        ResultatPoints rt = new ResultatPoints();
	        e.fixeResultat(1, rt);
	        System.out.println(e);
	        Candidat gangnant  = e.getVinqueur();
	        if (gangnant!=null) {
                System.out.println("le gangnant est: " + gangnant.getNon());
            } 
	        else {
                System.out.println(" il y aucun");
            }
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
	    }

		
}
