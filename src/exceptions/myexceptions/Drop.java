package exceptions.myexceptions;

public class Drop {
    public void meth(int n) throws MyException, NullPointerException {
        if (n < 4) {
            String s = "number " + n + " was less 4";
            throw new MyException(s);
        }
    }
}
