package fileUtility;

import java.io.*;
import java.nio.Buffer;

public class FileUtility {
    public void writeToFileWithBuffer(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void readFileWithBuffer(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void writeObjectToFile(Object object, String name) throws Exception {   //Object sheklinde yazmaq
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout)
        ) {
            oos.writeObject(object);
        }
    }


    public static Object readFileObject(String name) throws Exception {     //Object kimi oxumaq
        Object obj = null;
        FileInputStream fi = new FileInputStream(name);
        try (ObjectInputStream in = new ObjectInputStream(fi)) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }


}
