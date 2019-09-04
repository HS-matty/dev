package com.zend.ide.util;

import java.util.ArrayList;

public class bz
  implements bj
{
  private boolean a = false;
  private ArrayList b;

  public void B()
  {
    this.a = true;
    a(this.b);
  }

  public void D()
  {
    this.a = false;
    b(this.b);
  }

  public boolean b()
  {
    return this.a;
  }

  public void a(ca paramca)
  {
    if (this.b == null)
      this.b = new ArrayList(4);
    synchronized (this.b)
    {
      this.b.remove(paramca);
      this.b.add(paramca);
    }
  }

  public void b(ca paramca)
  {
    if (this.b != null)
      synchronized (this.b)
      {
        this.b.remove(paramca);
      }
  }

  private static final void a(ArrayList paramArrayList)
  {
    if (paramArrayList != null)
      synchronized (paramArrayList)
      {
        for (int i = 0; i < paramArrayList.size(); i++)
          ((ca)paramArrayList.get(i)).e();
      }
  }

  private static final void b(ArrayList paramArrayList)
  {
    if (paramArrayList != null)
      synchronized (paramArrayList)
      {
        for (int i = 0; i < paramArrayList.size(); i++)
          ((ca)paramArrayList.get(i)).f();
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bz
 * JD-Core Version:    0.6.0
 */