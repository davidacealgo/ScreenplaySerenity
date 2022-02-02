package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.SearchCoursePage;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.UNIVERSITY_CARD),
                Enter.theValue(course).into(SearchCoursePage.SEARCH_FIELD),
                Click.on(SearchCoursePage.SEARCH_BUTTON),
                Scroll.to(SearchCoursePage.COURSE_LINK).andAlignToBottom(),
                Click.on(SearchCoursePage.COURSE_LINK));

    }
}
