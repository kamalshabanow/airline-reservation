package serviceImpl;

import entity.Reservation;
import exception.MyException;
import service.ReservationService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReservationServiceImpl implements ReservationService {

    static ArrayList<Reservation> reservationArrayList = new ArrayList<>();

    static {
        reservationArrayList.add(new Reservation(1, "X792X2", "Baku", "Moscow", " 1 September 01:00", 12));
        reservationArrayList.add(new Reservation(2, "AS238S", "Istanbul", "Vilnus", " 25 August 05:00", 25));
        reservationArrayList.add(new Reservation(3, "BJ2H89", "Baku", "Roma", " 28 August 17:00", 30));
        reservationArrayList.add(new Reservation(4, "QW23RT", "Berlin", "Vashington", " 5 September 03:00", 19));
        reservationArrayList.add(new Reservation(5, "3DJ37G", "Madrid", "New-York", " 8 September 10:00", 5));
        reservationArrayList.add(new Reservation(6, "12KHD8", "Ankara", "Lissabon", " 3 September 12:00", 33));
    }

    @Override
    public Reservation getByReservationId(int id) throws Exception {
        return reservationArrayList.get(id - 1);

    }

    @Override
    public void addReservation(Reservation reservation) {
        reservationArrayList.add(reservation);

    }

    @Override
    public void deleteReservation(int id) {
        reservationArrayList.remove(id);
    }

    @Override
    public List<Reservation> getAllReservations(int id) {
        return reservationArrayList;
    }

    @Override
    public List<Reservation> getAllByOrigin(int length) {
        Reservation originObject = (Reservation) reservationArrayList.stream().filter(reservation -> reservation.getOrigin().length() > length).collect(Collectors.toList());
        return (List<Reservation>) originObject;
    }

    @Override
    public List<Reservation> getAllByDestination(int length) {
        Reservation destinationObject = (Reservation) reservationArrayList.stream().filter(reservation -> reservation.getDestination().length() < length).collect(Collectors.toList());
        return (List<Reservation>) destinationObject;
    }

    @Override
    public List<Reservation> getAllBySeatNumber(int seatNumber) {
        return reservationArrayList.stream().filter(reservation -> reservation.getSeatNumber() < seatNumber).collect(Collectors.toList());
    }

    private List<Reservation> reservations = new ArrayList<>();

    @Override
    public void updateReservation(Reservation updatedReservation) {
        int reservationId = updatedReservation.getReservationId();
        reservations.stream()
                .filter(reservation -> reservation.getReservationId() == reservationId)
                .findFirst()
                .ifPresent(reservation -> reservations.set(reservationId - 1, updatedReservation));
    }
}
