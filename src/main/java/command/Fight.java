package command;

import dictionary.GameEntities;
import entity.*;

public class Fight implements ICommand {
    final Entity parent;

    public
    Fight(final Entity parent) { this.parent = parent; }

    @Override
    public String
    apply(final String object, final GameEntities ge)
    {
        final String REDUCTION_STAT  = "health";
        final String COMPARISON_STAT = "strength";

        final Entity opponent = ge.getEntityOrDefault(object);

        final Integer opponentStrength = opponent.getStatValue(COMPARISON_STAT);
        final Integer parentStrength   = parent.getStatValue(COMPARISON_STAT);

        if (parentStrength < opponentStrength)
        {
            parent.setStat(REDUCTION_STAT, parent.getStatValue(REDUCTION_STAT) - 10);
            return String.format("%s, -10 health", parent.getName());
        }
        else if (opponentStrength.equals(parentStrength))
        {
            parent.setStat(REDUCTION_STAT, parent.getStatValue(REDUCTION_STAT) - 5);
            opponent.setStat(REDUCTION_STAT, 0);
            opponent.setActive(false);
            return String.format("%s, -5 health%n%s is killed.", parent.getName(), object);
        }
        else
        {
            opponent.setStat(REDUCTION_STAT, 0);
            opponent.setActive(false);
            return String.format("%s is killed.", object);
        }
    }
}
