package com.zend.ide.cb.a;

import java.io.IOException;
import java.sql.Clob;
import java.sql.SQLException;

public class vc
  implements xc
{
  private Clob a;

  public vc(Clob paramClob)
  {
    this.a = paramClob;
  }

  public byte[] a()
    throws SQLException, IOException
  {
    if (this.a == null)
      return new byte[0];
    return new byte[0];
  }

  public String toString()
  {
    return "[Clob]";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.vc
 * JD-Core Version:    0.6.0
 */