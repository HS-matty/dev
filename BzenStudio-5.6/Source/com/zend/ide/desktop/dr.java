package com.zend.ide.desktop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class dr
{
  Hashtable a = new Hashtable();

  public void a(String paramString, String[] paramArrayOfString)
  {
    synchronized (this.a)
    {
      Hashtable localHashtable = (Hashtable)this.a.get(paramString);
      if (localHashtable == null)
      {
        localHashtable = new Hashtable();
        this.a.put(paramString, localHashtable);
      }
      for (int i = 0; i < paramArrayOfString.length; i++)
        localHashtable.put(paramArrayOfString[i], paramArrayOfString[i]);
    }
  }

  public void a(String paramString1, String paramString2)
  {
    synchronized (this.a)
    {
      Hashtable localHashtable = (Hashtable)this.a.get(paramString1);
      if (localHashtable == null)
      {
        localHashtable = new Hashtable();
        this.a.put(paramString1, localHashtable);
      }
      localHashtable.put(paramString2, paramString2);
    }
  }

  public Collection a(String paramString)
  {
    Collection localCollection = null;
    synchronized (this.a)
    {
      Hashtable localHashtable = (Hashtable)this.a.get(paramString);
      if (localHashtable != null)
        localCollection = localHashtable.values();
      this.a.remove(paramString);
    }
    return localCollection;
  }

  public void b(String paramString1, String paramString2)
  {
    synchronized (this.a)
    {
      Hashtable localHashtable = (Hashtable)this.a.get(paramString1);
      if (localHashtable != null)
        localHashtable.remove(paramString2);
    }
  }

  public boolean b(String paramString)
  {
    synchronized (this.a)
    {
      Enumeration localEnumeration = this.a.elements();
      while (localEnumeration.hasMoreElements())
      {
        Hashtable localHashtable = (Hashtable)localEnumeration.nextElement();
        if (localHashtable.containsKey(paramString))
          return true;
      }
      return false;
    }
  }

  public String[] c(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    Enumeration localEnumeration = this.a.keys();
    while (localEnumeration.hasMoreElements())
    {
      localObject = (String)localEnumeration.nextElement();
      if ((paramString.equals(localObject)) || (paramString.startsWith((String)localObject)))
        localArrayList.add(localObject);
    }
    Object localObject = new String[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (String)localObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.dr
 * JD-Core Version:    0.6.0
 */