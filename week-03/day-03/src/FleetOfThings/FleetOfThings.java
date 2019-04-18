package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Fleet newFleet = new Fleet();

        Thing item1 = new Thing("Get milk");
        Thing item2 = new Thing("Remove the obstacles");
        Thing item3 = new Thing("Stand up");
        Thing item4 = new Thing("Eat lunch");


        newFleet.add(item1);
        newFleet.add(item2);
        newFleet.add(item3);
        newFleet.add(item4);

        item3.complete();
        item4.complete();

        System.out.println(newFleet);
    }
}