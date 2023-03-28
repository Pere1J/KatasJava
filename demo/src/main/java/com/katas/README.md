 
 Kata FIZZBUZZ

- Escribe un programa/función/clase que, como parámetro, reciba un número
  del 1 al 100 y devuelva:
    - Para múltiplos de tres, devuelva una string:`Fizz`
      en lugar del número.

    - Para los múltiplos de cinco, devuelva una string:`Buzz`
      en lugar del número.

    - Para números que son múltiplos de tres y cinco, 
      devuelva una string:`FizzBuzz` en lugar del número.

    - Por supuesto.. para números que no son múltiplos de tres y cinco,
      debe devolver el mismo número.
  
=============================================================

kata RPG Combat Kata

# **Background**

This is a fun kata that has the programmer building simple combat rules, as for a role-playing game (RPG). It is implemented as a sequence of iterations. The domain doesn't include a map or any other character skills apart from their ability to damage and heal one another.

# **Instructions**

1. Complete each iteration before reading the next one.
2. It's recommended you perform this kata with a pairing partner and while writing tests.

## **Iteration One**

1. All Characters, when created, have:
    - Health, starting at 1000
    - Level, starting at 1
    - May be Alive or Dead, starting Alive (Alive may be a true/false)
2. Characters can Deal Damage to Characters:
    - Damage is subtracted from Health
    - When damage received exceeds current Health, Health becomes 0 and the character dies
3. A Character can Heal a Character:
    - Dead characters cannot be healed
    - Healing cannot raise health above 1000

## **Iteration Two**
1. A Character cannot Deal Damage to itself.
2. A Character can only Heal itself.
When dealing damage:
   - If the target is 5 or more Levels above the attacker, Damage is reduced by 50%
   - If the target is 5 or more Levels below the attacker, Damage is increased by 50%
   
## **Iteration Three**
1. Characters have an attack Max Range.
   - Melee fighters have a range of 2 meters.
   - Ranged fighters have a range of 20 meters.

2. Characters must be in range to deal damage to a target.
   
## **Iteration Four**
Characters may belong to one or more Factions.
Newly created Characters belong to no Faction.
A Character may Join or Leave one or more Factions.
Players belonging to the same Faction are considered Allies.
Allies cannot Deal Damage to one another.
Allies can Heal one another.

## **Iteration Five**

1. Characters can damage non-character *things* (props).
    - Anything that has Health may be a target.
    - These things cannot be Healed and they do not Deal Damage.
    - These things do not belong to Factions; they are neutral.
    - When reduced to 0 Health, things are *Destroyed.*
    - As an example, you may create a Tree with 2000 Health.

