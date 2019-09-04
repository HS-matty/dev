package com.zend.ide.cb.c;

import com.zend.ide.cb.g;
import com.zend.ide.cb.q;
import java.util.ArrayList;
import java.util.List;

public abstract class i
  implements g
{
  protected String a;
  protected List b;
  protected h c;
  protected q d;
  private List e;

  protected i(String paramString, q paramq, h paramh)
  {
    this.a = paramString;
    this.d = paramq;
    this.c = paramh;
    this.e = new ArrayList(2);
    this.b = new ArrayList();
  }

  protected i(String paramString)
  {
    this(paramString, null, null);
  }

  public String a()
  {
    if (this.a == null)
      this.a = "";
    return this.a;
  }

  public String[] b()
  {
    String[] arrayOfString = new String[this.e.size()];
    this.e.toArray(arrayOfString);
    return arrayOfString;
  }

  public q c()
  {
    return this.d;
  }

  protected h a()
  {
    return this.c;
  }

  void d(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      String[] arrayOfString = paramString.split(" ");
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfString.length; i++)
      {
        localStringBuffer.append(e(arrayOfString[i]));
        localStringBuffer.append(' ');
      }
      localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      paramString = localStringBuffer.toString();
    }
    if (!this.e.contains(paramString))
      this.e.add(paramString);
  }

  private static String e(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      paramString = paramString.toLowerCase();
      paramString = Character.toUpperCase(paramString.charAt(0)) + paramString.substring(1);
    }
    return paramString;
  }

  protected Object f(String paramString)
  {
    return a(paramString, this.b);
  }

  protected Object a(String paramString, List paramList)
  {
    if ((paramList == null) || (paramString == null))
      return null;
    g[] arrayOfg = null;
    arrayOfg = new g[paramList.size()];
    paramList.toArray(arrayOfg);
    for (int i = 0; i < arrayOfg.length; i++)
    {
      g localg = arrayOfg[i];
      if ((localg != null) && (localg.a() != null) && (localg.a().equals(paramString)))
        return localg;
    }
    return null;
  }

  public String toString()
  {
    return a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.i
 * JD-Core Version:    0.6.0
 */