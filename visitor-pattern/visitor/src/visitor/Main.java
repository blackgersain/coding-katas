package visitor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decision;
		
		ILightUnit lightUnit = new Marine();
		IArmoredUnit armoredUnit = new Marauder();
		IVisitor tankBulletVisitor = new TankBullet();
		
		usage();
		System.out.println("You are the Tank. There is a Marine and a Marauder unit. Let's attack them.");
		
		do {
			decision = scanner.nextInt();
			
			switch (decision) {
			case 1:
				lightUnit.accept(tankBulletVisitor);
				System.out.println("Marine attacked");
				break;
				
			case 2:
				armoredUnit.accept(tankBulletVisitor);
				System.out.println("Marauder attacked");
				break;
				
			case 3:
				System.out.println("Marine's health: " + lightUnit.getHealth());
				break;
				
			case 4:
				System.out.println("Marauder's health: " + armoredUnit.getHealth());
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
		strBuilder.append("1 -> Attack Marine\n");
		strBuilder.append("2 -> Attack Marauder\n");
		strBuilder.append("3 -> Get Marine health\n");
		strBuilder.append("4 -> Get Marauder health\n");
		strBuilder.append("9 -> Usage\n");
		strBuilder.append("0 -> Exit\n");
		System.out.println(strBuilder);
	}

}

/*
using System;

public interface IVisitor
{
    void VisitLight(ILightUnit unit);
    void VisitArmored(IArmoredUnit unit);
}

public interface ILightUnit
{
    int Health { get; set; }

    void Accept(IVisitor visitor);
}

public interface IArmoredUnit
{
    int Health { get; set; }

    void Accept(IVisitor visitor);
}

public class Marine : ILightUnit
{
    private int _health;
    
    public Marine() 
    {
      _health = 100;  
    }
    public int Health 
    { 
      get { return _health; }
      set { _health = value; } 
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitLight(this);
    }
}

public class Marauder : IArmoredUnit
{
    private int _health;
    
    public Marauder() 
    {
        _health = 125;
    }
    
    public int Health 
    { 
        get { return _health; }
        set { _health = value; } 
    }

    public void Accept(IVisitor visitor)
    {
        visitor.VisitArmored(this);
    }
}

public class TankBullet : IVisitor
{
    public void VisitLight(ILightUnit unit)
    {
        unit.Health -= 21;
    }

    public void VisitArmored(IArmoredUnit unit)
    {
        unit.Health -= 32;
    }
}
*/
/*
using System;
using NUnit.Framework;

[TestFixture]
public class KataTestf
{
    [Test]
    public void _0_VisitLight()
    {
        IVisitor bullet = new TankBullet();
        ILightUnit light = new Marine();

        light.Accept(bullet);

        Assert.AreEqual(100 - 21, light.Health);
    }

    [Test]
    public void _1_VisitArmored()
    {
        IVisitor bullet = new TankBullet();
        IArmoredUnit armored = new Marauder();

        armored.Accept(bullet);

        Assert.AreEqual(125 - 32, armored.Health);
    }
}
*/