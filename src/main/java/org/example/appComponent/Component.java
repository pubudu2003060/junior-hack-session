package org.example.appComponent;

import org.example.operation.OperationFactory;
import org.example.userInput.InputI;
import org.example.userInput.UserInput;

public interface Component {

    OperationFactory operationFactory = new OperationFactory();
    InputI input = new UserInput();

    int getComponent();

}
