package server.model;

public class AffectiveDataModel {
    private float interest = 0;
    private float engagement = 0;
    private float stress = 0;
    private float relaxation = 0;
    private float excitement = 0;
    private float focus = 0;

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public float getEngagement() {
        return engagement;
    }

    public void setEngagement(float engagement) {
        this.engagement = engagement;
    }

    public float getStress() {
        return stress;
    }

    public void setStress(float stress) {
        this.stress = stress;
    }

    public float getRelaxation() {
        return relaxation;
    }

    public void setRelaxation(float relaxation) {
        this.relaxation = relaxation;
    }

    public float getExcitement() {
        return excitement;
    }

    public void setExcitement(float excitement) {
        this.excitement = excitement;
    }

    public float getFocus() {
        return focus;
    }

    public void setFocus(float focus) {
        this.focus = focus;
    }

    @Override
    public String toString() {
        return "AffectiveData{" +
                "interest=" + interest +
                ", engagement=" + engagement +
                ", stress=" + stress +
                ", relaxation=" + relaxation +
                ", excitement=" + excitement +
                ", focus=" + focus +
                '}';
    }
}
