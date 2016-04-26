package fr.ig2i.localwaves;

/**
 * Created by pc on 21/04/2016.
 */
public class EtatApplication {

    private Boolean etatConnexion;
    private Boolean etatGPS;

    public EtatApplication() {
    }

    public Boolean getEtatGPS() {
        return etatGPS;
    }

    public void setEtatGPS(Boolean etatGPS) {
        this.etatGPS = etatGPS;
    }

    public Boolean getEtatConnexion() {
        return etatConnexion;
    }

    public void setEtatConnexion(Boolean etatConnexion) {
        this.etatConnexion = etatConnexion;
    }


}
