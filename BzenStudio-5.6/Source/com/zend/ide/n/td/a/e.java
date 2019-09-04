package com.zend.ide.n.td.a;

import javax.swing.text.Position;

class e
{
  private Position a;
  private Position b;
  private int c;

  public e()
  {
    this(null, null, -1);
  }

  public e(Position paramPosition1, Position paramPosition2, int paramInt)
  {
    this.a = paramPosition1;
    this.b = paramPosition2;
    this.c = paramInt;
  }

  public int a()
  {
    return this.a != null ? this.a.getOffset() : -1;
  }

  public void a(Position paramPosition)
  {
    this.a = paramPosition;
  }

  public int b()
  {
    return this.b != null ? this.b.getOffset() : -1;
  }

  public void b(Position paramPosition)
  {
    this.b = paramPosition;
  }

  public int c()
  {
    return this.c;
  }

  public void a(int paramInt)
  {
    this.c = paramInt;
  }

  public int d()
  {
    if ((this.a == null) || (this.b == null))
      return -1;
    return this.b.getOffset() - this.a.getOffset();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject instanceof e))
    {
      e locale = (e)paramObject;
      return (a() == locale.a()) && (b() == locale.b());
    }
    return false;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("ElementPointer [lineIndex = ");
    localStringBuffer.append(this.c);
    localStringBuffer.append(", start = ");
    localStringBuffer.append(a());
    localStringBuffer.append(", end = ");
    localStringBuffer.append(b());
    localStringBuffer.append(", length = ");
    localStringBuffer.append(d());
    localStringBuffer.append(']');
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.e
 * JD-Core Version:    0.6.0
 */