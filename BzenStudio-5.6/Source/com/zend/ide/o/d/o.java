package com.zend.ide.o.d;

import com.zend.ide.t.r;
import com.zend.ide.util.cz;

public class o extends r
{
  private String d;
  private int e;
  private String[] f;

  public o()
  {
    super(17);
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }

  public String c()
  {
    return this.d;
  }

  public void b(int paramInt)
  {
    this.e = paramInt;
  }

  public int d()
  {
    return this.e;
  }

  public void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null)
    {
      this.f = new String[0];
      return;
    }
    this.f = new String[paramArrayOfString.length];
    System.arraycopy(paramArrayOfString, 0, this.f, 0, paramArrayOfString.length);
  }

  public String[] e()
  {
    return this.f;
  }

  public void a(cz paramcz)
    throws Exception
  {
    ((bl)paramcz).a(this);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.o
 * JD-Core Version:    0.6.0
 */