package Day0314.Ex04_상속;

public class Jiwoo {
	public static void main(String[] args) {
		Picachu picachu01 = new Picachu();
		picachu01.energy = 100;
		picachu01.type   = "전기";

		System.out.println(":::::::::: 피카츄 ::::::::::");
		System.out.println("에너지	: " + picachu01.energy);
		System.out.println("타입	: " + picachu01.type);
		System.out.println("공격A	: " + picachu01.aAttack());
		System.out.println("공격B	: " + picachu01.bAttack());
		System.out.println();

		Picachu picachu20 = new Picachu(150, "진화");
		System.out.println(":::::::::: 피카츄 (Lv.20) ::::::::::");
		System.out.println("에너지	: " + picachu20.energy);
		System.out.println("타입	: " + picachu20.type);
		System.out.println("공격A	: " + picachu20.aAttack());
		System.out.println("공격B	: " + picachu20.bAttack());
		System.out.println();

		Raichu raichu = new Raichu();
		System.out.println(":::::::::: 라이츄(Lv.20)  ::::::::::");
		System.out.println("에너지	: " + raichu.energy);
		System.out.println("타입	: " + raichu.type);
		System.out.println("공격A	: " + raichu.aAttack());
		System.out.println("공격B	: " + raichu.bAttack());
		System.out.println("공격C	: " + raichu.cAttack());
		System.out.println();

	}
}
