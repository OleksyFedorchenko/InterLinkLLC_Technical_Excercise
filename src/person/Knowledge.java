package person;

import java.io.Serializable;

public class Knowledge implements Serializable {
    private int level;

    public Knowledge(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Knowledge{" + "level=" + level + '}';
    }
}
