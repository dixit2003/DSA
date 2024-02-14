package LargeData;

import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.io.InputStreamReader;

public class Streams {
    public static void main(String[] args) throws IOException {
        // Take data in Byte stream
//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter some letters: ");
//            int letters = isr.read();
//
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();x
//            }
////            isr.close();
//            System.out.println();
//        } catch (IOException e) {
//            throw new RuntimeException(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("note.txt")) {
//            int letters = fr.read();
//
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
////            fr.close();
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // Byte to char stream and then reading char stream
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println("You typed: " + br.readLine());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//            osw.write("Hello");
//             osw.write(97);
//             char[] ch = "helloworld".toCharArray();
//             osw.write(ch);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileWriter fw = new FileWriter("note1.txt", true)){
//            fw.write("Hello world");
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note2.txt"))) {
//            bw.write("Ewww...!!!");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            FileReader fr = new FileReader("new-file.txt");
            while (fr.ready()) {
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }





    }
}
