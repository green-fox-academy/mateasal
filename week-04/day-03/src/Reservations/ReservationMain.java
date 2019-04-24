package Reservations;

public class ReservationMain {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();

        /* for(int i = 0; i < 15; i++) {
            System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking() + ".");
        } */

        System.out.println(reservation.getCodeBooking());
    }
}
