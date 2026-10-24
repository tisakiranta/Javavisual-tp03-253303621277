
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.GameCharacter;

public class MainWindow extends JFrame {

    public MainWindow(List<GameCharacter> characters) {
        setTitle("Character Collection - v0.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel root = new JPanel(new BorderLayout(12, 12));
        root.setBackground(AppTheme.BACKGROUND);
        root.setBorder(AppTheme.WINDOW_BORDER);
        root.setOpaque(true);

        JLabel title = new JLabel(
                "CHARACTER COLLECTION",
                SwingConstants.CENTER
        );
        title.setFont(AppTheme.TITLE_FONT);
        title.setForeground(AppTheme.TEXT_PRIMARY);

        JPanel characterPanel =
                new JPanel(new GridLayout(0, 3, 12, 12));
        characterPanel.setBackground(AppTheme.BACKGROUND);
        characterPanel.setOpaque(true);

        for (GameCharacter character : characters) {
            characterPanel.add(createCharacterCard(character));
        }

        root.add(title, BorderLayout.NORTH);
        root.add(characterPanel, BorderLayout.CENTER);

        setContentPane(root);
        pack();
        setLocationRelativeTo(null);
    }

    private JPanel createCharacterCard(GameCharacter character) {
        JPanel card = new JPanel(new GridLayout(0, 1, 0, 6));

        card.setOpaque(true);
        card.setBackground(AppTheme.colorFor(character.getRole()));
        card.setBorder(AppTheme.borderFor(character.getRole()));

        card.setToolTipText(
                character.getName()
                + " | HP: " + character.getHp()
                + " | ATK: " + character.getAtk()
        );

        JLabel nameLabel = new JLabel(character.getName());
        nameLabel.setFont(AppTheme.BODY_FONT);
        nameLabel.setForeground(AppTheme.TEXT_PRIMARY);

        JLabel roleLabel = new JLabel(
                "Role: " + character.getRole()
        );
        roleLabel.setFont(AppTheme.DETAIL_FONT);
        roleLabel.setForeground(AppTheme.TEXT_MUTED);

        JLabel levelLabel = new JLabel(
                "Level: " + character.getLevel()
        );

        if (character.getLevel()
                >= AppTheme.HIGH_LEVEL_THRESHOLD) {
            levelLabel.setForeground(AppTheme.GOLD);
            levelLabel.setFont(AppTheme.LEVEL_FONT);
        } else {
            levelLabel.setForeground(AppTheme.TEXT_PRIMARY);
            levelLabel.setFont(AppTheme.DETAIL_FONT);
        }

        card.add(nameLabel);
        card.add(roleLabel);
        card.add(levelLabel);

        return card;
    }
}
