package domain;

/**
 * Created by imrofli on 23.07.2015.
 */
public class Akku {

    private Integer akkuNumber;
    private Double maximumLoad=0.0;
    private Double remainingLoad=0.0;

    public Akku(Integer akkuNumber) {
        this.akkuNumber = akkuNumber;
    }

    public Akku(Integer akkuNumber, Double maximumLoad, Double remainingLoad) {
        this.akkuNumber = akkuNumber;
        this.maximumLoad = maximumLoad;
        this.remainingLoad = remainingLoad;
    }

    public Integer getAkkuNumber() {
        return akkuNumber;
    }

    public void setAkkuNumber(Integer akkuNumber) {
        this.akkuNumber = akkuNumber;
    }

    public Double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(Double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public Double getRemainingLoad() {
        return remainingLoad;
    }

    public void setRemainingLoad(Double remainingLoad) {
        this.remainingLoad = remainingLoad;
    }

    public Double getRemainingLoadPercentage(){
        return (100.0/maximumLoad) * remainingLoad;
    }

    @Override
    public String toString() {
        return "Akku{" +
                "akkuNumber=" + akkuNumber +
                ", maximumLoad=" + maximumLoad +
                ", remainingLoad=" + remainingLoad +
                '}';
    }
}
