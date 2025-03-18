package Day0318.Ex02_Builder;

public class Builder {
	public static void main(String[] args) {
		Picachu picachu = new Picachu.Builder()
									 .energy(100)
									 .type("전기")
									 .level(10)
									 .build();
		System.out.println(picachu);

		Picachu pikachu2 = new Picachu.Builder()
									  .energy(200)
									  .build();
		System.out.println(pikachu2);
	}
}
