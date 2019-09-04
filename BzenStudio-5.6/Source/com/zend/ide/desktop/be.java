package com.zend.ide.desktop;

import com.zend.ide.f.bm;
import com.zend.ide.f.bp;
import com.zend.ide.f.bt;
import com.zend.ide.f.s;
import com.zend.ide.j.y;
import com.zend.ide.l.u;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.r.p;
import com.zend.ide.u.bu;
import com.zend.ide.util.cl;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.text.Document;

public class be
{
  private com.zend.ide.util.c.h a = new com.zend.ide.util.c.h(0);
  private bp b;
  private v c;
  private bw d;
  private Hashtable e;
  private ch f;
  private cd g;
  private dr h;
  private dr k;
  private String i = "Editor";
  private Hashtable j;
  private com.zend.ide.util.bh l;
  private com.zend.ide.y.e m;
  private PropertyChangeListener n = new xb(this, null);
  private PropertyChangeListener o = new wb(this, null);
  s p;
  private ArrayList q = new ArrayList();
  private ArrayList r = new ArrayList();

  public be(v paramv, bw parambw, bp parambp)
  {
    com.zend.ide.util.c.h.c().a(new bf(this));
    e();
    this.h = new dr();
    this.k = new dr();
    this.j = new Hashtable();
    this.b = parambp;
    this.c = paramv;
    this.d = parambw;
    this.e = new Hashtable(100);
    this.f = new ch(this, null);
    parambw.a(this.f);
    parambw.addDocumentListener(this.f);
    p.e().a(this.f);
    this.g = new cd(this);
    paramv.a(this.g);
    bm.k();
  }

  private boolean g()
  {
    return this.c.e();
  }

  private void a(u paramu)
  {
    this.p = com.zend.ide.util.b.e.a().b(paramu.c());
  }

  public void b()
  {
    this.a.a(new bg(this));
  }

  private void e()
  {
    if (this.m != null)
      return;
    f localf = new f();
    this.m = new com.zend.ide.y.e(localf);
    localf.a("editing.encoding", this.n);
    this.m.a("editing.encoding");
    localf.a("desktop.phpVersion", this.o);
    this.m.a("desktop.phpVersion");
  }

  private void a(String paramString, Object paramObject)
  {
    synchronized (this.e)
    {
      this.e.put(paramString, paramObject);
    }
  }

  private Object a(Object paramObject)
  {
    synchronized (this.e)
    {
      return this.e.remove(paramObject);
    }
  }

  private void a(String paramString, File paramFile)
  {
    File localFile = com.zend.ide.j.h.m.g(paramString);
    if (localFile.isFile())
    {
      try
      {
        b(localFile.getCanonicalPath(), localFile.getCanonicalFile());
      }
      catch (IOException localIOException1)
      {
      }
    }
    else
    {
      this.j.clear();
      if (paramFile != null)
      {
        if (paramFile.isFile())
          try
          {
            b(localFile.getCanonicalPath(), paramFile.getCanonicalFile());
          }
          catch (IOException localIOException2)
          {
          }
        else
          a(localFile, paramFile);
      }
      else
        a(localFile, localFile);
      a(true);
    }
  }

  private boolean a(File paramFile1, File paramFile2)
  {
    try
    {
      String str = paramFile2.getCanonicalPath();
      if (this.j.containsKey(str))
        return true;
      this.j.put(str, str);
      File[] arrayOfFile = paramFile2.listFiles();
      if (arrayOfFile == null)
        return true;
      for (int i1 = 0; i1 < arrayOfFile.length; i1++)
      {
        boolean bool = arrayOfFile[i1].isFile();
        if (!bool)
        {
          if (!a(paramFile1, arrayOfFile[i1]))
            return false;
        }
        else if (a(arrayOfFile[i1]))
        {
          this.q.add(arrayOfFile[i1].getCanonicalFile());
        }
        else
        {
          this.b.b().g().a(arrayOfFile[i1]);
          this.r.add(arrayOfFile[i1].getCanonicalFile());
        }
      }
      synchronized (this.e)
      {
        if (this.c.g().m(paramFile1))
        {
          a(this.h, paramFile1.getCanonicalPath(), this.q, true);
          a(this.k, paramFile1.getCanonicalPath(), this.r, false);
        }
        else
        {
          this.q.clear();
          this.r.clear();
          return false;
        }
      }
      a(true);
      this.q.clear();
      this.r.clear();
    }
    catch (bu localbu)
    {
    }
    catch (IOException localIOException)
    {
      return false;
    }
    return true;
  }

  private void a(dr paramdr, String paramString, ArrayList paramArrayList, boolean paramBoolean)
  {
    String[] arrayOfString = new String[paramArrayList.size()];
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      File localFile = (File)paramArrayList.get(i1);
      String str = localFile.getPath();
      if (paramBoolean)
        a(str, localFile);
      arrayOfString[i1] = str;
    }
    paramdr.a(paramString, arrayOfString);
  }

  private void b(String paramString, File paramFile)
  {
    if (!a(paramFile))
    {
      try
      {
        if (this.k.b(paramFile.getCanonicalPath()))
          return;
        this.b.a(paramFile.getPath());
        this.k.a(paramString, paramFile.getCanonicalPath());
        this.b.b().g().a(com.zend.ide.j.h.m.g(paramFile.getCanonicalPath()));
      }
      catch (IOException localIOException1)
      {
        cl.a(localIOException1);
      }
      return;
    }
    synchronized (this.e)
    {
      a(paramFile.getPath(), paramFile);
      try
      {
        this.h.a(paramString, paramFile.getCanonicalPath());
        if (paramFile.exists())
          a(true);
        else
          f();
      }
      catch (IOException localIOException2)
      {
        cl.a(localIOException2);
      }
    }
  }

  private void b(File paramFile)
  {
    try
    {
      String[] arrayOfString = this.h.c(paramFile.getCanonicalPath());
      for (int i1 = 0; i1 < arrayOfString.length; i1++)
        c(arrayOfString[i1], paramFile);
      arrayOfString = this.k.c(paramFile.getCanonicalPath());
      for (i1 = 0; i1 < arrayOfString.length; i1++)
        c(arrayOfString[i1], paramFile);
    }
    catch (IOException localIOException)
    {
    }
  }

  private void c(String paramString, File paramFile)
  {
    try
    {
      Object localObject1;
      if (paramFile.isDirectory())
      {
        localObject1 = paramFile.listFiles();
        for (int i1 = 0; i1 < localObject1.length; i1++)
        {
          File localFile = localObject1[i1];
          c(paramString, localFile);
        }
      }
      else
      {
        localObject1 = paramFile.getCanonicalPath();
        if (a(paramFile))
        {
          this.h.b(paramString, (String)localObject1);
          if (!this.h.b((String)localObject1))
          {
            synchronized (this.e)
            {
              a(paramFile.getPath());
            }
            this.b.a(paramFile.getPath());
          }
        }
        else
        {
          this.k.b(paramString, (String)localObject1);
          if (!this.k.b((String)localObject1))
            this.b.a(paramFile.getPath());
        }
      }
    }
    catch (IOException localIOException)
    {
    }
  }

  private void a(String paramString, boolean paramBoolean)
  {
    File localFile = com.zend.ide.j.h.m.g(paramString);
    if (this.e.containsKey(localFile.getPath()))
      return;
    if (!a(localFile))
      return;
    a(localFile.getPath(), localFile);
    a(paramBoolean);
  }

  private void a(String paramString)
  {
    File localFile = com.zend.ide.j.h.m.g(paramString);
    if (this.e.containsKey(localFile.getPath()))
      return;
    if (!a(localFile))
      return;
    a(localFile.getPath(), localFile);
    f();
  }

  private void c()
  {
    this.b.b().b();
    this.e.clear();
  }

  private void d()
  {
    this.e.clear();
    this.a.a(new bh(this));
  }

  private void f()
  {
    while (!this.e.isEmpty())
      try
      {
        String str;
        Object localObject1;
        synchronized (this.e)
        {
          str = (String)this.e.keys().nextElement();
          localObject1 = a(str);
        }
        if ((localObject1 instanceof File))
        {
          ??? = (File)localObject1;
          a((File)???);
        }
        else
        {
          a((Reader)localObject1, str);
        }
      }
      catch (bu localbu)
      {
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  private void a(boolean paramBoolean)
  {
    while (!this.e.isEmpty())
      try
      {
        String str;
        Object localObject1;
        synchronized (this.e)
        {
          str = (String)this.e.keys().nextElement();
          localObject1 = a(str);
        }
        if ((localObject1 instanceof File))
        {
          ??? = (File)localObject1;
          if ((paramBoolean) && (this.p != null))
          {
            if (b(((File)???).getPath()))
              a((File)???);
          }
          else
            a((File)???);
        }
        else
        {
          a((Reader)localObject1, str);
        }
      }
      catch (bu localbu)
      {
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  private boolean b(String paramString)
  {
    com.zend.ide.m.bf localbf = this.p.a(paramString);
    return (localbf == null) || (!localbf.b());
  }

  private void a(Reader paramReader, String paramString)
    throws IOException
  {
    try
    {
      this.b.a(paramReader, paramString);
    }
    finally
    {
      paramReader.close();
    }
  }

  private void a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      localObject1 = paramFile.listFiles();
      if (localObject1 == null)
        return;
      for (int i1 = 0; i1 < localObject1.length; i1++)
      {
        if ((localObject1[i1].isFile()) && (!a(localObject1[i1])))
          continue;
        a(localObject1[i1].getPath(), localObject1[i1]);
      }
      return;
    }
    Object localObject1 = this.d.a(paramFile.getPath());
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((dz)localObject1).getDocument();
      a(paramFile.getPath(), new com.zend.ide.p.a.a((Document)localObject2));
      return;
    }
    try
    {
      localObject2 = com.zend.ide.j.h.m.f(paramFile);
      InputStreamReader localInputStreamReader;
      if ((this.l == null) || (this.l.equals(com.zend.ide.util.bh.a)))
        localInputStreamReader = new InputStreamReader((InputStream)localObject2);
      else
        localInputStreamReader = new InputStreamReader((InputStream)localObject2, this.l.c());
      this.b.a(localInputStreamReader, paramFile.getPath());
    }
    catch (Exception localException)
    {
    }
  }

  private static boolean a(File paramFile)
  {
    return com.zend.ide.util.wb.a(paramFile);
  }

  private static boolean a(String paramString)
  {
    return com.zend.ide.util.wb.b(paramString);
  }

  static com.zend.ide.util.c.h a(be parambe)
  {
    return parambe.a;
  }

  static void b(be parambe)
  {
    parambe.c();
  }

  static boolean c(be parambe)
  {
    return parambe.g();
  }

  static v d(be parambe)
  {
    return parambe.c;
  }

  static void a(be parambe, String paramString, File paramFile)
  {
    parambe.a(paramString, paramFile);
  }

  static bw e(be parambe)
  {
    return parambe.d;
  }

  static void a(be parambe, String paramString, boolean paramBoolean)
  {
    parambe.a(paramString, paramBoolean);
  }

  static com.zend.ide.util.bh a(be parambe, com.zend.ide.util.bh parambh)
  {
    return parambe.l = parambh;
  }

  static com.zend.ide.util.bh f(be parambe)
  {
    return parambe.l;
  }

  static boolean c(String paramString)
  {
    return a(paramString);
  }

  static boolean b(File paramFile)
  {
    return a(paramFile);
  }

  static dr h(be parambe)
  {
    return parambe.h;
  }

  static String i(be parambe)
  {
    return parambe.i;
  }

  static dr a(be parambe)
  {
    return parambe.k;
  }

  static void c(be parambe, String paramString, File paramFile)
  {
    parambe.b(paramString, paramFile);
  }

  static void b(be parambe, String paramString, File paramFile)
  {
    parambe.c(paramString, paramFile);
  }

  static void a(be parambe, String paramString)
  {
    parambe.a(paramString);
  }

  static void a(be parambe, u paramu)
  {
    parambe.a(paramu);
  }

  static void c(be parambe)
  {
    parambe.d();
  }

  static void a(be parambe, File paramFile)
  {
    parambe.b(paramFile);
  }

  static bp d(be parambe)
  {
    return parambe.b;
  }

  static Hashtable e(be parambe)
  {
    return parambe.e;
  }

  static Object a(be parambe, Object paramObject)
  {
    return parambe.a(paramObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.be
 * JD-Core Version:    0.6.0
 */