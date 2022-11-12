package package1;


import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class Class1 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }


    public void test1() {
        String name = "Kareem";
        Assert.assertTrue(name.contains("ree"));
        System.out.println(name);
    }

    public void test2() {
        Assert.assertTrue(true);
    }

    public void test3() {
        Assert.assertTrue(true);
    }

    public void test4() {
        Assert.assertTrue(true);
    }

    public void ensureName() {
        Assert.assertTrue(true);
        System.out.println("ensure");
    }


}
