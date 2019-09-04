package com.zend.ide.p.fb;

import java.awt.Rectangle;
import java.util.LinkedList;

public class b
{
  private LinkedList a;
  private Rectangle b;

  public b(LinkedList paramLinkedList, Rectangle paramRectangle)
  {
    this.a = paramLinkedList;
    this.b = paramRectangle;
  }

  public LinkedList a()
  {
    return this.a;
  }

  public Rectangle b()
  {
    return this.b;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b))
      return false;
    b localb = (b)paramObject;
    return (this.a.equals(localb.a)) && (this.b.equals(localb.b));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.fb.b
 * JD-Core Version:    0.6.0
 */