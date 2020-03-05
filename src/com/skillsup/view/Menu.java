package com.skillsup.view;

public interface Menu {
    void exit();


    default void exitProgram()
    {
        System.exit(0);
    }
    void back();
    void show();
}
