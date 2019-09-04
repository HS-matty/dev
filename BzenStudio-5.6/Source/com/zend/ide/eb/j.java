package com.zend.ide.eb;

import com.a.f;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.cv;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.text.DateFormatter;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class j
{
  private static j a;
  private static File b;
  private static boolean d = false;
  private static boolean e = false;
  private static Date f;
  public static String g = "user_snippets";
  private HashMap c;

  public static j a()
  {
    if (a == null)
    {
      File localFile = new File(cv.d());
      b = new File(localFile, "snippets");
      a = new j();
    }
    return a;
  }

  public static boolean a()
  {
    return a != null;
  }

  public j()
  {
    d();
    String str = bi.a("CODE_SNIPPETS_DB_UPDATE");
    if ((str != null) && (str.length() > 0))
      try
      {
        f = (Date)new DateFormatter(new SimpleDateFormat("M/d/yy")).stringToValue(str);
      }
      catch (ParseException localParseException)
      {
        cl.a(localParseException);
      }
  }

  public Iterator b()
  {
    return this.c.keySet().iterator();
  }

  public String[] b()
  {
    Iterator localIterator = b();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      if (!localObject.equals(g))
        localArrayList.add(localObject);
    }
    Object localObject = new String[localArrayList.size()];
    localArrayList.toArray(localObject);
    return (String)localObject;
  }

  public String[] a(String paramString)
  {
    HashMap localHashMap = (HashMap)this.c.get(paramString);
    String[] arrayOfString = new String[localHashMap.size()];
    localHashMap.keySet().toArray(arrayOfString);
    return arrayOfString;
  }

  public Iterator a(String paramString1, String paramString2)
  {
    ArrayList localArrayList = (ArrayList)((HashMap)this.c.get(paramString1)).get(paramString2);
    if (localArrayList != null)
      return localArrayList.iterator();
    return null;
  }

  public a[] a(String paramString1, String paramString2)
  {
    try
    {
      ArrayList localArrayList = (ArrayList)((HashMap)this.c.get(paramString1)).get(paramString2);
      if (localArrayList == null)
      {
        b(paramString1, paramString2);
        localArrayList = (ArrayList)((HashMap)this.c.get(paramString1)).get(paramString2);
        if (localArrayList == null)
          return null;
      }
      if (localArrayList.isEmpty())
      {
        localObject = new File(b, paramString1);
        File localFile = new File((File)localObject, paramString2 + ".xml");
        if (localFile.exists())
          b(localFile.getPath());
      }
      Object localObject = new a[localArrayList.size()];
      localArrayList.toArray(localObject);
      return localObject;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return (a)null;
  }

  public a[] a()
  {
    try
    {
      ArrayList localArrayList = (ArrayList)((HashMap)this.c.get(g)).get(g);
      a[] arrayOfa = new a[localArrayList.size()];
      localArrayList.toArray(arrayOfa);
      return arrayOfa;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  public void a(a parama)
  {
    ((ArrayList)((HashMap)this.c.get(g)).get(g)).add(parama);
  }

  public boolean a(String paramString)
  {
    Iterator localIterator = a(g, g);
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.a().equals(paramString))
        return ((ArrayList)((HashMap)this.c.get(g)).get(g)).remove(locala);
    }
    return false;
  }

  public boolean c()
  {
    e = true;
    try
    {
      String str1 = w.a();
      if ((str1 == null) || (str1.length() == 0))
        return false;
      if (!b.exists())
        b.mkdirs();
      File localFile1 = new File(b, "main.xml");
      FileWriter localFileWriter = new FileWriter(localFile1);
      localFileWriter.write(str1);
      localFileWriter.flush();
      localFileWriter.close();
      e();
      this.c.clear();
      i();
      c(localFile1.getPath());
      String[] arrayOfString1 = b();
      for (int i = 0; (i < arrayOfString1.length) && (e); i++)
      {
        String str2 = arrayOfString1[i];
        String[] arrayOfString2 = a(str2);
        File localFile2 = new File(b, str2);
        if (!localFile2.exists())
          localFile2.mkdirs();
        for (int j = 0; (j < arrayOfString2.length) && (e); j++)
        {
          String str3 = arrayOfString2[j];
          String str4 = w.a(str2, str3);
          File localFile3 = new File(localFile2, str3 + ".xml");
          localFileWriter = new FileWriter(localFile3);
          localFileWriter.write(str4);
          localFileWriter.flush();
          localFileWriter.close();
        }
      }
    }
    catch (Exception localException)
    {
      e = false;
      cl.a(localException);
      return false;
    }
    if (!e)
      return false;
    try
    {
      f = new Date();
      bi.b("CODE_SNIPPETS_DB_UPDATE", new DateFormatter(new SimpleDateFormat("M/d/yy")).valueToString(f));
    }
    catch (ParseException localParseException)
    {
      cl.a(localParseException);
    }
    d();
    d = false;
    e = false;
    return true;
  }

  public void f()
  {
    e = false;
    d();
  }

  private void d()
  {
    try
    {
      this.c = new HashMap();
      if (!b.exists())
      {
        b.mkdirs();
        g();
        d = true;
        bi.b("CODE_SNIPPETS_DB_UPDATE", "");
      }
      h();
      i();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void e()
  {
    File localFile = new File(b, "user_snippets.xml");
    if (!b.exists())
      b.mkdirs();
    else if (localFile.exists())
      localFile.delete();
    String str = f();
    try
    {
      FileWriter localFileWriter = new FileWriter(localFile);
      localFileWriter.write(str);
      localFileWriter.flush();
      localFileWriter.close();
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private String f()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
    localStringBuffer.append("<user_snippets>\n");
    a[] arrayOfa = a();
    for (int i = 0; i < arrayOfa.length; i++)
    {
      a locala = arrayOfa[i];
      localStringBuffer.append("<snippet ");
      localStringBuffer.append("name=\"");
      localStringBuffer.append(f.b(locala.a()));
      localStringBuffer.append("\" author=\"");
      localStringBuffer.append(f.b(locala.b()));
      localStringBuffer.append("\" date_modified=\"");
      localStringBuffer.append(locala.d());
      localStringBuffer.append("\" date_entered=\"");
      localStringBuffer.append(locala.c());
      localStringBuffer.append("\" rating=\"");
      localStringBuffer.append(locala.e());
      localStringBuffer.append("\">\n");
      localStringBuffer.append("<description>");
      localStringBuffer.append(f.b(locala.g()));
      localStringBuffer.append("</description>\n");
      localStringBuffer.append("<code>");
      localStringBuffer.append(f.b(locala.f()));
      localStringBuffer.append("</code>\n");
      localStringBuffer.append("</snippet>\n");
    }
    localStringBuffer.append("</user_snippets>");
    return localStringBuffer.toString();
  }

  private void g()
  {
    File localFile = new File(bi.a("SNIPPETS_DB", "./snippets"));
    if (localFile.exists())
      cv.b(localFile.getPath(), cv.d() + File.separator + "snippets");
  }

  public Object b(String paramString)
    throws SAXException, ParserConfigurationException, IOException
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    v localv = new v(this);
    localSAXParser.parse(new InputSource(new FileReader(paramString)), localv);
    return null;
  }

  public Object c(String paramString)
    throws SAXException, ParserConfigurationException, IOException
  {
    SAXParser localSAXParser = SAXParserFactory.newInstance().newSAXParser();
    u localu = new u(this);
    localSAXParser.parse(new InputSource(new FileReader(paramString)), localu);
    return null;
  }

  public void h()
  {
    File localFile = new File(b, "main.xml");
    if (!localFile.exists())
    {
      g();
      d = true;
    }
    try
    {
      c(localFile.getPath());
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

  public void b(String paramString1, String paramString2)
  {
    File localFile1 = new File(b, paramString1);
    File localFile2 = new File(localFile1, paramString2 + ".xml");
    try
    {
      b(localFile2.getPath());
    }
    catch (SAXException localSAXException)
    {
      cl.a("unable to load snippets : " + paramString1 + "->" + paramString2);
    }
    catch (ParserConfigurationException localParserConfigurationException)
    {
      cl.a("unable to load snippets : " + paramString1 + "->" + paramString2);
    }
    catch (IOException localIOException)
    {
      cl.a("unable to load snippets : " + paramString1 + "->" + paramString2);
    }
  }

  public void i()
  {
    File localFile = new File(b, "user_snippets.xml");
    if (localFile.exists())
    {
      try
      {
        b(localFile.getPath());
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
    else
    {
      this.c.put(g, new HashMap());
      ((HashMap)this.c.get(g)).put(g, new ArrayList(0));
    }
  }

  public boolean g()
  {
    int i = 0;
    long l = 2592000000L;
    if ((f == null) || (System.currentTimeMillis() - f.getTime() >= l))
      i = 1;
    return (d) || (i != 0);
  }

  static HashMap a(j paramj)
  {
    return paramj.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.j
 * JD-Core Version:    0.6.0
 */