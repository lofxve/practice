package com.lofxve.base.Stream.Serializable;

import java.io.*;

public class SerializableDomeTest {
    public static Object readAsObject(File file) throws IOException, ClassNotFoundException {
        Object object = null;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            object = (Object) input.readObject();
        }
        return object;
    }
    public static void writeAsObject(File file,Object object) throws IOException {
        try(ObjectOutputStream objectInputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectInputStream.writeObject(object);
            objectInputStream.flush();
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\dome.txt");

        final Dome dome = new Dome();
        dome.setAge("10");
        dome.setName("魏振东");

        writeAsObject(file,dome);
        Dome dome1 = (Dome)readAsObject(file);

        System.out.println(dome1.toString());
    }
}
