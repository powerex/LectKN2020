package exceptions;

import exceptions.myexceptions.Drop;
import exceptions.myexceptions.MyException;

public class Application {

    public static void main(String[] args) {

        try {
            Drop drop = new Drop();
            drop.meth(2);
        }
        catch (MyException e) {
            System.out.println("Here");
            System.out.println(e.getMessage());
        }

    }

}
