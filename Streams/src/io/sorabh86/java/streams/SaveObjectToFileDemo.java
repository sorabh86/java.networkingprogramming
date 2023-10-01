package io.sorabh86.java.streams;

import io.sorabh86.java.streams.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveObjectToFileDemo {

    public static void main(String[] args) {
        File file = new File("assets/streams/javaobject.data");
        try {
            if (!file.exists()) {
                boolean newFile = file.createNewFile();
            } else {
                List<Person> personList = new ArrayList<>();
                Person p1 = new Person(1, "Sorabh");
                Person p2 = new Person(2, "Neeraj");
                personList.add(p1);
                personList.add(p2);

                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(personList);
                oos.flush();
                fos.close();
                oos.close();
                System.out.println("Write object to file");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<Object> res = readObjectFromFile(file);
        System.out.println("RESULT: "+res.toString());
    }

    private static List<Object> readObjectFromFile(File file) {
        List<Object> res = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            res = (List<Object>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
}
