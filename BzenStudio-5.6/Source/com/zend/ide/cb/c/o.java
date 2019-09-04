package com.zend.ide.cb.c;

import com.zend.ide.cb.l;
import com.zend.ide.cb.m;
import java.sql.SQLException;

public class o extends i
  implements m
{
  private l g;
  private String h;
  private String i;

  public o(String paramString, h paramh, l paraml)
  {
    super(paramString, paraml.c(), paramh);
    this.g = paraml;
  }

  public void d()
    throws SQLException
  {
  }

  public void a(String paramString)
  {
    this.h = paramString;
  }

  public void b(String paramString)
  {
    this.i = paramString;
  }

  public String toString()
  {
    String str = a();
    if (this.h != null)
      str = str + " (" + this.h + ')';
    if (this.i != null)
      str = '[' + this.i + "] " + str;
    return str;
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof m)))
      return false;
    return a().equals(((m)paramObject).a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.o
 * JD-Core Version:    0.6.0
 */