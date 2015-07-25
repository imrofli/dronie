package domain;

/**
 * Created by imrofli on 24.07.2015.
 */
public class Position {

    private Double longitude, latitude;
    private Double height;

    public Position() {

    }

    public Position(Double longitude, Double latitude, Double height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
