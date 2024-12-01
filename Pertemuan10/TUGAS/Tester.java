package Pertemuan10.TUGAS;
// Interface Destroyable
interface Destroyable {
    void destroyed();
}

// Abstract Class Zombie
abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}

// WalkingZombie Class
class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += (health * 20 / 100);
            case 2 -> health += (health * 30 / 100);
            case 3 -> health += (health * 40 / 100);
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 20 / 100); // Health berkurang 20%
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}

// JumpingZombie Class
class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += (health * 30 / 100);
            case 2 -> health += (health * 40 / 100);
            case 3 -> health += (health * 50 / 100);
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 10 / 100); // Health berkurang 10%
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}

// Barrier Class
class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= (strength * 10 / 100); // Strength berkurang 10%
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}

// Plant Class
class Plant {
    public void doDestroy(Destroyable d) {
        d.destroyed();
    }
}

// Tester Class
public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);

        Plant p = new Plant();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("----------------------------");

        // Destroy the enemies 4 times
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
    }
}
