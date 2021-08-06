package utils;

import com.codeborne.selenide.Configuration;

public class Driver {

    public static void openMaximizedWindow() {
        Configuration.startMaximized = true;
    }
}
