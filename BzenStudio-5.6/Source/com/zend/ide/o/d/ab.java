package com.zend.ide.o.d;

import com.zend.ide.t.r;
import com.zend.ide.util.cz;

public class ab extends r
{
  private String d;
  private String e;
  private int f;
  private String[] g;

  public ab()
  {
    super(22);
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }

  public String a()
  {
    return this.d;
  }

  public void b(String paramString)
  {
    this.e = paramString;
  }

  public String b()
  {
    return this.e;
  }

  public void b(int paramInt)
  {
    this.f = paramInt;
  }

  public int c()
  {
    return this.f;
  }

  public void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null)
    {
      this.g = new String[0];
      return;
    }
    this.g = new String[paramArrayOfString.length];
    System.arraycopy(paramArrayOfString, 0, this.g, 0, paramArrayOfString.length);
  }

  public String[] d()
  {
    return this.g;
  }

  public void a(cz paramcz)
    throws Exception
  {
    ((bl)paramcz).a(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.ab
 * JD-Core Version:    0.6.0
 */