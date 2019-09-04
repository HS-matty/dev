package com.zend.ide.cb;

import java.util.HashMap;
import java.util.Set;

public class t
{
  private HashMap a = new HashMap();
  private static t b;

  public static t a()
  {
    if (b == null)
      b = new t();
    return b;
  }

  public void a(String paramString, r paramr)
  {
    this.a.put(paramString, paramr);
  }

  public String[] b()
  {
    Set localSet = this.a.keySet();
    String[] arrayOfString = new String[localSet.size()];
    localSet.toArray(arrayOfString);
    return arrayOfString;
  }

  public q a(e parame)
  {
    if ("DB2/i5".equals(parame.j()))
      parame.e("DB2/400");
    r localr = a(parame.j());
    if (localr != null)
      return localr.a(parame);
    return null;
  }

  public r a(String paramString)
  {
    return (r)this.a.get(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.t
 * JD-Core Version:    0.6.0
 */