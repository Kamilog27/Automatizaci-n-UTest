package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.actions.Click;



public class Login implements Task {
    public static Performable onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.JOIN_BUTTON),
                Enter.theValue("Juan Camilo").into(UTestLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("Garcia Avella").into(UTestLoginPage.INPUT_LAST_NAME),
                Click.on(UTestLoginPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("March").from(UTestLoginPage.SELECT_MONTH),
                Click.on(UTestLoginPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("27").from(UTestLoginPage.SELECT_DAY),
                Click.on(UTestLoginPage.SELECT_YEAR),
                SelectFromOptions.byVisibleText("1999").from(UTestLoginPage.SELECT_YEAR),
                Enter.theValue("kaamilog2710@gmail.com").into(UTestLoginPage.INPUT_EMAIL),
                Click.on(UTestLoginPage.BUTTON_NEXT),
                Click.on(UTestLoginPage.BUTTON_NEXT_U),
                //Click.on(UTestLoginPage.DEVICE_NAME),
                //Click.on(UTestLoginPage.DEVICE_NAME_SAMSUNG));
                Click.on(UTestLoginPage.BUTTON_NEXT_STEP),
                Enter.theValue("1234Juan2022*").into(UTestLoginPage.INPUT_PASSWORD),
                Enter.theValue("1234Juan2022*").into(UTestLoginPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestLoginPage.CHECK_TERM_COND),
                Click.on(UTestLoginPage.CHECK_PRIVACY),
                Click.on(UTestLoginPage.BTN_COMPLETE));
    }
}
