package com.zend.ide.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class i
  implements g
{
  private String a;
  private String b;
  private j[] c;
  private int d;
  private int e;
  private int f;

  public i(String paramString1, String paramString2, j[] paramArrayOfj, int paramInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramArrayOfj;
    this.d = paramInt;
  }

  public String a()
  {
    if (this.a == null)
      return "Enter description here...";
    return this.a;
  }

  public String b()
  {
    if (this.b == null)
      return "";
    return this.b;
  }

  public j[] a()
  {
    return this.c;
  }

  public Iterator c()
  {
    return this.c != null ? Arrays.asList(this.c).iterator() : null;
  }

  public Iterator a(int paramInt)
  {
    if (this.c == null)
      return null;
    ArrayList localArrayList = new ArrayList(this.c.length);
    for (int i = 0; i < this.c.length; i++)
    {
      j localj = this.c[i];
      if (localj.a() != paramInt)
        continue;
      localArrayList.add(localj);
    }
    return localArrayList.iterator();
  }

  public int d()
  {
    return this.d;
  }

  public void a(int paramInt)
  {
    this.e = paramInt;
  }

  public void b(int paramInt)
  {
    this.f = paramInt;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public int a()
  {
    return this.e;
  }

  public int b()
  {
    return this.f;
  }

  public boolean c(int paramInt)
  {
    return (paramInt > a()) && (paramInt <= b());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.i
 * JD-Core Version:    0.6.0
 */