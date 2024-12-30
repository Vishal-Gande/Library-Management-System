public class borrowTransaction {
    public int borrow_id;
    public int member_id;
    public String date;
    public int amount;

    public borrowTransaction(int borrow_id, int member_id, String date, int amount) {

        this.borrow_id = borrow_id;
        this.member_id = member_id;
        this.date = date;
        this.amount = amount;
    }
}
