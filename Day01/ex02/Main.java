public class Main {

	static void heal(Warrior w)
	{
		w.saglik = 100; 
	}
	public static void main(String[] args) {
		Warrior hero = new Warrior("Samko", 100);
		hero.hasarAl(100);
		heal(hero);
		System.out.println("Sağlık: " + hero.saglik);
	}

}

class Warrior{
	String isim;
	int saglik;

	Warrior(String isim, int saglik)
	{
		this.isim = isim;
		this.saglik = saglik;
	}

	void hasarAl(int miktar)
	{
		if (saglik <= 0)
		{
			System.err.println("Hero already dead");
			return ;
		}
		saglik -= miktar;
		System.out.println("Hero took " + miktar + " damage");
		if (saglik <= 0)
			System.out.println("Hero dead");
	}
}
