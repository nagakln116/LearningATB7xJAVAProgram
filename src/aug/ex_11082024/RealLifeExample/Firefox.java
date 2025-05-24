package aug.ex_11082024.RealLifeExample;

public class Firefox extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Opening the browser:  "+ browser);
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the browser:  "+ browser);
        return "";
    }
    @Override
    void takeScreenShot() {
        System.out.println("Taking Screenshot");
    }
}
