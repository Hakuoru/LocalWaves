package fr.ig2i.localwaves;

import java.util.Collection;

/**
 * Created by pc on 21/04/2016.
 */
public class ListeStation {

    private Collection<Station> stations;

    public ListeStation()
    {

    }

    public Collection<Station> getStationOnline()
    {
        //rechercher les stations disponibles online.
        //mettre à jour l'xml.
        return stations;
    }

    public Collection<Station> getStationOffline()
    {
        //lire le .xlm
        return stations;

    }


}
