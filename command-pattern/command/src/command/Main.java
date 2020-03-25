package command;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decision;
		
		IUnit unit = new Probe();
		
		usage();
		System.out.println("You are a Probe. Let's execute some commands.");
		
		do {
			decision = scanner.nextInt();
			
			switch (decision) {
			case 1:
				MoveCommand moveCommand = new MoveCommand(
						  unit
						, unit.getPosition().getX() + 1
						, unit.getPosition().getY() + 1);
				moveCommand.execute();
				System.out.println("MoveCommand executed");
				break;
				
			case 2:
				GatherCommand gatherCommand = new GatherCommand(unit);
				gatherCommand.execute();
				System.out.println("GatherCommand executed");
				break;
				
			case 3:
				System.out.println("Probe's position: (" + unit.getPosition().getX() + ", " + unit.getPosition().getY() + ")");
				break;
				
			case 4:
				System.out.println("Probe's minerals: " + unit.getMinerals());
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
		strBuilder.append("1 -> Execute MoveCommand\n");
		strBuilder.append("2 -> Execute GatherCommand\n");
		strBuilder.append("3 -> Get Probe's position\n");
		strBuilder.append("4 -> Get Probe's minerals\n");
		strBuilder.append("9 -> Usage\n");
		strBuilder.append("0 -> Exit\n");
		System.out.println(strBuilder);
	}
}
/*
using System;
using System.Collections.Generic;

public class Probe : IUnit
{
    public Probe() 
    {
        Minerals = 0;
        Position = new Point();
        Commands = new Queue<ICommand>();
    }
    
    public Queue<ICommand> Commands { get; set; }

    public int Minerals { get; set; }

    public Point Position { get; set; }

    public void Move(int x, int y)
    {
        Commands.Enqueue(new MoveCommand(this, x, y));
    }

    public void Gather()
    {
        Commands.Enqueue(new GatherCommand(this));
    }
}

public class MoveCommand : ICommand
{
    private IUnit unit;
    private int x;
    private int y;

    public MoveCommand(IUnit unit, int x, int y)
    {
        this.unit = unit;
        this.x = x;
        this.y = y;
    }

    public bool CanExecute() 
    { 
        return true;
    }

    public void Execute() 
    { 
        unit.Position.X = x;
        unit.Position.Y = y;
    }
}

public class GatherCommand : ICommand
{
    private IUnit unit;

    public GatherCommand(IUnit unit)
    {
        this.unit = unit;
    }

    public bool CanExecute() 
    { 
        return unit.Minerals == 0;
    }

    public void Execute() 
    { 
        if (CanExecute()) unit.Minerals += 5;
    }
}
*/
/*
using NUnit.Framework;
using System;
using System.Collections.Generic;

[TestFixture]
public class KataTestf
{
    [Test]
    public void _0_MoveCommand_Should_Move_Unit()
    {
        var unit = new Probe();
        var moveCommand = new MoveCommand(unit, 7, 9);

        moveCommand.Execute();

        var expected = new Point { X = 7, Y = 9 };

        Assert.AreEqual(expected.X, unit.Position.X);
        Assert.AreEqual(expected.Y, unit.Position.Y);
    }

    [Test]
    public void _1_GatherCommand_Should_Gather_Resources()
    {
        var unit = new Probe();
        var gatherCommand = new GatherCommand(unit);

        gatherCommand.Execute();

        Assert.AreEqual(5, unit.Minerals);
    }

    [Test]
    public void _2_GatherCommand_Should_Only_Gather_Resources_If_Minerals_Equal_0()
    {
        var unit = new Probe();
        var gatherCommand = new GatherCommand(unit);

        Assert.AreEqual(0, unit.Minerals);

        gatherCommand.Execute();

        Assert.AreEqual(5, unit.Minerals);

        unit.Minerals = 6;

        gatherCommand.Execute();

        Assert.IsTrue(unit.Minerals == 6, "you should increment only when it can execute");
    }
}
*/