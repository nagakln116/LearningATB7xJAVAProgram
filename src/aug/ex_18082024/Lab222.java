package aug.ex_18082024;

public class Lab222 {
    public static void main(String[] args) {
        //throw
        //Custom exception
        Bank sbi = new Bank("inr",100);
        Bank icici = new Bank("inr",1000);

        Integer total = sbi.add(icici);
        System.out.println(total);

        Bank jpmorgan = new Bank("usd",2000);
        Integer total2 = sbi.add(jpmorgan);
        System.out.println(total2);

    }
}
