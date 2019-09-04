package com.zend.ide.desktop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class l
{
  private boolean a = false;
  private boolean e = false;
  private boolean d = false;
  private String[] b;
  private m[] c;

  l(String[] paramArrayOfString)
  {
    a(paramArrayOfString);
  }

  private void a(String[] paramArrayOfString)
  {
    try
    {
      ArrayList localArrayList = new ArrayList(Arrays.asList(paramArrayOfString));
      if (localArrayList.contains("-debugMode"))
      {
        this.a = true;
        System.setProperty("debugMode", "true");
        localArrayList.remove("-debugMode");
      }
      if (localArrayList.contains("-debugFile"))
      {
        this.e = true;
        localArrayList.remove("-debugFile");
      }
      if (localArrayList.contains("-ftpDebug"))
      {
        System.setProperty("ftpDebug", "ftpDebug");
        localArrayList.remove("-ftpDebug");
      }
      if (localArrayList.contains("-sqlDebug"))
      {
        System.setProperty("sqlDebug", "sqlDebug");
        localArrayList.remove("-sqlDebug");
      }
      if (localArrayList.contains("-loggingDebug"))
      {
        System.setProperty("loggingDebug", "loggingDebug");
        localArrayList.remove("-loggingDebug");
      }
      if (localArrayList.contains("-sqlAll"))
      {
        System.setProperty("sqlAll", "sqlAll");
        localArrayList.remove("-sqlAll");
      }
      if (localArrayList.contains("-ignoreOtherIDE"))
      {
        this.d = true;
        localArrayList.remove("-ignoreOtherIDE");
      }
      if (localArrayList.contains("-jp"))
      {
        System.setProperty("jp", "jp");
        localArrayList.remove("-jp");
      }
      localObject = new ArrayList(1);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if (str1.startsWith("-s"))
        {
          str2 = str1.substring(2);
          m localm = new m("OS_SYSTEM_ROOT", str2);
          ((ArrayList)localObject).add(localm);
          localIterator.remove();
        }
      }
      if (((ArrayList)localObject).size() > 0)
      {
        this.c = new m[((ArrayList)localObject).size()];
        ((ArrayList)localObject).toArray(this.c);
      }
      if (localArrayList.size() > 0)
      {
        this.b = new String[localArrayList.size()];
        localArrayList.toArray(this.b);
      }
    }
    catch (Exception localException)
    {
      String str2;
      Object localObject = "";
      int i = 0;
      int j = paramArrayOfString.length;
      while (i < j)
      {
        str2 = paramArrayOfString[i];
        localObject = (String)localObject + str2 + " ";
        i++;
      }
      throw new RuntimeException((String)localObject);
    }
  }

  public String[] e()
  {
    return this.b;
  }

  public m[] b()
  {
    return this.c;
  }

  public boolean c()
  {
    return this.a;
  }

  public boolean f()
  {
    return this.e;
  }

  public boolean d()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.l
 * JD-Core Version:    0.6.0
 */