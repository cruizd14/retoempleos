package co.com.choucair.prueba.retoempleos.task;

import co.com.choucair.prueba.retoempleos.userinterfaces.Empleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegacionEmpleosReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Empleos.PREPARARSE)


        );
    }
    public static NavegacionEmpleosReto makeinformation(){
        return instrumented(NavegacionEmpleosReto.class);
    }
}
