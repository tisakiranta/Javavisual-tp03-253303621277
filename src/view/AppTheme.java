
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class AppTheme {

    private AppTheme() {}

    // Warna
    public static final Color BACKGROUND =
            new Color(245, 247, 250);
    public static final Color CARD_BACKGROUND =
            Color.WHITE;
    public static final Color TEXT =
            new Color(40, 44, 52);
    public static final Color CARD_TEXT =
            Color.WHITE;
    public static final Color GOLD =
            new Color(255, 215, 0);
    public static final Color TANK_COLOR =
            new Color(55, 105, 190);
    public static final Color DPS_COLOR =
            new Color(195, 65, 65);
    public static final Color SUPPORT_COLOR =
            new Color(40, 135, 90);
    public static final Color DEFAULT_ROLE_COLOR =
            new Color(120, 120, 130);

    // Font
    public static final Font TITLE_FONT =
            new Font(Font.SANS_SERIF, Font.BOLD, 22);
    public static final Font BODY_FONT =
            new Font(Font.SANS_SERIF, Font.PLAIN, 14);
    public static final Font MONO_FONT =
            new Font(Font.MONOSPACED, Font.PLAIN, 13);
    public static final Font LEVEL_FONT =
            BODY_FONT.deriveFont(Font.BOLD);

    // Border
    public static final Border CARD_BORDER =
            BorderFactory.createLineBorder(
                    new Color(210, 215, 225), 1
            );

    // Pemetaan warna role
    public static Color colorFor(String role) {
        if (role == null) {
            return DEFAULT_ROLE_COLOR;
        }

        switch (role.trim().toUpperCase()) {
            case "TANK":
                return TANK_COLOR;
            case "DPS":
                return DPS_COLOR;
            case "SUPPORT":
                return SUPPORT_COLOR;
            default:
                return DEFAULT_ROLE_COLOR;
        }
    }
}
