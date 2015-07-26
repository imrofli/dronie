package controllers;

import com.google.inject.Inject;
import domain.Dronie;
import ninja.Result;
import ninja.Results;
import ninja.params.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by imrofli on 24.07.2015.
 */
public class ControlsController {
    Logger logger = LoggerFactory.getLogger(ControlsController.class);


    @Inject
    private Dronie dronie;

    public enum ControlSheme {
        KEYBOARD,
        CONTROLLER
    }
    ControlSheme controlScheme;

    public Result control(@Param("controlscheme") String controlscheme) {
        logger.info("selected " + controlscheme + " controls");
        if(controlscheme.equals("controller")){
            controlScheme=ControlSheme.CONTROLLER;
        }
        else{
            controlScheme=ControlSheme.KEYBOARD;
        }

        Result result = Results.html();
        result.render("controlscheme", controlScheme);
        return result;
    }
}
