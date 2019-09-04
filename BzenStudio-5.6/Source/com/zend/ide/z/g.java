package com.zend.ide.z;

import com.zend.ide.o.bt;
import com.zend.ide.util.d.a;
import java.util.ArrayList;
import java.util.Hashtable;

public class g
  implements l
{
  private a a = new a();
  private Hashtable b = new Hashtable();
  private k c;

  public g(bt parambt)
  {
    this.c = parambt.k();
    e();
    f();
  }

  private void e()
  {
    this.b.clear();
    n[] arrayOfn = g().c();
    for (int i = 0; i < arrayOfn.length; i++)
    {
      n localn = arrayOfn[i];
      this.b.put(localn.e(), localn);
    }
  }

  private void f()
  {
    this.a.c();
    n[] arrayOfn = g().c();
    if (arrayOfn != null)
      for (int i = 0; i < arrayOfn.length; i++)
      {
        n localn = arrayOfn[i];
        r[] arrayOfr = localn.c();
        if (arrayOfr == null)
          continue;
        for (int j = 0; j < arrayOfr.length; j++)
          this.a.a(arrayOfr[j].d(), arrayOfr[j]);
      }
  }

  public r a(int paramInt)
  {
    return (r)this.a.b(paramInt);
  }

  public n a(String paramString)
  {
    if (this.b.get(paramString) != null)
      return (n)this.b.get(paramString);
    return null;
  }

  public n[] c()
  {
    return this.c.c();
  }

  public ArrayList a()
  {
    return this.c.a();
  }

  public i b()
  {
    return g().d();
  }

  public u d()
  {
    return g().b();
  }

  private k g()
  {
    if (this.c == null)
      this.c = new k();
    return this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.g
 * JD-Core Version:    0.6.0
 */