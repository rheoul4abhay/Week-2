package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable{

    private String insurancePolicyNumber;

    public Bike(String bikeNumber, double bikeRentalRate, String insurancePolicyNumber){
        super(bikeNumber, "Bike", bikeRentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days){
        return (getVehicleRentalRate() * (double)(days));
    };

    @Override
    public double calculateInsurance(){
        return getVehicleRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails(){
        return "Policy Number: " + insurancePolicyNumber;
    }
}
