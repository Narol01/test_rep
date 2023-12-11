package practice.id_sream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ByteInputAppl {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fin = new FileInputStream("./dest/data.txt");
        try {
           /* System.out.println("Availible: "+fin.available());
            int a = fin.read();
            System.out.println(a);
            System.out.println("Availible: "+fin.available());
            a= fin.read();
            System.out.println(a);
            System.out.println("Availible: "+fin.available());*/

            //how count all in file
            // option 1
           /* int a = fin.read();
            while (a !=-1){
                System.out.println(a);
                a= fin.read();//257-256 = 1 get in end

            }*/
            //Option 2
         /*   int length= fin.available();
            for (int i = 0; i < length; i++) {
                int a = fin.read();
                System.out.println(a);
            }*/

            //option 3
            int length = fin.available();
            byte[] arr= new byte[length];
            fin.read(arr);
            for(Byte b:arr){
                System.out.println(b);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
