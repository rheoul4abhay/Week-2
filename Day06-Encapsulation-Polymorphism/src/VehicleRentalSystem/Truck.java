package VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String truckNumber, double truckRentalRate, String insurancePolicyNumber){
        super(truckNumber, "Truck", truckRentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days){
        return (getVehicleRentalRate() * (double)(days));
    };

    @Override
    public double calculateInsurance(){
        return getVehicleRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails(){
        return "Policy Number: " + insurancePolicyNumber;
    }
}
