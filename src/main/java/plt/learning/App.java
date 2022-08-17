package plt.learning;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Lombok;

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

        exampleModel.getWidth();




        System.out.println("Hello World!");

        new Gson();

        new Lombok();


    }
}
