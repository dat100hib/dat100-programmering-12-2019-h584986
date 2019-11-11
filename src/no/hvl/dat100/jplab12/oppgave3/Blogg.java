package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.Bilde;
import no.hvl.dat100.jplab12.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
   private Innlegg[] innleggstabell; 
   private int nesteledig; 

	public Blogg() {
	    innleggstabell = new Innlegg[20];  
	    nesteledig = 0; 	
	}

	public Blogg(int lengde) {
	    innleggstabell = new Innlegg[lengde];
	    nesteledig = 0;    
	}

	public int getAntall() { 
	   return nesteledig; 
	}
	public Innlegg[] getSamling() {
	    return innleggstabell; 
	}
	
	public int finnInnlegg(Innlegg innlegg) {
	  for(int i = 0; i<innleggstabell.length; i++) {
	      if(innlegg.erLik(innleggstabell[i])) {
	          return i; 
	      }
	      }
	  return -1; 
	}

	public boolean finnes(Innlegg innlegg) {
	int i = 0; 
	while(innleggstabell[i] != null) {
	    if(innleggstabell[i].erLik(innlegg)) {
	        return true;
	    }
	    i++;
	} 
	return false; 
	}

	public boolean ledigPlass() {
	    for(Innlegg i : innleggstabell) {
	        if(i==null) {
	            return true;
	            }
	        } 
	     return false;   
	 }
	
	public boolean leggTil(Innlegg innlegg) {

	    if (!finnes(innlegg) && ledigPlass()) {
	        innleggstabell[nesteledig] = innlegg; 
            nesteledig++; 
            return true; 
            } else {
              return false;
            }
	}
	
	public String toString() {
	    String utskrift = nesteledig + "\n";
	    for(Innlegg i : innleggstabell) {
	        if (i instanceof Bilde) {
	            Bilde b = (Bilde) i; 
	            utskrift = utskrift + b.toString();
	    } else if (i instanceof Tekst) {
	        Tekst t = (Tekst) i; 
	        utskrift = utskrift + t.toString(); 
	        } 
	    }
	    return utskrift; 
	    }

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}