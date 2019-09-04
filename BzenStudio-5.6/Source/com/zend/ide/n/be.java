package com.zend.ide.n;

import com.zend.ide.s.bb;
import com.zend.ide.s.nb;
import com.zend.ide.s.sb;
import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;
import com.zend.ide.util.d.i;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class be
  implements hl
{
  private List a = new ArrayList();
  private a b = new a();
  private Color c = Color.black;
  private bd d = new bd();

  public be()
  {
    this.d.a(this.c);
  }

  public bd a(int paramInt)
  {
    bd localbd = (bd)this.b.b(paramInt);
    if (localbd != null)
      return localbd;
    return this.d;
  }

  public void a(int paramInt, bd parambd)
  {
    parambd.b(paramInt);
    this.b.a(paramInt, parambd);
    c();
  }

  public void a(hn paramhn)
  {
    this.a.add(paramhn);
  }

  public void b(hn paramhn)
  {
    this.a.remove(paramhn);
  }

  public boolean b(int paramInt)
  {
    return this.b.a(paramInt);
  }

  private void c()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((hn)localIterator.next()).o();
  }

  public Object clone()
  {
    be localbe = new be();
    Enumeration localEnumeration = this.b.g();
    while (localEnumeration.hasMoreElements())
    {
      bd localbd = (bd)((bd)localEnumeration.nextElement()).clone();
      localbe.a(localbd.g(), localbd);
    }
    return localbe;
  }

  public dq[] d()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Set localSet = this.b.d();
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      localObject = (i)localIterator.next();
      int i = ((i)localObject).c();
      hk localhk = (hk)this.b.b(i);
      String str = bb.a(i);
      if (str == null)
        str = nb.a(i);
      if (str == null)
        str = sb.a(i);
      if (!localArrayList1.contains(str))
      {
        localArrayList2.add(new dq(str, localhk));
        localArrayList1.add(str);
      }
    }
    Object localObject = new dq[localArrayList2.size()];
    localArrayList2.toArray(localObject);
    return (dq)localObject;
  }

  public void a(dq paramdq)
  {
    bd localbd = (bd)paramdq.b();
    int[] arrayOfInt1;
    Object localObject;
    if (paramdq.b() != null)
    {
      arrayOfInt1 = bb.a(paramdq.b());
      for (int i = 0; (arrayOfInt1 != null) && (i < arrayOfInt1.length); i++)
        a(arrayOfInt1[i], (bd)localbd.clone());
      localObject = nb.a(paramdq.b());
      for (int j = 0; (localObject != null) && (j < localObject.length); j++)
        a(localObject[j], (bd)localbd.clone());
      int[] arrayOfInt2 = sb.a(paramdq.b());
      for (int m = 0; (arrayOfInt2 != null) && (m < arrayOfInt2.length); m++)
        a(arrayOfInt2[m], (bd)localbd.clone());
    }
    else
    {
      arrayOfInt1 = paramdq.a();
      localObject = new ArrayList();
      for (int k = 0; k < arrayOfInt1.length; k++)
      {
        String str = bb.b(arrayOfInt1[k]);
        if (str == null)
          cl.a("null groupName, token=" + arrayOfInt1[k]);
        if ((((ArrayList)localObject).contains(str)) || (str == null))
          continue;
        ((ArrayList)localObject).add(str);
        int[] arrayOfInt3 = bb.a(str);
        for (int n = 0; n < arrayOfInt3.length; n++)
          a(arrayOfInt3[n], (bd)localbd.clone());
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.be
 * JD-Core Version:    0.6.0
 */