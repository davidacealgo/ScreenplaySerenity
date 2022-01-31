package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Button to shows the form of login")
            .located(By.xpath("//a[@class='btn btn-info btn-sm text-white']/"));

    public static Target USERNAME = Target.the("Username field to login")
            .located(By.id("username"));

    public static Target PASSWORD = Target.the("Password field to login")
            .located(By.id("password"));

    public static Target ENTER_BUTTON = Target.the("Button to confirm login")
            .located(By.xpath("//button[@class='btn btn-primary']"));
}
