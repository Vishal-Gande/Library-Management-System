import java.util.Scanner;

public class client {


    public static void main(String[] args) {

        libraryManager libMgr = new libraryManager();

        libMgr.add_member("vish", 27, 4563, "vish@gmail.com", "9123456781");
        libMgr.add_member("prav", 27, 4564, "prav@gmail.com", "9123456782");
        libMgr.add_member("neethu", 27, 4565, "neethu@gmail.com", "9123456783");

        libMgr.add_book(24, "system design", "Alex", 2021, "978-1-345-45985-5");
        libMgr.add_book(25, "Half-girlfriend", "Ravinder", 2006, "978-1-345-45985-6");
        libMgr.add_book(26, "Let's talk Money", "Monika Halan", 2018, "978-1-345-45985-7");
        libMgr.add_book(27, "The Psychology of Money", "Morgan Housel", 2020, "1387580086");



        libMgr.remove_member(4565);
        //libMgr.remove_book(24);

        libMgr.borrow_book(4563, 25);
        libMgr.borrow_book(4563, 26);

        libMgr.return_book(25, 4563);
        libMgr.borrow_book(4563, 24);


        System.out.println("all done!");

    }
}
