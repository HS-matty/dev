package com.zend.ide.bf;

import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import com.zend.ide.util.cv;
import com.zend.ide.util.d.a;
import com.zend.ide.y.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class r
{
  private static final d[] e = new d[0];
  private static r a;
  private static ib f;
  private static e g;
  private Hashtable b;
  private Hashtable c;
  private a d;

  public static synchronized r b()
  {
    if (a == null)
    {
      a = new r();
      f = new ib(null);
      com.zend.ide.y.f localf = new com.zend.ide.y.f();
      g = new e(localf);
      localf.a("completion.xhtmlTagStyle", f);
      g.a("completion.xhtmlTagStyle");
    }
    return a;
  }

  private r()
  {
    g();
    if (this.b == null)
      this.b = q.b();
    this.c = q.c();
    c();
  }

  private void c()
  {
    this.d = new a();
    this.d.a(134, "PHPDoc");
    this.d.a(140, "PHP");
    this.d.a(135, "PHP");
    this.d.a(132, "PHP");
    this.d.a(137, "PHP");
    this.d.a(143, "PHP");
    this.d.a(136, "PHP");
    this.d.a(144, "PHP");
    this.d.a(142, "PHP");
    this.d.a(120, "HTML");
    this.d.a(121, "HTML");
    this.d.a(125, "HTML");
    this.d.a(114, "HTML");
    this.d.a(129, "JavaScript");
    this.d.a(105, "CSS");
    this.d.a(107, "CSS");
    this.d.a(106, "CSS");
    this.d.a(108, "CSS");
    this.d.a(109, "CSS");
    this.d.a(110, "CSS");
    this.d.a(113, "CSS");
    this.d.a(112, "CSS");
  }

  protected d a(Object paramObject1, Object paramObject2)
  {
    return (d)((Hashtable)this.b.get(paramObject1)).get(paramObject2);
  }

  public d a(int paramInt, Object paramObject)
  {
    paramInt = kc.g(paramInt);
    Object localObject = this.d.b(paramInt);
    if (localObject == null)
      return null;
    return (d)((Hashtable)this.b.get(localObject)).get(paramObject);
  }

  public void a(Object paramObject, d paramd)
  {
    ((Hashtable)this.b.get(paramObject)).put(paramd.a(), paramd);
  }

  public void b(Object paramObject1, Object paramObject2)
  {
    ((Hashtable)this.b.get(paramObject1)).remove(paramObject2);
  }

  public d[] a(int paramInt, String paramString)
  {
    paramInt = kc.g(paramInt);
    Object localObject = this.d.b(paramInt);
    if (localObject == null)
      return e;
    return a(localObject, paramString);
  }

  private d[] a(Object paramObject, String paramString)
  {
    Hashtable localHashtable = (Hashtable)this.b.get(paramObject);
    if (localHashtable == null)
      return e;
    if (paramString.equals(""))
    {
      localObject1 = new d[localHashtable.values().size()];
      return (d[])(d[])localHashtable.values().toArray(localObject1);
    }
    Object localObject1 = new ArrayList();
    Enumeration localEnumeration = localHashtable.keys();
    while (localEnumeration.hasMoreElements())
    {
      localObject2 = (String)localEnumeration.nextElement();
      if (((String)localObject2).startsWith(paramString))
        ((ArrayList)localObject1).add(localHashtable.get(localObject2));
    }
    Object localObject2 = new d[((ArrayList)localObject1).size()];
    ((ArrayList)localObject1).toArray(localObject2);
    Arrays.sort(localObject2);
    return (d)(d)localObject2;
  }

  public d[] d()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Hashtable)localIterator.next();
      localArrayList.addAll(((Hashtable)localObject).values());
    }
    Object localObject = new d[localArrayList.size()];
    return (d)(d[])(d[])localArrayList.toArray(localObject);
  }

  public static Object[] e()
  {
    return new Object[] { "PHP", "PHPDoc", "HTML", "JavaScript", "CSS" };
  }

  public boolean a(d paramd)
  {
    d[] arrayOfd = d();
    for (int i = 0; i < arrayOfd.length; i++)
    {
      d locald = arrayOfd[i];
      if (locald.equals(paramd))
        return true;
    }
    return false;
  }

  public com.zend.ide.bf.b.f a(Object paramObject)
  {
    return (com.zend.ide.bf.b.f)((Hashtable)this.c.get("general")).get(paramObject);
  }

  public com.zend.ide.bf.b.f c(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      return a(paramObject2);
    Hashtable localHashtable = (Hashtable)this.c.get(paramObject1);
    return (localHashtable != null) && (localHashtable.get(paramObject2) != null) ? (com.zend.ide.bf.b.f)localHashtable.get(paramObject2) : a(paramObject2);
  }

  public com.zend.ide.bf.b.f[] b(Object paramObject)
  {
    Hashtable localHashtable = (Hashtable)this.c.get(paramObject);
    if (localHashtable == null)
      return null;
    com.zend.ide.bf.b.f[] arrayOff = new com.zend.ide.bf.b.f[localHashtable.size()];
    return (com.zend.ide.bf.b.f[])(com.zend.ide.bf.b.f[])localHashtable.values().toArray(arrayOff);
  }

  public void f()
  {
    File localFile1 = new File(cv.d());
    File localFile2 = new File(localFile1, "templates");
    String str;
    if (!localFile2.exists())
    {
      localFile2.mkdirs();
    }
    else
    {
      localObject1 = localFile2.listFiles();
      for (int i = 0; i < localObject1.length; i++)
      {
        str = localObject1[i];
        str.delete();
      }
    }
    Object localObject1 = e();
    bf localbf = new bf();
    for (int j = 0; j < localObject1.length; j++)
    {
      Object localObject2 = localObject1[j];
      d[] arrayOfd = b().a(localObject2, "");
      localbf.a(arrayOfd);
      str = new File(localFile2, localObject2 + ".xml").getPath();
      try
      {
        com.a.f.a(str, localbf);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  private void g()
  {
    File localFile1 = new File(cv.d());
    Object[] arrayOfObject = e();
    File localFile2 = new File(localFile1, "templates");
    if ((localFile2.exists()) && (localFile2.listFiles() != null))
    {
      this.b = q.d();
      File[] arrayOfFile = localFile2.listFiles();
      for (int i = 0; i < arrayOfFile.length; i++)
      {
        File localFile3 = arrayOfFile[i];
        if (!localFile3.exists())
          return;
        int j = localFile3.getName().indexOf('.');
        String str = j != -1 ? localFile3.getName().substring(0, j) : localFile3.getName();
        str = a(str);
        try
        {
          bf localbf = (bf)com.a.f.a(localFile3.getPath());
          d[] arrayOfd = localbf.b();
          for (int k = 0; k < arrayOfObject.length; k++)
          {
            Object localObject = arrayOfObject[k];
            if (!str.equals(localObject))
              continue;
            for (int m = 0; m < arrayOfd.length; m++)
            {
              d locald = arrayOfd[m];
              ((Hashtable)this.b.get(localObject)).put(locald.a(), locald);
            }
          }
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

  private String a(String paramString)
  {
    if (paramString.equals("html"))
      return "HTML";
    if (paramString.equals("php"))
      return "PHP";
    if (paramString.equals("php_doc"))
      return "PHPDoc";
    return paramString;
  }

  static Hashtable a(r paramr)
  {
    return paramr.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.r
 * JD-Core Version:    0.6.0
 */