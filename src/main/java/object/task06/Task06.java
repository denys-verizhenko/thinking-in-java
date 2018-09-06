package object.task06;

public class Task06 {

    public static void main(String[] args) {
        Task06 task06 = new Task06();
        System.out.println(task06.storage("abc"));
    }

    int storage(String s) {
        return s.length() * 2;
    }
}
