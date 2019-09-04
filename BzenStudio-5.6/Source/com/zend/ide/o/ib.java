package com.zend.ide.o;

import java.util.Enumeration;
import java.util.Vector;

public class ib
{
  private Vector a = new Vector();

  public void a(jb paramjb)
  {
    this.a.add(paramjb);
  }

  public jb a(int paramInt)
  {
    return (jb)this.a.remove(paramInt);
  }

  public int a()
  {
    return this.a.size();
  }

  public jb b(int paramInt)
  {
    return (jb)this.a.get(paramInt);
  }

  public jb[] b()
  {
    jb[] arrayOfjb = new jb[this.a.size()];
    this.a.toArray(arrayOfjb);
    return arrayOfjb;
  }

  public String toString()
  {
    String str = "***\n";
    Enumeration localEnumeration = this.a.elements();
    while (localEnumeration.hasMoreElements())
      str = str + localEnumeration.nextElement().toString() + "\n" + "***\n";
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.ib
 * JD-Core Version:    0.6.0
 */