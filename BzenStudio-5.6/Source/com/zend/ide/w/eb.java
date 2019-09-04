package com.zend.ide.w;

import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.j.y;
import com.zend.ide.l.be;
import com.zend.ide.l.l;
import com.zend.ide.l.u;
import com.zend.ide.util.cl;
import com.zend.ide.util.cv;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class eb
{
  private static final File a;
  private ArrayList b;
  private ArrayList c;
  private HashMap d;
  private y e;
  private HashMap f;

  public eb(u paramu)
  {
    this.e = ((be)((l)paramu.d().get("project_roots")).b()).b();
    this.b = new ArrayList();
    this.c = new ArrayList();
    this.d = new HashMap();
  }

  public boolean a(String paramString)
  {
    try
    {
      String str = a(new File(paramString).getName(), paramString);
      FileInputStream localFileInputStream = new FileInputStream(new File(a, str));
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localFileInputStream, 2048);
      ObjectInputStream localObjectInputStream = new ObjectInputStream(localBufferedInputStream);
      c.b().d().a("Loading source control data");
      this.b = ((ArrayList)localObjectInputStream.readObject());
      this.c = ((ArrayList)localObjectInputStream.readObject());
      this.d = ((HashMap)localObjectInputStream.readObject());
      c.b().d().b("Loading source control data");
      Runtime.getRuntime().gc();
      localObjectInputStream.close();
      localBufferedInputStream.close();
      localFileInputStream.close();
      return true;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      return false;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  public void a(Object paramObject)
  {
    try
    {
      File localFile = new File(paramObject.toString());
      FileOutputStream localFileOutputStream = new FileOutputStream(new File(a, a(localFile.getName(), localFile.getPath())));
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(localFileOutputStream, 2048);
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localBufferedOutputStream);
      localObjectOutputStream.writeObject(this.b);
      localObjectOutputStream.writeObject(this.c);
      localObjectOutputStream.writeObject(this.d);
      localObjectOutputStream.flush();
      localObjectOutputStream.close();
      localFileOutputStream.close();
      localBufferedOutputStream.close();
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    Runtime.getRuntime().gc();
  }

  public void b(Object paramObject)
  {
    a();
    File localFile = new File(paramObject.toString());
    new File(a, a(localFile.getName(), localFile.getPath())).delete();
  }

  public void b(String paramString)
  {
    if (!this.b.contains(paramString))
    {
      this.b.add(paramString);
      c(paramString);
    }
  }

  private void c(String paramString)
  {
    File localFile1 = new File(paramString);
    int i = 0;
    File localFile2;
    while (((localFile2 = localFile1.getParentFile()) != null) && (i == 0))
    {
      if (this.e.m(localFile2))
        i = 1;
      localFile1 = localFile1.getParentFile();
      String str = localFile2.getPath();
      if (!this.d.containsKey(str))
      {
        this.d.put(str, new Integer(1));
        continue;
      }
      Integer localInteger = (Integer)this.d.get(str);
      this.d.put(str, Integer.valueOf(localInteger.intValue() + 1));
    }
  }

  public void d(String paramString)
  {
    File localFile = new File(paramString);
    if (this.f != null)
      this.f.remove(paramString);
    if (localFile.isDirectory())
    {
      g(paramString);
      f(paramString);
      e(paramString);
    }
    else
    {
      this.b.remove(paramString);
      g(paramString);
    }
  }

  private void e(String paramString)
  {
    String[] arrayOfString = new String[this.d.size()];
    this.d.keySet().toArray(arrayOfString);
    for (int i = 0; i < arrayOfString.length; i++)
    {
      if (!arrayOfString[i].startsWith(paramString))
        continue;
      d(arrayOfString[i]);
    }
  }

  private void f(String paramString)
  {
    for (int i = 0; i < this.b.size(); i++)
    {
      String str = (String)this.b.get(i);
      if (!str.startsWith(paramString))
        continue;
      this.b.remove(str);
      if (this.f == null)
        continue;
      this.f.remove(paramString);
    }
  }

  private void g(String paramString)
  {
    File localFile1 = new File(paramString);
    if ((localFile1.isDirectory()) && (this.d.containsKey(paramString)))
      h(paramString);
    int i = 0;
    File localFile2;
    while (((localFile2 = localFile1.getParentFile()) != null) && (i == 0))
    {
      if (this.e.m(localFile2))
        i = 1;
      localFile1 = localFile1.getParentFile();
      String str = localFile2.getPath();
      h(str);
    }
  }

  private void h(String paramString)
  {
    Integer localInteger1 = (Integer)this.d.get(paramString);
    if ((localInteger1 != null) && (localInteger1.intValue() == 1))
    {
      this.d.remove(paramString);
      if (this.f != null)
        this.f.remove(paramString);
    }
    else if (localInteger1 != null)
    {
      Integer localInteger2 = (Integer)this.d.get(paramString);
      this.d.put(paramString, Integer.valueOf(localInteger2.intValue() - 1));
    }
  }

  public HashMap a(File[] paramArrayOfFile, HashMap paramHashMap)
  {
    this.f = paramHashMap;
    for (int i = 0; i < paramArrayOfFile.length; i++)
      d(paramArrayOfFile[i].getPath());
    return this.f;
  }

  public boolean i(String paramString)
  {
    return this.b.contains(paramString);
  }

  public boolean j(String paramString)
  {
    return this.d.containsKey(paramString);
  }

  public boolean k(String paramString)
  {
    return this.c.contains(paramString);
  }

  public void a()
  {
    this.b.clear();
    this.d.clear();
  }

  private String a(String paramString1, String paramString2)
  {
    try
    {
      int i = paramString1.lastIndexOf('.');
      String str1 = i != -1 ? paramString1.substring(0, i) : paramString1;
      String str2 = ".vcsCache";
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      return str1 + "_" + a(localMessageDigest.digest(paramString2.getBytes())) + str2;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return null;
  }

  private String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayOfByte.length; i++)
      localStringBuffer.append(Integer.toHexString(paramArrayOfByte[i] & 0xFF | 0x100).substring(1, 3));
    return localStringBuffer.toString();
  }

  public void a(File paramFile)
  {
    this.c.add(paramFile.getPath());
  }

  static
  {
    File localFile = new File(cv.d());
    a = new File(localFile, "caches");
    if (!a.exists())
      a.mkdirs();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.eb
 * JD-Core Version:    0.6.0
 */