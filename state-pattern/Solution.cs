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
