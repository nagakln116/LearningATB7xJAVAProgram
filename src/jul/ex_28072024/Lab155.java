package jul.ex_28072024;

public class Lab155 {
    public static void main(String[] args) {
        Building_BP builder1 = new Building_BP();
        builder1.builder_name = "DLF";
        builder1.number_of_floors = 10;
        builder1.number_of_rooms = 15;
        builder1.number_of_restrooms = 20;
        builder1.use_lift();

        Building_BP builder2 = new Building_BP();
        builder2.builder_name = "Prestige";
        builder2.number_of_rooms = 10;
        builder2.number_of_restrooms = 20;
        builder2.number_of_floors = 10;
        builder2.use_lift();
    }
}
