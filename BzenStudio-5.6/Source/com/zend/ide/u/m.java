package com.zend.ide.u;

import java.io.IOException;
import java.io.OutputStream;

class m extends OutputStream
{
  private OutputStream a;
  private String b;
  final i c;

  private m(i parami, String paramString)
    throws IOException
  {
    this.b = paramString;
    this.a = i.c(parami).i(paramString);
  }

  public void write(int paramInt)
    throws IOException
  {
    this.a.write(paramInt);
  }

  public void write(byte[] paramArrayOfByte)
    throws IOException
  {
    this.a.write(paramArrayOfByte);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void flush()
    throws IOException
  {
    this.a.flush();
  }

  public void close()
    throws IOException
  {
    this.a.close();
    this.c.a((f)this.c.g(this.b), false);
  }

  m(i parami, String paramString, cg paramcg)
    throws IOException
  {
    this(parami, paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.m
 * JD-Core Version:    0.6.0
 */