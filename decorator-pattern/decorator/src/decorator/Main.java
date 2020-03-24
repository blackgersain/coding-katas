package decorator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decision;
		
		IMarine marine = new Marine(10, 1);
		
		usage();
		System.out.println("You are a Marine. Let's upgrade our Damage and Armor.");
		
		do {
			decision = scanner.nextInt();
			
			switch (decision) {
			case 1:
				marine = new MarineWeaponUpgrade(marine);
				System.out.println("Marine's damage upgraded");
				break;
				
			case 2:
				marine = new MarineArmorUpgrade(marine);
				System.out.println("Marine's armor upgraded");
				break;
				
			case 3:
				System.out.println("Marine's damage: " + marine.getDamage());
				break;
				
			case 4:
				System.out.println("Marine's armor: " + marine.getArmor());
				break;
				
			case 0:
				scanner.close();
				break;
				
			default:
				usage();
			}	
		}
		while (decision != 0);
	}
	
	public static void usage() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Usage:\n");
		strBuilder.append("1 -> Upgrade Damage\n");
		strBuilder.append("2 -> Upgrade Armor\n");
		strBuilder.append("3 -> Get Marine's Damage\n");
		strBuilder.append("4 -> Get Marine's Armor\n");
		strBuilder.append("9 -> Usage\n");
		strBuilder.append("0 -> Exit\n");
		System.out.println(strBuilder);
	}

}
/*
using System;

public interface IMarine
{
    int Damage { get; set; }
    int Armor { get; set; }
}

public class Marine : IMarine
{
    public Marine(int damage, int armor)
    {
        Damage = damage;
        Armor = armor;
    }

    public int Damage { get; set; }
    public int Armor { get; set; }
}

public class MarineWeaponUpgrade : IMarine
{
    private IMarine marine;

    public MarineWeaponUpgrade(IMarine marine)
    {
        this.marine = marine;
    }

    public int Damage 
    { 
        get { return marine.Damage + 1; }
        set { marine.Damage = value; }
    }

    public int Armor 
    { 
        get { return marine.Armor; }
        set { marine.Armor = value; }
    }
}

public class MarineArmorUpgrade : IMarine
{
    private IMarine marine;

    public MarineArmorUpgrade(IMarine marine)
    {
        this.marine = marine;
    }

    public int Damage 
    { 
        get { return marine.Damage; }
        set { marine.Damage = value; }
    }

    public int Armor 
    { 
        get { return marine.Armor + 1; }
        set { marine.Armor = value; }
    }
}
*/
/*
using System;
using NUnit.Framework;

[TestFixture]
public class KataTest
{
    [Test]
    public void _0_SingleUpgrade()
    {
        IMarine marine = new Marine(10, 1);

        Assert.AreEqual(11, new MarineWeaponUpgrade(marine).Damage);
        Assert.AreEqual(11, new MarineWeaponUpgrade(marine).Damage);
    }

    [Test]
    public void _1_DoubleUpgrade()
    {
        IMarine marine = new Marine(15, 1);
        marine = new MarineWeaponUpgrade(marine);
        marine = new MarineWeaponUpgrade(marine);

        Assert.AreEqual(17, marine.Damage);
    }

    [Test]
    public void _2_TripleUpgrade()
    {
        IMarine marine = new Marine(20, 1);
        marine = new MarineWeaponUpgrade(marine);
        marine = new MarineWeaponUpgrade(marine);
        marine = new MarineWeaponUpgrade(marine);

        Assert.AreEqual(23, marine.Damage);
    }
}
*/