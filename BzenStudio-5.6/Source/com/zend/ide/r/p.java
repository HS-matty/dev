package com.zend.ide.r;

import com.zend.ide.l.bv;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.da;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public abstract class p
  implements cu
{
  private static p a;
  private static y b;
  private static ba g;
  private static o f;
  private static bv e;
  protected Hashtable c = new Hashtable(8);
  protected Hashtable d = new Hashtable(0);
  protected Hashtable h = new Hashtable(1);
  protected Hashtable j = new Hashtable(0);
  protected HashMap i = new HashMap(50);
  private da k;

  public static p e()
  {
    if (a == null)
    {
      a = new e();
      a.j();
    }
    return a;
  }

  public static y a()
  {
    if (b == null)
      b = new y(com.zend.ide.bd.c.b().h());
    return b;
  }

  public abstract void a(d paramd);

  public abstract d a(String paramString1, String paramString2, boolean paramBoolean);

  public abstract void b(d paramd);

  public abstract d b(String paramString);

  public abstract d c(String paramString);

  public abstract d a(File paramFile);

  public abstract Icon a(File paramFile);

  public abstract void a(d paramd, f paramf);

  public abstract void b(d paramd, f paramf);

  public abstract void a(d paramd, String paramString);

  public abstract void a(d paramd, String paramString, boolean paramBoolean);

  protected abstract boolean a(f paramf);

  public ba a(JDialog paramJDialog)
  {
    if (g == null)
      g = new ba(this, paramJDialog);
    return g;
  }

  public static void a(o paramo, String paramString)
  {
    ((b)paramo).b(paramString);
  }

  public static void b(o paramo, String paramString)
  {
    ((b)paramo).c(paramString);
  }

  public static void b(d paramd, String paramString)
  {
    paramd.e(paramString);
  }

  public static void b(d paramd, boolean paramBoolean)
  {
    paramd.c(paramBoolean);
  }

  public static void a(d paramd, int paramInt)
  {
    paramd.a(paramInt);
  }

  public static void c(d paramd, String paramString)
  {
    paramd.a(paramString);
  }

  public static void a(d paramd, boolean paramBoolean)
  {
    paramd.b(paramBoolean);
  }

  public static void c(d paramd, boolean paramBoolean)
  {
    paramd.d(paramBoolean);
  }

  public static void d(d paramd, boolean paramBoolean)
  {
    paramd.e(paramBoolean);
  }

  public o g(String paramString)
  {
    if (paramString == null)
      return null;
    if (paramString.equals(f().b()))
      return f();
    Enumeration localEnumeration = this.j.elements();
    o localo;
    while (localEnumeration.hasMoreElements())
    {
      localo = (o)localEnumeration.nextElement();
      if (localo.b().equals(paramString))
        return localo;
    }
    localEnumeration = this.h.elements();
    while (localEnumeration.hasMoreElements())
    {
      localo = (o)localEnumeration.nextElement();
      if (localo.b().equals(paramString))
        return localo;
    }
    return null;
  }

  public o a(String paramString)
  {
    Object localObject = c(paramString);
    if (localObject == null)
      localObject = g(paramString);
    if ((localObject == null) && (paramString.equals(l().getDescription())))
      localObject = (o)l();
    return (o)localObject;
  }

  public Iterator c()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.c.values());
    localArrayList.addAll(this.d.values());
    return localArrayList.iterator();
  }

  public Iterator g()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.d.values());
    Iterator localIterator1 = this.d.values().iterator();
    Iterator localIterator2 = this.c.values().iterator();
    int m = 0;
    while (localIterator2.hasNext())
    {
      d locald1 = (d)localIterator2.next();
      while (localIterator1.hasNext())
      {
        d locald2 = (d)localIterator1.next();
        if (locald1.b().equals(locald2.b()))
          m = 1;
      }
      if (m == 0)
        localArrayList.add(locald1);
      else
        m = 0;
      localIterator1 = this.d.values().iterator();
    }
    return localArrayList.iterator();
  }

  public Iterator d()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.h.values());
    localArrayList.addAll(this.j.values());
    return localArrayList.iterator();
  }

  public Iterator a(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
      localArrayList.add(f);
    localArrayList.addAll(this.h.values());
    localArrayList.addAll(this.j.values());
    localArrayList.addAll(this.c.values());
    localArrayList.addAll(this.d.values());
    return localArrayList.iterator();
  }

  public boolean h(String paramString)
  {
    return g(paramString) != null;
  }

  public void a(o paramo)
  {
    if (this.h.containsKey(paramo.b()))
      return;
    this.h.put(paramo.b(), paramo);
    b(paramo);
  }

  void a(c paramc)
  {
    this.h.put(paramc.b(), paramc);
    b(paramc);
  }

  public void d(String paramString)
  {
    o localo = e().a(paramString);
    this.h.remove(paramString);
    c(localo);
  }

  public void a(r paramr)
  {
    if (this.k == null)
      this.k = new da(2);
    if (!this.k.contains(paramr))
      this.k.add(paramr);
  }

  public void b(r paramr)
  {
    if (this.k != null)
      this.k.remove(paramr);
  }

  protected final void a(bo parambo)
  {
    if (this.k != null)
      synchronized (this.k)
      {
        Iterator localIterator = this.k.iterator();
        while (localIterator.hasNext())
          ((r)localIterator.next()).a(parambo);
      }
  }

  protected void b(o paramo)
  {
    if (this.k != null)
      synchronized (this.k)
      {
        Iterator localIterator = this.k.iterator();
        while (localIterator.hasNext())
          ((r)localIterator.next()).a(paramo);
      }
  }

  protected final void c(o paramo)
  {
    if (this.k != null)
      synchronized (this.k)
      {
        Iterator localIterator = this.k.iterator();
        while (localIterator.hasNext())
          ((r)localIterator.next()).c(paramo);
      }
  }

  public static o f()
  {
    if (f == null)
      h();
    return f;
  }

  public s l()
  {
    if (e == null)
      e = new bv();
    return e;
  }

  private static void h()
  {
    f = new q();
    ((b)f).b("All Files");
    ((b)f).c("All Files");
  }

  public void i()
  {
    File localFile1 = new File(cv.d());
    File localFile2 = new File(localFile1, "fileTypes");
    if (!localFile2.exists())
    {
      localFile2.mkdirs();
    }
    else
    {
      localObject1 = localFile2.listFiles();
      for (int m = 0; m < localObject1.length; m++)
      {
        Object localObject2 = localObject1[m];
        localObject2.delete();
      }
    }
    Object localObject1 = g();
    a(localFile2, (Iterator)localObject1);
    if (!this.h.isEmpty())
    {
      localObject1 = this.h.values().iterator();
      a(localFile2, (Iterator)localObject1);
    }
    if (!this.j.isEmpty())
    {
      localObject1 = this.j.values().iterator();
      a(localFile2, (Iterator)localObject1);
    }
  }

  private static void a(File paramFile, Iterator paramIterator)
  {
    while (paramIterator.hasNext())
    {
      o localo = (o)paramIterator.next();
      String str = new File(paramFile, localo.b() + ".xml").getPath();
      try
      {
        com.a.f.a(str, localo);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
    }
  }

  private void j()
  {
    File localFile1 = new File(cv.d());
    File localFile2 = new File(localFile1, "fileTypes");
    if ((localFile2.exists()) && (localFile2.listFiles() != null))
    {
      File[] arrayOfFile = localFile2.listFiles();
      for (int m = 0; m < arrayOfFile.length; m++)
      {
        File localFile3 = arrayOfFile[m];
        if (!localFile3.exists())
          return;
        try
        {
          o localo = (o)com.a.f.a(localFile3.getPath());
          if ((localo instanceof c))
            a(localo);
          else
            a((d)localo);
        }
        catch (SAXException localSAXException)
        {
          cl.a(localSAXException);
        }
        catch (ParserConfigurationException localParserConfigurationException)
        {
          cl.a(localParserConfigurationException);
        }
        catch (IOException localIOException)
        {
          cl.a(localIOException);
        }
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.p
 * JD-Core Version:    0.6.0
 */