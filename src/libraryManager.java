import java.util.HashMap;
import java.util.Map;

public class libraryManager {

    // make this class singleton
    public int max_per_member = 2;
    public Map<Integer, member> members ; // memberID as key, member as value
    public Map<Integer, book> books ; // title as key, book as value

    public libraryManager() {
//          why are we initialising again?
//        Map<Integer, member> members --> here you are declaring a reference to a Map object.
//        However, this does not create an actual Map. At this point, members is null, which
//        means it does not point to any valid object in memory.
//        If you try to use this null reference, such as calling members.put(...), you’ll get a NullPointerException.

        members = new HashMap<Integer, member>();
        books = new HashMap<Integer, book>();
    }

    public void add_member(String name, int age, int member_id, String email, String mobile){
        member m = new member(name, age, member_id, email, mobile);
        members.put(member_id, m);
    }

    public void remove_member(int member_id){

        // taking back all his borrowed books
        for (int book_id : members.get(member_id).borrowed){
                this.return_book(book_id,member_id);
        }

        members.remove(member_id);
    }

    public void add_book(int id,String title, String author, int publicationYear, String ISBN){

        book b = new book(id, title, author, publicationYear, ISBN);
        books.put(id,b);
    }

    public void remove_book(int id){
        books.remove(id);
    }

    public void borrow_book(int member_id, int book_id){

        if(members.get(member_id).borrowed.size() < max_per_member )
        {
            if(books.containsKey(book_id) && books.get(book_id).status == book_status.AVAILABLE){

                books.get(book_id).status = book_status.NOT_AVAILABLE; // Change status
                members.get(member_id).borrowed.add(book_id);

                System.out.println("Library member "+ members.get(member_id).name + "(" +
                        members.get(member_id).borrowed.size() + ") borrowed book" +
                        books.get(book_id).title + "(" + book_id + ")");
            }
            else{
                System.out.println("Sorry! Book isn't available");
            }
        }
        else{
            System.out.println("You've exceeded max books allowed per member. Don't be kanjoos, return a few");
        }

    }

    public void return_book(int book_id, int member_id){
        // make book available again

        books.get(book_id).status = book_status.AVAILABLE;
        members.get(member_id).borrowed.remove(Integer.valueOf(book_id));
//        In Java, ArrayList has two overloaded remove() methods:
//        1.	remove(int index) - Removes the element at the given index.
//        2.	remove(Object o) - Removes the first occurrence of the specified object.

    }
}
