package web.model;


public class Car {

    private String name;

    private String model;

    private Integer horsePowers;

    public Car(String name, String model, Integer horsePowers) {
        this.name = name;
        this.model = model;
        this.horsePowers = horsePowers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(Integer horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", horsePowers=" + horsePowers +
                '}';
    }
}
