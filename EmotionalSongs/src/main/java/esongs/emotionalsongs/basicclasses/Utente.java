/*
Francesco Vulcano 749074
Giacomo Paviano 750742
Alessandro Messuti 750734
Riccardo Shpati 748993
Sede: Varese
 */
package esongs.emotionalsongs.basicclasses;

public class Utente {
    String nome,cognome,userId,codiceFiscale,password,email;
    Indirizzo indirizzo;

    public Utente(String nome, String cognome, String userId, String codiceFiscale, String password, String email,
                  Indirizzo indirizzo){
        this.nome = nome;
        this.cognome = cognome;
        this.userId = userId;
        this.codiceFiscale = codiceFiscale;
        this.password = password;
        this.email = email;
        this.indirizzo = indirizzo;
    }
}
