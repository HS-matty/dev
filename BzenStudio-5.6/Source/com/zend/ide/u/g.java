package com.zend.ide.u;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class g extends FilterInputStream
{
  private byte[] b = a(paramlb, paramString);
  final b a;

  private g(b paramb, lb paramlb, String paramString)
    throws Exception
  {
    super(null);
    this.in = new ByteArrayInputStream(this.b);
  }

  synchronized byte[] a(lb paramlb, String paramString)
    throws Exception
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (b.d(this.a) == 0)
      b.c(this.a);
    if (this.a.h())
      synchronized (paramlb)
      {
        paramlb.a(localByteArrayOutputStream, b.a(this.a, paramString));
      }
    return localByteArrayOutputStream.toByteArray();
  }

  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramArrayOfByte == null)
      throw new NullPointerException();
    if ((paramInt1 < 0) || (paramInt1 > paramArrayOfByte.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfByte.length) || (paramInt1 + paramInt2 < 0))
      throw new IndexOutOfBoundsException();
    if (paramInt2 == 0)
      return 0;
    int i = 0;
    for (int j = paramInt1; j < Math.min(paramInt2, this.b.length); j++)
    {
      paramArrayOfByte[i] = this.b[j];
      i++;
    }
    return i;
  }

  g(b paramb, lb paramlb, String paramString, u paramu)
    throws Exception
  {
    this(paramb, paramlb, paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.g
 * JD-Core Version:    0.6.0
 */