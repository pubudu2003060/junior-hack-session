package org.example;

import org.example.appComponent.Component;
import org.example.appComponent.CreateImpl;
import org.example.appComponent.DeleteImpl;
import org.example.appComponent.MainMenu;
import org.example.operation.OperationFactory;
import org.example.userInput.InputI;
import org.example.userInput.UserInput;

import java.util.Scanner;

public class Application {


    Scanner scanner = new Scanner(System.in);
    Component menuComponent = new MainMenu();
    Component createComponent = new CreateImpl();
    Component deleteComponent = new DeleteImpl();
    boolean run = true;

    public void runApplication() {

        while (run) {
            int submenu = menuComponent.getComponent();
            switch (submenu){
                case 1:createComponent.getComponent();break;
                case 4:deleteComponent.getComponent();break;
                case 5:run = false;break;
            }
        }




    }

}
