package com.zend.ide.f;

import com.zend.ide.m.bd;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.g;
import com.zend.ide.m.j;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class md
  implements bn
{
  private String a = "";
  private List b = new ArrayList(3000);
  private List c = new ArrayList();
  private List d = new ArrayList();
  private List e = new ArrayList();
  private List f = new ArrayList(2000);
  private List g = new ArrayList();

  private md()
  {
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramString2 = paramString2.substring(1);
    this.g.add(di.a(paramString2, null, paramBoolean1, paramBoolean2, paramString1, paramString3));
  }

  public void a(String paramString, int paramInt)
  {
    this.a = paramString;
  }

  private static bi a(bi[] paramArrayOfbi, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return null;
    if (paramString.charAt(0) == '&')
      paramString = paramString.substring(1);
    if (paramString.charAt(0) == '$')
      paramString = paramString.substring(1);
    for (int i = 0; i < paramArrayOfbi.length; i++)
      if (paramString.equalsIgnoreCase(paramArrayOfbi[i].a()))
        return paramArrayOfbi[i];
    return null;
  }

  public void a(String paramString)
  {
  }

  public void a(String paramString, boolean paramBoolean, int paramInt1, g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
    bi[] arrayOfbi = new bi[this.g.size()];
    this.g.toArray(arrayOfbi);
    this.g.clear();
    String str1 = null;
    if (paramg != null)
    {
      localObject1 = paramg.a(7);
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (j)((Iterator)localObject1).next();
        String str2 = ((j)localObject2).a().trim();
        String[] arrayOfString = str2.split(" ");
        String str3 = null;
        String str4 = null;
        int i = arrayOfString.length > 2 ? 2 : arrayOfString.length;
        for (int j = 0; j < i; j++)
          if (arrayOfString[j].startsWith("$"))
            str3 = arrayOfString[j];
          else
            str4 = arrayOfString[j];
        if (str3 == null)
          str3 = arrayOfString[0];
        bi localbi = a(arrayOfbi, str3);
        if (localbi == null)
        {
          str4 = arrayOfString[0];
          str3 = arrayOfString.length > 1 ? arrayOfString[1] : null;
          localbi = a(arrayOfbi, str4);
        }
        if ((localbi != null) && (str4 != null) && (str4.length() > 0))
        {
          String str5 = localbi.g();
          if ((str5 == null) || (str5.length() == 0))
            localbi.a(str4);
        }
      }
      Object localObject2 = paramg.a(6);
      str1 = ((Iterator)localObject2).hasNext() ? ((j)((Iterator)localObject2).next()).a() : null;
    }
    if (str1 == null)
      if ((paramBoolean) && (paramString.equals(this.a)))
        str1 = this.a;
      else
        str1 = "void";
    Object localObject1 = di.a(paramString, paramInt1, paramg, null, arrayOfbi, str1);
    if (paramBoolean)
      this.d.add(localObject1);
    else
      this.b.add(localObject1);
  }

  public void a(String paramString, boolean paramBoolean, int paramInt)
  {
  }

  public void a(String paramString1, int paramInt1, String paramString2, String paramString3, g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
    y localy;
    if (paramString2 != null)
    {
      int i = paramString2.indexOf(']');
      paramString2 = paramString2.substring(i + 1);
      localy = di.a(paramString2, null);
    }
    else
    {
      localy = di.a(paramString2, null);
    }
    w[] arrayOfw;
    if (paramString3 != null)
    {
      localObject = paramString3.split(",");
      arrayOfw = new w[localObject.length];
      for (int j = 0; j < localObject.length; j++)
      {
        String str = localObject[j];
        int k = str.indexOf(']');
        str = str.substring(k + 1);
        arrayOfw[j] = di.b(str, null);
      }
    }
    else
    {
      arrayOfw = di.h;
    }
    Object localObject = di.a(paramString1, paramInt1, null, null, localy, arrayOfw, di.g, di.j, di.c);
    this.e.add(localObject);
  }

  public void c(String paramString, int paramInt)
  {
    if (this.e.size() > 0)
    {
      cd localcd = (cd)this.e.get(this.e.size() - 1);
      if (localcd.a().equals(paramString))
      {
        z[] arrayOfz = new z[this.c.size()];
        this.c.toArray(arrayOfz);
        Arrays.sort(arrayOfz);
        bh[] arrayOfbh = new bh[this.d.size()];
        this.d.toArray(arrayOfbh);
        Arrays.sort(arrayOfbh);
        for (int i = 0; i < arrayOfz.length; i++)
          ((dg)arrayOfz[i]).a(localcd);
        for (i = 0; i < arrayOfbh.length; i++)
          ((cl)arrayOfbh[i]).a(localcd);
        localcd.a(arrayOfbh);
        localcd.a(arrayOfz);
      }
    }
    this.c.clear();
    this.d.clear();
    this.a = "";
  }

  public void a(String paramString, int paramInt1, g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(String paramString, g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void a(String paramString, g paramg, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void b()
  {
  }

  public void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public void b(String paramString, int paramInt)
  {
  }

  public void c(String paramString)
  {
  }

  public void d(String paramString)
  {
  }

  public void a(int paramInt1, int paramInt2)
  {
    bh[] arrayOfbh = new bh[this.b.size()];
    this.b.toArray(arrayOfbh);
    Arrays.sort(arrayOfbh);
    kd.a(arrayOfbh);
    for (int i = 0; i < arrayOfbh.length; i++)
      kd.h().put(arrayOfbh[i].a(), arrayOfbh[i]);
    v[] arrayOfv = new v[this.e.size()];
    this.e.toArray(arrayOfv);
    Arrays.sort(arrayOfv);
    kd.a(arrayOfv);
    for (int j = 0; j < arrayOfv.length; j++)
      kd.i().put(arrayOfv[j].a(), arrayOfv[j]);
    bd[] arrayOfbd = new bd[this.f.size()];
    this.f.toArray(arrayOfbd);
    Arrays.sort(arrayOfbd);
    kd.a(arrayOfbd);
  }

  public void a(String paramString1, String paramString2, g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramString1.startsWith("\"")) || (paramString1.startsWith("'")))
      paramString1 = paramString1.substring(1);
    if ((paramString1.endsWith("\"")) || (paramString1.endsWith("'")))
      paramString1 = paramString1.substring(0, paramString1.length() - 1);
    this.f.add(di.a(paramString1, paramString2, null, paramg));
  }

  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void a(int paramInt1, String paramString, short[] paramArrayOfShort, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void b(int paramInt1, int paramInt2)
  {
  }

  public void c(int paramInt1, int paramInt2)
  {
  }

  public void a(g paramg)
  {
  }

  md(ld paramld)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.md
 * JD-Core Version:    0.6.0
 */