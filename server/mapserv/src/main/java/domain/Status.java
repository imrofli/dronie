package domain;

import com.google.inject.Inject;
import ninja.utils.NinjaProperties;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imrofli on 23.07.2015.
 */
public class Status {

    @Inject
    NinjaProperties ninjaProperties;

    private List<Rotor> rotors = new ArrayList<>(4);
    private List<Akku> akkus =  new ArrayList<>(4);
    private DateTimeZone timeZone = DateTimeZone.forID("Europe/Zurich");
    private DateTime entryTime;
    private List<Position> positions = new ArrayList<>();

    public Status() {

        entryTime = DateTime.now(timeZone);

    }

    public List<Rotor> getRotors() {
        return rotors;
    }

    public void setRotors(List<Rotor> rotors) {
        this.rotors = rotors;
    }

    public List<Akku> getAkkus() {
        return akkus;
    }

    public void setAkkus(List<Akku> akkus) {
        this.akkus = akkus;
    }

    public Rotor getRotor(Rotor.RotorPosition rotorPosition){
        for(Rotor rotor : rotors){
            if (rotor.getRotorPosition()==rotorPosition){
                return rotor;
            }
        }
        return null;
    }

    public Akku getAkku(Integer number){
        for(Akku akku : akkus){
            if (akku.getAkkuNumber()==number){
                return akku;
            }
        }
        return null;
    }

    public void addRotor(Rotor rotor){
        rotors.add(rotor);
    }

    public void addAkku(Akku akku){
        akkus.add(akku);
    }

    public DateTime getEntryTime() {
        return entryTime;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Position getLatestPosition(){
        return positions.get(positions.size()-1);
    }

    public void addPosition(Position position){
        positions.add(position);
    }

    @Override
    public String toString() {
        return "Status{" +
                "entryTime=" + entryTime +
                ", timeZone=" + timeZone +
                ", akkus=" + akkus +
                ", rotors=" + rotors +
                '}';
    }
}
