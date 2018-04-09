import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		main main = new main();

	}


	public main() {
		int att = 100;
		BabyPlantMonster plant = new BabyPlantMonster();
		System.out.println("A plant appears it has " + plant.health + " health");
		System.out.println("Attack?");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch(choice) {
		case 1: plant.health -= att;
		if(plant.health <= 0) {
			plant.death();
		}
		}
	}
}
