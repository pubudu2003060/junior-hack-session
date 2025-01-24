package org.example;

import org.example.appComponent.*;
import org.example.operation.OperationFactory;
import org.example.userInput.InputI;
import org.example.userInput.UserInput;

import java.util.Scanner;

public class Application {

    Component menuComponent = new MainMenu();
    Component createComponent = new CreateImpl();
    Component deleteComponent = new DeleteImpl();
    Component selectComponent = new SelectImpl();
    Component updateComponent = new UpdateImpl();
    Component selectAllComponent = new SelectAllImpl();
    boolean run = true;

    public void runApplication() {

        while (run) {
            int submenu = menuComponent.getComponent();
            switch (submenu){
                case 1:createComponent.getComponent();break;
                case 2:selectComponent.getComponent();break;
                case 3:selectAllComponent.getComponent();break;
                case 4:updateComponent.getComponent();break;
                case 5:deleteComponent.getComponent();break;
                case 6:run = false;break;
            }
        }


    }

}
