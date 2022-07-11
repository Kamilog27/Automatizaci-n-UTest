package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage extends PageObject {
    public static final Target JOIN_BUTTON=Target.the("Boton de Join Today ").located(By.cssSelector("body > ui-view > unauthenticated-container > div > div > unauthenticated-header > div > div.unauthenticated-nav-bar__links.navbar-right.hidden-sm.hidden-xs > ul:nth-child(2) > li:nth-child(2) > a"));
    public static final Target INPUT_FIRST_NAME=Target.the("Input para el primer nombre").located(By.cssSelector("#firstName"));
    public static final Target INPUT_LAST_NAME=Target.the("Input para el apellido").located(By.cssSelector("#lastName"));
    public static final Target INPUT_EMAIL=Target.the("Input para el email").located(By.cssSelector("#email"));
    public static final Target SELECT_MONTH=Target.the("Seleccionar mes de nacimiento").located(By.cssSelector("#birthMonth"));
    public static final Target SELECT_DAY=Target.the("Seleccionar dia de nacimiento").located(By.cssSelector("#birthDay"));
    public static final Target SELECT_YEAR=Target.the("Seleccionar año de nacimiento").located(By.cssSelector("#birthYear"));
    public static final Target BUTTON_NEXT=Target.the("Boton Siguiente Ubicación").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group.col-xs-12.text-right > a"));
    public static final Target BUTTON_NEXT_U=Target.the("Boton Siguiente Dispositivo").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(2) > div > a"));
    //public static final Target DEVICE_NAME=Target.the("Seleccionar Dispositivo").located(By.cssSelector("#mobile-device > div:nth-child(1) > div.ui-select-box > div"));
    //public static final Target DEVICE_NAME_SAMSUNG=Target.the("Seleccion Samsung").located(By.cssSelector("#ui-select-choices-row-15-37 > span > div"));
    public static final Target BUTTON_NEXT_STEP=Target.the("Boton Siguiente Paso").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > div:nth-child(2) > div > a"));
    public static final Target INPUT_PASSWORD=Target.the("Input contraseña").located(By.cssSelector("#password"));
    public static final Target INPUT_CONFIRM_PASSWORD=Target.the("Input Verificación contraseña").located(By.cssSelector("#confirmPassword"));
    public static final Target CHECK_TERM_COND=Target.the("Check de terminos y condiciones").located(By.cssSelector("#termOfUse"));
    public static final Target CHECK_PRIVACY=Target.the("Check de privacidad").located(By.cssSelector("#privacySetting"));
    public static final Target BTN_COMPLETE=Target.the("Boton de completado").located(By.cssSelector("#laddaBtn"));
    public static final Target MESSAGE_WELCOME=Target.the("Mensaje de Bienvenida").located(By.cssSelector("#mainContent > div > div > div.image-box.gradient-cold-hero > div > h1"));







}
