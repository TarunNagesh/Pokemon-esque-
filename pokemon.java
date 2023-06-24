import java.util.*;

public class pokemon {
  private String name;
  private String type;
  private ArrayList<power> Powers;
  private int health;
  private int maxHealth;

  public pokemon(String n, String t, power pow1, power pow2, power pow3, power pow4) {
    name = n;
    type = t;
    Powers = new ArrayList<power>();
    Powers.add(pow1);
    Powers.add(pow2);
    Powers.add(pow3);
    Powers.add(pow4);
    health = 200;
    maxHealth = 200 + (int) (Math.random() * 31) + (int) (Math.random() * 6);
  }

  // accessor methods
  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getMaxHealth() {
    return maxHealth;
  }

  public int getHealth() {
    return health;
  }

  public power getPower(int i) {
    return (Powers.get(i));
  }

  public String getPowerName(int i) {
    return (Powers.get(i).getpName());
  }

  public void printStats() {
    System.out.println("Name: " + this.getName());
    System.out.println("Type: " + this.getType());
    if (this.getHealth() >= 0) {
      System.out.println("HP: " + this.getHealth());
    } else {
      System.out.println("HP: 0");
    }
    for (int i = 0; i < 4; i++)
      System.out.println("Power: " + this.getPowerName(i) + "    Stock: " + this.getPower(i).getStock());
  }
  public void printLightStats(){
    System.out.println("Name: " + this.getName());
    System.out.println("Type: " + this.getType());
    if (this.getHealth() >= 0) {
      System.out.println("HP: " + this.getHealth());
    } else {
      System.out.println("HP: 0");
    }
  }

  // mutator methods
  public void setMaxHealth(int h) {
    maxHealth = h;
  }

  public void setHealth(int h) {
    health = h;
  }

  public boolean isEffective(pokemon other) {
    String otherT = other.type;
    if (this.type.equals("water") && (otherT.equals("fire") || otherT.equals("ground"))) {
      return true;
    } else if (this.type.equals("ground") && (otherT.equals("water") || otherT.equals("electric"))) {
      return true;
    } else if (this.type.equals("fire") && (otherT.equals("ground") || otherT.equals("ice"))) {
      return true;
    } else if (this.type.equals("ice") && (otherT.equals("ground") || otherT.equals("electric"))) {
      return true;
    } else if (this.type.equals("electric") && (otherT.equals("fire") || otherT.equals("water"))) {
      return true;
    } else {
      return false;
    }
  }
}