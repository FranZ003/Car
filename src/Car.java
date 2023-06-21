public class Car {
    private String models;
    private String manufacturer;
    private int year;

    public Car(String models,String manufacturer,int year){
        this.models=models;
        this.manufacturer=manufacturer;
        this.year=year;
    }


    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
