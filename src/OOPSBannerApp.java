import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    private static final Map<Character, String[]> patternRegistry = new HashMap<>();

    static {

        patternRegistry.put('O', new String[] {
                " OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "
        });
        patternRegistry.put('P', new String[] {
                "PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "
        });
        patternRegistry.put('S', new String[] {
                " SSS ", "S    ", "S    ", " SSS ", "    S", "    S", "SSSS "
        });
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    public static void renderBanner(String word) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternRegistry.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }
}