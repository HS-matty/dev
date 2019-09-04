package com.zend.ide.w.c.b;

import com.zend.ide.w.bb;
import com.zend.ide.w.c.f;
import com.zend.ide.w.c.g;
import com.zend.ide.w.p;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class d
  implements a
{
  private String a;
  private String[] g;
  private String b;
  private Map c;
  private File[] d;
  private boolean e;
  protected com.zend.ide.w.c.d f;

  public d(com.zend.ide.w.c.d paramd)
  {
    this.f = paramd;
  }

  public void a(Map paramMap)
    throws y
  {
    this.c = paramMap;
  }

  public void a()
    throws y
  {
    this.f.b().a();
    String str1 = b();
    synchronized (this.f.a())
    {
      this.f.a().a(str1 + '\n', "command");
    }
    if (this.a == null)
      throw new y("Cannot execute - The Command was not initialized!");
    __x = (this instanceof x) ? d() : null;
    b localb = new b(this.f, __x);
    localb.a(System.getProperty("user.home"), this.f.c(), this.a, this.g);
    this.b = localb.a();
    String str2 = localb.b();
    this.e = ((str2 != null) && (str2.length() > 0));
    if (this.e)
      str2 = str2.toLowerCase();
    while ((this.e) && ((str2.indexOf("password") > -1) || (str2.indexOf("username") > -1)))
    {
      f localf = new f(10);
      this.f.d().a(localf);
      String str3 = localf.p();
      String str4 = localf.q();
      if ((str3 == null) || (str4 == null) || (str3.equals("")) || (str4.equals("")))
        break;
      if (this.g == null)
      {
        this.g = new String[] { "--username " + str3, "--password " + str4 };
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        for (int j = 0; j < this.g.length; j++)
          if (i == 0)
          {
            if ((this.g[j].equalsIgnoreCase("--username")) || (this.g[j].equalsIgnoreCase("--password")))
              i = 1;
            else
              localArrayList.add(this.g[j]);
          }
          else
            i = 0;
        localArrayList.add("--username");
        localArrayList.add(str3);
        localArrayList.add("--password");
        localArrayList.add(str4);
        this.g = new String[localArrayList.size()];
        localArrayList.toArray(this.g);
      }
      localb.a(System.getProperty("user.home"), this.f.c(), this.a, this.g);
      this.b = localb.a();
      str2 = localb.b();
      this.e = ((str2 != null) && (str2.length() > 0));
      if (this.e)
        str2 = str2.toLowerCase();
    }
    this.f.c(d());
  }

  private String b()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.f.c());
    localStringBuffer.append(' ');
    localStringBuffer.append(this.a);
    localStringBuffer.append(' ');
    if (this.g != null)
      for (int i = 0; i < this.g.length; i++)
      {
        localStringBuffer.append(this.g[i]);
        localStringBuffer.append(' ');
      }
    return localStringBuffer.toString();
  }

  protected void a(String paramString)
  {
    this.a = paramString;
  }

  protected void a(String[] paramArrayOfString)
  {
    this.g = paramArrayOfString;
  }

  public String a()
  {
    return this.b;
  }

  public boolean b()
  {
    return this.e;
  }

  public Map c()
  {
    return this.c;
  }

  public void a(File[] paramArrayOfFile)
  {
    this.d = paramArrayOfFile;
    if (this.c == null)
      this.c = new HashMap(5);
    if (paramArrayOfFile != null)
    {
      String[] arrayOfString = new String[paramArrayOfFile.length];
      for (int i = 0; i < paramArrayOfFile.length; i++)
        arrayOfString[i] = paramArrayOfFile[i].getAbsolutePath();
      this.c.put("TARGETS", arrayOfString);
    }
  }

  public File[] d()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.d
 * JD-Core Version:    0.6.0
 */