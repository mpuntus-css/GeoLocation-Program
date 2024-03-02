/*
 * This program constructs several PlaceInformation objects and prints
 * information about them and the distances between them and two locations
 * (London and the Aerial Lift Bridge).  It is intended to be used to test 
 * whether the PlaceInformation class is implemented correctly.
 */
package geolocation;

public class PlaceInformationClient
{
    public static void main(String[] args) {
        
        PlaceInformation css = new PlaceInformation("The College of Saint Scholastica", "1200 Kenwood Avenue, Duluth, MN 55811", "College", 46.816305, -92.104850);
        PlaceInformation mallOfAmerica = new PlaceInformation("Mall of America", "4001 Stevens Way", "Shopping Center", 44.855020, -93.242120);
        PlaceInformation lakeItascaStatePark = new PlaceInformation("Lake Itasca State Park", "36750 Main Park Drive, Park Rapids, MN 56470", "State Park", 47.246374, -95.212163);
           
        
        PlaceInformation[] data = {css, mallOfAmerica, lakeItascaStatePark};

        GeoLocation london = new GeoLocation(51.5112139, -0.1198244);
        GeoLocation aerialLiftBridge = new GeoLocation(46.778516,-92.092570);

        for (PlaceInformation info : data) {
            System.out.println("name    : " + info.getName());
            System.out.println("address : " + info.getAddress());
            System.out.println("tags    : " + info.getTag());
            System.out.println("toString: " + info);
            System.out.println("London  : " + info.distanceFromNewMethod(london));
            System.out.println("Aerial Lift Bridge: " + info.distanceFromNewMethod(aerialLiftBridge));
            System.out.println();
        }
        
    }
}
