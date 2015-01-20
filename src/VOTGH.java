import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class VOTGH {
	//System.out.println("");
	//System.out.println("------------------------------------------------------");
	
	//declare and initialize system variables
		static Scanner in = new Scanner(System.in);
		static Random rand = new Random();
		static String gameExit = "Exit";		
		static boolean gameRunning = true;
		//static boolean dungeonEnd = true;
		
		static String test;
		
		//declare and initialize game variables
		static String[] enemies = {"Zombie", "Skeleton", "Witch", 
							"Ghost", "Undead Warrior", "Assassin"};
		static String[] bosses = {"", "", ""};
		//final boss stages
		static String finalBossStage1 = "Ghost Guardian";
		static String finalBossStage2 = "Undead Guardian";
		static String finalBossStage3 = "Resurrected Guardian";
		static int maxEnemyHP = 60;
		static int enemyAttackPower = 20;
		static String startingchoice;
		static String forestchoice;
		static String nightchoice;
		static String nightforestchoice;
		static String nighttreechoice;
		static String deathswimchoice;
		//static String warmswimchoice;
		static String deathchoice;
		static String dungeonchoice;
		static String enemychoice;
		static String waterchoice;
		static String shorechoice;
			
		//declare and initialize player variables
		static int userHP = 100;
		static int maxUserHP = 100;
		static int attackDamage = 30;
		static int numHPPotions = 3;
		static int healthPotionHealAmount = 35;
		static int healthPotionDropChance = 65; //Percentage of Drop Chance
		//int enemyAppearChance = 70; //Percentage of Enemy Appear Chance
	
		//experience point (level up) system
		static int currentXP = 0;
		static int nextLevelUp = 100;
		static int xpMaxDrop = 20;
		
		static int points = 0;
		static int output = 0;
		static int minlevel = 2; // first level to display
		static int maxlevel = 200; // last level to display
		
		/**int gainExperience(int x){
			currentXP += x; if(currentXP >= nextLevelUp){
				//levelUp();
			}
			return x;
		}**/
						
		//class (character) things
		static String classChoice;
		static String confirmedClass;
		static String playerName;
		static String confirmedName;
		
		//base classes
		static boolean isHunter;
		static boolean isKnight;
		static boolean isThief;
		static boolean isMagician;
		static boolean isPriest;
		
	public static void leveledUpClasses(){
			//Hunter Classes (leveled ups as well)
			 boolean isHunter;
			 boolean isSniper;	
			 boolean isDuelWield;
			 boolean isMagicRanger;
				
			//Warrior Classes (leveled ups as well)
			 boolean isKnight;
			 boolean isPaladin;
			 boolean isDarkKnight;
			 boolean isDragonKnight;
			 boolean isSamurai;
				
			//Rogue Classes (leveled ups as well)
			 boolean isThief;
			 boolean isAssassin;
			 boolean isNinja;
			 boolean isPirate;
			 boolean isShadow;
				
			//Magical Classes (leveled ups as well)
			 boolean isMagician;
			 boolean isWitch;
			 boolean isWarlock;
			 boolean isNecromancer;
			 boolean isShaman;
			 boolean isElementalist;
				 boolean isWater;
				 boolean isFire;
				 boolean isEarth;
				 boolean isWind;
						
			//Medic Classes (leveled ups as well, or mixed)
			 boolean isPriest;
			 boolean isBattlePriest;
			 boolean isTemplar;
			 boolean isCaster;
						
			//Misc Classes (leveled ups as well, or mixed)
			 boolean isScout; //rogue and hunter
			 boolean isMonk;
			 boolean isEngineer;
			 boolean isAlchemist;
			 boolean isPsychic;
			 boolean isGunslinger;
				
			//RARE Classes (ONLY level ups)
			 boolean isIce; //Rare magic class
			 boolean isGlassCannon; //A quick and powerful individual who does NOT want to get hit. Made of glass. 
			//If he was made of a stronger material, he could be very powerful. Indestructible even.
			 boolean isGameBreaker; //Jack of all Stats: risks being a Master of None if his skills 
			//don't have synergy. On the other hand, if they do overlap, you'll find yourself 
			//having a magic-slinging Master Of All with a stats total up the wazoo; in short, 
			//a Game Breaker.
			 boolean isRealityWarper;// N/A; Breaks time and space.
		}
			
	public static void classes(){
		
			System.out.println("What do you think your profession might be? (Ranger)");///Knight/Thief/Mage/Healer)");
			
			classChoice = in.nextLine();
			
			hunterChoice();
			knightChoice();
			thiefChoice();
			mageChoice();
			healerChoice();			
	}
	
	public static void hunterChoice(){
		switch(classChoice){
		//Default Ranger
		case "Ranger":
			isHunter = true;
			System.out.println("Oh I see, a Ranger! Well, be sure to use your bow! You seem to recall\n"
					+ "it was hand-made by your friends in the forest...");
			System.out.println("");
			break;
		//lowercase
		case "ranger":
			isHunter = true;
			System.out.println("Oh I see, a Ranger! Well, be sure to use your bow! You seem to recall\n"
					+ "it was hand-made by your friends in the forest...");
			System.out.println("");
			break;
		//caps
		case "RANGER":
			isHunter = true;
			System.out.println("Oh I see, a Ranger! Well, be sure to use your bow! You seem to recall\n"
					+ "it was hand-made by your friends in the forest...");
			System.out.println("");
			break;
		//just the (capital) letter
		case "R":
			isHunter = true;
			System.out.println("Oh I see, a Ranger! Well, be sure to use your bow! You seem to recall\n"
					+ "it was hand-made by your friends in the forest...");
			System.out.println("");
			break;
		//just the (lowercase) letter)
		case "r":
			isHunter = true;
			System.out.println("Oh I see, a Ranger! Well, be sure to use your bow! You seem to recall\n"
					+ "it was hand-made by your friends in the forest...");
			System.out.println("");
			break;
		}
	}
	
	public static void knightChoice(){
		switch(classChoice){
		//Default Knight
		case "Knight":
			isKnight = true;
			System.out.println("Awesome, a Knight!! Watch out for monsters, and be sure to use your sword!\n"
					+ "You seem to recall it was hand-crafted especially for you...\n"
					+ "It was a really shiny blade too. ;)");
			System.out.println("");
			break;
		//lowercase
		case "knight":
			isKnight = true;
			System.out.println("Awesome, a Knight!! Watch out for monsters, and be sure to use your sword!\n"
					+ "You seem to recall it was hand-crafted especially for you...\n"
					+ "It was a really shiny blade too. ;)");
			System.out.println("");
			break;
		//caps
		case "KNIGHT":
			isKnight = true;
			System.out.println("Awesome, a Knight!! Watch out for monsters, and be sure to use your sword!\n"
					+ "You seem to recall it was hand-crafted especially for you...\n"
					+ "It was a really shiny blade too. ;)");
			System.out.println("");
			break;
		//just the (capital) letter
		case "K":
			isKnight = true;
			System.out.println("Awesome, a Knight!! Watch out for monsters, and be sure to use your sword!\n"
					+ "You seem to recall it was hand-crafted especially for you...\n"
					+ "It was a really shiny blade too. ;)");
			System.out.println("");
			break;
		//just the (lowercase) letter
		case "k":
			isKnight = true;
			System.out.println("Awesome, a Knight!! Watch out for monsters, and be sure to use your sword!\n"
					+ "You seem to recall it was hand-crafted especially for you...\n"
					+ "It was a really shiny blade too. ;)");
			System.out.println("");
			break;
		}
	}
	
	public static void thiefChoice(){
		switch(classChoice){
		//Default thief
		case "Thief":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
		//thief lowercase
		case "thief":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
						+ "Oh, and be sure you use your keen sense! You were born with it!");
				System.out.println("");
				break;
		//thief uppercase
		case "THIEF":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
		//wrong spelling in case
		case "Theif":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
		//wrong spelling lowercase
		case "theif":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
		//wrong spelling uppercase
		case "THEIF":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
		//just the uppercase letter
		case "T":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
		//just the lowercase letter
		case "t":
			isThief = true;
			System.out.println("Woah, a Thief?!? Have fun looting!!\n"
					+ "Oh, and be sure you use your keen sense! You were born with it!");
			System.out.println("");
			break;
			}
	}
	
	public static void mageChoice(){
		switch(classChoice){
		//Default Mage
		case "Mage":
			isMagician = true;
			System.out.println("That's so cool, a Magician?!?! Can you make a fireball yet? "
					+ "Oh! I almost forgot! Make sure you remember to carry around your staff!\n"
					+ "It's the source of your power! You wouldn't want to lose that, right?");
			System.out.println("");
			break;
		//mage lowercase
		case "mage":
			isMagician = true;
			System.out.println("That's so cool, a Magician?!?! Can you make a fireball yet? "
					+ "Oh! I almost forgot! Make sure you remember to carry around your staff!\n"
					+ "It's the source of your power! You wouldn't want to lose that, right?");
			System.out.println("");
			break;
		//mage uppercase
		case "MAGE":
			isMagician = true;
			System.out.println("That's so cool, a Magician?!?! Can you make a fireball yet? "
					+ "Oh! I almost forgot! Make sure you remember to carry around your staff!\n"
					+ "It's the source of your power! You wouldn't want to lose that, right?");
			System.out.println("");
			break;
		//just the uppercase letter
		case "M":
			isMagician = true;
			System.out.println("That's so cool, a Magician?!?! Can you make a fireball yet?\n"
					+ "Oh! I almost forgot! Make sure you remember to carry around your staff!\n"
					+ "It's the source of your power! You wouldn't want to lose that, right?");
			System.out.println("");
			break;
		//just the lowercase letter
		case "m":
			isMagician = true;
			System.out.println("That's so cool, a Magician?!?! Can you make a fireball yet? "
					+ "Oh! I almost forgot! Make sure you remember to carry around your staff!\n"
					+ "It's the source of your power! You wouldn't want to lose that, right?");
			System.out.println("");
			break;
		}
		
	}
	
	public static void healerChoice(){
		switch(classChoice){
		//Default Healer	
		case "Healer":
			isPriest = true;
			System.out.println("Wow! it's amazing that you're a priest!!\n"
					+ "If you're ever hurt just think about being strong again!\n"
					+ "You'll be instantly healed! Oh, and don't forget that gem you have in your pocket!\n"
					+ "It's the source of your healing powers!");
			System.out.println("");
			break;
		//lowercase healer
		case "healer":
			isPriest = true;
			System.out.println("Wow! it's amazing that you're a priest!!\n"
					+ "If you're ever hurt just think about being strong again!\n"
					+ "You'll be instantly healed! Oh, and don't forget that gem you have in your pocket!\n"
					+ "It's the source of your healing powers!");
			System.out.println("");
			break;
		//caps healer
		case "HEALER":
			isPriest = true;
			System.out.println("Wow! it's amazing that you're a priest!!\n"
					+ "If you're ever hurt just think about being strong again!\n"
					+ "You'll be instantly healed! Oh, and don't forget that gem you have in your pocket!\n"
					+ "It's the source of your healing powers!");
			System.out.println("");
			break;
		//just the uppercase letter
		case "H":
			isPriest = true;
			System.out.println("Wow! it's amazing that you're a priest!!\n"
					+ "If you're ever hurt just think about being strong again!\n"
					+ "You'll be instantly healed! Oh, and don't forget that gem you have in your pocket!\n"
					+ "It's the source of your healing powers!");
			System.out.println("");
			break;
		//just lowercase letter
		case "h":
			isPriest = true;
			System.out.println("Wow! it's amazing that you're a priest!!\n"
					+ "If you're ever hurt just think about being strong again!\n"
					+ "You'll be instantly healed! Oh, and don't forget that gem you have in your pocket!\n"
					+ "It's the source of your healing powers!");
			System.out.println("");
			break;
		}
		
	}

	public static void beginHunterJourney() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("You wake up under a tree, with the sun shining bright into your eyes.\n"
				+ "You don't really know how you got here, you just remember falling asleep.\n"
				+ "You seem to remember being a " + classChoice + "...Maybe that's useful?\n"
				+ "Your bow is littered in pieces on the ground. Maybe you can find a place to fix it.\n"
				+ "You blink once or twice to wake yourself up, but you still feel tired.\n"
				+ "You get up, and look around. It looks like you're just on the outskirts of\n"
				+ "a forest, and there's a body of water near you. An ocean, perhaps? It also\n"
				+ "looks like there's a cave of some kind. You wonder what's inside there.\n"
				+ "There looks to be some mountains too, but quite rocky. You should be careful...\n"
				+ "In the forest, it looks like there's some sort of fort. Maybe you can\n"
				+ "repair your bow there, meet some friends, and scout out the area.\n"
				+ "You think to yourself that you if can get to the fort, repair your bows\n"
				+ "and meet some people, you'll be much better off. You know you always feel better\n"
				+ "after you know your surroundings better. You reassure yourself that you'll be fine.\n"
				+ "You always are. Right?");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Sit under the tree for a little while longer");
		System.out.println("4) Curiously walk inside the cave");
		
		System.out.println();
		
		startingchoice = in.nextLine();
		
		//GAME:
		while(gameRunning){
			System.out.println("----------------------------------------------------------------");
		
			int enemyHP = rand.nextInt(maxEnemyHP);
			String enemy = enemies[rand.nextInt(enemies.length)];
			//String boss = bosses[rand.nextInt(bosses.length)];
	
			//BODY OF WATER
			if(startingchoice.equals("1")){
				System.out.println("You walk down to the waterfront. It's much colder and windier here.");
				
				System.out.println("Well, what will you do?");
				System.out.println("1) Check out the temperature of the water");
				System.out.println("2) Go for a swim");
				System.out.println("3) Walk along the shore, see where it takes you");
				System.out.println("4) Walk back to the tree");
				waterchoice = in.nextLine();
				/**
				 * TOUCH THE WATER
				 */
				if(waterchoice.equals("1")){
					System.out.println("You slowly reach out your hand to touch the water. You react quickly\n"
							+ "and pull your hand out. It's cold to the touch.");
				}
				/**
				 * GO FOR A SWIM
				 */
				else if(waterchoice.equals("2")){
					System.out.println("Are you sure you want to go for a swim?");
					System.out.println("1) Yes");
					System.out.println("2) No");
					nightforestchoice = in.nextLine();
					if(nightforestchoice.equals("1")){
						System.out.println("You take off your dark green pants that you never realized you had on, and wade in the water.\n"
								+ "It's quite cold, but you keep wading forward. At once, out of nowhere a huge fish jumped out of the water\n"
								+ "and swallowed you whole.");
						System.out.println("\tYOU HAVE DIED....");
						System.out.println("Restart?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						deathchoice = in.nextLine();
						//yes
						if(deathchoice.equals("1")){
							System.out.println("Please restart the code.");
							break;
						}
						//no
						else if(deathchoice.equals("2")){
							break;
						}
					}
				}
				/**
				 * WALK ALONG THE SHORE
				 */
				else if(waterchoice.equals("3")){
					System.out.println("You walk along the shore, looking out over the deep blue ocean.\n"
							+ "The clouds start getting darker as you get farther away from the forest,\n"
							+ "and closer to the large mountain looming overhead.\n");
					System.out.println("You ponder going back. What shall you do?");
					System.out.println("1) Walk back to the tree");
					System.out.println("2) Keep walking towards the mountain");
					shorechoice = in.nextLine();
					if(shorechoice.equals("1")){
						returnToTree();
						in.nextLine();
					}
					else if(shorechoice.equals("2")){
						System.out.println("");
					}
				}
				else if(waterchoice.equals("4")){
					returnToTree();
					in.nextLine();
				}
			}
			/**
			 * THE FOREST
			 */
			else if(startingchoice.equals("2")){
				System.out.println("You walk to the forest, to explore a bit. After a while, you come to a clearing.");
				System.out.println("");
				System.out.println("Well, what shall you do?");
				System.out.println("1) Kepp walking through the forest, see what else you can find.");
				System.out.println("2) Look around a bit, see if you can find anything else.");
				System.out.println("3) ");
				forestchoice = in.nextLine();
				if(forestchoice.equals("1")){
					
				}
				else if(forestchoice.equals("2")){
					
				}
				else if(forestchoice.equals("3")){
					
				}
				
			}
			//SIT UNDER THE TREE
			else if(startingchoice.equals("3")){
				System.out.println("You slowly close your eyes and doze off...");
				System.out.println("And wake up! It looks like it's slowly becoming night,\n"
						+ "and there's not much light left. Too bad you already slept.\n"
						+ "You could always go check out the body of water before it gets dark.\n"
						+ "It's up to you.");
				System.out.println("");
				System.out.println("Well, what shall you do?");
				System.out.println("1) Go check out the body of water");
				System.out.println("2) Try and sleep again. You don't feel like doing anything.");
				System.out.println("3) Walk into the forest (at night)");
				nightchoice = in.nextLine();
				//BODY OF WATER
				if(nightchoice.equals("1")){
					
				}
				//can't sleep
				else if(nightchoice.equals("2")){
					System.out.println("You can't sleep! You just woke up, and you're not THAT tired.");
				}
				else if(nightchoice.equals("3")){
					System.out.println("Do you really want to go into the forest (at night)?");
					System.out.println("1) Yes");
					System.out.println("2) No");
					nightforestchoice = in.nextLine();
					if(nightforestchoice.equals("1")){
						System.out.println("Okay....");
						System.out.println("It's so dark in the forest that you tripped on a huge tree stump,\n"
								+ "and you fell off the edge of a cliff and died.\n"
								+ "You should've thought twice about that. Oh well.");
						System.out.println("\tYOU HAVE DIED....");
						System.out.println("Restart?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						deathchoice = in.nextLine();
						//yes
						if(deathchoice.equals("1")){
							System.out.println("Sorry, you have to restart the code to do that.");
							break;
						}
						//no
						else if(deathchoice.equals("2")){
							break;
						}
					}
					else if(nightforestchoice.equals("2")){
						System.out.println("At the last second, you decide against going to the forest, since it's night.");
						returnToTreeAtNight();
						in.nextLine();
						nightchoice = in.nextLine();
					}
				}
			}
			else if(startingchoice.equals("4")){
				System.out.println("You walk into the cave slowly, trying not to make a sound, but you hit a rock.");
				System.out.println("\t*** " + enemy + " has appeared ***\n");
				//while enemy is NOT dead
				while(enemyHP > 0){
					System.out.println("\tYour HP is: " + userHP);
					System.out.println("\t" + enemy + "'s HP is: " + enemyHP);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1) Attack");
					System.out.println("\t2) Take Health Potion");
					System.out.println("\t3) RUN!");
					System.out.println("");
					//local variable
					enemychoice = in.nextLine();
					//attack choice
					if(enemychoice.equals("1")){
						int damageDealt = rand.nextInt(attackDamage);
						int damageTaken = rand.nextInt(enemyAttackPower);
						
						enemyHP -= damageDealt;
						userHP -= damageTaken;
						System.out.println("\t> You attacked the " + enemy + " for " + damageDealt + " damage!!");
						System.out.println("\t> You recieved " + damageTaken + " damage in retaliation!");
						System.out.println("");
						
						if(userHP < 1){
							System.out.println("\t> You have taken too much damage, and you have died. :(");
							System.out.println("");
							break;
						}
					}
					//health potion choice
					else if(enemychoice.equals("2")){
						if(numHPPotions > 0){
							userHP += healthPotionHealAmount;
							numHPPotions--;
							System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
									+ "\n\t> You now have " + userHP + " HP."
									+ "\n\t> You have " + numHPPotions + " health potions left");
							System.out.println("");
						}
						else{
							System.out.println("\t> You do not have any health potions left! Defeat enemies for a chance to get more.");
							System.out.println("");
						}
					}
					//run choice
					else if(enemychoice.equals("3")){
						System.out.println("\t Got away safely from the " + enemy + "!");
						break;
						//continue GAME;
					}
					else{
						System.out.println("\tInvalid choice!");
						System.out.println("");
					}
				}
				//when you, the user has no more health left
				if(userHP < 1){
					System.out.println("You slowly crawl out of the dungeon, utterly weak from battle.");
					break;
				}
			
				System.out.println("-----------------------------------------------------------------");
				System.out.println(" *** " + enemy + " was defeated! ***");
				System.out.println(" *** You have " + userHP + " HP left. ***");
				
				if(rand.nextInt(100) < healthPotionDropChance){
					numHPPotions++;
					System.out.println(" *** The " + enemy + " has dropped a health potion! ***");
					System.out.println(" *** You have gained 1(one) health potion!" + " You now have " + numHPPotions + " health potion(s). ***");
				}
				
				levelUp();  
				
				System.out.println("");
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1) Keep going through the dungeon");
				System.out.println("2) Leave the dungeon");
				//local variable               
				
				dungeonchoice = in.nextLine();
				//make sure the choice is only 1 or 2
				while(!dungeonchoice.equals("1") && !dungeonchoice.equals("2")){
					System.out.println("\tInvalid choice!");
					dungeonchoice=in.nextLine();
				}
				//keep walking through
				if(dungeonchoice.equals("1")){
					System.out.println("You continue throughout the" /**scary yet confusing maze-like**/ + "dungeon with " + userHP + " HP!");
					//continue BATTLE;
				}
				
				//leave the dungeon choice
				else if(dungeonchoice.equals("2")){
					System.out.println("You have left the dungeon and walk back to the tree stump.");
					returnToTree();
					in.nextLine();
				}
				System.out.println("");
			}
			/**else if((!startingchoice.equals("1")) || (!startingchoice.equals("2")) || (!startingchoice.equals("3")) || (!startingchoice.equals("4"))){
				System.out.println("INVALID CHOICE!");
			}*/
		}		
		System.out.println("GAME STILL IN BETA -- NOT COMPLETELY FINSIHED YET!!");
		System.out.println("Thanks for playing my game! Hope you had a lot of fun!");
		System.out.println("--\n"
				+ "Jon");
	}
	
	public static void beginKnightJourney() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("You wake up under a tree, with the sun shining bright into your eyes.\n"
				+ "You don't really know how you got here, you just remember falling asleep.\n"
				+ "You seem to remember being a " + classChoice + "...Maybe that's useful?\n"
				+ "Your sword is sitting on the ground next to you, all dull and boring!\n"
				+ "You blink once or twice to wake yourself up, but you still feel tired.\n"
				+ "You get up, and look around. It looks like you're just on the outskirts of\n"
				+ "a forest, and there's a body of water near you. An ocean, perhaps? It also\n"
				+ "looks like there's a cave of some kind. You wonder what's inside there.\n"
				+ "There looks to be some mountains too, but quite rocky. You should be careful...\n"
				+ "You squint past the mountains and you see..a castle? Maybe that's the nearest city.\n"
				+ "You prioritize and figure out that's your best tactic right now. Once you get there,\n"
				+ "you should sharpen your sword. If you're to survive you'll need a sharper sword\n"
				+ "You remember being a great warrior, and a great tactician.\n"
				+ "If you know your surroundings much better, you can plan out what to do next.\n" 
				+ "You reassure yourself that you'll figure it out. You always do. Right?");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Sit under the tree for a little while longer");
		System.out.println("4) Curiously walk inside the cave");
		
		System.out.println();
		
		startingchoice = in.nextLine();
		
		//GAME:
		while(gameRunning){
			System.out.println("----------------------------------------------------------------");
		
			int enemyHP = rand.nextInt(maxEnemyHP);
			String enemy = enemies[rand.nextInt(enemies.length)];
			//String boss = bosses[rand.nextInt(bosses.length)];
	
			//BODY OF WATER
			if(startingchoice.equals("1")){
				System.out.println("");
				System.out.println("You walk down to the waterfront. It's much colder and windier here.");
				
				System.out.println("Well, what will you do?");
				System.out.println("1) Check out the temperature of the water");
				System.out.println("2) Go for a swim");
				System.out.println("3) Walk along the shore, see where it takes you");
				System.out.println("4) Walk back to the tree");
				waterchoice = in.nextLine();
				
				if(waterchoice.equals("1")){
					
				}
				else if(waterchoice.equals("2")){
					
				}
				else if(waterchoice.equals("3")){
					
				}
				else if(waterchoice.equals("4")){
					//returnToTree();
				}
			}
			//THE FOREST
			else if(startingchoice.equals("2")){
				System.out.println("");
			}
			//SIT UNDER THE TREE
			else if(startingchoice.equals("3")){
				System.out.println("You slowly close your eyes and doze off...");
				System.out.println("And wake up! It looks like it's slowly becoming night,\n"
						+ "and there's not much light left. Too bad you already slept.\n"
						+ "You could always go check out the body of water before it gets dark.\n"
						+ "It's up to you.");
				System.out.println("");
				System.out.println("Well, what shall you do?");
				System.out.println("1) Go check out the body of water");
				System.out.println("2) Try and sleep again. You don't feel like doing anything.");
				System.out.println("3) Walk into the forest (at night)");
				nightchoice = in.nextLine();
				//BODY OF WATER
				if(nightchoice.equals("1")){
					
				}
				//can't sleep
				else if(nightchoice.equals("2")){
					System.out.println("You can't sleep! You just woke up, and you're not THAT tired.");
				}
				else if(nightchoice.equals("3")){
					System.out.println("Do you really want to go into the forest (at night)?");
					System.out.println("1) Yes");
					System.out.println("2) No");
					nightforestchoice = in.nextLine();
					if(nightforestchoice.equals("1")){
						System.out.println("Okay....");
						System.out.println("It's so dark in the forest that you tripped on a huge tree stump,\n"
								+ "and you fell off the edge of a cliff and died.\n"
								+ "You should've thought twice about that. Oh well.");
						System.out.println("\tYOU HAVE DIED....");
						System.out.println("Restart?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						deathchoice = in.nextLine();
						//yes
						if(deathchoice.equals("1")){
							System.out.println("Sorry, you have to restart the code to do that.");
							break;
						}
						//no
						else if(deathchoice.equals("2")){
							break;
						}
					}
					else if(nightforestchoice.equals("2")){
						System.out.println("At the last second, you decide against going to the forest, since it's night.");
					}
				}
			}
			else if(startingchoice.equals("4")){
				System.out.println("You walk into the cave slowly, trying not to make a sound, but you hit a rock.");
				System.out.println("\t*** " + enemy + " has appeared ***\n");
				//while enemy is NOT dead
				while(enemyHP > 0){
					System.out.println("\tYour HP is: " + userHP);
					System.out.println("\t" + enemy + "'s HP is: " + enemyHP);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1) Attack");
					System.out.println("\t2) Take Health Potion");
					System.out.println("\t3) RUN!");
					System.out.println("");
					//local variable
					enemychoice = in.nextLine();
					//attack choice
					if(enemychoice.equals("1")){
						int damageDealt = rand.nextInt(attackDamage);
						int damageTaken = rand.nextInt(enemyAttackPower);
						
						enemyHP -= damageDealt;
						userHP -= damageTaken;
						System.out.println("\t> You attacked the " + enemy + " for " + damageDealt + " damage!!");
						System.out.println("\t> You recieved " + damageTaken + " damage in retaliation!");
						System.out.println("");
						
						if(userHP < 1){
							System.out.println("\t> You have taken too much damage, and you have died. :(");
							System.out.println("");
							break;
						}
					}
					//health potion choice
					else if(enemychoice.equals("2")){
						if(numHPPotions > 0){
							userHP += healthPotionHealAmount;
							numHPPotions--;
							System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
									+ "\n\t> You now have " + userHP + " HP."
									+ "\n\t> You have " + numHPPotions + " health potions left");
							System.out.println("");
						}
						else{
							System.out.println("\t> You do not have any health potions left! Defeat enemies for a chance to get more.");
							System.out.println("");
						}
					}
					//run choice
					else if(enemychoice.equals("3")){
						System.out.println("\t Got away safely from the " + enemy + "!");
						break;
						//continue GAME;
					}
					else{
						System.out.println("\tInvalid choice!");
						System.out.println("");
					}
				}
				//when you, the user has no more health left
				if(userHP < 1){
					System.out.println("You slowly crawl out of the dungeon, utterly weak from battle.");
					break;
				}
			
				System.out.println("-----------------------------------------------------------------");
				System.out.println(" *** " + enemy + " was defeated! ***");
				System.out.println(" *** You have " + userHP + " HP left. ***");
				
				if(rand.nextInt(100) < healthPotionDropChance){
					numHPPotions++;
					System.out.println(" *** The " + enemy + " has dropped a health potion! ***");
					System.out.println(" *** You have gained 1(one) health potion!" + " You now have " + numHPPotions + " health potion(s). ***");
				}
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1) Keep going through the dungeon");
				System.out.println("2) Leave the dungeon");
				//local variable               
				
				dungeonchoice = in.nextLine();
				//make sure the choice is only 1 or 2
				while(!dungeonchoice.equals("1") && !dungeonchoice.equals("2")){
					System.out.println("\tInvalid choice!");
					dungeonchoice=in.nextLine();
				}
				//keep walking through
				if(dungeonchoice.equals("1")){
					System.out.println("You continue throughout the" /**scary yet confusing maze-like**/ + "dungeon with " + userHP + " HP!");
					//continue BATTLE;
				}
				
				//leave the dungeon choice
				else if(dungeonchoice.equals("2")){
					System.out.println("You have left the dungeon and walk back to the tree stump.");
					returnToTree();
					in.nextLine();
				}
				System.out.println("");
			}
		}
		System.out.println("GAME STILL IN BETA -- NOT COMPLETELY FINSIHED YET!!");
		System.out.println("Thanks for playing my game! Hope you had a lot of fun!");
		System.out.println("--\n"
				+ "Jon");
	}
	
	public static void beginThiefJourney() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("You wake up under a tree, with the sun shining bright into your eyes.\n"
				+ "You don't really know how you got here, you just remember falling asleep.\n"
				+ "You seem to remember being a " + "Thief" + "...Maybe that's useful?\n"
				+ "Next to you on the ground are your lock picks, and your knives. They're smashed\n"
				+ "though. Might as well just leave them there. No use for them now..right?\n"
				+ "You blink once or twice to wake yourself up, but you still feel tired.\n"
				+ "You get up, and look around. It looks like you're just on the outskirts of\n"
				+ "a forest, and there's a body of water near you. An ocean, perhaps? It also\n"
				+ "looks like there's a cave of some kind. You wonder what's inside there.\n"
				+ "There looks to be some mountains too, but quite rocky. You should be careful...\n"
				+ "You look back to the ocean and realize something you missed earlier. There's a\n"
				+ "ship of some sort. It's crashed against the rocks, though. Maybe it's a pirate ship?\n "
				+ "You can get quite the fortune from them.. If you end up checking out the ship, the crow's\n"
				+ "nest seems like a good place to start. It's still intact, at least that's what it looks like.\n"
				+ "If you get a good fortune from the ship you go to the nearest city and get stocked up.\n"
				+ "As long as you replace your knives, and a better lock picks, you'll be set.\n"
				+ "You reassure yourself that you'll survive this new world.\n"
				+ "You always survive. Right?");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Sit under the tree for a little while longer");
		System.out.println("4) Curiously walk inside the cave");
		
		System.out.println();
		
		startingchoice = in.nextLine();
		
		//GAME:
		while(gameRunning){
			System.out.println("----------------------------------------------------------------");
		
			int enemyHP = rand.nextInt(maxEnemyHP);
			String enemy = enemies[rand.nextInt(enemies.length)];
			//String boss = bosses[rand.nextInt(bosses.length)];
	
			//BODY OF WATER
			if(startingchoice.equals("1")){
				System.out.println("");
				System.out.println("You walk down to the waterfront. It's much colder and windier here.");
				
				System.out.println("Well, what will you do?");
				System.out.println("1) Check out the temperature of the water");
				System.out.println("2)");
				System.out.println("");
				System.out.println("");
			}
			//THE FOREST
			else if(startingchoice.equals("2")){
				System.out.println("");
			}
			//SIT UNDER THE TREE
			else if(startingchoice.equals("3")){
				System.out.println("You slowly close your eyes and doze off...");
				System.out.println("And wake up! It looks like it's slowly becoming night,\n"
						+ "and there's not much light left. Too bad you already slept.\n"
						+ "You could always go check out the body of water before it gets dark.\n"
						+ "It's up to you.");
				System.out.println("");
				System.out.println("Well, what shall you do?");
				System.out.println("1) Go check out the body of water");
				System.out.println("2) Try and sleep again. You don't feel like doing anything.");
				System.out.println("3) Walk into the forest (at night)");
				nightchoice = in.nextLine();
				//BODY OF WATER
				if(startingchoice.equals("1")){
					System.out.println("");
					System.out.println("You walk down to the waterfront. It's much colder and windier here.");
					
					System.out.println("Well, what will you do?");
					System.out.println("1) Check out the temperature of the water");
					System.out.println("2) Go for a swim");
					System.out.println("3) Walk along the shore, see where it takes you");
					System.out.println("4) Walk back to the tree");
					waterchoice = in.nextLine();
					
					if(waterchoice.equals("1")){
						
					}
					else if(waterchoice.equals("2")){
						
					}
					else if(waterchoice.equals("3")){
						
					}
					else if(waterchoice.equals("4")){
						//returnToTree();
					}
				}
				//can't sleep
				else if(nightchoice.equals("2")){
					System.out.println("You can't sleep! You just woke up, and you're not THAT tired.");
				}
				else if(nightchoice.equals("3")){
					System.out.println("Do you really want to go into the forest (at night)?");
					System.out.println("1) Yes");
					System.out.println("2) No");
					nightforestchoice = in.nextLine();
					if(nightforestchoice.equals("1")){
						System.out.println("Okay....");
						System.out.println("It's so dark in the forest that you tripped on a huge tree stump,\n"
								+ "and you fell off the edge of a cliff and died.\n"
								+ "You should've thought twice about that. Oh well.");
						System.out.println("\tYOU HAVE DIED....");
						System.out.println("Restart?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						deathchoice = in.nextLine();
						//yes
						if(deathchoice.equals("1")){
							System.out.println("Sorry, you have to restart the code to do that.");
							break;
						}
						//no
						else if(deathchoice.equals("2")){
							break;
						}
					}
					else if(nightforestchoice.equals("2")){
						System.out.println("At the last second, you decide against going to the forest, since it's night.");
					}
				}
			}
			else if(startingchoice.equals("4")){
				System.out.println("You walk into the cave slowly, trying not to make a sound, but you hit a rock.");
				System.out.println("\t*** " + enemy + " has appeared ***\n");
				//while enemy is NOT dead
				while(enemyHP > 0){
					System.out.println("\tYour HP is: " + userHP);
					System.out.println("\t" + enemy + "'s HP is: " + enemyHP);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1) Attack");
					System.out.println("\t2) Take Health Potion");
					System.out.println("\t3) RUN!");
					System.out.println("");
					//local variable
					enemychoice = in.nextLine();
					//attack choice
					if(enemychoice.equals("1")){
						int damageDealt = rand.nextInt(attackDamage);
						int damageTaken = rand.nextInt(enemyAttackPower);
						
						enemyHP -= damageDealt;
						userHP -= damageTaken;
						System.out.println("\t> You attacked the " + enemy + " for " + damageDealt + " damage!!");
						System.out.println("\t> You recieved " + damageTaken + " damage in retaliation!");
						System.out.println("");
						
						if(userHP < 1){
							System.out.println("\t> You have taken too much damage, and you have died. :(");
							System.out.println("");
							break;
						}
					}
					//health potion choice
					else if(enemychoice.equals("2")){
						if(numHPPotions > 0){
							userHP += healthPotionHealAmount;
							numHPPotions--;
							System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
									+ "\n\t> You now have " + userHP + " HP."
									+ "\n\t> You have " + numHPPotions + " health potions left");
							System.out.println("");
						}
						else{
							System.out.println("\t> You do not have any health potions left! Defeat enemies for a chance to get more.");
							System.out.println("");
						}
					}
					//run choice
					else if(enemychoice.equals("3")){
						System.out.println("\t Got away safely from the " + enemy + "!");
						break;
						//continue GAME;
					}
					else{
						System.out.println("\tInvalid choice!");
						System.out.println("");
					}
				}
				//when you, the user has no more health left
				if(userHP < 1){
					System.out.println("You slowly crawl out of the dungeon, utterly weak from battle.");
					break;
				}
			
				System.out.println("-----------------------------------------------------------------");
				System.out.println(" *** " + enemy + " was defeated! ***");
				System.out.println(" *** You have " + userHP + " HP left. ***");
				
				if(rand.nextInt(100) < healthPotionDropChance){
					numHPPotions++;
					System.out.println(" *** The " + enemy + " has dropped a health potion! ***");
					System.out.println(" *** You have gained 1(one) health potion!" + " You now have " + numHPPotions + " health potion(s). ***");
				}
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1) Keep going through the dungeon");
				System.out.println("2) Leave the dungeon");
				//local variable               
				
				dungeonchoice = in.nextLine();
				//make sure the choice is only 1 or 2
				while(!dungeonchoice.equals("1") && !dungeonchoice.equals("2")){
					System.out.println("\tInvalid choice!");
					dungeonchoice=in.nextLine();
				}
				//keep walking through
				if(dungeonchoice.equals("1")){
					System.out.println("You continue throughout the" /**scary yet confusing maze-like**/ + "dungeon with " + userHP + " HP!");
					//continue BATTLE;
				}
				
				//leave the dungeon choice
				else if(dungeonchoice.equals("2")){
					System.out.println("You have left the dungeon and walk back to the tree stump.");
					returnToTree();
					in.nextLine();
				}
				System.out.println("");
			}
		}
		System.out.println("GAME STILL IN BETA -- NOT COMPLETELY FINSIHED YET!!");
		System.out.println("Thanks for playing my game! Hope you had a lot of fun!");
		System.out.println("--\n"
				+ "Jon");
	}
	
	public static void beginMageJourney(){
		System.out.println("----------------------------------------------------------------");
		System.out.println("You wake up under a tree, with the sun shining bright into your eyes.\n"
				+ "You don't really know how you got here, you just remember falling asleep.\n"
				+ "You seem to remember being a " + classChoice + "...Maybe that's useful?\n"
				+ "You blink once or twice to wake yourself up, but you still feel tired.\n"
				+ "You get up, and look around. It looks like you're just on the outskirts of\n"
				+ "a forest, and there's a body of water near you. An ocean, perhaps? It also\n"
				+ "looks like there's a cave of some kind. You wonder what's inside there.\n"
				+ "There looks to be some mountains too, but quite rocky. You should be careful...\n"
				+ "Beyond the forest, way in the distance, it seems like it's some sort of tower!\n"
				+ "Maybe it's a mage tower. You know, with wizards and stuff!! You can re-learn all your spells.\n"
				+ "You think to yourself that you if can get to the tower, you can check out your\n"
				+ "surroundings much better. You reassure yourself that you'll figure it out.\n"
				+ "You always do. Right?");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Sit under the tree for a little while longer");
		System.out.println("4) Curiously walk inside the cave");
		
		System.out.println();
		
		startingchoice = in.nextLine();
		
		//GAME:
		while(gameRunning){
			System.out.println("----------------------------------------------------------------");
		
			int enemyHP = rand.nextInt(maxEnemyHP);
			String enemy = enemies[rand.nextInt(enemies.length)];
			//String boss = bosses[rand.nextInt(bosses.length)];
	
			//BODY OF WATER
			if(startingchoice.equals("1")){
				System.out.println("");
				System.out.println("You walk down to the waterfront. It's much colder and windier here.");
				
				System.out.println("Well, what will you do?");
				System.out.println("1) Check out the temperature of the water");
				System.out.println("2)");
				System.out.println("");
				System.out.println("");
			}
			//THE FOREST
			else if(startingchoice.equals("2")){
				System.out.println("");
			}
			//SIT UNDER THE TREE
			else if(startingchoice.equals("3")){
				System.out.println("You slowly close your eyes and doze off...");
				System.out.println("And wake up! It looks like it's slowly becoming night,\n"
						+ "and there's not much light left. Too bad you already slept.\n"
						+ "You could always go check out the body of water before it gets dark.\n"
						+ "It's up to you.");
				System.out.println("");
				System.out.println("Well, what shall you do?");
				System.out.println("1) Go check out the body of water");
				System.out.println("2) Try and sleep again. You don't feel like doing anything.");
				System.out.println("3) Walk into the forest (at night)");
				nightchoice = in.nextLine();
				//BODY OF WATER
				if(startingchoice.equals("1")){
					System.out.println("");
					System.out.println("You walk down to the waterfront. It's much colder and windier here.");
					
					System.out.println("Well, what will you do?");
					System.out.println("1) Check out the temperature of the water");
					System.out.println("2) Go for a swim");
					System.out.println("3) Walk along the shore, see where it takes you");
					System.out.println("4) Walk back to the tree");
					waterchoice = in.nextLine();
					
					if(waterchoice.equals("1")){
						
					}
					else if(waterchoice.equals("2")){
						
					}
					else if(waterchoice.equals("3")){
						
					}
					else if(waterchoice.equals("4")){
						//returnToTree();
					}
				}
				//can't sleep
				else if(nightchoice.equals("2")){
					System.out.println("You can't sleep! You just woke up, and you're not THAT tired.");
				}
				else if(nightchoice.equals("3")){
					System.out.println("Do you really want to go into the forest (at night)?");
					System.out.println("1) Yes");
					System.out.println("2) No");
					nightforestchoice = in.nextLine();
					if(nightforestchoice.equals("1")){
						System.out.println("Okay....");
						System.out.println("It's so dark in the forest that you tripped on a huge tree stump,\n"
								+ "and you fell off the edge of a cliff and died.\n"
								+ "You should've thought twice about that. Oh well.");
						System.out.println("\tYOU HAVE DIED....");
						System.out.println("Restart?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						deathchoice = in.nextLine();
						//yes
						if(deathchoice.equals("1")){
							System.out.println("Sorry, you have to restart the code to do that.");
							break;
						}
						//no
						else if(deathchoice.equals("2")){
							break;
						}
					}
					else if(nightforestchoice.equals("2")){
						System.out.println("At the last second, you decide against going to the forest, since it's night.");
					}
				}
			}
			else if(startingchoice.equals("4")){
				System.out.println("You walk into the cave slowly, trying not to make a sound, but you hit a rock.");
				System.out.println("\t*** " + enemy + " has appeared ***\n");
				//while enemy is NOT dead
				while(enemyHP > 0){
					System.out.println("\tYour HP is: " + userHP);
					System.out.println("\t" + enemy + "'s HP is: " + enemyHP);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1) Attack");
					System.out.println("\t2) Take Health Potion");
					System.out.println("\t3) RUN!");
					System.out.println("");
					//local variable
					enemychoice = in.nextLine();
					//attack choice
					if(enemychoice.equals("1")){
						int damageDealt = rand.nextInt(attackDamage);
						int damageTaken = rand.nextInt(enemyAttackPower);
						
						enemyHP -= damageDealt;
						userHP -= damageTaken;
						System.out.println("\t> You attacked the " + enemy + " for " + damageDealt + " damage!!");
						System.out.println("\t> You recieved " + damageTaken + " damage in retaliation!");
						System.out.println("");
						
						if(userHP < 1){
							System.out.println("\t> You have taken too much damage, and you have died. :(");
							System.out.println("");
							break;
						}
					}
					//health potion choice
					else if(enemychoice.equals("2")){
						if(numHPPotions > 0){
							userHP += healthPotionHealAmount;
							numHPPotions--;
							System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
									+ "\n\t> You now have " + userHP + " HP."
									+ "\n\t> You have " + numHPPotions + " health potions left");
							System.out.println("");
						}
						else{
							System.out.println("\t> You do not have any health potions left! Defeat enemies for a chance to get more.");
							System.out.println("");
						}
					}
					//run choice
					else if(enemychoice.equals("3")){
						System.out.println("\t Got away safely from the " + enemy + "!");
						break;
						//continue GAME;
					}
					else{
						System.out.println("\tInvalid choice!");
						System.out.println("");
					}
				}
				//when you, the user has no more health left
				if(userHP < 1){
					System.out.println("You slowly crawl out of the dungeon, utterly weak from battle.");
					break;
				}
			
				System.out.println("-----------------------------------------------------------------");
				System.out.println(" *** " + enemy + " was defeated! ***");
				System.out.println(" *** You have " + userHP + " HP left. ***");
				
				if(rand.nextInt(100) < healthPotionDropChance){
					numHPPotions++;
					System.out.println(" *** The " + enemy + " has dropped a health potion! ***");
					System.out.println(" *** You have gained 1(one) health potion!" + " You now have " + numHPPotions + " health potion(s). ***");
				}
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1) Keep going through the dungeon");
				System.out.println("2) Leave the dungeon");
				//local variable               
				
				dungeonchoice = in.nextLine();
				//make sure the choice is only 1 or 2
				while(!dungeonchoice.equals("1") && !dungeonchoice.equals("2")){
					System.out.println("\tInvalid choice!");
					dungeonchoice=in.nextLine();
				}
				//keep walking through
				if(dungeonchoice.equals("1")){
					System.out.println("You continue throughout the" /**scary yet confusing maze-like**/ + "dungeon with " + userHP + " HP!");
					//continue BATTLE;
				}
				
				//leave the dungeon choice
				else if(dungeonchoice.equals("2")){
					System.out.println("You have left the dungeon and walk back to the tree stump.");
					returnToTree();
					in.nextLine();
				}
				System.out.println("");
			}
		}
		System.out.println("GAME STILL IN BETA -- NOT COMPLETELY FINSIHED YET!!");
		System.out.println("Thanks for playing my game! Hope you had a lot of fun!");
		System.out.println("--\n"
				+ "Jon");
	}
	
	public static void beginHealerJourney() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("You wake up under a tree, with the sun shining bright into your eyes.\n"
				+ "You don't really know how you got here, you just remember falling asleep.\n"
				+ "You seem to remember being a " + classChoice + "...Maybe that's useful?\n"
				+ "You blink once or twice to wake yourself up, but you still feel tired.\n"
				+ "You get up, and look around. It looks like you're just on the outskirts of\n"
				+ "a forest, and there's a body of water near you. An ocean, perhaps? It also\n"
				+ "looks like there's a cave of some kind. You wonder what's inside there.\n"
				+ "There looks to be some mountains too, but quite rocky. You should be careful...\n"
				+ "You look on top of the mountain, and there's a clearing. It looks like a chapel.\n"
				+ "You can go there to get settled and you'll definitely feel better.\n"
				+ "Chapels usually have a place to sleep and pray. You'll feel better if you go there.\n"
				+ "You reassure yourself that you'll survive, with the help of the chapel.\n"
				+ "You'll be fine, you always are. Right?");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Sit under the tree for a little while longer");
		System.out.println("4) Curiously walk inside the cave");
		
		System.out.println();
		
		startingchoice = in.nextLine();
		
		//GAME:
		while(gameRunning){
			System.out.println("----------------------------------------------------------------");
		
			int enemyHP = rand.nextInt(maxEnemyHP);
			String enemy = enemies[rand.nextInt(enemies.length)];
			//String boss = bosses[rand.nextInt(bosses.length)];
	
			//BODY OF WATER
			if(startingchoice.equals("1")){
				System.out.println("");
				System.out.println("You walk down to the waterfront. It's much colder and windier here.");
				
				System.out.println("Well, what will you do?");
				System.out.println("1) Check out the temperature of the water");
				System.out.println("2)");
				System.out.println("");
				System.out.println("");
			}
			//THE FOREST
			else if(startingchoice.equals("2")){
				System.out.println("");
			}
			//SIT UNDER THE TREE
			else if(startingchoice.equals("3")){
				System.out.println("You slowly close your eyes and doze off...");
				System.out.println("And wake up! It looks like it's slowly becoming night,\n"
						+ "and there's not much light left. Too bad you already slept.\n"
						+ "You could always go check out the body of water before it gets dark.\n"
						+ "It's up to you.");
				System.out.println("");
				System.out.println("Well, what shall you do?");
				System.out.println("1) Go check out the body of water");
				System.out.println("2) Try and sleep again. You don't feel like doing anything.");
				System.out.println("3) Walk into the forest (at night)");
				nightchoice = in.nextLine();
				//BODY OF WATER
				if(startingchoice.equals("1")){
					System.out.println("");
					System.out.println("You walk down to the waterfront. It's much colder and windier here.");
					
					System.out.println("Well, what will you do?");
					System.out.println("1) Check out the temperature of the water");
					System.out.println("2) Go for a swim");
					System.out.println("3) Walk along the shore, see where it takes you");
					System.out.println("4) Walk back to the tree");
					waterchoice = in.nextLine();
					
					if(waterchoice.equals("1")){
						
					}
					else if(waterchoice.equals("2")){
						
					}
					else if(waterchoice.equals("3")){
						
					}
					else if(waterchoice.equals("4")){
						//returnToTree();
					}
				}
				//can't sleep
				else if(nightchoice.equals("2")){
					System.out.println("You can't sleep! You just woke up, and you're not THAT tired.");
				}
				else if(nightchoice.equals("3")){
					System.out.println("Do you really want to go into the forest (at night)?");
					System.out.println("1) Yes");
					System.out.println("2) No");
					nightforestchoice = in.nextLine();
					if(nightforestchoice.equals("1")){
						System.out.println("Okay....");
						System.out.println("It's so dark in the forest that you tripped on a huge tree stump,\n"
								+ "and you fell off the edge of a cliff and died.\n"
								+ "You should've thought twice about that. Oh well.");
						System.out.println("\tYOU HAVE DIED....");
						System.out.println("Restart?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						deathchoice = in.nextLine();
						//yes
						if(deathchoice.equals("1")){
							System.out.println("Sorry, you have to restart the code to do that.");
							break;
						}
						//no
						else if(deathchoice.equals("2")){
							break;
						}
					}
					else if(nightforestchoice.equals("2")){
						System.out.println("At the last second, you decide against going to the forest, since it's night.");
					}
				}
			}
			else if(startingchoice.equals("4")){
				System.out.println("You walk into the cave slowly, trying not to make a sound, but you hit a rock.");
				System.out.println("\t*** " + enemy + " has appeared ***\n");
				//while enemy is NOT dead
				while(enemyHP > 0){
					System.out.println("\tYour HP is: " + userHP);
					System.out.println("\t" + enemy + "'s HP is: " + enemyHP);
					System.out.println("\n\tWhat would you like to do?");
					System.out.println("\t1) Attack");
					System.out.println("\t2) Take Health Potion");
					System.out.println("\t3) RUN!");
					System.out.println("");
					//local variable
					enemychoice = in.nextLine();
					//attack choice
					if(enemychoice.equals("1")){
						int damageDealt = rand.nextInt(attackDamage);
						int damageTaken = rand.nextInt(enemyAttackPower);
						
						enemyHP -= damageDealt;
						userHP -= damageTaken;
						System.out.println("\t> You attacked the " + enemy + " for " + damageDealt + " damage!!");
						System.out.println("\t> You recieved " + damageTaken + " damage in retaliation!");
						System.out.println("");
						
						if(userHP < 1){
							System.out.println("\t> You have taken too much damage, and you have died. :(");
							System.out.println("");
							break;
						}
					}
					//health potion choice
					else if(enemychoice.equals("2")){
						if(numHPPotions > 0){
							userHP += healthPotionHealAmount;
							numHPPotions--;
							System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
									+ "\n\t> You now have " + userHP + " HP."
									+ "\n\t> You have " + numHPPotions + " health potions left");
							System.out.println("");
						}
						else{
							System.out.println("\t> You do not have any health potions left! Defeat enemies for a chance to get more.");
							System.out.println("");
						}
					}
					//run choice
					else if(enemychoice.equals("3")){
						System.out.println("\t Got away safely from the " + enemy + "!");
						break;
						//continue GAME;
					}
					else{
						System.out.println("\tInvalid choice!");
						System.out.println("");
					}
				}
				//when you, the user has no more health left
				if(userHP < 1){
					System.out.println("You slowly crawl out of the dungeon, utterly weak from battle.");
					break;
				}
			
				System.out.println("-----------------------------------------------------------------");
				System.out.println(" *** " + enemy + " was defeated! ***");
				System.out.println(" *** You have " + userHP + " HP left. ***");
				
				if(rand.nextInt(100) < healthPotionDropChance){
					numHPPotions++;
					System.out.println(" *** The " + enemy + " has dropped a health potion! ***");
					System.out.println(" *** You have gained 1(one) health potion!" + " You now have " + numHPPotions + " health potion(s). ***");
				}
				
				System.out.println("-----------------------------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("1) Keep going through the dungeon");
				System.out.println("2) Leave the dungeon");
				//local variable               
				
				dungeonchoice = in.nextLine();
				//make sure the choice is only 1 or 2
				while(!dungeonchoice.equals("1") && !dungeonchoice.equals("2")){
					System.out.println("\tInvalid choice!");
					dungeonchoice=in.nextLine();
				}
				//keep walking through
				if(dungeonchoice.equals("1")){
					System.out.println("You continue throughout the" /**scary yet confusing maze-like**/ + "dungeon with " + userHP + " HP!");
					//continue BATTLE;
				}
				
				//leave the dungeon choice
				else if(dungeonchoice.equals("2")){
					System.out.println("You have left the dungeon and walk back to the tree stump.");
					returnToTree();
					in.nextLine();
				}
				System.out.println("");
			}
		}
		System.out.println("GAME STILL IN BETA -- NOT COMPLETELY FINSIHED YET!!");
		System.out.println("Thanks for playing my game! Hope you had a lot of fun!");
		System.out.println("--\n"
				+ "Jon");
	}

	public static void returnToTree(){
		System.out.println("----------------------------------------------------------------");
		System.out.println("You walk back to the tree, with your choices still the same.");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Sit under the tree for a little while longer");
		System.out.println("4) Curiously walk inside the cave");
	}
	
	public static void returnToTreeAtNight(){
		System.out.println("----------------------------------------------------------------");
		System.out.println("You walk back to the tree, with your choices still the same.");
		System.out.println("");
		System.out.println("Well, what shall you do?");
		System.out.println("1) Go check out the body of water");
		System.out.println("2) Walk into the forest");
		System.out.println("3) Try and go to sleep");
		System.out.println("4) Curiously walk inside the cave");
	}
	
	public static void levelUp(){
		if(currentXP >= nextLevelUp){
			nextLevelUp += 50;
			userHP += 25;
			attackDamage += 15;
			xpMaxDrop += 10;
		}
	}
	
	public static void main(String[] args){

		System.out.println("Welcome to my game! Welcome to "
				+ "The Vault of the Ghost Guardian!\n" 
				+ "I hope you have fun playing my game I made,\n"
				+ "I worked really hard on it. Tell me if there\n"
				+ "are any bugs, and I'll try my best to fix it!\n");
				
		System.out.println("");
		
		//levelUp();
		classes();
		returnToTree();
		
		if(classChoice.equalsIgnoreCase("Ranger") || classChoice.equalsIgnoreCase("R")){
			beginHunterJourney();
		}
		
		if(classChoice.equalsIgnoreCase("Knight") || classChoice.equalsIgnoreCase("K")){
			beginKnightJourney();
		}
		if(classChoice.equalsIgnoreCase("Thief") || classChoice.equalsIgnoreCase("Theif") || classChoice.equalsIgnoreCase("T")){
			beginThiefJourney();
		}
		if(classChoice.equalsIgnoreCase("Mage") || classChoice.equalsIgnoreCase("M")){
			beginMageJourney();
		}
		if(classChoice.equalsIgnoreCase("Healer") || classChoice.equalsIgnoreCase("H")){
			beginHealerJourney();
		}	
		
		//after intial while loop
		in.close();
	}
}