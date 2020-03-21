package state;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decision;
		Tank tank = new Tank();
		usage();
		System.out.println("In TankState");
		
		do {
			decision = scanner.nextInt();
			
			switch (decision) {
			case 1:
				tank.setState(new TankState());
				System.out.println("In TankState");
				break;
				
			case 2:
				tank.setState(new SiegeState());
				System.out.println("In SiegeState");
				break;
				
			case 3:
				System.out.println("Can move? " + tank.canMove());
				break;
				
			case 4:
				System.out.println("Damage: " + tank.damage());
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
		strBuilder.append("1 -> To TankState\n");
		strBuilder.append("2 -> To SiegeState\n");
		strBuilder.append("3 -> Can move?\n");
		strBuilder.append("4 -> Damage\n");
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
    IUnitState State { get; set; }
    bool CanMove { get; }
    int Damage { get; }
}

public interface IUnitState
{
    bool CanMove { get; }
    int Damage { get; }
}

public class SiegeState : IUnitState
{
    public SiegeState()
    {}

    public bool CanMove { 
      get { return false; } 
    }
    
    public int Damage { 
      get { return 20; }
    }
}

public class TankState : IUnitState
{
    public TankState()
    {}

    public bool CanMove { 
      get { return true; }
    }
    
    public int Damage { 
      get { return 5; }
    }
}

public class Tank : IUnit
{
    private IUnitState state;
    
    public Tank()
    {
        state = new TankState();
    }

    public IUnitState State { 
      get { return this.state; } 
      
      set {
        this.state = value;
      } 
    }

    public bool CanMove { 
      get { return state.CanMove; } 
    }
    
    public int Damage { 
      get { return state.Damage; }
    }
}
*/

