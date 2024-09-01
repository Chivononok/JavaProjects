package ExceptionsAndFiles;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 2L;
    private String model;

    public Car(String model){
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public String toString(){
        return "Car{model=" + model + "}";
    }
}
