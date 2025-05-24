package aug.ex_11082024.RealLifeExample;

public class Lab189 {
    public static void main (String [] args){
        Chrome c1 = new Chrome();
        c1.openBrowser("Chrome");
        c1.takeScreenShot();
        c1.closeBrowser("Chrome");


        Firefox f1 = new Firefox();
        f1.openBrowser("Firefox");
        f1.takeScreenShot();
        f1.closeBrowser("Firefox");

    }
}
