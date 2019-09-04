package com.zend.ide.cb.c;

import com.zend.ide.cb.j;
import java.sql.SQLException;

public class l extends i
  implements j
{
  private com.zend.ide.cb.i g;
  private String h;

  public l(String paramString, h paramh, com.zend.ide.cb.i parami)
  {
    super(paramString, parami.c(), paramh);
    this.g = parami;
  }

  public void d()
    throws SQLException
  {
  }

  public String b()
  {
    return this.h;
  }

  public void a(String paramString)
  {
    this.h = paramString;
  }

  public String toString()
  {
    return a() + ' ' + b();
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof j)))
      return false;
    return a().equals(((j)paramObject).a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.l
 * JD-Core Version:    0.6.0
 */