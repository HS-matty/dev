package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.ba;
import com.zend.ide.m.bf;
import com.zend.ide.m.bg;
import com.zend.ide.m.bh;
import java.util.ArrayList;
import java.util.List;

public class bl
{
  public static final rb a = new ub(true);
  public static final rb b = new ub(false);
  public static final rb d = new wd(true);
  public static final rb e = new rd();
  public static final rb f = new sd();
  public static final rb g = new td();
  public static final rb h = new ud();
  public static final rb i = new vd();
  public static final vb c = new tb("", "", "");

  public static d[] a(d[] paramArrayOfd, String paramString)
  {
    return a(paramArrayOfd, paramString, false);
  }

  public static d[] b(d[] paramArrayOfd, String paramString)
  {
    return a(paramArrayOfd, paramString, true);
  }

  private static d[] a(d[] paramArrayOfd, String paramString, boolean paramBoolean)
  {
    if (paramArrayOfd == null)
      paramArrayOfd = di.a;
    if ((paramString == null) || (paramString.equals("")) || (paramArrayOfd.length == 0))
      return paramArrayOfd;
    int j = a(paramArrayOfd, paramString, false, paramBoolean);
    if (j < 0)
      return di.a;
    int k = paramArrayOfd.length - 1;
    int m = paramString.length();
    for (int n = j; n < paramArrayOfd.length; n++)
    {
      localObject = paramBoolean ? ((gd)paramArrayOfd[n]).c() : paramArrayOfd[n].a();
      localObject = ((String)localObject).length() > m ? ((String)localObject).substring(0, m) : localObject;
      if (((String)localObject).compareToIgnoreCase(paramString) == 0)
        continue;
      k = n - 1;
      break;
    }
    n = k < j ? 0 : k - j + 1;
    Object localObject = new d[n];
    System.arraycopy(paramArrayOfd, j, localObject, 0, localObject.length);
    return (d)localObject;
  }

  public static int a(d[] paramArrayOfd, String paramString, boolean paramBoolean)
  {
    return a(paramArrayOfd, paramString, paramBoolean, false);
  }

  private static int a(d[] paramArrayOfd, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = paramString.length();
    if (j == 0)
    {
      if (paramBoolean1)
        return -1;
      return 0;
    }
    if ((paramArrayOfd == null) || (paramArrayOfd.length == 0))
      return -1;
    if (paramArrayOfd.length < 12)
    {
      for (k = 0; k < paramArrayOfd.length; k++)
      {
        String str1 = paramBoolean2 ? ((gd)paramArrayOfd[k]).c() : paramArrayOfd[k].a();
        if ((!paramBoolean1) && (str1.length() > j))
          str1 = str1.substring(0, j);
        if (paramString.equalsIgnoreCase(str1))
          return k;
      }
      return -1;
    }
    int k = 0;
    int m = paramArrayOfd.length - 1;
    while (k <= m)
    {
      int n = k + m >> 1;
      String str3 = paramBoolean2 ? ((gd)paramArrayOfd[n]).c() : paramArrayOfd[n].a();
      if ((!paramBoolean1) && (str3.length() > j))
        str3 = str3.substring(0, j);
      int i1 = str3.compareToIgnoreCase(paramString);
      if (i1 == 0)
      {
        k = n;
        break;
      }
      if (i1 < 0)
        k = n + 1;
      else
        m = n - 1;
    }
    if ((k < 0) || (k >= paramArrayOfd.length))
      return -1;
    String str2 = paramBoolean2 ? ((gd)paramArrayOfd[k]).c() : paramArrayOfd[k].a();
    if ((!paramBoolean1) && (str2.length() > j))
      str2 = str2.substring(0, j);
    if (!str2.equalsIgnoreCase(paramString))
      return -1;
    k--;
    while (k >= 0)
    {
      str2 = paramBoolean2 ? ((gd)paramArrayOfd[k]).c() : paramArrayOfd[k].a();
      if ((!paramBoolean1) && (str2.length() > j))
        str2 = str2.substring(0, j);
      if (!str2.equalsIgnoreCase(paramString))
        break;
      k--;
    }
    return k + 1;
  }

  public static d[] a(d[] paramArrayOfd)
  {
    if (paramArrayOfd.length < 2)
      return paramArrayOfd;
    int j = 0;
    Object localObject = paramArrayOfd[0].a();
    for (int k = 1; k < paramArrayOfd.length; k++)
    {
      String str = paramArrayOfd[k].a();
      if (((String)localObject).equals(str))
      {
        paramArrayOfd[k] = null;
        j++;
      }
      else
      {
        localObject = str;
      }
    }
    d[] arrayOfd = new d[paramArrayOfd.length - j];
    int m = 0;
    for (int n = 0; n < paramArrayOfd.length; n++)
    {
      if (paramArrayOfd[n] == null)
        continue;
      arrayOfd[m] = paramArrayOfd[n];
      m++;
    }
    return (d)arrayOfd;
  }

  public static d[] b(d[] paramArrayOfd1, d[] paramArrayOfd2)
  {
    if ((paramArrayOfd1 == null) || (paramArrayOfd1.length == 0))
      return paramArrayOfd2;
    if ((paramArrayOfd2 == null) || (paramArrayOfd2.length == 0))
      return paramArrayOfd1;
    ArrayList localArrayList = new ArrayList(paramArrayOfd1.length + paramArrayOfd2.length);
    int j = 0;
    int k = 0;
    while ((j != paramArrayOfd1.length) || (k != paramArrayOfd2.length))
    {
      if (j == paramArrayOfd1.length)
      {
        localArrayList.add(paramArrayOfd2[(k++)]);
        continue;
      }
      if (k == paramArrayOfd2.length)
      {
        localArrayList.add(paramArrayOfd1[(j++)]);
        continue;
      }
      int m = paramArrayOfd1[j].compareTo(paramArrayOfd2[k]);
      if (m == 0)
      {
        localArrayList.add(paramArrayOfd1[(j++)]);
        k++;
        continue;
      }
      if (m < 0)
        localArrayList.add(paramArrayOfd1[(j++)]);
      else
        localArrayList.add(paramArrayOfd2[(k++)]);
    }
    d[] arrayOfd = new d[localArrayList.size()];
    localArrayList.toArray(arrayOfd);
    return arrayOfd;
  }

  public static d[] a(d[] paramArrayOfd1, d[] paramArrayOfd2)
  {
    if ((paramArrayOfd1 == null) || (paramArrayOfd1.length == 0))
      return paramArrayOfd2;
    if ((paramArrayOfd2 == null) || (paramArrayOfd2.length == 0))
      return paramArrayOfd1;
    int j = paramArrayOfd1.length + paramArrayOfd2.length;
    d[] arrayOfd = new d[j];
    int k = 0;
    int m = 0;
    for (int n = 0; n < j; n++)
    {
      if (k == paramArrayOfd1.length)
      {
        System.arraycopy(paramArrayOfd2, m, arrayOfd, n, j - n);
        break;
      }
      if (m == paramArrayOfd2.length)
      {
        System.arraycopy(paramArrayOfd1, k, arrayOfd, n, j - n);
        break;
      }
      if (paramArrayOfd1[k].compareTo(paramArrayOfd2[m]) < 0)
        arrayOfd[n] = paramArrayOfd1[(k++)];
      else
        arrayOfd[n] = paramArrayOfd2[(m++)];
    }
    return arrayOfd;
  }

  public static vb a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      paramString1 = "";
    if (paramString2 == null)
      paramString2 = "";
    if ((paramString1.equals("")) && (paramString2.equals("")))
      return c;
    return new tb("", paramString1, paramString2);
  }

  public static vb a(bf parambf, int paramInt)
  {
    return a(bg.a(parambf, paramInt));
  }

  public static vb a(String paramString1, String paramString2, String paramString3)
  {
    return new tb(paramString1, paramString2, paramString3);
  }

  public static vb a(d paramd)
  {
    if (paramd == null)
      return c;
    String str1 = "";
    String str2 = "";
    String str3;
    if ((paramd instanceof bh))
    {
      bh localbh = (bh)paramd;
      str3 = localbh.a();
      ba localba = localbh.l();
      if (localba != null)
        str2 = localba.a();
    }
    else
    {
      str3 = paramd.a();
    }
    return new tb(str1, str2, str3);
  }

  public static d[] a(d[] paramArrayOfd, rb paramrb)
  {
    if ((paramArrayOfd == null) || (paramArrayOfd.length == 0))
      return paramArrayOfd;
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramArrayOfd.length; j++)
    {
      if (!paramrb.a(paramArrayOfd[j]))
        continue;
      localArrayList.add(paramArrayOfd[j]);
    }
    d[] arrayOfd = new d[localArrayList.size()];
    localArrayList.toArray(arrayOfd);
    return arrayOfd;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.bl
 * JD-Core Version:    0.6.0
 */