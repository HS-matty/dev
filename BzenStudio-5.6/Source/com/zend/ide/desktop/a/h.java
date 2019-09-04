package com.zend.ide.desktop.a;

import com.zend.ide.bd.c;
import com.zend.ide.l.k;
import com.zend.ide.n.bw;
import com.zend.ide.v.bc;
import com.zend.ide.v.o;
import com.zend.ide.v.p;
import java.util.Arrays;

public class h
  implements k
{
  private bw a;
  private bc b;

  public h(bw parambw)
  {
    this.a = parambw;
  }

  public Object m()
  {
    return this.a.s();
  }

  public void a(Object paramObject)
  {
    this.a.c(paramObject);
  }

  public boolean b(Object paramObject)
  {
    o localo1 = (o)paramObject;
    o localo2 = (o)m();
    p[] arrayOfp1 = localo1.c();
    p[] arrayOfp2 = localo2.c();
    if (arrayOfp1.length != arrayOfp2.length)
      return true;
    i locali = new i(null);
    Arrays.sort(arrayOfp1, locali);
    Arrays.sort(arrayOfp2, locali);
    for (int i = 0; i < arrayOfp2.length; i++)
      if (!arrayOfp2[i].equals(arrayOfp1[i]))
        return true;
    return false;
  }

  public Object b()
  {
    return "editor_component";
  }

  public boolean a(boolean paramBoolean)
  {
    if (this.b == null)
      this.b = new bc(c.b().h());
    return this.b.b(this.a.i());
  }

  public Object d()
  {
    return new o();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.h
 * JD-Core Version:    0.6.0
 */