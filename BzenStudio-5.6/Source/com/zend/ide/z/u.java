package com.zend.ide.z;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.io.Serializable;
import java.util.ArrayList;

public class u
  implements Serializable, cu
{
  private String a = "";
  private String b = "";
  private String j = "";
  private String c = "";
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private ArrayList h = new ArrayList();
  private int i = 1000000;

  public void e(String paramString)
  {
    this.j = paramString;
  }

  public String h()
  {
    String str1 = "original_url=";
    String str2 = "";
    if (this.b.indexOf(str1) != -1)
      str2 = this.b.substring(this.b.indexOf(str1) + str1.length());
    else if (this.j.indexOf(str1) != -1)
      str2 = this.j.substring(this.j.indexOf(str1) + str1.length());
    if (str2.equals(""))
      str2 = ct.a(1045);
    return str2;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String b()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public String c()
  {
    return this.c;
  }

  public void c(String paramString)
  {
    this.c = paramString;
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
  }

  public void b(int paramInt)
  {
    this.e = paramInt;
  }

  public int d()
  {
    return this.g;
  }

  public void c(int paramInt)
  {
    this.g = paramInt;
  }

  public void d(String paramString)
  {
    this.h.add(paramString);
  }

  public void d(int paramInt)
  {
    this.f = paramInt;
  }

  public double e()
  {
    double d1 = (this.d * this.i + this.e) / this.i;
    return d1;
  }

  public double g()
  {
    return e() * 1000.0D;
  }

  public String[] f()
  {
    String[] arrayOfString = new String[this.h.size()];
    this.h.toArray(arrayOfString);
    return arrayOfString;
  }

  public void f(String paramString)
  {
    for (int k = 0; k < this.h.size(); k++)
    {
      String str = (String)this.h.get(k);
      if (!str.endsWith(paramString))
        continue;
      this.h.remove(k);
      this.g -= 1;
      break;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.u
 * JD-Core Version:    0.6.0
 */