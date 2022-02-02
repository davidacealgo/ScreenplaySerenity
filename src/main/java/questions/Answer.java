package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean expectedResult = false;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        System.out.println(nameCourse);
        System.out.println(question);
        if (question.equals(nameCourse)){
            expectedResult= true;
        }
        return expectedResult;
    }
}
