package com.zend.ide.cb.c;

import java.sql.ResultSet;
import java.sql.SQLException;

public class k extends i
  implements com.zend.ide.cb.h
{
  private com.zend.ide.cb.v g;
  private boolean h;

  public k(String paramString, h paramh, com.zend.ide.cb.v paramv)
  {
    super(paramString, paramv.c(), paramh);
    this.g = paramv;
  }

  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public boolean b()
  {
    return this.h;
  }

  public ResultSet c()
    throws SQLException
  {
    return this.c.g().a(this);
  }

  public com.zend.ide.cb.v a()
  {
    return this.g;
  }

  public void d()
  {
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof com.zend.ide.cb.h)))
      return false;
    return a().equals(((com.zend.ide.cb.h)paramObject).a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.k
 * JD-Core Version:    0.6.0
 */