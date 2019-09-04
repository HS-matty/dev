package com.zend.ide.f.zc.a;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c
  implements b
{
  public final String a;
  private final Map b = new HashMap();
  private final Set c = new HashSet();

  public c(String paramString)
  {
    if ((!d) && (paramString == null))
      throw new AssertionError();
    this.a = paramString.intern();
  }

  public b a(String paramString)
  {
    if ((!d) && (paramString == null))
      throw new AssertionError();
    String str = a(paramString);
    Object localObject = c(str);
    if (localObject == null)
    {
      localObject = new c(str);
      this.b.put(str, localObject);
    }
    return str.length() == paramString.length() ? localObject : (b)((b)localObject).a(paramString.substring(str.length() + 1));
  }

  public final void b(String paramString)
  {
    if ((!d) && ((paramString == null) || (paramString.indexOf('.') != -1)))
      throw new AssertionError();
    this.c.add(paramString);
  }

  public static final String a(String paramString)
  {
    int i = paramString.indexOf('.');
    return i == -1 ? paramString : paramString.substring(0, i);
  }

  public int hashCode()
  {
    int i = 1;
    i = 31 * i + (this.a == null ? 0 : this.a.hashCode());
    return i;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (paramObject == null)
      return false;
    if (getClass() != paramObject.getClass())
      return false;
    c localc = (c)paramObject;
    if (this.a == null)
    {
      if (localc.a != null)
        return false;
    }
    else if (!this.a.equals(localc.a))
      return false;
    return true;
  }

  public final b c(String paramString)
  {
    if ((!d) && (paramString == null))
      throw new AssertionError();
    String str = a(paramString);
    b localb = (b)this.b.get(str);
    return str.length() == paramString.length() ? localb : localb == null ? null : localb.c(paramString.substring(str.length() + 1));
  }

  public final Collection b()
  {
    return Collections.unmodifiableCollection(this.b.values());
  }

  public final Set c()
  {
    return Collections.unmodifiableSet(this.c);
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(this.a);
    localStringBuffer.append("\n----------\n");
    Iterator localIterator = this.b.values().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (c)localIterator.next();
      localStringBuffer.append("Sub package: ");
      localStringBuffer.append(((c)localObject).toString());
      localStringBuffer.append("\n");
    }
    localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localStringBuffer.append("Class: ");
      localStringBuffer.append((String)localObject);
      localStringBuffer.append("\n");
    }
    return (String)localStringBuffer.toString();
  }

  public boolean d(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    String str;
    Object localObject;
    if (i != -1)
    {
      str = paramString.substring(i + 1);
      localObject = c(paramString.substring(0, i));
    }
    else
    {
      str = paramString;
      localObject = this;
    }
    if (localObject == null)
      return false;
    return ((b)localObject).c().contains(str);
  }

  public String a()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.a.c
 * JD-Core Version:    0.6.0
 */