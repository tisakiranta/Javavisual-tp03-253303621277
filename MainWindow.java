
package view;

import javax.swing.*;
import java.awt.*;
import model.Character;
import model.CharacterManager;

public class MainWindow extends JFrame {

    public MainWindow(CharacterManager manager) {
        setTitle("Daftar Karakter");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(
            BorderFactory.createEmptyBorder(15, 20, 15, 20)
        );

        JLabel titleLabel = new JLabel("Daftar Karakter");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(titleLabel);

        panel.add(Box.createVerticalStrut(10));

        for (Character character : manager.getCharacters()) {
            JLabel characterLabel = new JLabel(
                character.getName()
                + " - Tipe: " + character.getType()
                + " - Level: " + character.getLevel()
            );

            characterLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(characterLabel);
        }

        panel.add(Box.createVerticalStrut(15));

        JLabel averageLabel = new JLabel(
            String.format(
                java.util.Locale.US,
                "Rata-rata Level: %.2f",
                manager.getAverageLevel()
            )
        );

        averageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        averageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(averageLabel);

        add(panel);
    }
}
