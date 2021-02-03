package dk.easv;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        try {
            Vector v = new Vector();
            while (true)
            {
                byte b[] = new byte[1048576];
                v.add(b);

                Thread.sleep(50);
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
