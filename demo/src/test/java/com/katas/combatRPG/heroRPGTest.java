package com.katas.combatRPG;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class heroRPGTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void heroRPGHasCorrectParameters(){
        //given dado un personaje su health es de 1000, su Level es 1 y Alive = true
        var solidSnake = new heroRPG();
        //var sut = solidSnake.getHealth();
        assertEquals(1000, solidSnake.getHealth());
        assertEquals(1, solidSnake.getLevel());
        assertEquals(true, solidSnake.getAlive());
    }
    @Test
    void heroRPGCanDealDamageToOthers(){
        //given dos personajes uno puede causar un daño concreto
        var victim = new heroRPG();
        var slayer= new heroRPG();

        // when slayer ataca con daño resta health

        slayer.attacks(victim, 50L);

        //then
        assertEquals(950L, victim.getHealth());
    }
    @Test
    void heroRPGWithDamageReceivedExceedsCurrentHealthHeroRPGDies(){
        //Given un personaje con salud x
        var victim= new heroRPG();
        var slayer= new heroRPG();
        //When atacks deals more damage than Health

        slayer.attacks(victim, 1000L);

        //then health =< 0
        assertEquals(0L, victim.getHealth());

        //then heroRPG is died (alive = false)
        assertEquals(false, victim.getAlive());
    }
    @Test
    void heroRPGCanHealOthers(){
        //given  personajes with health 1000
        var victim= new heroRPG();
        var sorcerer= new heroRPG();
        var slayer= new heroRPG();


        //when sorcerer  cura aumenta health
        slayer.attacks(victim, 2L);
        //sorcerer.heals(victim, 20L);
        victim.heals(victim, 20L);

        //then victim aumenta health
        //but Healing cannot raise health above 1000
        // and Dead characters cannot be healed
        assertEquals(true, victim.getAlive());
        assertEquals(1000L, victim.getHealth());


    }
    //////////ITERATION TWO////////////////////////////////////
    @Test
    void victimCanNotDamageItself() {
        //given  personaje with health 1000
        var victim= new heroRPG();
        //when
        victim.attacks(victim, 100L);

        //then
        assertEquals(1000, victim.getHealth());
    }
    @Test
    void heroRpgCanOnlyHealItself() {
        //given  personaje with health 1000
        var victim= new heroRPG();
        var victim2= new heroRPG();
        var sorcerer= new heroRPG();
        var slayer= new heroRPG();
        //when
        slayer.attacks(victim, 100L);
        slayer.attacks(victim2, 100L);
        sorcerer.heals(victim2, 100L);
        victim.heals(victim, 100L);


        //then
        assertEquals(900, victim2.getHealth());
        assertEquals(1000, victim.getHealth());
    }
    @Test
    void heroRPGDeals50PerCentDamageIfTargetIs5OrMoreLevelsAboveAttacker(){
        //given
        var victim= new heroRPG(7);
        var victim2= new heroRPG(7);
        var slayer= new heroRPG();
        var superSlayer= new heroRPG(12);

        //when
        slayer.attacks(victim, 100L);
        superSlayer.attacks(victim2, 100L);
        //then
        assertEquals(950, victim.getHealth());
        assertEquals(850, victim2.getHealth());

    }



}