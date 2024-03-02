package geolocation;

public class GeoLocationClient {
    
    


    public static void main(String[] args) {
        GeoLocation stash = new GeoLocation(34.988889, -106.614444);
        System.out.println("The stash is at " + stash);

        GeoLocation studio_ABQ = new GeoLocation(34.989978, -106.614357);
        System.out.println("ABQ studio is at " + studio_ABQ);

        GeoLocation building_FBI = new GeoLocation(35.131281, -106.61263);
        System.out.println("FBI building is at " + studio_ABQ);

        System.out.println("Distance in miles between:");
        System.out.println("From stash to studio = " + stash.distanceFrom(studio_ABQ));
        System.out.println("From stash to building = " + building_FBI.distanceFrom(stash));


        

    }
}
