package entities;

public class OutsourcedEmployee extends Employee {
    private double adicionalCharge;

    public OutsourcedEmployee(){
      super();  
    }
    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, double adicionalCharge){
        super(name, hour, valuePerHour);
        this.adicionalCharge = adicionalCharge;
    }

    
    public double getAdicionalCharge() {
        return adicionalCharge;
    }
    public void setAdicionalCharge(double adicionalCharge) {
        this.adicionalCharge = adicionalCharge;
    }
    
    @Override
    public final double payment(){
        return super.payment() + (adicionalCharge*(110/100));

    }

    
}
