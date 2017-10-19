
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nl.hva.dmci.ict.se.datastructures.DictionaryGenerator;

/**
 *
 * @author Yasmin
 */
public class Dictionary implements DictionaryGenerator {

    public static void main(String[] args) {
        System.out.println("1 lettergreep: " + new Dictionary().yololian(1));
        System.out.println("2 lettergrepen: " + Arrays.toString(new Dictionary().yololian(2)));
        System.out.println("3 lettergrepen: " + Arrays.toString(new Dictionary().yololian(3)));
    }

    String[] yo_lo = new String[]{"yo", "lo"};

    private String yo = "yo";
    private String lo = "lo";

    @Override
    public String[] yololian(int n) {
        if (n == 1) {
            return yo_lo;
        } else {
            List<String> eindYolo = new ArrayList<String>();
            String[] vorigeYolo = yololian(n - 1);
            for (String s : vorigeYolo) {
                eindYolo.add(s + yo);
                eindYolo.add(s + lo);
            }
            return eindYolo.toArray(new String[eindYolo.size()]);
        }
    }

    @Override
    public String[] language(int n, String[] syllables) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
