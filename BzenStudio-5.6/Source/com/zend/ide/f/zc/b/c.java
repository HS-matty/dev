package com.zend.ide.f.zc.b;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class c extends a
{
  private static final Map e;
  private static final Map f;
  private static final Map g;
  private File[] h;
  private File[] i;

  public c(String paramString)
  {
    super(paramString, b());
  }

  public List a()
  {
    int k = this.h != null ? this.h.length : 0;
    int m = this.i != null ? this.i.length : 0;
    ArrayList localArrayList = new ArrayList(k + m);
    int n;
    if (this.h != null)
      for (n = 0; n < this.h.length; n++)
        localArrayList.add(new g(this.h[n].getAbsolutePath()));
    if (this.i != null)
      for (n = 0; n < this.i.length; n++)
        localArrayList.add(new g(this.i[n].getAbsolutePath()));
    return localArrayList;
  }

  private static final d[] b()
  {
    d locald = h.a();
    return new d[] { locald, locald, locald, locald };
  }

  public void a(File[] paramArrayOfFile)
    throws IOException
  {
    if ((!j) && (paramArrayOfFile == null))
      throw new AssertionError();
    this.h = paramArrayOfFile;
    ArrayList localArrayList = new ArrayList(paramArrayOfFile.length);
    for (int k = 0; k < paramArrayOfFile.length; k++)
    {
      File localFile = paramArrayOfFile[k];
      Object localObject = f.get(localFile);
      if (localObject != null)
      {
        if ((!j) && (!(localObject instanceof d)))
          throw new AssertionError();
        localArrayList.add((d)localObject);
      }
      else
      {
        b localb = new b(null, new File[] { localFile });
        localArrayList.add(localb);
        f.put(localFile, localb);
      }
    }
    a(1, new a(null, (d[])(d[])localArrayList.toArray(new d[localArrayList.size()])));
  }

  public void b(File[] paramArrayOfFile)
    throws IOException
  {
    if ((!j) && (paramArrayOfFile == null))
      throw new AssertionError();
    this.i = paramArrayOfFile;
    ArrayList localArrayList = new ArrayList(paramArrayOfFile.length);
    for (int k = 0; k < paramArrayOfFile.length; k++)
    {
      File localFile = paramArrayOfFile[k];
      Object localObject = g.get(localFile);
      if (localObject != null)
      {
        if ((!j) && (!(localObject instanceof d)))
          throw new AssertionError();
        localArrayList.add((d)localObject);
      }
      else
      {
        e locale = new e(localFile);
        localArrayList.add(locale);
        g.put(localFile, locale);
      }
    }
    a(2, new a(null, (d[])(d[])localArrayList.toArray(new d[localArrayList.size()])));
  }

  static
  {
    e = new WeakHashMap();
    f = new WeakHashMap();
    g = new WeakHashMap();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.c
 * JD-Core Version:    0.6.0
 */