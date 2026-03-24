public class Main {

	static void heal(Warrior w)
	{
		w.setSaglik(155);
	}
	public static void main(String[] args) {
		Warrior listWarrior[] = new Warrior[2];
		listWarrior[0] = new Mage("Samko", 100, "Mage",50);
		listWarrior[1] = new Archer("Kezgi", 100, "Archer",50);
		for (int i = 0; i < 2; i++)
		{
			if (listWarrior[i] instanceof Mage m)
			{
				((Mage)listWarrior[i]).buyuAt(20);
				//m.buyuAt(20); pattern matching
			}
			else if (listWarrior[i] instanceof Archer)
			{
				((Archer)listWarrior[i]).okAt(20);
			}
			listWarrior[i].saldir();
			listWarrior[i].showInfo();
		}
	}
}

interface IShowInfo{
    void showInfo();
}

class Archer extends Warrior{
	private int mana;

	Archer(String isim, int saglik, String tur, int mana)
	{
		super(isim, saglik, tur);

		this.mana = mana;
	}

	void saldir()
	{
        System.out.println(isim + " isimli archer saldirdi.");
	}

	void okAt(int value)
	{
		if (mana < value)
		{
			System.out.println("Mana not enough");
			return ;
		}
		mana -= value;
		System.out.println(isim + " ok atti");
	}

	int getMana(){
		return mana;
	}

	void setMana(int num){
		mana = num;
	}
}

class Mage extends Warrior{
	
	private int mana;

	Mage(String isim, int saglik, String tur, int mana)
	{
		super(isim, saglik, tur);

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

abstract class Warrior implements IShowInfo{
	protected String isim;
	protected int saglik;
	protected String tur;

    abstract void saldir();

    @Override
    public void showInfo()
    {
        System.out.println("İsim: " + getIsım() + "\nTur: " + getTur() +"\nSaglik: " + getSaglik());
    }

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

	void setTur(String name){
		tur = name;
	}

	String getTur(){
		return tur;
	}

	Warrior(String isim, int saglik, String tur)
	{
		this.isim = isim;
		this.saglik = saglik;
		this.tur = tur;
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
