/*
Francesco Vulcano 749074
Giacomo Paviano 750742
Alessandro Messuti 750734
Riccardo Shpati 748993
Sede: Varese
 */
package esongs.emotionalsongs.basicclasses;

public class Indirizzo {
    String via, numeroCivico,cap,comune,provincia;
   
    public Indirizzo(String via, String numeroCivico, String cap, String comune, String provincia){
        this.via = via;
        this.numeroCivico = numeroCivico;
        this.cap = cap;
        this.comune = comune; 
        this.provincia = provincia;
    }
}
