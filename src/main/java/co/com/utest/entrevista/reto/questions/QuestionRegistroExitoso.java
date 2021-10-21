package co.com.utest.entrevista.reto.questions;

import co.com.utest.entrevista.reto.tasks.CompletarRegistro;
import co.com.utest.entrevista.reto.userinterface.PaginaCompletarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.model.TakeScreenshots;

import javax.swing.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class QuestionRegistroExitoso implements Question<String> {


  public QuestionRegistroExitoso(){

    }

    public static QuestionRegistroExitoso mensajeExitoso () {

        return new QuestionRegistroExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {
      actor.attemptsTo(
              WaitUntil.the(PaginaCompletarRegistro.QUESTION_FINALDEREGISTRO, isPresent()).forNoMoreThan(15).seconds()
      );
      return  Text.of(PaginaCompletarRegistro.QUESTION_FINALDEREGISTRO).viewedBy(actor).asString();

    }
}
