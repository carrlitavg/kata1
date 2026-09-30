package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person Carla = new Person("Carla", LocalDate.of(2006, 08, 26));
        System.out.println(Carla);
    }
}
