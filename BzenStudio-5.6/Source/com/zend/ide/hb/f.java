package com.zend.ide.hb;

import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import java.io.File;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class f
{
  private static y a = new y();
  private h b;
  private File c;
  private File[] d;
  private String e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private Map k = new HashMap(100);

  public void a(h paramh)
  {
    this.b = paramh;
  }

  public void a(File paramFile)
  {
    this.c = paramFile;
  }

  public void a(File[] paramArrayOfFile)
  {
    this.d = paramArrayOfFile;
  }

  public void a(String paramString)
  {
    this.e = paramString;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public void d(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public int a()
  {
    this.i = false;
    int m = b(this.c);
    this.k.clear();
    return m;
  }

  public void b()
  {
    this.i = true;
  }

  public int c()
  {
    this.i = false;
    int m = 0;
    if (this.d != null)
      m = b(this.d);
    this.k.clear();
    return m;
  }

  private int b(File[] paramArrayOfFile)
  {
    for (int m = 0; m < paramArrayOfFile.length; m++)
    {
      if ((paramArrayOfFile[m].isFile()) && (b(paramArrayOfFile[m]) == -1))
        return -1;
      if ((!paramArrayOfFile[m].isDirectory()) || (!this.j) || (f(paramArrayOfFile[m])))
        continue;
      this.b.b(paramArrayOfFile[m]);
      if (b(paramArrayOfFile[m]) == -1)
        return -1;
    }
    return 0;
  }

  private int b(File paramFile)
  {
    if (this.i)
      return -1;
    if (paramFile.isFile())
    {
      c(paramFile);
      return 0;
    }
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null)
      return 0;
    e(paramFile);
    return b(arrayOfFile);
  }

  private void c(File paramFile)
  {
    if ((!this.b.a(paramFile)) || (!paramFile.canRead()))
      return;
    this.b.a(paramFile);
    d[] arrayOfd = d(paramFile);
    if ((arrayOfd != null) && (arrayOfd.length > 0))
      this.b.a(arrayOfd);
  }

  private d[] d(File paramFile)
  {
    d[] arrayOfd = null;
    try
    {
      bh localbh = bh.a();
      Reader localReader = bh.a(paramFile, localbh);
      if (localReader == null)
        return arrayOfd;
      Object localObject1 = new char[4096];
      int m = 0;
      int n;
      while (((n = localReader.read(localObject1, m, localObject1.length - m)) != -1) && (!this.i))
      {
        m += n;
        if (n < localObject1.length - m)
          break;
        localObject2 = new char[localObject1.length << 1];
        System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
        localObject1 = localObject2;
      }
      Object localObject2 = CharBuffer.wrap(localObject1, 0, m);
      db[] arrayOfdb = a.a((CharSequence)localObject2, this.e, this.f, this.g, this.h);
      arrayOfd = a(paramFile, (CharBuffer)localObject2, arrayOfdb);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return (d)(d)arrayOfd;
  }

  private static d[] a(File paramFile, CharBuffer paramCharBuffer, db[] paramArrayOfdb)
  {
    d[] arrayOfd = new d[paramArrayOfdb.length];
    int m = 0;
    int n = 1;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i4 < arrayOfd.length; i4++)
    {
      int i5 = paramArrayOfdb[i4].b();
      int i6 = paramArrayOfdb[i4].f();
      String str1 = paramArrayOfdb[i4].g();
      if (i2 != 0)
        m++;
      i2 = 0;
      for (int i7 = m; i7 < paramArrayOfdb[i4].b(); i7++)
      {
        i8 = paramCharBuffer.get(i7);
        if (i8 == 10)
        {
          n++;
          i1 = i7 + 1;
        }
        if (i8 != 13)
          continue;
        n++;
        i1 = i7 + 1;
        if ((i7 + 1 >= paramArrayOfdb[i4].b()) || (paramCharBuffer.get(i7 + 1) != '\n'))
          continue;
        i7++;
        i3++;
      }
      for (i7 = paramArrayOfdb[i4].b(); i7 < paramCharBuffer.length(); i7++)
      {
        i8 = paramCharBuffer.get(i7);
        if (i8 == 10)
          break;
        if (i8 != 13)
          continue;
        if ((i7 + 1 >= paramCharBuffer.length()) || (paramCharBuffer.get(i7 + 1) != '\n'))
          break;
        i2 = 1;
        break;
      }
      Object localObject1 = paramCharBuffer.subSequence(i1, i7).toString();
      int i8 = i5;
      int i9 = 0;
      for (int i10 = i5; i10 > 0; i10--)
      {
        if ((paramCharBuffer.get(i10) == '\n') || (paramCharBuffer.get(i10) == '\r'))
        {
          i8 = i5 - i10 - 1 - i9;
          break;
        }
        if ((paramCharBuffer.get(i10) == '\t') || (paramCharBuffer.get(i10) == ' '))
          i9++;
        else
          i9 = 0;
      }
      i10 = 100;
      int i11 = 0;
      Object localObject2 = localObject1;
      int i12 = i8;
      if (((String)localObject1).length() > (i10 << 1) + 20)
      {
        if (((String)localObject1).charAt(0) == '\n')
          i11 = 1;
        String str2 = "...";
        int i13 = 0;
        int i14 = ((String)localObject1).length() - 1;
        if (i8 + i9 - i10 > i13)
        {
          i13 = i8 + i9 - i10;
          i12 = i10 + str2.length();
        }
        else
        {
          i12 = str2.length() + i8 + i9;
        }
        if (i8 + i9 + i10 < i14)
          i14 = i8 + i9 + i10;
        try
        {
          localObject1 = str2 + ((String)localObject1).substring(i13 + i11, i14 + i11) + str2;
        }
        catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException)
        {
          localObject1 = localObject2;
        }
      }
      arrayOfd[i4] = a(paramFile, i5 - i3, i6 - i3, str1, n, (String)localObject1, i8, i12, i9);
      m = i5 + 1;
    }
    return (d)arrayOfd;
  }

  private void e(File paramFile)
  {
    try
    {
      String str = paramFile.getCanonicalPath();
      this.k.put(str, str);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private boolean f(File paramFile)
  {
    int m = 0;
    try
    {
      String str = paramFile.getCanonicalPath();
      m = this.k.get(str) != null ? 1 : 0;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return m;
  }

  private static d a(File paramFile, int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, int paramInt4, int paramInt5, int paramInt6)
  {
    return new g(paramFile, paramInt1, paramInt2, paramString1, paramInt3, paramString2, paramInt4, paramInt5, paramInt6);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.f
 * JD-Core Version:    0.6.0
 */