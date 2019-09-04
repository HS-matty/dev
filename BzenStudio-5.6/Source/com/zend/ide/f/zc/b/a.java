package com.zend.ide.f.zc.b;

import com.zend.ide.f.zc.a.b;
import java.util.ArrayList;
import java.util.List;

public class a
  implements d
{
  protected d[] a;
  protected final com.zend.ide.f.zc.a.a b;
  protected final String c;

  public a(String paramString, d[] paramArrayOfd)
  {
    if ((!d) && (paramArrayOfd == null))
      throw new AssertionError();
    this.c = paramString;
    this.a = new d[paramArrayOfd.length];
    System.arraycopy(paramArrayOfd, 0, this.a, 0, paramArrayOfd.length);
    b[] arrayOfb = new b[paramArrayOfd.length];
    for (int i = 0; i < paramArrayOfd.length; i++)
    {
      d locald = paramArrayOfd[i];
      arrayOfb[i] = locald.a();
    }
    this.b = new com.zend.ide.f.zc.a.a(arrayOfb);
  }

  public b a()
  {
    return this.b;
  }

  public Class[] a(String[] paramArrayOfString)
    throws ClassNotFoundException
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      if ((d) || (paramArrayOfString[j] != null))
        continue;
      throw new AssertionError();
    }
    String[] arrayOfString = new String[i];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, i);
    Class[] arrayOfClass1 = new Class[i];
    int k = 0;
    for (int m = 0; (m < this.a.length) && (k != i); m++)
    {
      if (this.a[m] == null)
        continue;
      b localb = this.a[m].a();
      ArrayList localArrayList = new ArrayList();
      for (int n = 0; n < i; n++)
      {
        if ((arrayOfString[n] == null) || (!localb.d(paramArrayOfString[n])))
          continue;
        localArrayList.add(arrayOfString[n]);
        arrayOfString[n] = null;
      }
      if (localArrayList.size() <= 0)
        continue;
      Class[] arrayOfClass2 = this.a[m].a((String[])(String[])localArrayList.toArray(new String[localArrayList.size()]));
      System.arraycopy(arrayOfClass2, 0, arrayOfClass1, k, arrayOfClass2.length);
      k += localArrayList.size();
    }
    if (k != i)
      throw new ClassNotFoundException();
    return arrayOfClass1;
  }

  public void a(int paramInt, d paramd)
  {
    this.a[paramInt] = paramd;
    this.b.a(paramInt, paramd.a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.zc.b.a
 * JD-Core Version:    0.6.0
 */