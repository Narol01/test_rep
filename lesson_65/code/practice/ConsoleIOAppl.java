package practice;

import java.io.*;

public class ConsoleIOAppl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File number: ");
        String str = br.readLine();
        PrintWriter pw = new PrintWriter(new FileWriter(str,true));//позволяет не перезаписывать файл, а дополнять.
        System.out.println("Type the text here,pls");
        str = br.readLine();
        while (!"stop".equalsIgnoreCase(str)){
            pw.println(str);
            System.out.println("Type the text here,pls");
            str = br.readLine();
        }
        pw.flush();
        pw.close();
    }
}
