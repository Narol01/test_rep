package practice.id_sream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputAppl {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("./dest/data.txt")) {
                fout.write(65);// litter a
                fout.write(66);// litter a
                fout.write(27);
                fout.write(257);
                fout.write(1);
                fout.write(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
