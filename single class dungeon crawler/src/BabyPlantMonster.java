import java.util.Random;

public class BabyPlantMonster {


	Random rand = new Random();
	
	Items items = new Items();
	Items healthPot = new Items();
	
	int health = 10;
	int attack;
	int defence;
	//boolean isAlive = true;
	
	
		
	public void drops() {
		
		//coins
		items.maxCoinDrop = 5;
		items.coinDropRate = 5;
		
		//health potions
		items.healthPotDropRate = 10;
		
	}
	
	public void death(){
		drops();
		int coinsDropped;
		//	isAlive = false;
			System.out.println("plant died");
			if(rand.nextInt(15) > items.coinDropRate) {
				coinsDropped = rand.nextInt(items.maxCoinDrop);
				System.out.println(coinsDropped + " Coins dropped");
				Items.coins += coinsDropped;
			
		}


	
		
		
		
	}
	
}
