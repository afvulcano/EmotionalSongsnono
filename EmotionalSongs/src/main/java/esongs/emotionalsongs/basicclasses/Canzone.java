/*
Francesco Vulcano 749074
Giacomo Paviano 750742
Alessandro Messuti 750734
Riccardo Shpati 748993
Sede: Varese
 */
package esongs.emotionalsongs.basicclasses;

import java.time.Year;
public class Canzone {
    String idCanzone,titolo,autore;
    Year anno;

    public Canzone(String idCanzone, String titolo, String autore, Year anno){
        this.idCanzone = idCanzone;
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }
}
