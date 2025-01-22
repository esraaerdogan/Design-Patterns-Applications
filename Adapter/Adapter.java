public class Adapter implements DB {

    private Mssql mssql;

    public Adapter(){ 
        mssql = new Mssql(); 
    }

    @Override
    public User selectUserById(int id) {
        System.out.println("[Adapter]: Mssql veritabanından kullanıcı aranıyor...");
        return mssql.userByID(id);
    }

    @Override
    public void insertUser(User user) {
        System.out.println("[Adapter]: Mssql veritabanına kullanıcı ekleniyor...");
        mssql.user(user);
    }
}