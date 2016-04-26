package fr.ig2i.localwaves;

import android.location.Location;
import android.location.LocationProvider;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Localite {

    private double longitude;
    private double latitude;
    private double altitude;
    private String ville;
    private String region;

    public Localite() {
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Localite{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", ville='" + ville + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
        String newStatus = "";
        switch (status) {
            case LocationProvider.OUT_OF_SERVICE:
                newStatus = "OUT_OF_SERVICE";
                break;
            case LocationProvider.TEMPORARILY_UNAVAILABLE:
                newStatus = "TEMPORARILY_UNAVAILABLE";
                break;
            case LocationProvider.AVAILABLE:
                newStatus = "AVAILABLE";
                break;
        }
        /*String msg = String.format(getResources().getString(R.string.provider_disabled), provider, newStatus);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();*/
    }

    public void onLocationChanged(Location location) {
        latitude = location.getLatitude();
        longitude = location.getLongitude();
        altitude = location.getAltitude();
        Log.i("LOCALWAVES",Double.toString(latitude) +" - "+Double.toString(longitude)+""+Double.toString(altitude));

        /*String msg = String.format(
                getResources().getString(R.string.new_location), latitude,
                longitude, altitude);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();*/
    }


}
