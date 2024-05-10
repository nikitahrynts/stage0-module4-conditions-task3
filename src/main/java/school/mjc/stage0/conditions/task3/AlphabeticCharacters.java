package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90)
                || (character >= 97 && character <= 122)) {
            if (character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'a') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
