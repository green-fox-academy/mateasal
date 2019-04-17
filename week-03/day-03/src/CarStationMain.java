public class CarStationMain {

    public static void main(String[] args) {

        Station station = new Station(1200);

        Car car = new Car();

        while (station.gasAmount != 0){
            station.refill(car);
        }

        System.out.println(car.getGasAmount());
    }
}
