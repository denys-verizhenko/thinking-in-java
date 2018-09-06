package object.task08;

import object.task07.Incrementable;
import object.task07.StaticTest;

public class Task08 {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i + " " + st2.i);
        Incrementable.increment();
        System.out.println(st1.i + " " + st2.i);
    }
}
