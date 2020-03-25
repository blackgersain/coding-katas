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
