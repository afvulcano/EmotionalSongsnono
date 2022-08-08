/*
Francesco Vulcano 749074
Giacomo Paviano 750742
Alessandro Messuti 750734
Riccardo Shpati 748993
Sede: Varese
 */
package esongs.emotionalsongs.basicclasses;

import java.util.LinkedList;

public class Playlist {
    String idPlaylist,nome;
    LinkedList<Canzone> ListaCanzoni = new LinkedList<Canzone>();

    public Playlist(String idPlaylist, String nome){
        this.idPlaylist = idPlaylist;
        this.nome = nome;
    }
}
