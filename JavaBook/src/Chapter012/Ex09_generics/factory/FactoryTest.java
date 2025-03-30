package Chapter012.Ex09_generics.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class FactoryTest {

	public static void main(String[] args) throws IOException {

		FactoryCar<Car> carFactory = new FactoryCar<Car>();
		// (에러) carFactory.fixCar(new Ship("배"));
		// (에러) carFactory.fixCar(new Cruze("크루즈"));
		// (에러) carFactory.fixCar(new Boat("보트"));
		carFactory.fixCar(new AutoCar("오토카"));
		carFactory.fixCar(new Taxi("택시"));

		FactoryShip<Ship> shipFactory = new FactoryShip<>();
		shipFactory.fixShip(new Cruze("크루즈"));
		shipFactory.fixShip(new Boat("보트"));

		Socket         socket = new Socket();
		BufferedReader br     = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
}
