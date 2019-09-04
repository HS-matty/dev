package com.zend.ide.be;

import java.awt.Rectangle;
import java.io.Serializable;

public class i
  implements Cloneable, Serializable
{
  public boolean a;
  public boolean b;
  public int c;
  public double d;
  public int e;
  public Rectangle f;

  public i()
  {
    this.a = false;
    this.b = false;
    this.c = 0;
    this.d = 1.0D;
    this.e = 0;
    this.f = new Rectangle();
  }

  public i(int paramInt)
  {
    this.a = false;
    this.b = false;
    this.c = paramInt;
    this.d = 1.0D;
    this.e = 0;
    this.f = new Rectangle();
  }

  public i(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, double paramDouble, int paramInt2, Rectangle paramRectangle)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramInt1;
    this.d = paramDouble;
    this.e = paramInt2;
    this.f = paramRectangle;
  }

  public Object clone()
  {
    try
    {
      i locali = (i)super.clone();
      locali.f = ((Rectangle)this.f.clone());
      return locali;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new InternalError();
  }

  public String toString()
  {
    String str = "";
    str = str + "visiable: " + this.a + "\n";
    str = str + "floating: " + this.b + "\n";
    str = str + "layoutLocation: " + this.c + "\n";
    str = str + "weight: " + this.d + "\n";
    str = str + "location: " + this.e + "\n";
    str = str + "floatingFrameBounds: " + this.f + "\n";
    return str;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof i))
      return false;
    i locali = (i)paramObject;
    if ((this.a == locali.a) && (this.b == locali.b) && (this.c == locali.c) && (this.d == locali.d) && (this.e == locali.e))
    {
      if (this.f == locali.f)
        return true;
      if ((this.f != null) && (this.f.equals(locali.f)))
        return true;
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.i
 * JD-Core Version:    0.6.0
 */