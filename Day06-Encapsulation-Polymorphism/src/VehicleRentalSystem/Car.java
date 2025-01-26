package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String carNumber, double carRentalRate, String insurancePolicyNumber){
        super(carNumber, "Car", carRentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days){
        return (getVehicleRentalRate() * (double)(days));
    };

    @Override
    public double calculateInsurance(){
        return getVehicleRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails(){
        return "Policy Number: " + insurancePolicyNumber;
    }
}
