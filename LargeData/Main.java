package LargeData;

import java.io.*;

public class Main {
    public static void main(String[] args)  {
        // Create file
//        try {
//            File fo = new File("new-file.txt");
//            fo.createNewFile();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //Write
//        try {
//            FileWriter fw = new FileWriter("new-file.txt");
//            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच: || 66||");
//            fw.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            FileReader fr = new FileReader("new-file.txt");
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.print((char) letters);
//                letters = fr.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            BufferedReader br = new BufferedReader(new FileReader("new-file.txt"));
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if (fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
