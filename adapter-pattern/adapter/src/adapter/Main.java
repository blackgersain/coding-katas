package adapter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decision;
		MarioAdapter marioAdapter = new MarioAdapter(new Mario());
		Zergling zergling = new Zergling();
		Zealot zealot = new Zealot();
		Marine marine = new Marine();
		Target target = new Target();
		target.setHealth(3000);
		
		usage();
		System.out.println("new Target with 3000 of health, let's attack!");
		
		do {
			decision = scanner.nextInt();
			
			switch (decision) {
			case 1:
				marioAdapter.attack(target);
				System.out.println("MarioAdapter attacked");
				break;
				
			case 2:
				zergling.attack(target);
				System.out.println("Zergling attacked");
				break;
				
			case 3:
				marine.attack(target);
				System.out.println("Marine attacked");
				break;
				
			case 4:
				zealot.attack(target);
				System.out.println("Zealot attacked");
				break;
				
			case 5:
				System.out.println("Health: " + target.getHealth());
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
		strBuilder.append("1 -> MarioAdapter attack\n");
		strBuilder.append("2 -> Zergling attack\n");
		strBuilder.append("3 -> Marine attack\n");
		strBuilder.append("4 -> Zealot attack\n");
		strBuilder.append("5 -> Get target health\n");
		strBuilder.append("9 -> Usage\n");
		strBuilder.append("0 -> Exit\n");
		System.out.println(strBuilder);
	}
}

/*
using System;

public class MarioAdapter : IUnit
{
    private Mario mario;
    
    public MarioAdapter(Mario mario)
    {
        this.mario = mario;    
    }

    public void Attack(Target target)
    {
        target.Health -= mario.jumpAttack();
    }
}

public class Target
{
    public int Health { get; set; }
}
public interface IUnit
{
    void Attack(Target target);
}

public class Marine : IUnit
{
    public void Attack(Target target)
    {
        target.Health -= 6;
    }
}

public class Zealot : IUnit
{
    public void Attack(Target target)
    {
        target.Health -= 8;
    }
}

public class Zergling : IUnit
{
    public void Attack(Target target)
    {
        target.Health -= 5;
    }
}

public class Mario
{
    public int jumpAttack()
    {
        Console.WriteLine("Mamamia!");
        return 3;
    }
}
 */

/*
 using NUnit.Framework;
using System;

[TestFixture]
public class KataTestf
{
    [Test]
    public void _0_MarioAdapter_Can_Attack()
    {
        var marioAdapter = new MarioAdapter(new Mario());
        var target = new Target { Health = 33 };

        marioAdapter.Attack(target);

        Assert.AreEqual(30, target.Health);
    }
}
 * */
