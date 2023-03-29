package com.katas.combatRPG;

public class heroRPG {
    private Long health = 1000L;
    private Integer level = 1;
    private Boolean alive = true;

    public heroRPG() {
    }

    public heroRPG(Integer level) {
        this.level = level;
    }

    public Long getHealth() {
        return this.health;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Boolean getAlive() {
        return this.alive;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public void setAlive() {
    }

    public void attacks(heroRPG victim, Long damage) {
        if (victim == this) {
            victim.damage(0L, this.level);
            return;
        }
        victim.damage(damage, this.level);


    }

    public void damage(Long damage, Integer attackerLevel) {
        int difLevels = attackerLevel - this.level;

        if (difLevels >= 5) {
            this.health -= damage + (damage / 2);
        }
        if (difLevels <= -5) {
            this.health -= damage / 2;
        }

        if (difLevels >=0 && difLevels <=4) {
            this.health -= damage;
        }
        //this.health -= damage;

        if (this.health <= 0) {
            this.alive = false;
        }
    }

    public void heals(heroRPG victim, long healing) {
        if (this == victim) {
            victim.healing(healing);
            return;
        }
        victim.healing(0L);
    }

    public void healing(Long healing) {

        if (this.alive == false) {
            this.health += 0;
        }
        if (this.alive == true) {
            this.health += healing;
        }
        if (this.health > 1000L) {
            setHealth(1000L);
        }
    }

}
