package com.zend.ide.cb.a;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

public class rc
  implements xc
{
  private Blob a;

  public rc(Blob paramBlob)
  {
    this.a = paramBlob;
  }

  public byte[] a()
    throws SQLException, IOException
  {
    if (this.a == null)
      return new byte[0];
    return new cc(this.a).a();
  }

  public String toString()
  {
    return "[Blob]";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.rc
 * JD-Core Version:    0.6.0
 */