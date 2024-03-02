package geolocation;

public class PlaceInformation {


    private String name;
    private String address;
    private String tag;
    private GeoLocation location;


        
    public PlaceInformation(String inName, String inAddress, String inTag, double inLatitude, double inLongitude) {
        name = inName;
        address = inAddress;
        tag = inTag; 
        location = new GeoLocation(inLatitude, inLongitude);
    
    }



    @Override
    public String toString() {
        return name + ", " + address + ", " + tag + ", " + location;
    }



    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }



    public String getTag() {
        return tag;
    }



    public GeoLocation getLocation() {
        return location;
    }

    public double distanceFromNewMethod(GeoLocation spot) {
        return location.distanceFrom(spot);
    }




}
