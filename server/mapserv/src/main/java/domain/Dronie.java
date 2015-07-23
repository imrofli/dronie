package domain;

import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imrofli on 23.07.2015.
 */
@Singleton
public class Dronie {


    private List<Status> statusList = new ArrayList<>();

    public List<Status> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Status> statusList) {
        this.statusList = statusList;
    }

    public void addStatus(Status status){
        statusList.add(status);
    }

    public Status getNewestStatus(){
        return statusList.get(statusList.size()-1);
    }
}
