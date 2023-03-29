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

    public void setHealth(Long health) {
        this.health = health;
    }

    public void setAlive() {
    }

    public void attacks(heroRPG victim, Long damage) {
        if(victim==this){
            victim.damage(0L);
            return;
        }
        victim.damage(damage);


    }

    public void damage(Long damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.alive = false;
        }
    }

    public void heals(heroRPG victim, long healing) {
        victim.healing(healing);
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
