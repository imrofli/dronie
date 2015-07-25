package controllers;

import com.google.inject.Inject;
import domain.Dronie;
import ninja.Result;
import ninja.Results;

/**
 * Created by imrofli on 24.07.2015.
 */
public class VisionController {
    @Inject
    private Dronie dronie;

    public Result vision() {

        Result result = Results.html();
        return result;
    }
}
