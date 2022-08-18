package plt.learning;

import com.sun.tools.javac.Main;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

import java.util.logging.Logger;


/**
 * Hello world!
 */

@AllArgsConstructor
@Log
public class App {

    Boolean a;
    Boolean b;
    Boolean c;

    //do loggera
//    private static final Logger logo = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        new App(true, true, true) {
        };

        ExampleModel exampleModel = new ExampleModel();

        exampleModel.setAge(5);
        exampleModel.setHeight(160);
        exampleModel.setWidth(90);
        exampleModel.setHairColor("Brown");
        exampleModel.setMale(true);

        System.out.println(exampleModel);

        //@EqualsAndHashCode
        //standardowe porownanie equalsnie nadpisanym da false
        //zeby porownalo na podstawie naszych wymagan to nadpisujemy equals
        //potem lombok

        ExampleModel exampleModelDuplicate = new ExampleModel();

        exampleModelDuplicate.setAge(5);
        exampleModelDuplicate.setHeight(160);
        exampleModelDuplicate.setWidth(90);
        exampleModelDuplicate.setHairColor("Brown");
        exampleModelDuplicate.setMale(true);
        System.out.println(exampleModelDuplicate);

        System.out.println(exampleModelDuplicate.equals(exampleModelDuplicate)); //false

        //z uzyciem buildera, w klasie ExampleModel dodalem @Builder
        //teraz na obiekcie example model statycznie wywoluje builder
        //nastepnie na nim ustawiam parametry

        ExampleModel exampleModel3 = ExampleModel.builder()
                .hairColor("black")
                .age(5)
                .isMale(true)
                .width(44).build();

        System.out.println(exampleModel3);

        log.info("komunikat x logo");
    }
}
