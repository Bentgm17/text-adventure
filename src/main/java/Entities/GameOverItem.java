package Entities;

public class GameOverItem implements IEntity {
    String type;
    String name;
    String description;
    Boolean consumable;
    Boolean active;
    Stat stat;

    public GameOverItem(String type,
                        String name,
                        String description,
                        Boolean consumable,
                        Boolean active,
                        Stat stat) {

        this.type = type;
        this.name = name;
        this.description = description;
        this.consumable = consumable;
        this.active = active;
        this.stat = stat;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getDescription() { return description; }

    @Override
    public Boolean isActive() { return active; }
}
