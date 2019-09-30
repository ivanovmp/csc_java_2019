package ru.compscicenter.java_2019.lesson_06;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.*;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static ru.compscicenter.java_2019.Util.__;

@FixMethodOrder(MethodSorters.JVM)
public class _1_FileIOTest {

    @Test
    public void fileObjectDoesntCreateFile() {
        File f = new File("foo.txt");
        assertEquals(__, f.exists());
    }

    @Test
    public void fileCreationAndDeletion() throws IOException {
        File f = new File("foo.txt");
        f.createNewFile();
        assertEquals(__, f.exists());
        f.delete();
        assertEquals(__, f.exists());
    }

    @Test
    public void basicFileWritingAndReading() throws IOException {
        File file = new File("file.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("First line\nSecond line");
        fw.flush();
        fw.close();

        char[] in = new char[50];
        int size = 0;
        FileReader fr = new FileReader(file);
        size = fr.read(in);
        // No flush necessary!
        fr.close();
        assertEquals(__, size);
        String expected = new String(in);
        assertEquals(__, expected.length());
        assertEquals(__, expected);
        file.delete();
    }

    @Test
    public void betterFileWritingAndReading() throws IOException {
        File file = new File("file.txt");
        file.deleteOnExit();
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("First line");
        pw.println("Second line");
        pw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = null;
        try {
            br = new BufferedReader(fr);
            assertEquals(__, br.readLine()); // first line
            assertEquals(__, br.readLine()); // second line
            assertEquals(__, br.readLine()); // what now?
        } finally {
            // anytime you open access to a file, you should close it or you may
            // lock it from other processes (ie frustrate people)
            closeStream(br);
        }
    }

    private void closeStream(BufferedReader br) {
        if (br != null) {
            try {
                br.close();
            } catch (IOException x) {
                Logger.getAnonymousLogger().severe("Unable to close reader.");
            }
        }
    }

    @Test
    public void directChainingForReadingAndWriting() throws IOException {
        File file = new File("file.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("1. line");
        pw.println("2. line");
        pw.close();

        StringBuffer sb = new StringBuffer();
        // TODO Add the loop to go through the file line by line and add the line
        //  to the StringBuffer
        assertEquals("1. line\n2. line", sb.toString());
    }
}

