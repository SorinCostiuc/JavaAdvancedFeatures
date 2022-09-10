package exceptii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
//            exceptiile se impart in CHECKED si NOTCHECKED////////
            //checked
            //ORICE clasa care mosteneste EXCEPTION este o exceptie checked
            //cand nu se intampla din vina programatorului
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a1 = 5;
        int a2 = 0;
        //unchecked
        //ORICE exceptie care extinde RUNTIME exception este o exceptie unchecked
        //cand erorile se intampla din vina programatorului

//        if (a2 != 0) {       //ne protejam de runtime exception
            System.out.println(a1 / a2);
//        }
    }
}
