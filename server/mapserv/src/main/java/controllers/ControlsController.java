package controllers;

import com.google.inject.Inject;
import domain.Dronie;
import ninja.Result;
import ninja.Results;
import ninja.params.Param;

/**
 * Created by imrofli on 24.07.2015.
 */
public class ControlsController {
    @Inject
    private Dronie dronie;

    public enum ControlSheme {
        KEYBOARD,
        CONTROLLER
    }
    ControlSheme controlScheme;

    public Result control(@Param("controlscheme") String controlscheme) {
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
