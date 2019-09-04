package com.b.a;

import java.util.Stack;

public class d
{
  protected Stack a;
  protected int b;
  protected Stack c;

  public d(Stack paramStack)
    throws Exception
  {
    if (paramStack == null)
      throw new Exception("Internal parser error: attempt to create null virtual stack");
    this.a = paramStack;
    this.c = new Stack();
    this.b = 0;
    d();
  }

  protected void d()
  {
    if (this.b >= this.a.size())
      return;
    c localc = (c)this.a.elementAt(this.a.size() - 1 - this.b);
    this.b += 1;
    this.c.push(new Integer(localc.b));
  }

  public int b()
    throws Exception
  {
    if (this.c.empty())
      throw new Exception("Internal parser error: top() called on empty virtual stack");
    return ((Integer)this.c.peek()).intValue();
  }

  public void c()
    throws Exception
  {
    if (this.c.empty())
      throw new Exception("Internal parser error: pop from empty virtual stack");
    this.c.pop();
    if (this.c.empty())
      d();
  }

  public void a(int paramInt)
  {
    this.c.push(new Integer(paramInt));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.b.a.d
 * JD-Core Version:    0.6.0
 */