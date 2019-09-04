package com.zend.ide.n.a;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class b
  implements g
{
  private bw a;
  private String b;
  private ArrayList c;
  private i d;
  private j e;
  private d f;

  public b(String paramString, bw parambw)
  {
    this.b = paramString;
    this.a = parambw;
    this.c = new ArrayList();
    this.f = e();
    parambw.addDocumentListener(this.f);
    this.e = f();
    parambw.a(this.e);
  }

  public String c()
  {
    return this.b;
  }

  protected bw d()
  {
    return this.a;
  }

  protected d e()
  {
    return new d(this);
  }

  protected j f()
  {
    return new j(this);
  }

  public int g()
  {
    int i = 0;
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
      i += ((ArrayList)localIterator.next()).size();
    return i;
  }

  public List m()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = this.c.iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((ArrayList)localIterator1.next()).iterator();
      while (localIterator2.hasNext())
        localArrayList.add(localIterator2.next());
    }
    return localArrayList;
  }

  public List b(String paramString)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      k localk = (k)localIterator.next();
      if (localk.b().equals(paramString))
        return localk;
    }
    return new k(paramString);
  }

  public String a(String paramString)
  {
    int i = this.c.size();
    if (i == 0)
      return null;
    for (int j = 0; j < i; j++)
    {
      if (!((k)this.c.get(j)).b().equals(paramString))
        continue;
      int k = j == this.c.size() - 1 ? 0 : j + 1;
      return ((k)this.c.get(k)).b();
    }
    return ((k)this.c.get(0)).b();
  }

  public e a(String paramString, int paramInt)
  {
    Object localObject = null;
    List localList = b(paramString);
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.b() == paramInt)
        return locale;
      if (locale.b() > paramInt)
        break;
    }
    return localObject;
  }

  public void a(String paramString)
  {
    List localList = b(paramString);
    for (int i = 0; i < localList.size(); i++)
      b((e)localList.get(i));
  }

  public void b()
  {
    if (this.c.isEmpty())
      return;
    List localList = m();
    b((e)localList.get(localList.size() - 1));
    b();
  }

  public void a(e parame)
  {
    if ((parame.j() == null) || (parame.j().length() == 0))
      return;
    k localk = (k)b(parame.j());
    if (localk.isEmpty())
    {
      this.c.add(localk);
      Collections.sort(this.c);
    }
    localk.add(parame);
    Collections.sort(localk);
    i().a(parame);
    a(parame, true);
    i().c(parame);
  }

  public void b(e parame)
  {
    k localk = (k)b(parame.j());
    if (localk == null)
      return;
    localk.remove(parame);
    if (localk.isEmpty())
      this.c.remove(localk);
    d(parame);
    i().b(parame);
    i().d(parame);
  }

  protected i h()
  {
    return new i();
  }

  protected i i()
  {
    if (this.d == null)
      this.d = h();
    return this.d;
  }

  public void a(h paramh)
  {
    i().a(paramh);
  }

  public void b(h paramh)
  {
    i().b(paramh);
  }

  protected void a(e parame, boolean paramBoolean)
  {
    if (!paramBoolean)
      return;
    dz localdz = d().a(parame.j());
    if (localdz != null)
      localdz.a(parame.b(), c(), parame);
  }

  protected void d(e parame)
  {
    dz localdz = d().a(parame.j());
    if (localdz != null)
      localdz.a(parame.b(), c());
  }

  protected void a(e parame, int paramInt)
  {
    parame.a(paramInt);
  }

  static ArrayList a(b paramb)
  {
    return paramb.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.b
 * JD-Core Version:    0.6.0
 */