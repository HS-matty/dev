package com.zend.ide.f.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

public class d
  implements a
{
  private Hashtable a = new Hashtable(1000);
  private ArrayList b = new ArrayList();
  private e c = new e(this);

  public synchronized void c()
  {
    this.a.clear();
    this.b.clear();
  }

  public synchronized List a(String paramString)
  {
    return null;
  }

  public synchronized com.zend.ide.b.d a(String paramString)
  {
    if (paramString == null)
      return null;
    return (com.zend.ide.b.d)this.a.get(paramString);
  }

  public synchronized void a(com.zend.ide.b.d paramd)
  {
    String str = paramd.a();
    this.a.put(str, paramd);
    this.b.add(paramd);
  }

  public synchronized void b(com.zend.ide.b.d paramd)
  {
    String str = paramd.a();
    this.a.remove(str);
    this.b.remove(paramd);
  }

  public synchronized List b()
  {
    Object[] arrayOfObject = this.a.values().toArray();
    Arrays.sort(arrayOfObject, 0, arrayOfObject.length, this.c);
    return new ArrayList(Arrays.asList(arrayOfObject));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.a.d
 * JD-Core Version:    0.6.0
 */