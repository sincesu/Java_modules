public class Main {

	static void heal(Warrior w)
	{
		w.setSaglik(155);
	}
	public static void main(String[] args) {
		Warrior hero = new Warrior("Samko", 100);
		hero.hasarAl(100);
		heal(hero);
		System.out.println("Sağlık: " + hero.getSaglik());
	}

}

class Warrior{
	private String isim;
	private int saglik;

	int getSaglik(){
		return saglik;
	}

	void setSaglik(int num)
	{
		if (num > 100)
			saglik = 100;
		else if (num < 0)
			saglik = 0;
		else
			saglik = num;
	}

	String getIsım(){
		return isim;
	}

	void setIsım(String name){
		isim = name;
	}

	Warrior(String isim, int saglik)
	{
		this.isim = isim;
		this.saglik = saglik;
	}

	void hasarAl(int miktar)
	{
		setSaglik(getSaglik() - miktar);
		if (getSaglik() <= 0)
				System.out.println("Hero dead");
		else
			System.out.println("Hero took " + miktar + " damage");
	}
}
