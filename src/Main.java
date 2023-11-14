import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {

        try( FileWriter fw= new FileWriter("C://Users//Даниил//Desktop//tezt//files.txt")) {

            String text = "Hello gods";
            String[] arr = text.split(" ");
            System.out.println("Кол-во слов");
            System.out.println(arr.length);
            char ch = 'l';
            int count = text.length() - text.replace(String.valueOf(ch), "").length();
            fw.write(text);
            fw.append('\n');
            fw.flush();

            System.out.println("символы"+ '\n'+ text.length() );
            System.out.println("Слова");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try( FileReader fr = new FileReader("C://Users//Даниил//Desktop//tezt//files.txt")) {
            Scanner scan = new Scanner(fr);
            int i =1;
            while (scan.hasNextLine()){
                System.out.println(i + ":" + scan.nextLine());
                i++;
            }
            fr.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());

        }

    }



}