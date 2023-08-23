package entity;

public class Reservation {
    private int reservationId;
    private String carrierReservationNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int seatNumber;

    public Reservation() {
    }

    public Reservation(int reservationId, String carrierReservationNumber, String origin, String destination, String departureTime, int seatNumber) {
        this.reservationId = reservationId;
        this.carrierReservationNumber = carrierReservationNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seatNumber = seatNumber;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getCarrierReservationNumber() {
        return carrierReservationNumber;
    }

    public void setCarrierReservationNumber(String carrierReservationNumber) {
        this.carrierReservationNumber = carrierReservationNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", carrierReservationNumber='" + carrierReservationNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
