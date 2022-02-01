package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target UNIVERSITY_CARD = Target.the("Card to select Choucair University")
            .located(By.className("card_index"));
    public static final Target SEARCH_FIELD = Target.the("Search Box to write the course to search")
            .located(By.id("coursesearchbox"));
    public static final Target SEARCH_BUTTON = Target.the("Button to search the course")
            .locatedBy("//button[@class = 'btn btn-secondary']");
    public static final Target COURSE_LINK = Target.the("Link of searched course")
            .locatedBy("//h4/a[contains(text(), 'Patrones')]");
    public static final Target NAME_COURSE = Target.the("Name of the course")
            .locatedBy("//h3//a[contains(text(), 'Patrones')]");

}
