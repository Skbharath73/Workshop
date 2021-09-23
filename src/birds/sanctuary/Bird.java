package birds.sanctuary;

import java.util.Objects;

public class Bird {
    String name;
    String color;
    String ID;
    String gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return  Objects.equals(ID, bird.ID) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ID='" + ID + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
