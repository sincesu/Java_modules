public class Main {

	static void heal(Warrior w)
	{
		w.setSaglik(155);
	}
	public static void main(String[] args) {
		Mage hero = new Mage("Samko", 100, 0);
		Mage hero2 = new Mage("Kezgi", 100, 50);
		hero2.buyuAt(30);
		hero.hasarAl(30);
	}

}

class Mage extends Warrior{
	
	private int mana;

	Mage(String isim, int saglik, int mana)
	{
		super(isim, saglik);

		this.mana = mana;
	}

    void saldir()
    {
        System.out.println(isim + " isimli mage saldirdi.");
    }

	void buyuAt(int value)
	{
		if (mana < value)
		{
			System.out.println("Mana not enough");
			return ;
		}
		mana -= value;
		System.out.println(isim + " buyu atti");
	}

	int getMana(){
		return mana;
	}

	void setMana(int num){
		mana = num;
	}

}

abstract class Warrior{
	protected String isim;
	protected int saglik;

    abstract void saldir();

	static void selamVer(String var0) {
      System.out.println("Selam " + var0 + ", Java'ya hoş geldin!");
   }

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
				System.out.println(isim + " dead");
		else
			System.out.println(isim + " took " + miktar + " damage");
	}
}
