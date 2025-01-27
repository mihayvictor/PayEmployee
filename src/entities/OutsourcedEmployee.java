package entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;
    private final double CONSTANT = 1.1;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double additionalCharge(double additionalCharge){
        return additionalCharge * CONSTANT;
    }
  
    @Override
    public final Double paymant() {
        return super.paymant()+ additionalCharge(additionalCharge);
    }

}
