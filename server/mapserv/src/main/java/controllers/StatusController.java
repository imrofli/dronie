package controllers;

import com.google.inject.Inject;
import domain.Akku;
import domain.Dronie;
import domain.Rotor;
import domain.Status;
import ninja.Result;
import ninja.Results;
import org.apache.commons.lang.math.RandomUtils;

/**
 * Created by imrofli on 21.07.2015.
 */
public class StatusController {
    @Inject
    private Dronie dronie;
    private Integer counter =1;


    public Result status() {
        counter += dronie.getStatusList().size();
        Status status = new Status();
        Double maxLoad =3600.0;
        Double realLoad = maxLoad-counter*300;
        status.addAkku(new Akku(counter, maxLoad, realLoad));

        for (int i = 1; i <= counter; i++) {
            Rotor.RotorPosition rotorPosition;
            switch (i){
                case 1:
                    rotorPosition= Rotor.RotorPosition.FRONT_LEFT;
                    break;
                case 2:
                    rotorPosition= Rotor.RotorPosition.FRONT_RIGHT;
                    break;
                case 3:
                    rotorPosition= Rotor.RotorPosition.BACK_LEFT;
                    break;
                case 4:
                    rotorPosition= Rotor.RotorPosition.BACK_RIGHT;
                    break;
                default:
                    rotorPosition= Rotor.RotorPosition.BACK_RIGHT;
            }
            status.addRotor(getRandRotor(rotorPosition));
        }
        dronie.addStatus(status);
        System.out.println("Entered: " + status);
        System.out.println("Dronie has status count: " + dronie.getStatusList().size());
        Result result = Results.html();
        result.render("dronie", dronie);
        return result;

    }

    private Rotor getRandRotor(Rotor.RotorPosition rotorPosition){


        Integer rpm = RandomUtils.nextInt(16000);

        Double volt = 14.4 - RandomUtils.nextDouble();
        Integer milliAmpere = RandomUtils.nextInt(1600);
        Integer watts = RandomUtils.nextInt(100);

        Rotor rotor = new Rotor(rotorPosition, rpm, volt, milliAmpere, watts);
        return rotor;
    }

    public Dronie getDronie() {
        return dronie;
    }

    public void setDronie(Dronie dronie) {
        this.dronie = dronie;
    }
}
