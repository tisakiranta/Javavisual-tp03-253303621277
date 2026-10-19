
import java.util.Locale;
import java.util.Objects;

/**
 * Merepresentasikan karakter dalam program Character Manager.
 */
public class Character {

    private String name;
    private int level;
    private CharacterType type;

    // Penghitung jumlah objek Character yang berhasil dibuat.
    private static int totalCharacterCreated = 0;

    /**
     * Membuat karakter baru dengan validasi data.
     *
     * @param name nama karakter
     * @param level level karakter, tidak boleh negatif
     * @param type tipe karakter
     */
    public Character(String name, int level, CharacterType type) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nama tidak boleh kosong"
            );
        }

        if (level < 0) {
            throw new IllegalArgumentException(
                "Level tidak boleh negatif"
            );
        }

        this.name = name.trim();
        this.level = level;
        this.type = Objects.requireNonNull(
            type, "Tipe karakter tidak boleh null"
        );

        totalCharacterCreated++;
    }

    /**
     * Mengambil nama karakter.
     *
     * @return nama karakter
     */
    public String getName() {
        return name;
    }

    /**
     * Mengambil level karakter.
     *
     * @return level karakter
     */
    public int getLevel() {
        return level;
    }

    /**
     * Mengubah level karakter dengan validasi.
     *
     * @param level level baru, tidak boleh negatif
     */
    public void setLevel(int level) {
        if (level < 0) {
            throw new IllegalArgumentException(
                "Level tidak boleh negatif"
            );
        }

        this.level = level;
    }

    /**
     * Mengambil tipe karakter.
     *
     * @return tipe karakter
     */
    public CharacterType getType() {
        return type;
    }

    /**
     * Mengambil jumlah objek Character yang berhasil dibuat.
     *
     * @return jumlah objek yang telah dibuat
     */
    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    /**
     * Membandingkan karakter berdasarkan nama,
     * tanpa membedakan huruf besar dan kecil.
     *
     * @param obj objek pembanding
     * @return true jika nama karakter sama
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return name.equalsIgnoreCase(other.name);
    }

    /**
     * Menghasilkan hash code yang konsisten dengan equals().
     *
     * @return hash code berdasarkan nama karakter
     */
    @Override
    public int hashCode() {
        return name.toLowerCase(Locale.ROOT).hashCode();
    }

    /**
     * Menghasilkan representasi teks karakter.
     *
     * @return informasi karakter dalam bentuk String
     */
    @Override
    public String toString() {
        return "Character{name='" + name
            + "', level=" + level
            + ", type=" + type + "}";
    }
}
