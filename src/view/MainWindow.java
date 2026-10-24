
package view;

import model.GameCharacter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {

    private static final int GOLD_LEVEL_THRESHOLD = 5;

    private final JPanel mainPanel;

    public MainWindow() {
        setTitle("Character Manager v0.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new GridLayout(0, 2, 12, 12));
        mainPanel.setOpaque(true);
        mainPanel.setBackground(AppTheme.BACKGROUND);
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(16, 16, 16, 16)
        );

        JLabel heading = new JLabel(
                "Character Manager",
                SwingConstants.CENTER
        );
        heading.setFont(AppTheme.TITLE_FONT);
        heading.setForeground(AppTheme.TEXT);

        JPanel content = new JPanel(new BorderLayout(0, 12));
        content.setBackground(AppTheme.BACKGROUND);
        content.add(heading, BorderLayout.NORTH);
        content.add(mainPanel, BorderLayout.CENTER);

        setContentPane(content);

        loadCharacters();

        pack();
        setLocationRelativeTo(null);
    }

    private void loadCharacters() {
        List<GameCharacter> characters = new ArrayList<>();

        characters.add(new GameCharacter("Arka", "TANK", 1, 100, 15));
        characters.add(new GameCharacter("Mira", "DPS", 3, 85, 30));
        characters.add(new GameCharacter("Nara", "SUPPORT", 4, 90, 12));
        characters.add(new GameCharacter("Bima", "TANK", 5, 150, 25));
        characters.add(new GameCharacter("Sora", "DPS", 7, 120, 45));
        characters.add(new GameCharacter("Kira", "SUPPORT", 10, 180, 35));

        for (GameCharacter character : characters) {
            mainPanel.add(createCharacterCard(character));
        }
    }

    private JPanel createCharacterCard(GameCharacter character) {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setOpaque(true);
        card.setBackground(AppTheme.colorFor(character.getRole()));
        card.setBorder(AppTheme.CARD_BORDER);

        JLabel nameLabel = new JLabel(character.getName());
        nameLabel.setFont(AppTheme.TITLE_FONT.deriveFont(16.0f));
        nameLabel.setForeground(AppTheme.CARD_TEXT);

        JLabel roleLabel = new JLabel("Role: " + character.getRole());
        roleLabel.setFont(AppTheme.BODY_FONT);
        roleLabel.setForeground(AppTheme.CARD_TEXT);

        JLabel levelLabel = new JLabel("Level: " + character.getLevel());
        levelLabel.setFont(AppTheme.BODY_FONT);
        levelLabel.setForeground(AppTheme.CARD_TEXT);

        if (character.getLevel() >= GOLD_LEVEL_THRESHOLD) {
            levelLabel.setForeground(AppTheme.GOLD);
            levelLabel.setFont(AppTheme.LEVEL_FONT);
        }

        JLabel hpLabel = new JLabel("HP: " + character.getHp());
        hpLabel.setFont(AppTheme.BODY_FONT);
        hpLabel.setForeground(AppTheme.CARD_TEXT);

        JLabel atkLabel = new JLabel("ATK: " + character.getAtk());
        atkLabel.setFont(AppTheme.BODY_FONT);
        atkLabel.setForeground(AppTheme.CARD_TEXT);

        // Properti tambahan 1: tooltip berisi detail karakter
        String tooltip = character.getName()
                + " | HP: " + character.getHp()
                + " | ATK: " + character.getAtk();

        card.setToolTipText(tooltip);
        nameLabel.setToolTipText(tooltip);

        // Properti tambahan 2: karakter level 1 dinonaktifkan
        if (character.getLevel() == 1) {
            card.setEnabled(false);
            nameLabel.setEnabled(false);
            roleLabel.setEnabled(false);
            levelLabel.setEnabled(false);
            hpLabel.setEnabled(false);
            atkLabel.setEnabled(false);
        }

        card.add(nameLabel);
        card.add(Box.createVerticalStrut(6));
        card.add(roleLabel);
        card.add(levelLabel);
        card.add(hpLabel);
        card.add(atkLabel);

        return card;
    }
}
