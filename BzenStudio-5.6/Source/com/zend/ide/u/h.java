package com.zend.ide.u;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

class h extends FilterOutputStream
{
  lb a;
  String b;
  final b c;

  private h(b paramb, lb paramlb, String paramString)
  {
    super(new ByteArrayOutputStream());
    this.b = b.a(paramb, paramString);
    this.a = paramlb;
  }

  public synchronized void close()
    throws IOException
  {
    super.close();
    byte[] arrayOfByte = ((ByteArrayOutputStream)this.out).toByteArray();
    try
    {
      if (b.d(this.c) == 0)
        b.c(this.c);
      if (this.c.h())
        synchronized (this.a)
        {
          this.a.a(arrayOfByte, this.b);
        }
    }
    catch (Exception localException)
    {
      throw b.a(this.c, localException);
    }
  }

  h(b paramb, lb paramlb, String paramString, u paramu)
  {
    this(paramb, paramlb, paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.h
 * JD-Core Version:    0.6.0
 */