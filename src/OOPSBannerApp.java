public class OOPSBannerApp{

    public static void main(String[] args) {
        // UC6: Building the banner using static helper methods
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            // We call the methods for each letter at row 'i'
            banner[i] = String.join("  ", 
                getLetterO(i), 
                getLetterO(i), 
                getLetterP(i), 
                getLetterS(i)
            );
        }

        // Render the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static helper methods to encapsulate character patterns
    static String getLetterO(int row) {
        String[] pattern = {
            " OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "
        };
        return pattern[row];
    }

    static String getLetterP(int row) {
        String[] pattern = {
            "PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "
        };
        return pattern[row];
    }

    static String getLetterS(int row) {
        String[] pattern = {
            " SSS ", "S    ", "S    ", " SSS ", "    S", "    S", "SSSS "
        };
        return pattern[row];
    }
}