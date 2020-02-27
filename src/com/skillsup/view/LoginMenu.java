package com.skillsup.view;

import java.util.Scanner;

public class LoginMenu implements Menu{
String[] menuItems = new String[]{
        "1. Login",
        "2. Register",
        "9. Back",
        "0. Exit"
};
}

    @Override
    public void back() {
        exitProgram();
    }

    @Override
    public void show() {
for (String item: menuItems)
    System.out.println(item);
    }

    Scanner scanner = new Scanner(System.in);
     switch (scanner.nextInt())
        { case 1:

}
