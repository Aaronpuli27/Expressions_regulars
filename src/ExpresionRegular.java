import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpresionRegular {
    public static void main(String[] args) throws IOException {

        FileReader read = new FileReader("santako.txt");
        BufferedReader buff = new BufferedReader(read);

        String linea = buff.readLine();

        while (linea!=null){
            Pattern p = Pattern.compile("\\*<]:-DOo");
            Matcher m = p.matcher(linea);
            int santa = 0;
            while (m.find()) {
                santa++;
            }
            if (santa!=0) {
                System.out.print("Pare Noel ("+ santa +") ");
            }

            Pattern p2 = Pattern.compile(">:o\\)");
            Matcher m2 = p2.matcher(linea);
            int reno = 0;
            while (m2.find()) {
                reno++;
            }
            if (reno!=0) {
                System.out.print("Ren ("+ reno +") ");
            }

            Pattern p3 = Pattern.compile("[^*]<]:-D");
            Matcher m3 = p3.matcher(linea);
            int follet = 0;
            while (m3.find()) {
                follet++;
            }
            if (follet!=0) {
                System.out.print("Follet ("+ follet +") ");
            }
            System.out.println();
            linea = buff.readLine();
        }

    }
}