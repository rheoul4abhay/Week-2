package RideHailingApplication;

public class GPSImpl implements GPS {

    private String location;

    public GPSImpl(String initialLocation){
        this.location = initialLocation;
    }

    @Override
    public String getCurrentLocation(){
        return "Current location: " + location;
    }

    @Override
    public void updateLocation(String newLocation){
        this.location = newLocation;
    }
}
