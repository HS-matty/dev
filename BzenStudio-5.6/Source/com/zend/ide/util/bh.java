package com.zend.ide.util;

import com.zend.ide.j.h;
import com.zend.ide.l.f;
import com.zend.ide.l.u;
import com.zend.ide.y.b;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;

public final class bh
  implements Serializable
{
  public static final transient bh a = new bh("default");
  private static transient List b = new ArrayList();
  private String c;

  public static bh[] d()
  {
    bh[] arrayOfbh = new bh[b.size()];
    b.toArray(arrayOfbh);
    return arrayOfbh;
  }

  public static final byte[] a(String paramString, bh parambh)
  {
    if ((parambh != null) && (!parambh.equals(a)))
      try
      {
        return paramString.getBytes(parambh.c());
      }
      catch (Exception localException)
      {
      }
    return paramString.getBytes();
  }

  public static final String a(byte[] paramArrayOfByte, bh parambh)
  {
    if ((parambh != null) && (!parambh.equals(a)))
      try
      {
        return new String(paramArrayOfByte, parambh.c());
      }
      catch (Exception localException)
      {
      }
    return new String(paramArrayOfByte);
  }

  public static final Reader a(File paramFile, bh parambh)
  {
    if ((parambh != null) && (!parambh.equals(a)))
      try
      {
        return new InputStreamReader(h.m.f(paramFile), parambh.c());
      }
      catch (Exception localException1)
      {
      }
    try
    {
      return new InputStreamReader(h.m.f(paramFile));
    }
    catch (dj localdj)
    {
      if (localdj.getMessage().indexOf("550") != -1)
        return null;
    }
    catch (Exception localException2)
    {
      cl.a(localException2);
    }
    return null;
  }

  public static boolean a(bh parambh)
  {
    return b.contains(parambh);
  }

  public bh(String paramString)
  {
    this.c = paramString;
  }

  public String c()
  {
    return this.c;
  }

  public String toString()
  {
    return c();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof bh)))
      return false;
    bh localbh = (bh)paramObject;
    if (this == localbh)
      return true;
    return c().equals(localbh.c());
  }

  public static bh a()
  {
    if ((f.b != null) && (!f.b.c()))
    {
      bh localbh = f.b.b();
      if (localbh != null)
        return localbh;
    }
    return (bh)b.a("editing.encoding");
  }

  static
  {
    b.add(a);
    SortedMap localSortedMap = Charset.availableCharsets();
    Iterator localIterator = localSortedMap.values().iterator();
    while (localIterator.hasNext())
    {
      Charset localCharset = (Charset)localIterator.next();
      b.add(new bh(localCharset.displayName()));
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.bh
 * JD-Core Version:    0.6.0
 */