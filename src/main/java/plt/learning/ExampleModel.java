package plt.learning;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ExampleModel {

    @Getter @Setter
    private String hairColor;
    @Getter @Setter
    private int height;
    @Getter @Setter
    private int width;
    @Getter @Setter
    private boolean isMale;
    @Getter @Setter
    private int age;


    //normalnie dajemy settery i gettery

//    public String getHairColor() {
//        return hairColor;
//    }
//
//    public void setHairColor(String hairColor) {
//        this.hairColor = hairColor;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public boolean isMale() {
//        return isMale;
//    }
//
//    public void setMale(boolean male) {
//        isMale = male;
//    }
}
