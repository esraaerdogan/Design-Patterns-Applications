public class App {
    public static void main(String[] args) throws Exception {
        
        Oracle oracle = new Oracle();
        Adapter adapter = new Adapter();

        // Oracle veritabanı üzerinden işlem
        Service service1 = new Service(oracle);
        service1.addUser(new User("Test 1"));
        service1.addUser(new User("Test 2"));
        service1.addUser(new User("Test 3"));
        User user1 = service1.getUser(2);
        System.out.println("[Oracle]: Bulunan kullanıcı: " + user1.getName());

        // Mssql veritabanı Adapter ile kullanılıyor
        Service service3 = new Service(adapter);
        service3.addUser(new User("Test 4"));
        service3.addUser(new User("Test 5"));
        service3.addUser(new User("Test 6"));
        User user2 = service3.getUser(1);
        System.out.println("[Mssql (Adapter)]: Bulunan kullanıcı: " + user2.getName());
    }
} 