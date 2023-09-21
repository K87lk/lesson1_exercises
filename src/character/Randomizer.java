package character;

import java.util.Random;

public class Randomizer {
    private Character character;
    private String[] names = {"John", "Nick", "Erick", "Chris", "Bob", "Will"};
    private String[] weapons = {"pistol", "shotgun",
            "machine gun", "grenade", "rocket launcher", "machete"};
    private int[] damages = {21,10,34,98, 100, 230, 300,130};
    public Character randomize(Character[] characters) {
       Random random = new Random();
       int index = random.nextInt(names.length);
       int index2 = random.nextInt(weapons.length);
       int index3 = random.nextInt(damages.length);

        return new Character(names[index], weapons[index2], damages[index3]);
        }
    }
