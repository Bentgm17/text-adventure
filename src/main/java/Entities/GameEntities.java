package Entities;

import java.util.Map;

public class GameEntities {
    private Map<String, Item> itemEntities;
    private Map<String, Area> areaEntities;
    private Map<String, Obstacle> obstacleEntities;
    private Map<String, Npc> npcEntities;
    private GameOverItem gameOverItem;
    private Player player;
    private EmptyEntity emptyEntity;

    GameEntities(Map<String, Item>itemEntities,
                 Map<String, Area> areaEntities,
                 Map<String, Obstacle> obstacleEntities,
                 Map<String, Npc> npcEntities,
                 GameOverItem gameOverItem,
                 Player player,
                 EmptyEntity emptyEntity) {

        this.itemEntities = itemEntities;
        this.areaEntities = areaEntities;
        this.obstacleEntities = obstacleEntities;
        this.npcEntities = npcEntities;
        this.gameOverItem = gameOverItem;
        this.player = player;
        this.emptyEntity = emptyEntity;
    }

    public Map<String, Item> getItemEntities() { return itemEntities; }

    public Map<String, Area> getAreaEntities() { return areaEntities; }

    public Map<String, Obstacle> getObstacleEntities() { return obstacleEntities; }

    public Map<String, Npc> getNpcEntities() { return npcEntities; }

    public GameOverItem getGameOverItem() { return gameOverItem; }

    public Player getPlayer() { return player; }

    public EmptyEntity getEmptyEntity() { return emptyEntity; }

}
