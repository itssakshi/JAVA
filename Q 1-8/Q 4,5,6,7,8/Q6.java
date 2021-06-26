package Prac;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fh {
    public static void main(String[] args) throws IOException {

        String line;
        String content = "";

        File myFile = new File("test.txt");
        Scanner sc = new Scanner(myFile);

        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (line.startsWith("//")){
                content = content + line + "\n";
            }
        }
        System.out.println(content);
    }
