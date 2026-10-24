
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingUtilities;

import model.GameCharacter;
import view.MainWindow;

public class Main {

    public static void main(String[] args) {

        List<GameCharacter> characters = Arrays.asList(
            new GameCharacter("Arka", "Tank", 1, 1200, 80),
            new GameCharacter("Bima", "Mage", 3, 700, 180),
            new GameCharacter("Citra", "Assassin", 4, 800, 220),
            new GameCharacter("Damar", "Tank", 5, 1600, 120),
            new GameCharacter("Elara", "Mage", 7, 900, 300),
            new GameCharacter("Faris", "Assassin", 10, 1100, 450)
        );

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(characters);
            window.setVisible(true);
        });
    }
}
