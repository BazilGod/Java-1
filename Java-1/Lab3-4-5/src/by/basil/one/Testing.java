package by.basil.one;
import org.testng.Assert;
import org.testng.annotations.*;
public class Testing {
    private Shturmovik shturmovik;

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("@BeforeSuite");
    }
    @BeforeTest
    public void testBeforeTest() {
        System.out.println("@BeforeTest");
        AirCompany BSTU = new AirCompany();
        Shturmovik shturmovik = BSTU.CreateShtur();
        shturmovik.Name = "NVX-200";
        shturmovik.timenaliota = 1200;
        shturmovik.ChooseOil("Podsolnechnoe");
        shturmovik.salary = 2200;
        shturmovik.Fly();
        shturmovik.level = "Very Hard";
        shturmovik.UpgradeShturmovik(  shturmovik);
        shturmovik.MoreSalary();

    }
    @BeforeGroups
    public void testBeforeGroups() {
        System.out.println("@BeforeGroups");
    }
    @BeforeClass
    public void testBeforeClass() {
        System.out.println("@BeforeClass");
    }
    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterSuite
    public void testASuite() {
        System.out.println("@AfterSuite");
    }
    @AfterTest
    public void testATest() {
        System.out.println("@AfterTest");
    }
    @AfterGroups
    public void testAGroups() {
        System.out.println("@AfterGroups");
    }
    @AfterClass
    public void testAClass() {
        System.out.println("@AfterClass");
    }
    @AfterMethod
    public void testAMethod() {
        System.out.println("@AfterMethod");
    }

    // тест конструктора
    @Test(alwaysRun = true)
    public void testObject(){
        try{
            if(shturmovik == null)
                throw new NullPointerException();
            Assert.assertEquals(shturmovik.getName(), "NVX-200");
            Assert.assertEquals(shturmovik.getOil() , "Podsolnechnoe");
            System.out.println("@Test");
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //assert
    @Test(enabled = true)
    public void ExTst(){
        Assert.fail();
    }
    //timeout
    @Test(timeOut = 100)
    public void ignoredTest(){
        System.out.println("Ignored");
    }
    //groups
    @Test(groups = {"Group"})
    public void test1Group(){
        System.out.println("method 1 test in group");
    }
    @Test(groups = {"Group"})
    public void test2Group(){
        System.out.println("method 2 test in group");
    }
    @Test(dependsOnGroups = "Group")
    public void testGroup(){
        System.out.println("Group test");
    }
}
