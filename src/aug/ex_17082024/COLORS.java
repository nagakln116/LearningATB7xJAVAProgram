package aug.ex_17082024;

public enum COLORS {
   RED("#ff0000"), BLUE ("#f0d0d0d"), GREEN ("#f0d0d0e");
   private String hexValue;
    COLORS(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getValue() {
        return hexValue;
    }
}
