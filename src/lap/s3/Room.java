package lap.s3;

import javax.naming.Name;
import java.util.ArrayList;

public class Room {
    String name;
    String add;
    ArrayList<String> user;

    public Room() {
        user = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String naMe) {
        this.name = naMe;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public ArrayList<String> getUser() {
        return user;
    }

    public void setUser(ArrayList<String> user) {
        this.user = user;
    }

    public void addUser(String us){
        user.add(us);
    }

    public void removeUser(String u){
        user.remove(u);
    }

    public void In(){
        System.out.println(""+getName());
        System.out.println(""+getAdd());
        for (String i:user){
            System.out.println(i);
        }
    }
}
