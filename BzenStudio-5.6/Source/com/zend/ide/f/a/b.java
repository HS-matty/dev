package com.zend.ide.f.a;

import com.zend.ide.b.d;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeSet;

public class b
  implements a
{
  private Hashtable a = new Hashtable(1000);
  private TreeSet b = new TreeSet();
  private ArrayList d;

  public synchronized void c()
  {
    this.d = null;
    this.a.clear();
    this.b.clear();
  }

  public synchronized List a(String paramString)
  {
    if (paramString == null)
      return null;
    paramString = paramString.trim().toLowerCase();
    return (List)this.a.get(paramString);
  }

  public synchronized void a(d paramd)
  {
    this.d = null;
    String str = paramd.a().trim().toLowerCase();
    ArrayList localArrayList = (ArrayList)this.a.get(str);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.a.put(str, localArrayList);
    }
    localArrayList.remove(paramd);
    localArrayList.add(paramd);
    this.b.add(paramd);
  }

  public synchronized void b(d paramd)
  {
    this.d = null;
    String str = paramd.a().trim().toLowerCase();
    ArrayList localArrayList = (ArrayList)this.a.get(str);
    if (localArrayList == null)
      return;
    localArrayList.remove(paramd);
    if (localArrayList.isEmpty())
      this.a.remove(localArrayList);
    this.b.remove(paramd);
  }

  public synchronized List b()
  {
    if (this.d == null)
      this.d = new ArrayList(this.b);
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.a.b
 * JD-Core Version:    0.6.0
 */