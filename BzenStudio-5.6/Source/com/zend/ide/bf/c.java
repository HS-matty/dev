package com.zend.ide.bf;

import com.zend.ide.b.m;
import com.zend.ide.m.l;
import com.zend.ide.s.g;
import com.zend.ide.util.cz;
import com.zend.ide.x.b;

public class c
  implements com.zend.ide.b.d, d
{
  private String a;
  private String b;
  private String c;
  private String d;
  private boolean e;

  public c(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    this.a = paramString1;
    this.d = paramString2;
    this.b = paramString3;
    this.c = paramString4;
    this.e = paramBoolean;
  }

  public String a()
  {
    return this.a;
  }

  public Object d()
  {
    return this.d;
  }

  public String b()
  {
    return this.b;
  }

  public String c()
  {
    return this.c;
  }

  public boolean e()
  {
    return false;
  }

  public m f()
  {
    return null;
  }

  public void a(cz paramcz)
  {
    if ((paramcz instanceof l))
      ((l)paramcz).a(this);
    else if ((paramcz instanceof b))
      ((b)paramcz).a(this);
    else
      ((g)paramcz).a(this);
  }

  public int compareTo(Object paramObject)
  {
    if (!(paramObject instanceof d))
      return -1;
    com.zend.ide.b.d locald = (d)paramObject;
    return this.a.compareToIgnoreCase(locald.a());
  }

  public boolean a()
  {
    return this.e;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d))
      return false;
    d locald = (d)paramObject;
    return (locald.a().equals(a())) && (locald.d().equals(d()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.c
 * JD-Core Version:    0.6.0
 */