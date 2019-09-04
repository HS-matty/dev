package com.zend.ide.j;

import com.zend.ide.util.ct;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class h extends g
{
  public static h m = new h();

  private h()
  {
    super(ct.a(176));
  }

  public synchronized boolean a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    List localList = null;
    if (this.a != null)
    {
      localList = this.a.a(paramFile1);
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        File localFile1 = (File)localIterator1.next();
        this.a.c(localFile1);
      }
    }
    boolean bool = false;
    try
    {
      Object localObject1;
      if (paramFile2.exists())
      {
        int i = 0;
        if ((!bool) && (localList != null))
        {
          localObject1 = localList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            File localFile2 = (File)((Iterator)localObject1).next();
            this.a.b(localFile2);
          }
        }
        return i;
      }
      bool = super.a(paramFile1, paramFile2, paramBoolean);
      if (!bool)
      {
        bool = t.b(paramFile1, paramFile2.getParentFile(), null);
        if (bool)
        {
          t.a(paramFile1, false);
          if (paramBoolean)
            d(paramFile1, paramFile2);
        }
      }
      if ((!bool) && (localList != null))
      {
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          localObject1 = (File)localIterator2.next();
          this.a.b((File)localObject1);
        }
      }
    }
    finally
    {
      if ((!bool) && (localList != null))
      {
        Iterator localIterator3 = localList.iterator();
        while (localIterator3.hasNext())
        {
          File localFile3 = (File)localIterator3.next();
          this.a.b(localFile3);
        }
      }
    }
    return bool;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.h
 * JD-Core Version:    0.6.0
 */