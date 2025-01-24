package org.example.userInput;

import java.util.Scanner;

public class UserInput implements InputI {

    static Scanner in = new Scanner(System.in);

    @Override
    public String getInput() {
        System.out.print("Please enter your responce: ");
        return in.nextLine();
    }

}
