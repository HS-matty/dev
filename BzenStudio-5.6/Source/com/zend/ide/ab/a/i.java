package com.zend.ide.ab.a;

import java.io.IOException;

public class i
  implements h
{
  private byte[] a;
  private int b;

  public i(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    this.b = 0;
  }

  public long b()
    throws IOException
  {
    return this.a.length;
  }

  public int b()
    throws IOException
  {
    if (this.b < b())
    {
      int i = this.a[(this.b++)];
      if (i < 0)
        i += 128;
      return i;
    }
    return -1;
  }

  public void a(byte[] paramArrayOfByte)
    throws IOException
  {
    int i = (int)b() - this.b;
    if (paramArrayOfByte.length <= i)
    {
      System.arraycopy(this.a, this.b, paramArrayOfByte, 0, paramArrayOfByte.length);
      this.b += paramArrayOfByte.length;
    }
    else
    {
      System.arraycopy(this.a, this.b, paramArrayOfByte, 0, i);
      this.b = this.a.length;
      throw new c("Could not fill the buffer completely");
    }
  }

  public void a(long paramLong)
    throws IOException
  {
    this.b = (int)paramLong;
  }

  public void c()
    throws IOException
  {
    this.a = new byte[0];
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ab.a.i
 * JD-Core Version:    0.6.0
 */