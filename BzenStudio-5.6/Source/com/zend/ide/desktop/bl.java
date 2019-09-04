package com.zend.ide.desktop;

import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.j.y;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.util.bc;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.m;
import java.io.ByteArrayInputStream;
import java.io.File;

public class bl
  implements m
{
  private bw a;
  private v b;
  private static bl c = new bl();

  public static bl a()
  {
    return c;
  }

  public void a(v paramv)
  {
    this.b = paramv;
  }

  public void a(bw parambw)
  {
    this.a = parambw;
  }

  public synchronized bc a(String paramString)
  {
    return a(paramString, null);
  }

  public synchronized bc a(String paramString, File paramFile)
  {
    bc localbc = null;
    File localFile = h.m.g(paramString);
    if ((paramFile != null) || (localFile.exists()))
    {
      localObject = ((paramFile != null) && (!localFile.exists())) || (localFile.getParentFile() == null) ? paramFile : localFile.getParentFile();
      if (localObject != null)
      {
        localbc = a(new File[] { localObject }, paramString);
        if (localbc.b != null)
          return localbc;
      }
    }
    localbc = b(paramString);
    if ((localbc != null) && (localbc.b != null))
      return localbc;
    if (this.b.g() != null)
    {
      localObject = this.b.g().b();
      localbc = a(localObject, paramString);
      if (localbc.b != null)
        return localbc;
    }
    if ((localbc != null) && (localbc.b != null))
      return localbc;
    localbc = c(paramString);
    if ((localbc != null) && (localbc.b != null))
      return localbc;
    Object localObject = new bc();
    ((bc)localObject).a = paramString;
    ((bc)localObject).b = null;
    return (bc)localObject;
  }

  private bc a(File[] paramArrayOfFile, String paramString)
  {
    bc localbc = new bc();
    localbc.a = paramString;
    try
    {
      char c1 = h.m.d();
      String str1 = paramString;
      int i = 0;
      while (i != -1)
      {
        for (int j = 0; j < paramArrayOfFile.length; j++)
        {
          int k = h.m.A(paramArrayOfFile[j]).d();
          String str2;
          if (paramArrayOfFile[j].isFile())
            str2 = paramArrayOfFile[j].getParentFile().getAbsolutePath();
          else
            str2 = paramArrayOfFile[j].getAbsolutePath();
          String str3;
          if (((str1.length() > 0) && (str1.charAt(0) == c1)) || ((str2.length() > 0) && (str2.charAt(str2.length() - 1) == k)) || (str2.equals("")))
            str3 = str2 + str1;
          else
            str3 = str2 + c1 + str1;
          String str4 = h.m.a(str3);
          File localFile = h.m.g(str4);
          if (!localFile.exists())
          {
            localbc = b(str1);
            if (localbc.b != null)
              return localbc;
          }
          else
          {
            String str5 = localFile.getCanonicalPath();
            localbc = b(str5);
            if (localbc.b != null)
              return localbc;
            if (localFile.isDirectory())
              continue;
            localbc.a = str5;
            localbc.b = h.m.f(localFile);
            return localbc;
          }
        }
        i = str1.indexOf(c1);
        if (i == -1)
          continue;
        str1 = str1.substring(i + 1);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return localbc;
  }

  private bc c(String paramString)
  {
    bc localbc = new bc();
    localbc.a = paramString;
    try
    {
      String str = paramString;
      int i = 0;
      while (i != -1)
      {
        localbc = b(str);
        if (localbc.b != null)
          return localbc;
        i = str.indexOf(h.m.d());
        if (i == -1)
          continue;
        str = str.substring(i + 1);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return localbc;
  }

  public bc b(String paramString)
  {
    bc localbc = new bc();
    localbc.a = paramString;
    dz localdz = this.a.a(paramString);
    Object localObject;
    if (localdz == null)
    {
      localObject = paramString.replace(h.m.d(), '/');
      localdz = this.a.a((String)localObject);
    }
    if (localdz == null)
    {
      localObject = this.a.i();
      for (int i = 0; i < localObject.length; i++)
      {
        String str = localObject[i].k();
        if (((localObject[i] instanceof bw)) && (((bw)localObject[i]).c()))
        {
          if (!str.equals(paramString))
            continue;
          localdz = localObject[i];
          break;
        }
        if ((!str.endsWith('/' + paramString)) && (!str.endsWith("\\" + paramString)))
          continue;
        localdz = localObject[i];
        break;
      }
    }
    if (localdz != null)
    {
      localbc.a = localdz.k();
      localObject = localdz.getText();
      if (((String)localObject).equals(""))
        localObject = " ";
      bh localbh = bh.a();
      localbc.b = new ByteArrayInputStream(bh.a((String)localObject, localbh));
    }
    return (bc)localbc;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bl
 * JD-Core Version:    0.6.0
 */