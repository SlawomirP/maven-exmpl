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

        System.out.println("Hello World!");

    }
}
