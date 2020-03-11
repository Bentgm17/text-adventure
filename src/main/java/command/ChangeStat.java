package command;

import dictionary.GameEntities;
import entity.*;

import java.util.Map;

public class ChangeStat implements Command {
    private final Entity parent;

    public ChangeStat(final Entity parent) { this.parent = parent; }

    @Override
    public String apply(final String object, final GameEntities ge) {
        if (!parent.hasInInventory(object)) { return String.format("You do not have '%s' in your inventory.", object); }

        Item i = ge.getItemOrElse(object);
        if (!i.isConsumable()) { return "You cannot use that."; }

        StringBuilder result = new StringBuilder();
        for (final Map.Entry<String, Integer> stat : i.getStats().entrySet())
        {
            final Integer oldValue = parent.getStatValue(stat.getKey());
            final Integer newValue = oldValue + stat.getValue();
            parent.setStat(stat.getKey(), newValue);

            result.append("\n").append(stat.getKey()).append(" changes to ").append(newValue);
        }

        parent.removeFromInventory(object);
        i.setActive(false);

        return result.toString();
    }

    public String apply(final Area object, final GameEntities ge) {
        return "";
    }

    public String apply(final Item object, final GameEntities ge) {
        return "";
    }

    public String apply(final Npc object, final GameEntities ge) {
        return "";
    }

    public String apply(final Obstacle object, final GameEntities ge) {
        return "";
    }

    public String apply(final Player object, final GameEntities ge) {
        return "";
    }
}