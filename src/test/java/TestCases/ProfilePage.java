package TestCases;

import Base.BaseTest;
import org.example.Login;
import org.example.Profile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePage extends BaseTest {
    private Profile ProfilePage;
    private Login loginTest;

    @BeforeMethod(description = "This is the login test cases")
    public void setProfilePage() throws Exception {
        super.setUp();
        ProfilePage = new Profile(driver);
        loginTest = new Login(driver);
        loginTest.Loginapp();

    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyName() throws Exception {
        ProfilePage.SaveName();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifySaveAddressDetails() throws Exception {
        ProfilePage.SaveAddressDetails();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyUpdateTheImage() throws Exception {
        ProfilePage.UpdateTheImage();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyClusterHoldings() throws Exception {
        ProfilePage.ClusterHoldings();
    }
    @Test(description = "Verify the login ", priority = 0)
    public void VerifyTransaction() throws Exception {
        ProfilePage.Transaction();
    }

}
