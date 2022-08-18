package plt.learning;

import lombok.AllArgsConstructor;


/**
 * Hello world!
 */

@AllArgsConstructor
public class App {
    Boolean a;
    Boolean b;
    Boolean c;

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

    }
}
