public class OOPSBannerApp {
    public static void main(String[] args) {
        
        String[] banner = {
            String.join("  ", " OOO ", " OOO ", "PPPP ", " SSS "),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "PPPP ", " SSS "),
            String.join("  ", "O   O", "O   O", "P    ", "    S"),
            String.join("  ", "O   O", "O   O", "P    ", "    S"),
            String.join("  ", " OOO ", " OOO ", "P    ", "SSSS ")
        };

        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
