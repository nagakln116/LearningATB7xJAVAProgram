package aug.ex_04082024.singleinheritance.real;

public class TestCase2 extends BaseTest{
    void testCase2 (){
        startBrowser();
        getDataFromSql();
        System.out.println(gold);
        closeBrowser();
    }
}
