
import javax.swing.SwingUtilities;
import model.Character;
import model.CharacterManager;
import view.MainWindow;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        manager.addCharacter(
            new Character("Rama", "Penyerang", 85)
        );

        manager.addCharacter(
            new Character("Anastasya", "Pendukung", 70)
        );

        manager.addCharacter(
            new Character("Markonah", "Tank", 95)
        );

        manager.addCharacter(
            new Character("Meylani", "Penyihir", 80)
        );

        manager.addCharacter(
            new Character("gama", "Penyerang", 90)
        );

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true);
        });
    }
}
