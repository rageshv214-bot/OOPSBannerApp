public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return pattern[row];
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap charO = new CharacterPatternMap('O', new String[] {
                " OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[] {
                "PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[] {
                " SSS ", "S    ", "S    ", " SSS ", "    S", "    S", "SSSS "
        });

        CharacterPatternMap[] word = { charO, charO, charP, charS };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : word) {
                line.append(cp.getRow(i)).append("  ");
            }
            System.out.println(line.toString());
        }
    }
}