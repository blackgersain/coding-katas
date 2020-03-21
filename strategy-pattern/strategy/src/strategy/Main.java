package strategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decision;
		Viking viking = new Viking();
		usage();
		
		do {
			decision = scanner.nextInt();
			
			switch (decision) {
			case 1:
				viking.setMoveBehavior(new Walk());
				System.out.println("In Walk mode");
				break;
				
			case 2:
				viking.setMoveBehavior(new Fly());
				System.out.println("In Fly mode");
				break;
				
			case 3:
				viking.move();
				System.out.println("Viking moved " + viking.getPosition());
				break;
				
			case 4:
				System.out.println("Position: " + viking.getPosition());
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
		strBuilder.append("1 -> To Walk mode\n");
		strBuilder.append("2 -> To Fly mode\n");
		strBuilder.append("3 -> Move\n");
		strBuilder.append("4 -> Get position\n");
		strBuilder.append("9 -> Usage\n");
		strBuilder.append("0 -> Exit\n");
		System.out.println(strBuilder);
	}
}

//Code written for the kata in C#
/*
using System;

public interface IUnit
{
    int Position { get; set; }
    void Move();
    IMoveBehavior MoveBehavior { get; set; }
}

public interface IMoveBehavior
{
    void Move(IUnit unit);
}

public class Fly : IMoveBehavior
{
    public void Move(IUnit unit)
    {
        unit.Position += 10;
    }
}

public class Walk : IMoveBehavior
{
    public void Move(IUnit unit)
    {
        unit.Position += 1;
    }
}

public class Viking : IUnit
{
    private IMoveBehavior moveBehavior;
    
    public Viking()
    {
        moveBehavior = new Walk();
    }

    public IMoveBehavior MoveBehavior { 
      get { return moveBehavior; }
      set { moveBehavior = value; }
    }

    public int Position { get; set; }

    public void Move()
    {
        moveBehavior.Move(this);
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
    public void _0_WalkMove()
    {
        IUnit viking = new Viking();

        viking.Move();
        Assert.AreEqual(1, viking.Position);
        viking.Move();
        Assert.AreEqual(2, viking.Position);
    }

    [Test]
    public void _1_FlyMove()
    {
        IUnit viking = new Viking();
        viking.MoveBehavior = new Fly();

        viking.Move();
        Assert.AreEqual(10, viking.Position);
        viking.Move();
        Assert.AreEqual(20, viking.Position);
    }

    [Test]
    public void _2_MixMove()
    {
        IUnit viking = new Viking();

        viking.Move();
        Assert.AreEqual(1, viking.Position);

        viking.MoveBehavior = new Fly();
        viking.Move();
        Assert.AreEqual(11, viking.Position);
    }
} 
 */
