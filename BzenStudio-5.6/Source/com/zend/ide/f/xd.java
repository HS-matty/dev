package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.m.u;
import com.zend.ide.util.cz;

public class xd
  implements d
{
  private static final long serialVersionUID = -7274728379618271188L;
  public final String a;
  public final char b;
  static final boolean c = !cj.class.desiredAssertionStatus();
  final cj d;

  public xd(cj paramcj, String paramString, char paramChar)
  {
    this.a = paramString;
    this.b = paramChar;
  }

  public void a(cz paramcz)
  {
    if ((!c) && (!(paramcz instanceof u)))
      throw new AssertionError();
    ((u)paramcz).a(this);
  }

  public String b()
  {
    return this.a;
  }

  public String a()
  {
    int i = this.a.lastIndexOf('.');
    if (i == -1)
      return this.a;
    return this.a.substring(i + 1);
  }

  public m f()
  {
    return null;
  }

  public boolean e()
  {
    return false;
  }

  public int compareTo(Object paramObject)
  {
    if (this == paramObject)
      return 0;
    if (paramObject == null)
      return 1;
    if (getClass() != paramObject.getClass())
      return 1;
    xd localxd = (xd)paramObject;
    if (this.a == null)
      this.a.compareTo(localxd.a);
    return 1;
  }

  public String toString()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.xd
 * JD-Core Version:    0.6.0
 */