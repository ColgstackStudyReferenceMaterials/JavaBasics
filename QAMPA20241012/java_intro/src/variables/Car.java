package variables;

public class Car {

	int noOfWheels = 4;

	enum model {
		A, B, C, D
	};

	enum gender {
		M, F, T
	};

	char series = 'A';
	boolean isMarketReady = true;
	float costPrice = 10.23f;
	String carDescription = "Automatic with Petrol";
	int minRegistrationAge = 20;

	public void carStart() {
		System.out.println("Car Started");
	}

	public void checkRegistrtionAllowed(int age) {
		if (age >= minRegistrationAge) {
			System.out.println("Eligible for Registartion");
		} else {
			System.out.println("Not of eligible age");
		}
	}

	public void carModelSale(model m) {
		switch (m) {
		case A: {

			System.out.println("You have slected model A");
			break;
		}
		case B: {

			System.out.println("You have slected model B");
			break;
		}
		case C: {

			System.out.println("You have slected model C");
			break;
		}
		case D: {

			System.out.println("You have slected model D");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + m);
		}
	}

	public static void main(String[] args) {
		Car bmw = new Car();
		System.out.println(bmw.costPrice);
		bmw.carStart();
		bmw.checkRegistrtionAllowed(30);
		bmw.checkRegistrtionAllowed(15);
		bmw.checkRegistrtionAllowed(20);
		model ma = model.A;
		bmw.carModelSale(ma);
		bmw.carModelSale(model.C);
		bmw.carModelSale(model.D);
		CarModels cm = CarModels.A_2;
		System.out.println(cm + " & "+CarModels.CED );
		System.out.println(cm);
	}

}
