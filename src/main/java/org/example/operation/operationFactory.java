package org.example.operation;

public class operationFactory {

    public Operation getOperation(String operation) {

        switch (operation) {
            case "create":return new Crearte();
            case "delete":return new Delete();
            case "update":return new Update();
            case "select":return new Select();
            default: return null;
        }

    }
}
