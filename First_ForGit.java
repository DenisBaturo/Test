import java.util.*;

public class Level1_2 {

    public static int odometer(int [] oksana) {

        int t = 0;      // Количество времени
        int v = 0;      // Количество скорости
        int t_pre = 0;  // Для сохранения предыдущего значения времени.
        int s = 0;      // Дистанция.

        for(int i = 0; i < oksana.length; i++){
            
            if((i % 2) == 0){
                v = oksana[i];     
                t_pre = t;          // Запоминаем предыдущее значение времени.
                t = oksana[i+1];    
                s += v * (t - t_pre);
            }
        }

        // Общая формула для вычисления скорости.
        return s;
    }
}
