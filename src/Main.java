import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        String santako = "[0]-=-=*<]:-DOo##=========\n" +
                "]-=-*<]:-DOo--*=][=>:o)*=**<]:-DOo0-!...\n" +
                "-=-0-o<]:Oo|=--=||++=++=++=>\n" +
                "==|<]:-D";


        Pattern p = Pattern.compile("\\*<]:-DOo");
        Matcher m = p.matcher(santako);

        int compte = 0;
        while (m.find()) {
            compte++;
        }
        System.out.println(compte);
    }
}