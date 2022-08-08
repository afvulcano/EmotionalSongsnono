/*
Francesco Vulcano 749074
Giacomo Paviano 750742
Alessandro Messuti 750734
Riccardo Shpati 748993
Sede: Varese
 */
package esongs.emotionalsongs.basicclasses;

public class Emozione {
    String idEmozione,idUtente,idCanzone,commento;
    short voto; // set by default 0
    public Emozione(String idEmozione, String idUtente, String idCanzone, String commento, short voto){
        this.idEmozione=idEmozione;
        this.idUtente = idUtente;
        this.idCanzone = idCanzone;
        this.commento = commento;
        this.voto = voto;
    }
}
