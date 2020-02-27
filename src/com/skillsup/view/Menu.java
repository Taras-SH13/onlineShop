package com.skillsup.view;

public interface Menu {

    default void exitProgram(){
        System.exit(0);
    }
    void back();
    void show();
}
