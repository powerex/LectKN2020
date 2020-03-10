package unboxing;

public class MyDemo {

    public static void main(String[] args) {

        int i = 4;

        Integer iObj = 4;

        i = iObj;

        iObj = 6;

        i = Integer.valueOf("234");

    }

}
