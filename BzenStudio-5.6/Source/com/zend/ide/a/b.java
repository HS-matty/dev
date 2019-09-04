package com.zend.ide.a;

import java.util.Hashtable;

public class b
{
  private static Hashtable a;

  public static void a(String paramString, Object paramObject)
  {
    e locale = b(paramString, paramObject);
    if (locale == null)
      return;
    locale.a(paramObject);
  }

  public static a a(Object paramObject1, Object paramObject2)
  {
    e locale = b(null, paramObject1);
    if (locale == null)
      return null;
    return locale.b(paramObject2);
  }

  private static e b(String paramString, Object paramObject)
  {
    if (a == null)
      a = new Hashtable();
    e locale = (e)a.get(paramObject);
    if (locale == null)
    {
      locale = a(paramString);
      a.put(paramObject, locale);
    }
    return locale;
  }

  private static e a(String paramString)
  {
    if (paramString.equals("EditorComponent"))
      return new d();
    if (paramString.equals("SQLQueryComponent"))
      return new f();
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.a.b
 * JD-Core Version:    0.6.0
 */