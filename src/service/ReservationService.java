package service;

import entity.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation getByReservationId(int id) throws Exception;
    void addReservation(Reservation reservation);
    void deleteReservation(int id);
     void updateReservation(Reservation updatedReservation);
    List<Reservation> getAllReservations(int id);
    List<Reservation> getAllByOrigin(int length);
    List<Reservation> getAllByDestination(int length);
    List<Reservation> getAllBySeatNumber(int seatNumber);
}
