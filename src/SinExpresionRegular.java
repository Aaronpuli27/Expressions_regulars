import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class SinExpresionRegular {

    public static void main(String[] args) throws IOException {
        FileReader read = new FileReader("santako.txt");
        BufferedReader buff = new BufferedReader(read);

        String linea = buff.readLine();

        while (linea!=null){
            int papaNoel = 0;
            int ren = 0;
            int follet = 0;

            if (linea.indexOf("*<]:-DOo")!=-1){
                papaNoel++;
                System.out.print("Pare Noel (" +papaNoel+ ") ");
            }

            if (linea.indexOf(">:o)")!=-1){
                ren++;
                System.out.print("Ren (" +ren+ ") ");
            }

            if (linea.indexOf("<]:-D")!=-1){
                follet++;
                System.out.print("Follet (" +follet+ ") ");
            }


            System.out.println();
            linea = buff.readLine();
        }

    }

}
