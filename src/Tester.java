public class Tester {
    public static void main(String[] args) {

        Plane trusty = new Plane("Cessna", 100, 10000, 30000);


        System.out.println("Plane make: " + trusty.getMake());

        System.out.println("Plane fuel level: " + trusty.getFuel_level() + "%");

        System.out.println("Plane current altitude: " + trusty.getCurrent_altitude());

        System.out.println("Plane max altitude: " + trusty.getMax_altitude());

        trusty.ascend(10000);

        System.out.println("Plane current altitude: " + trusty.getCurrent_altitude());

        trusty.descend(13000);

        System.out.println("Plane current altitude: " + trusty.getCurrent_altitude());


    }
}
