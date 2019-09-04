package com.zend.ide.n.td;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class qb
{
  private ArrayList a = new ArrayList();
  private boolean b;

  public void a(List paramList)
  {
    synchronized (this.a)
    {
      this.a.addAll(paramList);
      this.b = false;
    }
  }

  public int a()
  {
    return this.a.size();
  }

  public List b()
  {
    synchronized (this.a)
    {
      if (!this.b)
      {
        Collections.sort(this.a);
        this.b = true;
      }
    }
    return this.a;
  }

  public void c()
  {
    synchronized (this.a)
    {
      this.a.clear();
    }
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer("Folds Cache {\n");
    for (int i = 0; i < this.a.size(); i++)
    {
      localStringBuffer.append(this.a.get(i));
      localStringBuffer.append('\n');
    }
    localStringBuffer.append('}');
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.qb
 * JD-Core Version:    0.6.0
 */