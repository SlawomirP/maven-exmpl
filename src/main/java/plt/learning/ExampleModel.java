package plt.learning;

import lombok.*;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

import java.util.Objects;
@Builder
//jeżeli damy @Data to reszta pol nie jest porzebna
@Data
//-------------------------
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
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


    //normalnym sposobem tworzymy konstruktor, plus bezargumentowy
    //potem konstruktor lombok

//    public ExampleModel(String hairColor, int height, int width, boolean isMale, int age) {
//        this.hairColor = hairColor;
//        this.height = height;
//        this.width = width;
//        this.isMale = isMale;
//        this.age = age;
//    }
//
//    public ExampleModel() {
//    }

    //normalnie aby porownac obiekty wedlug naszych wymagan nadpisujemy
    //metode equals
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            ExampleModel that = (ExampleModel) o;
//            return height == that.height && width == that.width &&
//            isMale == that.isMale && age == that.age && Objects.equals(hairColor, that.hairColor);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(height, width, age);
//        }


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
