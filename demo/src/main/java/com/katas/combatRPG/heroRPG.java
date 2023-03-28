package com.katas.combatRPG;

public class heroRPG {
    private Long health = 1000L;
    private Integer level = 1;
    private Boolean alive = true;

    public Long getHealth() {
        return this.health;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Boolean getAlive() {
        return this.alive;
    }

    public void attacks(heroRPG victim, Long damage) {
        victim.damage(damage);
    }
    public void damage(Long damage){
        this.health -= damage;
        if (this.health <= 0) {
            this.alive=false;
        }

    }
}
