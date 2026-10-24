
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class AppTheme {

    private AppTheme() {
    }

    // Konstanta batas level tinggi
    public static final int HIGH_LEVEL_THRESHOLD = 5;

    // Warna
    public static final Color BACKGROUND =
            new Color(25, 28, 38);

    public static final Color CARD_BACKGROUND =
            new Color(42, 47, 61);

    public static final Color TEXT_PRIMARY =
            new Color(240, 243, 250);

    public static final Color TEXT_MUTED =
            new Color(170, 180, 195);

    public static final Color GOLD =
            new Color(255, 196, 65);

    public static final Color TANK_COLOR =
            new Color(49, 104, 82);

    public static final Color MAGE_COLOR =
            new Color(75, 68, 140);

    public static final Color ASSASSIN_COLOR =
            new Color(133, 56, 69);

    // Font
    public static final Font TITLE_FONT =
            new Font("SansSerif", Font.BOLD, 24);

    public static final Font BODY_FONT =
            new Font("SansSerif", Font.PLAIN, 14);

    public static final Font LEVEL_FONT =
            new Font("SansSerif", Font.BOLD, 14);

    public static final Font DETAIL_FONT =
            new Font("SansSerif", Font.PLAIN, 12);

    // Border
    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(
                            new Color(85, 94, 112), 1),
                    BorderFactory.createEmptyBorder(
                            12, 12, 12, 12)
            );

    public static final Border WINDOW_BORDER =
            BorderFactory.createEmptyBorder(
                    18, 18, 18, 18);

    // Warna berdasarkan role
    public static Color colorFor(String role) {
        if (role == null) {
            return CARD_BACKGROUND;
        }

        switch (role.trim().toLowerCase()) {
            case "tank":
                return TANK_COLOR;
            case "mage":
                return MAGE_COLOR;
            case "assassin":
                return ASSASSIN_COLOR;
            default:
                return CARD_BACKGROUND;
        }
    }

    // Border berdasarkan role
    public static Border borderFor(String role) {
        return BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        colorFor(role), 3),
                BorderFactory.createEmptyBorder(
                        12, 12, 12, 12)
        );
    }
}
