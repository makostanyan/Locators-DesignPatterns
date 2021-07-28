package steps;

import driver.DriverSingleton;
import io.cucumber.java.After;

public class Hook {

    @After()
    public void quiteDriver() {
        DriverSingleton.closeDriver();
    }
}
