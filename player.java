import java.util.*;

public class player {
  Scanner console = new Scanner(System.in);
  ArrayList<pokemon> mainPokemon;
  int money;
  int healingPotions;
  String name;
  pokemon inhand;

  public player(int m, int h, String n) {
    money = m;
    healingPotions = h;
    name = n;
    mainPokemon = new ArrayList<pokemon>();
  }

  public String getName() {
    return name;
  }

  public int getMoney() {
    return money;
  }

  public int getPotions() {
    return healingPotions;
  }

  public ArrayList<pokemon> getMainPokemon() {
    return mainPokemon;
  }

  public pokemon getInHand() {
    return inhand;
  }

  public void usePotion() {
    this.healingPotions--;
  }

  public void setFirstMain(pokemon p) {
    mainPokemon.add(p);
  }

  public void addToMain(pokemon p, int i) {
    mainPokemon.set(i, p);
  }

  public void setInHand(int index) {
    inhand = mainPokemon.get(index);
  }

  public void printMainPokemonString() {
    System.out.println("(1) " + mainPokemon.get(0).getName() + "        " + "(4) " + mainPokemon.get(3).getName());
    System.out.println("(2) " + mainPokemon.get(1).getName() + "        " + "(5) " + mainPokemon.get(4).getName());
    System.out.println("(3) " + mainPokemon.get(2).getName() + "        " + "(6) " + mainPokemon.get(5).getName());
  }

  public void switchOutPokemon() {
    ArrayList<pokemon> Swappable = new ArrayList<pokemon>();
    for(int i = 0; i < this.mainPokemon.size(); i++){
      if(!(this.mainPokemon.get(i).getName().equals(this.inhand.getName()))){
      Swappable.add(this.mainPokemon.get(i));
      }
    }
    if (Swappable.size() < 1) {
      System.out.println("Sorry, you can't switch out any pokemon now.");
      return;
    }
    System.out.println("Which pokemon do you want to call in?");

    for (int i = 1; i < Swappable.size() + 1; i++) {
      System.out.println("(" + i + ") " + Swappable.get((i - 1)).getName());
    }
    String response = console.nextLine();
    boolean test2 = true;
    while (test2) {
      if (Integer.parseInt(response) < 1 && Integer.parseInt(response) > Swappable.size()) {
        System.out.println("Please enter a valid response.");
      } else {
        System.out.println("Come back " + inhand.getName() + "!");
        inhand = Swappable.get(Integer.parseInt(response) - 1);
        System.out.println("Go " + inhand.getName() + "!");
        test2 = false;
      }
    }
  }

  public boolean moveScreen(player p2) {
    String battleAns = "";
    Scanner console = new Scanner(System.in);
    int x = 0;
    int y = 0;
    int miss = 0;
    boolean canAttack = true;
    if(this.mainPokemon.size() <= 0){
      System.out.println("All your pokemon have fainted, I guess you need a bit more practice before you can become a trainer!");
      return false;
    }
    System.out.println();
    System.out.println(p2.getName() + "'s pokemon's stats:");
    p2.inhand.printLightStats();
    System.out.println();
    System.out.println("Your pokemon's stats:");
    this.inhand.printStats();
    boolean test = true;
    if (this.inhand.getHealth() <= 0) {
      System.out.println();
      System.out.println("" + this.inhand.getName() + " fainted!");
      this.mainPokemon.remove(this.inhand);
      for (int j = 0; j < this.mainPokemon.size(); j++) {
        if (mainPokemon.get(j).getHealth() <= 0) {
        } else {
          this.inhand = this.mainPokemon.get(j);
          System.out.println("Go " + this.inhand.getName() + "!");
          this.inhand.printStats();
          j += 7;
        }
      }
    }
    System.out.println("What will " + this.inhand.getName() + " do?");
    System.out.println("(1) Attack");
    System.out.println("(2) Heal");
    System.out.println("(3) Switch out");
    while (test) {
      battleAns = console.nextLine();
      x = Integer.parseInt(battleAns);
      if (x <= 0 || x >= 4) {
        System.out.println("Please enter a valid response.");
      } else {
        test = false;
      }
    }
    test = true;
    if (x == 1) {
      System.out.println("What attack will " + this.inhand.getName() + " use?");
      System.out.println("(1) " + this.inhand.getPowerName(0));
      System.out.println("(2) " + this.inhand.getPowerName(1));
      System.out.println("(3) " + this.inhand.getPowerName(2));
      System.out.println("(4) " + this.inhand.getPowerName(3));

      while (test) {
        battleAns = console.nextLine();
        y = Integer.parseInt(battleAns);
        if (y < 1 || y > 4) {
          System.out.println("Please enter a valid response.");
        } else if (this.inhand.getPower(y - 1).getStock() <= 0) {
          canAttack = false;
          System.out.println("You have no more stock of this attack left! Pick another attack quick!");
        } else {
          System.out.println();
          System.out.println("" + this.inhand.getName() + " uses " + (this.inhand.getPowerName(y - 1)) + "!");
          this.inhand.getPower(y - 1).useStock();
          test = false;
        }
      }
      miss = (int) (Math.random() * 4 + 1);
      if (this.inhand.isEffective(p2.inhand) && canAttack && (miss != 4)) {
        System.out.println("It was a critical hit!");
        p2.inhand.setHealth(p2.inhand.getHealth() - (this.inhand.getPower(y - 1).getDamage() + 20));
      } else if (miss == 4) {
        System.out.println("The attack missed!");
      } else {
        System.out.println();
        p2.inhand.setHealth(p2.inhand.getHealth() - (this.inhand.getPower(y - 1).getDamage()));
      }
      canAttack = true;
    } else if (x == 2) {
      if (this.inhand.getHealth() + 30 > this.inhand.getMaxHealth()) {
        System.out.println("This pokemon cannot heal right now");
      } else if (this.getPotions() <= 0) {
        System.out.println("You do not have any more potions left! Please visit the store to buy more");
      } else {
        this.inhand.setHealth(this.inhand.getHealth() + 30);
        System.out.println("" + this.inhand.getName() + " heals 30 hp!");
        this.usePotion();
      }
    } else if (x == 3) {
      this.switchOutPokemon();
    }
    if (p2.mainPokemon.size() <= 0) {
      System.out.println("You beat " + p2.getName() + "!");
      return false;
    }
    return true;
  }

  public boolean enemyAttack(player p1) {
    int x = (int) (Math.random() * 4 + 1);
    int y = 0;
    boolean canUse = true;
    if (this.mainPokemon.size() <= 0) {
      System.out.println("You win!");
      return false;
    }
    if (this.inhand.isEffective(p1.inhand)) {
      y = 20;
    }
    if (this.inhand.getHealth() <= 0) {
      System.out.println(this.inhand.getName() + " fainted!");
      for (int j = 0; j < this.mainPokemon.size(); j++) {
        if (mainPokemon.get(j).getHealth() <= 0) {
          mainPokemon.remove(j);
        } else {
          this.inhand = this.mainPokemon.get(j);
          System.out.println(this.getName() + " sends out " + this.inhand.getName() + "!");
          this.inhand.printLightStats();
          j += 7;
        }
      }
    }
    if (x == 1 || x == 2) {
      x = (int) (Math.random() * 4 + 1);
      while(canUse){
        if (this.inhand.getPower(x - 1).getStock() <= 0){
          x = (int) (Math.random() * 4 + 1);
        } else{
          canUse = false;
        }
      }
      canUse = true;
      System.out.println("" + this.inhand.getName() + " uses " + this.inhand.getPowerName(x - 1) + "!");
      p1.inhand.setHealth(p1.inhand.getHealth() - (this.inhand.getPower(x - 1).getDamage() + y));
      if (y == 20) {
        System.out.println("It was a critical hit!");
      }
      this.inhand.getPower(x - 1).useStock();
    } else if (x == 3) {
      while(canUse){
        if (this.inhand.getPower(x - 1).getStock() <= 0){
          x = (int) (Math.random() * 4 + 1);
        } else{
          canUse = false;
        }
      }
      canUse = true;
      x = (int) (Math.random() * 4 + 1);
      System.out.println("" + this.inhand.getName() + " uses " + this.inhand.getPowerName(x - 1) + "!");
      System.out.println("The attack missed!");
      this.inhand.getPower(x - 1).useStock();
    } else if (x == 4) {
      if (this.getPotions() <= 0) {
        x = (int) (Math.random() * 4 + 1);
        System.out.println("" + this.inhand.getName() + " uses " + this.inhand.getPowerName(x - 1) + "!");
        p1.inhand.setHealth(p1.inhand.getHealth() - (this.inhand.getPower(x - 1).getDamage() + y));
        if (this.inhand.isEffective(p1.inhand)) {
          System.out.println("It was a critical hit!");
        }
        this.inhand.getPower(x - 1).useStock();
      } else {
        this.usePotion();
        System.out.println(this.getName() + " used a heal on " + this.inhand.getName() + "!");
      }
    }
    return true;
  }
}
