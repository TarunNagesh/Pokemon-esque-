import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    ArrayList<pokemon> starters = new ArrayList<pokemon>(4);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    ArrayList<pokemon> total = new ArrayList<pokemon>();
    ArrayList<String> battlerNames = new ArrayList<String>();
    player p2;

    String[] FireNames = { "Monferno", "Chimchar", "Ponyta", "Blaziken", "Cyndaquil", "Growlithe", "Torchic",
        "Fennekin", "Litleo", "Tepig", "Charmander", "Magmar" };
    String[] ElectricNames = { "Pikachu", "Shinx", "Voltorb", "Electrike", "Electrabuzz", "Magnemite", "Mareep",
        "Blitzle", "Plusle", "Chinchou", "Jolteon", "Minun" };
    String[] WaterNames = { "Squirtle", "Piplup", "Psyduck", "Greninja", "Oshawott", "Lapras", "Spheal", "Totodile",
        "Octillery", "Mudkip", "Froakie", "Poliwag", "Staryu" };
    String[] GroundNames = { "Onyx", "Geodude", "Cubone", "Leafeon", "Larvitar", "Rhyhorn", "Bulbasaur", "Sandshrew",
        "Phanpy", "Roselia", "Chikorita", "Tangela", "Exeggutor", "Gloom" };
    String[] IceNames = { "Glaceon", "Snover", "Snorunt", "Bergmite", "Cubchoo", "Delibird", "Jynx", "Shellder",
        "Regice", "Vanillite", "Cryogonal" };

    // Adds names to battlers
    battlerNames.add("Jake");
    battlerNames.add("Ian");
    battlerNames.add("Ethan");
    battlerNames.add("Gabriel");
    battlerNames.add("Eric");
    battlerNames.add("Paul");
    battlerNames.add("Professor Nguyen");

    // Electric Pokemon Powers
    ArrayList<power> ElectricPower = new ArrayList<power>();
    ElectricPower.add(new power("Charge", 10, false, 25));
    ElectricPower.add(new power("Overdrive", 30, true, 10));
    ElectricPower.add(new power("Spark", 10, false, 20));
    ElectricPower.add(new power("Thunder Bolt", 40, true, 5));
    ElectricPower.add(new power("Zap Cannon", 35, true, 5));
    ElectricPower.add(new power("Electrify", 15, false, 20));
    ElectricPower.add(new power("Shock Wave", 40, true, 5));
    ElectricPower.add(new power("Volt Tackle", 10, false, 25));
    ElectricPower.add(new power("False Ohmen", 30, true, 10));
    ElectricPower.add(new power("Tickling Thunder", 5, false, 50));
    ElectricPower.add(new power("Zeus' Wrath", 75, true, 2));
    ElectricPower.add(new power("Battery", 10, false, 20));
    
    ArrayList<power> ElectricPower2 = new ArrayList<power>();
    ElectricPower2.add(new power("Charge", 10, false, 25));
    ElectricPower2.add(new power("Overdrive", 30, true, 10));
    ElectricPower2.add(new power("Spark", 10, false, 20));
    ElectricPower2.add(new power("Thunder Bolt", 40, true, 5));
    ElectricPower2.add(new power("Zap Cannon", 35, true, 5));
    ElectricPower2.add(new power("Electrify", 15, false, 20));
    ElectricPower2.add(new power("Shock Wave", 40, true, 5));
    ElectricPower2.add(new power("Volt Tackle", 10, false, 25));
    ElectricPower2.add(new power("False Ohmen", 30, true, 10));
    ElectricPower2.add(new power("Tickling Thunder", 5, false, 50));
    ElectricPower2.add(new power("Zeus' Wrath", 75, true, 2));
    ElectricPower2.add(new power("Battery", 10, false, 20));
    // Random 4 numbers
    nums = fourNum(ElectricPower);
    // Adds Pikachu to starter pokemon
    starters.add(new pokemon("Pikachu", "electric", ElectricPower.get(nums.get(0)), ElectricPower.get(nums.get(1)),
        ElectricPower.get(nums.get(2)), ElectricPower.get(nums.get(3))));

    // Ground Pokemon Powers
    ArrayList<power> GroundPower = new ArrayList<power>();
    GroundPower.add(new power("Dig", 10, false, 25));
    GroundPower.add(new power("Drill Run", 30, true, 10));
    GroundPower.add(new power("Spike", 10, false, 20));
    GroundPower.add(new power("Earthquake", 40, true, 5));
    GroundPower.add(new power("Tectonic Rage", 35, true, 5));
    GroundPower.add(new power("Overgrowth", 15, false, 20));
    GroundPower.add(new power("Bulldoze", 40, true, 5));
    GroundPower.add(new power("Razor Leaf", 10, false, 25));
    GroundPower.add(new power("Ground Pound", 45, true, 5));
    GroundPower.add(new power("Drought", 10, false, 25));
    GroundPower.add(new power("Obsidian Obituary", 40, true, 5));
    GroundPower.add(new power("Rock Sling", 10, false, 25));
    
    ArrayList<power> GroundPower2 = new ArrayList<power>();
    GroundPower2.add(new power("Dig", 10, false, 25));
    GroundPower2.add(new power("Drill Run", 30, true, 10));
    GroundPower2.add(new power("Spike", 10, false, 20));
    GroundPower2.add(new power("Earthquake", 40, true, 5));
    GroundPower2.add(new power("Tectonic Rage", 35, true, 5));
    GroundPower2.add(new power("Overgrowth", 15, false, 20));
    GroundPower2.add(new power("Bulldoze", 40, true, 5));
    GroundPower2.add(new power("Razor Leaf", 10, false, 25));
    GroundPower2.add(new power("Ground Pound", 45, true, 5));
    GroundPower2.add(new power("Drought", 10, false, 25));
    GroundPower2.add(new power("Obsidian Obituary", 40, true, 5));
    GroundPower2.add(new power("Rock Sling", 10, false, 25));

    // Random 4 numbers
    nums = fourNum(GroundPower);
    // Adds Bulbasaur to starter pokemon
    starters.add(new pokemon("Bulbasaur", "ground", GroundPower.get(nums.get(0)), GroundPower.get(nums.get(1)),
        GroundPower.get(nums.get(2)), GroundPower.get(nums.get(3))));

    // Water Pokemon Powers
    ArrayList<power> WaterPower = new ArrayList<power>();
    WaterPower.add(new power("Drip", 10, false, 25));
    WaterPower.add(new power("Aqua Jet", 30, true, 10));
    WaterPower.add(new power("Surf", 10, false, 20));
    WaterPower.add(new power("Hydro Cannon", 40, true, 5));
    WaterPower.add(new power("Water Pulse", 35, true, 5));
    WaterPower.add(new power("Wave Crash", 15, false, 20));
    WaterPower.add(new power("Surging Strikes", 40, true, 5));
    WaterPower.add(new power("Splash", 10, false, 25));
    WaterPower.add(new power("Drought", 10, false, 25));
    WaterPower.add(new power("Tsunami", 40, true, 5));
    WaterPower.add(new power("Bubble Stream", 10, false, 25));
    WaterPower.add(new power("Drown", 45, true, 5));
    
    ArrayList<power> WaterPower2 = new ArrayList<power>();
    WaterPower2.add(new power("Drip", 10, false, 25));
    WaterPower2.add(new power("Aqua Jet", 30, true, 10));
    WaterPower2.add(new power("Surf", 10, false, 20));
    WaterPower2.add(new power("Hydro Cannon", 40, true, 5));
    WaterPower2.add(new power("Water Pulse", 35, true, 5));
    WaterPower2.add(new power("Wave Crash", 15, false, 20));
    WaterPower2.add(new power("Surging Strikes", 40, true, 5));
    WaterPower2.add(new power("Splash", 10, false, 25));
    WaterPower2.add(new power("Drought", 10, false, 25));
    WaterPower2.add(new power("Tsunami", 40, true, 5));
    WaterPower2.add(new power("Bubble Stream", 10, false, 25));
    WaterPower2.add(new power("Drown", 45, true, 5));
    // Random 4 numbers
    nums = fourNum(WaterPower);
    // Adds Squirtle to starter pokemon
    starters.add(new pokemon("Squirtle", "water", WaterPower.get(nums.get(0)), WaterPower.get(nums.get(1)),
        WaterPower.get(nums.get(2)), WaterPower.get(nums.get(3))));

    // Fire Pokemon Powers
    ArrayList<power> FirePower = new ArrayList<power>();
    FirePower.add(new power("Ember", 10, false, 25));
    FirePower.add(new power("Fusion Flare", 30, true, 10));
    FirePower.add(new power("Burn Up", 10, false, 20));
    FirePower.add(new power("Heat Wave", 40, true, 5));
    FirePower.add(new power("Searing Shot", 35, true, 5));
    FirePower.add(new power("Inferno", 15, false, 20));
    FirePower.add(new power("Sacred Fire", 40, true, 5));
    FirePower.add(new power("Overheat", 10, false, 25));
    FirePower.add(new power("Fury of the Sun", 45, true, 5));
    FirePower.add(new power("Exothermic Pulse", 10, false, 25));
    FirePower.add(new power("Exothermic Concussion", 40, true, 5));
    FirePower.add(new power("Combust", 10, false, 25));
    
    ArrayList<power> FirePower2 = new ArrayList<power>();
    FirePower2.add(new power("Ember", 10, false, 25));
    FirePower2.add(new power("Fusion Flare", 30, true, 10));
    FirePower2.add(new power("Burn Up", 10, false, 20));
    FirePower2.add(new power("Heat Wave", 40, true, 5));
    FirePower2.add(new power("Searing Shot", 35, true, 5));
    FirePower2.add(new power("Inferno", 15, false, 20));
    FirePower2.add(new power("Sacred Fire", 40, true, 5));
    FirePower2.add(new power("Overheat", 10, false, 25));
    FirePower2.add(new power("Fury of the Sun", 45, true, 5));
    FirePower2.add(new power("Exothermic Pulse", 10, false, 25));
    FirePower2.add(new power("Exothermic Concussion", 40, true, 5));
    FirePower2.add(new power("Combust", 10, false, 25));

    // Random 4 numbers
    nums = fourNum(FirePower);
    // Adds Charmander to starter pokemon
    starters.add(new pokemon("Charmander", "fire", FirePower.get(nums.get(0)), FirePower.get(nums.get(1)),
        FirePower.get(nums.get(2)), FirePower.get(nums.get(3))));

    // Ice Pokemon Powers
    ArrayList<power> IcePower = new ArrayList<power>();
    IcePower.add(new power("Frost Breath", 10, false, 25));
    IcePower.add(new power("Avalanche", 30, true, 10));
    IcePower.add(new power("Hail", 10, false, 20));
    IcePower.add(new power("Ice Beam", 40, true, 5));
    IcePower.add(new power("Blizzard", 35, true, 5));
    IcePower.add(new power("Mist", 15, false, 20));
    IcePower.add(new power("Icicle Crash", 40, true, 5));
    IcePower.add(new power("Ice Wind", 10, false, 25));
    IcePower.add(new power("Ice Skull", 10, false, 25));
    IcePower.add(new power("Freeze", 10, false, 25));
    IcePower.add(new power("Thermal Drought", 40, true, 5));
    IcePower.add(new power("Kinetic Termination", 75, true, 2));
    
    ArrayList<power> IcePower2 = new ArrayList<power>();
    IcePower2.add(new power("Frost Breath", 10, false, 25));
    IcePower2.add(new power("Avalanche", 30, true, 10));
    IcePower2.add(new power("Hail", 10, false, 20));
    IcePower2.add(new power("Ice Beam", 40, true, 5));
    IcePower2.add(new power("Blizzard", 35, true, 5));
    IcePower2.add(new power("Mist", 15, false, 20));
    IcePower2.add(new power("Icicle Crash", 40, true, 5));
    IcePower2.add(new power("Ice Wind", 10, false, 25));
    IcePower2.add(new power("Ice Skull", 10, false, 25));
    IcePower2.add(new power("Freeze", 10, false, 25));
    IcePower2.add(new power("Thermal Drought", 40, true, 5));
    IcePower2.add(new power("Kinetic Termination", 75, true, 2));

    ArrayList<pokemon> playerPossiblePokemon = new ArrayList<pokemon>();
    // initializes fire pokemon
    for (int i = 0; i < FireNames.length; i++) {
      nums = fourNum(FirePower);
      playerPossiblePokemon.add(new pokemon(FireNames[i], "fire", FirePower2.get(nums.get(0)),
          FirePower2.get(nums.get(1)), FirePower2.get(nums.get(2)), FirePower2.get(nums.get(3))));
    }
    // initializes electric pokemon
    for (int i = 0; i < ElectricNames.length; i++) {
      nums = fourNum(ElectricPower);
      playerPossiblePokemon.add(new pokemon(ElectricNames[i], "electric", ElectricPower2.get(nums.get(0)),
          ElectricPower2.get(nums.get(1)), ElectricPower2.get(nums.get(2)), ElectricPower2.get(nums.get(3))));
    }
    // initializes water pokemon
    for (int i = 0; i < WaterNames.length; i++) {
      nums = fourNum(WaterPower);
      playerPossiblePokemon.add(new pokemon(WaterNames[i], "water", WaterPower2.get(nums.get(0)),
          WaterPower2.get(nums.get(1)), WaterPower2.get(nums.get(2)), WaterPower2.get(nums.get(3))));
    }
    // initializes ground pokemon
    for (int i = 0; i < GroundNames.length; i++) {
      nums = fourNum(GroundPower);
      playerPossiblePokemon.add(new pokemon(GroundNames[i], "ground", GroundPower2.get(nums.get(0)),
          GroundPower2.get(nums.get(1)), GroundPower2.get(nums.get(2)), GroundPower2.get(nums.get(3))));
    }
    // initializes ice pokemon
    for (int i = 0; i < IceNames.length; i++) {
      nums = fourNum(IcePower);
      playerPossiblePokemon.add(new pokemon(IceNames[i], "ice", IcePower2.get(nums.get(0)), IcePower2.get(nums.get(1)),
          IcePower2.get(nums.get(2)), IcePower2.get(nums.get(3))));
    }


    
    // initializes fire pokemon
    for (int i = 0; i < FireNames.length; i++) {
      nums = fourNum(FirePower);
      total.add(new pokemon(FireNames[i], "fire", FirePower.get(nums.get(0)), FirePower.get(nums.get(1)),
          FirePower.get(nums.get(2)), FirePower.get(nums.get(3))));
    }
    // initializes electric pokemon
    for (int i = 0; i < ElectricNames.length; i++) {
      nums = fourNum(ElectricPower);
      total.add(new pokemon(ElectricNames[i], "electric", ElectricPower.get(nums.get(0)),
          ElectricPower.get(nums.get(1)), ElectricPower.get(nums.get(2)), ElectricPower.get(nums.get(3))));
    }
    // initializes water pokemon
    for (int i = 0; i < WaterNames.length; i++) {
      nums = fourNum(WaterPower);
      total.add(new pokemon(WaterNames[i], "water", WaterPower.get(nums.get(0)), WaterPower.get(nums.get(1)),
          WaterPower.get(nums.get(2)), WaterPower.get(nums.get(3))));
    }
    // initializes ground pokemon
    for (int i = 0; i < GroundNames.length; i++) {
      nums = fourNum(GroundPower);
      total.add(new pokemon(GroundNames[i], "ground", GroundPower.get(nums.get(0)), GroundPower.get(nums.get(1)),
          GroundPower.get(nums.get(2)), GroundPower.get(nums.get(3))));
    }
    // initializes ice pokemon
    for (int i = 0; i < IceNames.length; i++) {
      nums = fourNum(IcePower);
      total.add(new pokemon(IceNames[i], "ice", IcePower.get(nums.get(0)), IcePower.get(nums.get(1)),
          IcePower.get(nums.get(2)), IcePower.get(nums.get(3))));
    }

    Collections.shuffle(playerPossiblePokemon);

    System.out.println("Oh hey! You must be the new Pokemon trainer Professor Nguyen was talking about! Remind me of your name again?");
    player p1 = new player(200, 10, console.nextLine());
    System.out.println("Hi " + p1.getName() + "! Here are our starter pokemon, take your pick!");
    System.out.println("(1) Pikachu");
    System.out.println("(2) Bulbasaur");
    System.out.println("(3) Squirtle");
    System.out.println("(4) Charmander");
    boolean test1 = true;
    while (test1) {
      String x = console.nextLine();
      if (Integer.parseInt(x) >= 1 && Integer.parseInt(x) <= 4) {
        System.out.println();
        System.out.println("" + starters.get(Integer.parseInt(x) - 1).getName() + "? Great choice!");
        p1.setFirstMain(starters.get((Integer.parseInt(x) - 1)));
        test1 = false;
      } else {
        System.out.println("Please enter a valid input.");
      }
    }
    // Removes pokemon chosen from total list
    for (int i = 0; i < total.size(); i++){
      if(p1.mainPokemon.get(0).getName().equals(total.get(i).getName())){
        total.remove(i);
        i--;
      }
    }
    System.out.println();
    System.out.println("Oh, you want to jump straight into practice? Here, I'll let you use some of my pokemon so you can have a full team.");
    System.out.println();
    for (int i = 1; i < 6; i++) {
      p1.mainPokemon.add(playerPossiblePokemon.get((i - 1)));
      playerPossiblePokemon.remove(i - 1);
    }
    System.out.println("Here's your full team!");
    System.out.println();
    p1.printMainPokemonString();
    p1.inhand = p1.mainPokemon.get(0);

    Collections.shuffle(playerPossiblePokemon);

    boolean battle = true;
    boolean isStillIn = true;
    boolean win = true;
    while (battle) {
      Collections.shuffle(battlerNames);
      p2 = new player(0, 10, battlerNames.get(0));
      for (int i = 1; i < 6; i++) {
        p2.mainPokemon.add(playerPossiblePokemon.get((i - 1)));
        playerPossiblePokemon.remove(i - 1);
      }
      p2.inhand = p2.mainPokemon.get(0);
      System.out.println();
      System.out.println(p2.getName() + " has challenged you to a battle!");

      while (isStillIn && win) {
        isStillIn = p1.moveScreen(p2);
        win = p2.enemyAttack(p1);
      }

    }
  }

  public static ArrayList<Integer> fourNum(ArrayList<power> p) {
    boolean test = true;
    ArrayList<Integer> x = new ArrayList<Integer>();
    int heavies = 0;
    int light = 0;
    while (test) {
      for (int i = 0; i < p.size(); i++) {
        x.add(i);
      }
      Collections.shuffle(x);
      for (int i = 0; i < 4; i++) {
        if (p.get(x.get(i)).getHeavy()) {
          heavies++;
        } else {
          light++;
        }
      }
      if (heavies == light) {
        test = false;
        return x;
      }
      heavies = 0;
      light = 0;
      x.clear();
    }
    return x;
  }

}