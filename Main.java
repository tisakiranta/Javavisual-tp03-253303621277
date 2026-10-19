
public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        Character c1 = new Character(
            "Arjuna", 20, CharacterType.WARRIOR
        );

        Character c2 = new Character(
            "Merlin", 30, CharacterType.MAGE
        );

        Character c3 = new Character(
            "ARJUNA", 50, CharacterType.ARCHER
        );

        System.out.println("Tambah Arjuna: "
            + manager.addCharacter(c1));

        System.out.println("Tambah Merlin: "
            + manager.addCharacter(c2));

        System.out.println("Tambah duplikat: "
            + manager.addCharacter(c3));

        System.out.println("Total karakter: "
            + manager.getTotalCharacters());

        System.out.println("Cari Arjuna: "
            + manager.findByName("arjuna"));

        System.out.println("Hapus Merlin: "
            + manager.removeCharacter("Merlin"));

        System.out.println("Total setelah hapus: "
            + manager.getTotalCharacters());

        manager.getAllCharacters().clear();

        System.out.println("Total setelah salinan dibersihkan: "
            + manager.getTotalCharacters());

        System.out.println("\n=== UJI EQUALS ===");

        Character test1 = new Character(
            "Arjuna", 20, CharacterType.WARRIOR
        );

        Character test2 = new Character(
            "arjuna", 30, CharacterType.MAGE
        );

        System.out.println(
            "Uji equals: " + test1.equals(test2)
        );

        System.out.println("\n=== BAGIAN B ===");

        System.out.println("Rata-rata level: "
            + manager.getAverageLevel());

        System.out.println("Karakter bertipe WARRIOR:");

        for (Character character :
                manager.findByType(CharacterType.WARRIOR)) {
            System.out.println(character);
        }

        System.out.println("\n=== BAGIAN C ===");

        System.out.println("Karakter terkuat: "
            + manager.findStrongest());

        CharacterManager emptyManager = new CharacterManager();

        System.out.println("Karakter terkuat pada daftar kosong: "
            + emptyManager.findStrongest());

        // UJI TAMBAHAN: STATIC DAN REFERENCE
        System.out.println("\n=== UJI TAMBAHAN ===");

        System.out.println(
            "Total objek Character dibuat: "
            + Character.getTotalCharacterCreated()
        );

        Character testReference = new Character(
            "Bima", 5, CharacterType.WARRIOR
        );

        Character salinanReference = testReference;

        salinanReference.setLevel(8);

        System.out.println(
            "Level melalui reference pertama: "
            + testReference.getLevel()
        );

        System.out.println(
            "Apakah kedua reference menunjuk objek yang sama? "
            + (testReference == salinanReference)
        );

        System.out.println(
            "Total objek setelah membuat Bima: "
            + Character.getTotalCharacterCreated()
        );
    }
}
