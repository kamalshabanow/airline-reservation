import entity.Reservation;
import entity.User;
import exception.MyException;
import service.UserService;
import serviceImpl.ReservationServiceImpl;
import serviceImpl.UserServiceImpl;

import javax.naming.NameNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception, MyException {

        ReservationServiceImpl rsi = new ReservationServiceImpl();
//        try {
//            System.out.println(rsi.getByReservationId(10));
//
//        }catch(MyException myException) {
//            throw new MyException("Sehv bash verdi");
//        }


//        rsi.getAllReservations(1);
//        rsi.getAllByOrigin(10);
//        rsi.getAllBySeatNumber(5);
//        rsi.updateReservation(new Reservation());







        UserServiceImpl usi = new UserServiceImpl();
//        try {
//            usi.getByUserId(10);
//        }catch (MyException myException) {
//            throw new MyException("Sehv bash verdi");
//        }


//        usi.getAllByAge(10);
//        usi.getAllByNameCountCompare("Kamal");
//        usi.getAllByNameLength(4);
//        usi.getAllBySurnameLength(10);






    }
}