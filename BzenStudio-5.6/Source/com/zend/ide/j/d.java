package com.zend.ide.j;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

class d extends OutputStream
{
  private OutputStream a;
  private File b;
  private boolean d;
  final g c;

  d(g paramg, s params, File paramFile, boolean paramBoolean)
    throws IOException
  {
    this.d = paramBoolean;
    this.b = paramFile;
    boolean bool = paramFile.exists();
    this.a = params.b(this.b, paramBoolean);
    if ((paramBoolean) && (!bool))
      paramg.v(paramFile);
  }

  d(g paramg, s params, String paramString, boolean paramBoolean)
    throws IOException
  {
    this(paramg, params, paramg.g(paramString), paramBoolean);
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
    if (this.d)
      this.c.x(this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.d
 * JD-Core Version:    0.6.0
 */