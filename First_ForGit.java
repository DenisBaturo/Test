import java.util.*;

public class Level1 {

    public static int odometer(int [] oksana) {

        int t = 0;   // Общее количество времени
        int v = 0;   // Общее количество скорости

        for(int i = 0; i < oksana.length; i++){

            if((i % 2) == 0){
                v += oksana[i];      // Узнать общее количество скорости
            }
            else {
                t += oksana[i];     // Узнать общее количество времени
            }
        }

        // Общая формула для вычисления скорости.
        return v * t;
    }
}
