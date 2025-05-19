package aug.ex_10082024.ECapsution;

public class Lab180_ICICIBank {
    public static void main (String [] args) {
        ICICIBank naga = new ICICIBank("Naga", 10000);
        //iciciBank1.name = "Nagarajan"; // Not allowed as the data member is private; use setter
        System.out.println(naga.getName()+", "+naga.getBalance());
        naga.setName("Nagarajan");
        naga.setBalance(15000, false);
        System.out.println(naga.getName()+", "+naga.getBalance());

        ICICIBank admin = new ICICIBank("admin", 20000);
        System.out.println(admin.getName()+", "+admin.getBalance());
        admin.setName("ADMIN");
        admin.setBalance(25000,true);
        System.out.println(admin.getName()+", "+admin.getBalance());
    }

}
