import java.util.ArrayList;
import java.util.List;

public class Mssql{

    private final List<User> userList;
    private int idCounter;

    public Mssql(){
        idCounter = 0;
        userList = new ArrayList<>();
    }
    
    public User userByID(int id){
        System.out.println("[Mssql]: Kullanıcı aranıyor...");
        for(User user:userList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public void user(User user){
        user.setId(idCounter++);
        userList.add(user);
        System.out.println("[Mssql]: Kullanıcı eklendi: " + user.getName() + " (ID: " + user.getId() + ")");
    }
}