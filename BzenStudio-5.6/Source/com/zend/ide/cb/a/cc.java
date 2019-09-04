package com.zend.ide.cb.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

public class cc extends BufferedInputStream
{
  private Blob a;
  private int b;

  public cc(Blob paramBlob)
    throws SQLException
  {
    super(paramBlob.getBinaryStream());
    this.a = paramBlob;
    long l = this.a.length();
    if (l > 2147483647L)
      l = 2147483647L;
    this.b = (int)l;
  }

  public byte[] a()
    throws IOException
  {
    byte[] arrayOfByte = new byte[this.b];
    read(arrayOfByte);
    return arrayOfByte;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.cc
 * JD-Core Version:    0.6.0
 */