package com.zend.ide.util.b;

import com.zend.ide.bd.c;
import com.zend.ide.be.k;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.f.xc;
import com.zend.ide.m.bf;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e
{
  public static e a;
  private static File b;

  public static e a()
  {
    if (a == null)
    {
      File localFile = new File(cv.d());
      b = new File(localFile, "caches");
      if (!b.exists())
        b.mkdirs();
      a = new e();
    }
    return a;
  }

  public void a(String paramString)
  {
    String str = a(new File(paramString).getName(), paramString);
    File localFile = new File(b, str);
    if (localFile.exists())
      localFile.delete();
  }

  public s b(String paramString)
  {
    Runtime.getRuntime().gc();
    try
    {
      String str = a(new File(paramString).getName(), paramString);
      FileInputStream localFileInputStream = new FileInputStream(new File(b, str));
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localFileInputStream, 2048);
      DataInputStream localDataInputStream = new DataInputStream(localBufferedInputStream);
      int i = localDataInputStream.readInt();
      Object localObject = null;
      s locals = bp.d().b();
      if (i == 80905)
      {
        c.b().d().a(ct.a(1781));
        bf[] arrayOfbf = xc.a(localDataInputStream);
        for (int j = 0; j < arrayOfbf.length; j++)
        {
          bf localbf = arrayOfbf[j];
          locals.a(localbf);
        }
        c.b().d().b(ct.a(1781));
        Runtime.getRuntime().gc();
        return locals;
      }
      localDataInputStream.close();
      localBufferedInputStream.close();
      localFileInputStream.close();
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return null;
  }

  public void b(Object paramObject)
  {
    try
    {
      s locals = bp.d().b();
      a[] arrayOfa = locals.a();
      File localFile = new File(paramObject.toString());
      FileOutputStream localFileOutputStream = new FileOutputStream(new File(b, a(localFile.getName(), localFile.getPath())));
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(localFileOutputStream, 2048);
      DataOutputStream localDataOutputStream = new DataOutputStream(localBufferedOutputStream);
      localDataOutputStream.writeInt(80905);
      xc.a(arrayOfa, localDataOutputStream);
      localDataOutputStream.flush();
      localDataOutputStream.close();
      localFileOutputStream.close();
      localBufferedOutputStream.close();
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
    Runtime.getRuntime().gc();
  }

  private String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayOfByte.length; i++)
      localStringBuffer.append(Integer.toHexString(paramArrayOfByte[i] & 0xFF | 0x100).substring(1, 3));
    return localStringBuffer.toString();
  }

  private String a(String paramString1, String paramString2)
  {
    try
    {
      int i = paramString1.lastIndexOf('.');
      String str1 = i != -1 ? paramString1.substring(0, i) : paramString1;
      String str2 = ".zpjCache";
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      return str1 + "_" + a(localMessageDigest.digest(paramString2.getBytes())) + str2;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.b.e
 * JD-Core Version:    0.6.0
 */