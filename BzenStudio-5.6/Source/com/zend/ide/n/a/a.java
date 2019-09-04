package com.zend.ide.n.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a
  implements e, Cloneable
{
  private String a = "";
  private int b = -1;
  private transient Collection c;

  public a()
  {
  }

  public a(String paramString, int paramInt)
  {
    a(paramString);
    a(paramInt);
  }

  public String j()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    if (this.a.equals(paramString))
      return;
    String str = this.a;
    this.a = paramString;
    a(this, "fileName", str, paramString);
  }

  public int b()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    if (this.b == paramInt)
      return;
    int i = this.b;
    this.b = paramInt;
    a(this, "lineNumber", new Integer(i), new Integer(paramInt));
  }

  public void a(f paramf)
  {
    if (this.c == null)
      this.c = new ArrayList(3);
    if (!this.c.contains(paramf))
      this.c.add(paramf);
  }

  public void b(f paramf)
  {
    if (this.c != null)
      this.c.remove(paramf);
  }

  protected void a(e parame, String paramString, Object paramObject1, Object paramObject2)
  {
    if (this.c != null)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        localf.a(parame, paramString, paramObject1, paramObject2);
      }
    }
  }

  public int compareTo(Object paramObject)
  {
    if (!(paramObject instanceof Cloneable))
      return -1;
    e locale = (Cloneable)paramObject;
    int i = this.a.compareTo(locale.j());
    if (i == 0)
      i = this.b - locale.b();
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (super.equals(paramObject))
      return true;
    if ((paramObject == null) || (!(paramObject instanceof Cloneable)))
      return false;
    e locale = (Cloneable)paramObject;
    return (this.a.equals(locale.j())) && (this.b == locale.b());
  }

  public Object clone()
  {
    try
    {
      a locala = (a)super.clone();
      locala.c = null;
      return locala;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new InternalError();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.a
 * JD-Core Version:    0.6.0
 */