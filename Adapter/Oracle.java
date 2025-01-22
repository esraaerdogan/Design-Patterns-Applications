import java.util.ArrayList;
import java.util.List;

public class Oracle implements DB{

    private final List<User> userList;
    private int idCounter;

    public Oracle(){
        idCounter = 0;
        userList = new ArrayList<>();
    }

    @Override
    public User selectUserById(int id) {
        System.out.println("[Oracle]: Kullanıcı aranıyor...");
        for(User user : userList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void insertUser(User user) {
        count();
        user.setId(idCounter);
        userList.add(user);
        System.out.println("[Oracle]: Kullanıcı eklendi: " + user.getName() + " (ID: " + user.getId() + ")");
    }

    private void count(){ 
        idCounter = idCounter +1; 
    }
}
