package com.zend.ide.f.a;

import com.zend.ide.b.d;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeSet;

public class c
  implements a
{
  private Hashtable a = new Hashtable(1000);
  private TreeSet b = new TreeSet();
  private ArrayList c;

  public synchronized void c()
  {
    this.c = null;
    this.a.clear();
    this.b.clear();
  }

  public synchronized List a(String paramString)
  {
    return null;
  }

  public synchronized void a(d paramd)
  {
    this.c = null;
    String str = paramd.a().trim().toLowerCase();
    Integer localInteger = (Integer)this.a.get(str);
    if (localInteger == null)
    {
      localInteger = new Integer(1);
      this.b.add(paramd);
    }
    else
    {
      localInteger = new Integer(localInteger.intValue() + 1);
    }
    this.a.put(str, localInteger);
  }

  public synchronized void b(d paramd)
  {
    this.c = null;
    String str = paramd.a().trim().toLowerCase();
    Integer localInteger = (Integer)this.a.get(str);
    if (localInteger == null)
    {
      this.b.remove(paramd);
      return;
    }
    int i = localInteger.intValue() - 1;
    if (i <= 0)
    {
      this.b.remove(paramd);
      this.a.remove(str);
    }
    else
    {
      this.a.put(str, new Integer(i));
    }
  }

  public synchronized List b()
  {
    if (this.c == null)
      this.c = new ArrayList(this.b);
    return this.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.a.c
 * JD-Core Version:    0.6.0
 */