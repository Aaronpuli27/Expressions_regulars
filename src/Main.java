import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        String santako = "[0]-=-=*<]:-DOo##=========\n" +
                "]-=-*<]:-DOo--*=][=>:o)*=**<]:-DOo0-!...\n" +
                "-=-0-o<]:Oo|=--=||++=++=++=>\n" +
                "==|<]:-D";


        Pattern pattern = Pattern.compile("\\*<]:-DOo");
        Matcher matcher = pattern.matcher(santako);


    }
}