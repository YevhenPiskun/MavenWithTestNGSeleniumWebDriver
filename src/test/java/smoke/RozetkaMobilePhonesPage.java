package smoke;

import model.HomePage;
import model.ResultElement;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RozetkaMobilePhonesPage extends BaseTest {

    @Test
    public void testHeader() {
        driver.get(BASE_URL + "mobile-phones/c80003/");
        HomePage home = new HomePage(driver);
        ResultElement result = home.getHeader();
        assertThat(result.findText()).contains("Мобільні телефони");
    }
}