package aug.ex_10082024.RealTimeInheritance;

public class RealTimeInheritance {
    public static void main (String [] args) {
        BaseClass t1 = new TestCase1(); //Dynamic dispatch
        t1.setBrowser("Chrome",true);
        t1.openBrowser("Chrome");
    }
}

class BaseClass {
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth)
        this.browser = browser;
        else System.out.println("Not allowed as you are not authenticated");
    }
    void openBrowser (){
        System.out.println("Chrome Browser!!");
    }
    void openBrowser (String browserName){
        System.out.println("Open Browser!! --> " + browserName);
    }
}

class TestCase1 extends BaseClass {
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser,isAuth);
    }
}