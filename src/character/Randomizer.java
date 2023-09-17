package character;

import java.util.Random;

public class Randomizer {
    private Character character;
    public Character randomize(Character[] characters) {
        for (Character character: characters) {
            if(character.getDamage() > 50 && character.getDamage() < 80)
                return new Character("John", "pistol", 90);
            else if (character.getDamage() < 50) {
                return new Character("Sam", "gunshot", 120);
            } else if (character.getDamage() > 80 && character.getDamage() < 100) {
                return new Character("Nick", "hammer", 50);
            } else if (character.getDamage() > 100 && character.getDamage() < 120) {
                return new Character("Jack", "grenade launcher", 500);
            }
        }
        return null;
        }
    }
