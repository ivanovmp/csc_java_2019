package ru.compscicenter.java_2019.lesson_06;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _2_BytesVsCharsIOTest {

    static class Person implements Serializable {

        private final int age;
        private final String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    private static String personFile = "person.bin";
    private static String textFile = "textFile.txt";

    @Test
    public void whereIsMyUserDir() {
        assertEquals(__, System.getProperty("user.dir"));
    }

    @Test
    public void writeStreamOfBytes() throws IOException {
        try (FileOutputStream fos = new FileOutputStream(personFile)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Person(92, "Старик Хоттабыч"));
            oos.flush();
        }
        assertEquals(__, new File(personFile).exists());
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(personFile)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person = (Person) ois.readObject();
            System.out.println("read object:" + person);
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("current dir: " + System.getProperty("user.dir"));
        copyFile();
        readObject();
        writeTextFile();
        readTextFile();

    }

    //Обратите внимание на цепочку декораторов
    private static void copyFile() throws IOException {
        try (ZipOutputStream zipOut = new ZipOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(textFile + "_copy.zip")));
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream(textFile))) {

            ZipEntry zipEntry = new ZipEntry(textFile);
            zipOut.putNextEntry(zipEntry);
            int buffer;
            while ((buffer = bis.read()) > 0) {
                zipOut.write(buffer);
            }
            zipOut.closeEntry();
        }
    }


    private static void writeTextFile() throws IOException {
        String line1 = "Hello Java, str1";
        String line2 = "Hello Java, str2";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textFile));) {
            writer.write(line1);
            writer.newLine();
            writer.write(line2);
        }
    }

    private static void readTextFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line = reader.readLine();
            System.out.println("text from the file:");
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
    }
}
