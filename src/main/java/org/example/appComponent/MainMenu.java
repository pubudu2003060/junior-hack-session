package org.example.appComponent;

public class MainMenu implements Component {

    @Override
    public int  getComponent(){
        System.out.println("-------------------------");
        System.out.println("          Menu");
        System.out.println("--------------------------");
        System.out.println("1. Add Item");
        System.out.println("2. Show Item");
        System.out.println("3. Update Item");
        System.out.println("4. Delete Item");
        System.out.println("5. Exit");
        String inp =  input.getInput();
        System.out.println("--------------------------");
        return Integer.parseInt(inp);

    }

}
