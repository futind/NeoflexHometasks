package ru.neoflex.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    /*
    volatile гарантирует, что при изменении этой переменной, все изменения,
    что были в очереди на применение, будут применены процессором, таким образом,
    все потоки будут получать корректное её значение
    */
    private static volatile Logger instance = null;

    private Logger() {}

    // Тут применена идиома Double-Checked locking, которая была объяснена в лекции
    // Я решил применить именно её, так как для меня это было чем-то новым.
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null)  {
                    instance = new Logger();
                }
            }
        }

        return instance;
    }

    public void classLog(Object object, String info) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println("Log info: " + date.format(formatter) + " - "
                                        + object.getClass().getCanonicalName() + " - "
                                        + info);
    }
}
