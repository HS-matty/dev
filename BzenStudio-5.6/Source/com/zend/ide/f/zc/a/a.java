package com.zend.ide.f.zc.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a
  implements b
{
  private final b[] a;
  private final b b = new c("");

  public a(b[] paramArrayOfb)
  {
    this.a = paramArrayOfb;
  }

  public void b(String paramString)
  {
    this.b.b(paramString);
  }

  public b a(String paramString)
  {
    return this.b.a(paramString);
  }

  public Set c()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.b.c());
    for (int i = 0; i < this.a.length; i++)
    {
      b localb = this.a[i];
      localHashSet.addAll(localb.c());
    }
    return Collections.unmodifiableSet(localHashSet);
  }

  public b c(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    b localb1 = this.b.c(paramString);
    if (localb1 != null)
      localArrayList.add(localb1);
    for (int i = 0; i < this.a.length; i++)
    {
      b localb2 = this.a[i];
      localb1 = localb2.c(paramString);
      if (localb1 == null)
        continue;
      localArrayList.add(localb1);
    }
    i = localArrayList.size();
    return i != 0 ? new a((b[])localArrayList.toArray(new b[i])) : null;
  }

  public Collection b()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.b.b());
    for (int i = 0; i < this.a.length; i++)
    {
      b localb = this.a[i];
      localHashSet.addAll(localb.b());
    }
    return localHashSet;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(this.b.toString());
    for (int i = 0; i < this.a.length; i++)
    {
      b localb = this.a[i];
      localStringBuffer.append(localb.toString());
    }
    return localStringBuffer.toString();
  }

  public boolean d(String paramString)
  {
    if (this.b.d(paramString))
      return true;
    for (int i = 0; i < this.a.length; i++)
    {
      b localb = this.a[i];
      if (localb.d(paramString))
        return true;
    }
    return false;
  }

  public String a()
  {
    return this.b.a();
  }

  public void a(int paramInt, b paramb)
  {
    this.a[paramInt] = paramb;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.a.a
 * JD-Core Version:    0.6.0
 */