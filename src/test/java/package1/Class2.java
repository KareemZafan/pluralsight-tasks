package package1;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test
public class Class2 {

    @Test(groups = {"Group0"}, description = "Hello test1")
    public void test1() {
        Assert.assertTrue(true);
    }


    @Test(groups = {"Group0"})
    public void test2() {
        Assert.assertTrue(true);
    }

    @Test(groups = "Group1", dependsOnGroups = {"Group0"})
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test(groups = "Group1", dependsOnGroups = {"Group0"})
    public void test4() {
        Assert.assertTrue(true);
    }

    @BeforeGroups(groups = {"Group1"})
    public void beforeGroup1() {
        System.out.println("Before Group1");
    }

    @BeforeGroups(groups = {"Group0"})
    public void beforeGroup0() {
        System.out.println("Before Group0");
    }

}
