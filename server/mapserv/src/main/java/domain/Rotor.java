package domain;

/**
 * Created by imrofli on 23.07.2015.
 */
public class Rotor {

    public static enum RotorPosition {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }


    private RotorPosition rotorPosition;
    private Integer rpm=0;
    private Double volt=0.0;
    private Integer milliAmpere=0;
    private Integer watts=0;

    public Rotor(RotorPosition rotorPosition) {
        this.rotorPosition = rotorPosition;
    }

    public Rotor(RotorPosition rotorPosition, Integer rpm, Double volt, Integer milliAmpere, Integer watts) {
        this.rotorPosition = rotorPosition;
        this.rpm = rpm;
        this.volt = volt;
        this.milliAmpere = milliAmpere;
        this.watts = watts;
    }

    public RotorPosition getRotorPosition() {
        return rotorPosition;
    }

    public void setRotorPosition(RotorPosition rotorPosition) {
        this.rotorPosition = rotorPosition;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Double getVolt() {
        return volt;
    }

    public void setVolt(Double volt) {
        this.volt = volt;
    }

    public Integer getMilliAmpere() {
        return milliAmpere;
    }

    public void setMilliAmpere(Integer milliAmpere) {
        this.milliAmpere = milliAmpere;
    }

    public Integer getWatts() {
        return watts;
    }

    public void setWatts(Integer watts) {
        this.watts = watts;
    }

    @Override
    public String toString() {
        return "Rotor{" +
                "rotorPosition=" + rotorPosition +
                ", rpm=" + rpm +
                ", volt=" + volt +
                ", milliAmpere=" + milliAmpere +
                ", watts=" + watts +
                '}';
    }
}
