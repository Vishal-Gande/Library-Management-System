import java.util.ArrayList;

public class member {

    public String name;
    public int age;
    public int member_id;
    public String email;
    public String mobile;
    public ArrayList<Integer> borrowed;

    public member(String name, int age, int member_id, String email, String mobile){
        this.name = name;
        this.age = age;
        this.member_id = member_id;
        this.email = email;
        this.mobile = mobile;
    }

}
