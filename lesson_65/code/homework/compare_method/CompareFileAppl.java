package homework.compare_method;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFileAppl {  public static void main(String[] args) {
    // написать утилиту для командной строки бля копирования файла
    // аргументы: файл источник и файл копия

    if(args.length !=2){
        System.out.println("Wrong arguments");
    }
    System.out.println("File 1: " + args[0]);
    System.out.println("File 2: " + args[1]);

    try(FileInputStream fin1 = new FileInputStream(args[0])) {
        FileInputStream fin2=new FileInputStream(args[1]);
        int byte1, byte2;
        boolean filesEqual = true;

        while ((byte1 = fin1.read()) != -1 && (byte2 = fin2.read()) != -1) {
            if (byte1 != byte2) {
                filesEqual = false;
                break;
            }
        }
        if (filesEqual && fin1.read() != fin2.read()) {
            filesEqual = false;
        }

        if (filesEqual) {
            System.out.println("Files are identical.");
        } else {
            System.out.println("Files are different.");
        }

    } catch (IOException e) {
        throw new RuntimeException(e);
    } ;




}
}
