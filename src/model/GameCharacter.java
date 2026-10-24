
package model;

public class GameCharacter {

    private String name;
    private String role;
    private int level;
    private int hp;
    private int atk;

    public GameCharacter(
            String name,
            String role,
            int level,
            int hp,
            int atk) {

        this.name = name;
        this.role = role;
        this.level = level;
        this.hp = hp;
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }
}
