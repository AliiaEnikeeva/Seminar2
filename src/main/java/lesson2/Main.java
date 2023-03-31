package lesson2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    forExample();
    }
    public static void forExample() {
        try{
            File file = new File("test.txt");
            file.createNewFile();
            throw new Exception("Errow");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Я все равно работаю");
        }

    }
}
