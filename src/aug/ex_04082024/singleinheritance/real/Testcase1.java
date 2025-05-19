package aug.ex_04082024.singleinheritance.real;

public class Testcase1 extends BaseTest{
    void testCase1(){
        startBrowser();
        getDataFromSql();
        System.out.println(gold);
        closeBrowser();
    }
}
