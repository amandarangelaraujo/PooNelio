package entities;

public class Employee {
    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee(){

    }

    public Employee(String name, Integer hour, Double valuePerHour){
        this.name = name;
        this.hour =  hour;
        this.valuePerHour = valuePerHour;
    }
    
    
    public String getName() {
        System.out.println(name);
        return name;
    }
    public Integer getHour() {
        return hour;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }


    public double payment(){
        return hour*valuePerHour;
    }

}
