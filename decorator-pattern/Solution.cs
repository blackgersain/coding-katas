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
