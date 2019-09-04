package com.zend.ide.w.c.b;

import com.zend.ide.util.cl;
import com.zend.ide.w.bb;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class c
  implements Runnable
{
  private StringBuffer a;
  private InputStream b;
  private bb c;
  private b d;
  private String e;

  public c(InputStream paramInputStream, StringBuffer paramStringBuffer, bb parambb, b paramb, String paramString)
  {
    this.b = paramInputStream;
    this.a = paramStringBuffer;
    this.c = parambb;
    this.d = paramb;
    this.e = ("err".equalsIgnoreCase(paramString) ? "server" : "regular");
  }

  public void run()
  {
    InputStreamReader localInputStreamReader = new InputStreamReader(this.b);
    char[] arrayOfChar = new char[1];
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      int i;
      while ((i = localInputStreamReader.read(arrayOfChar)) != -1)
      {
        localStringBuffer.append(arrayOfChar[0]);
        this.a.append(arrayOfChar[0]);
        if ((localStringBuffer.length() <= 256) && (arrayOfChar[0] != '\n') && (arrayOfChar[0] != '\r'))
          continue;
        synchronized (this.c)
        {
          this.c.a(localStringBuffer.toString(), this.e);
        }
        localStringBuffer.delete(0, localStringBuffer.length());
      }
      if (localStringBuffer.length() > 0)
        synchronized (this.c)
        {
          this.c.a(localStringBuffer.toString(), this.e);
        }
      localInputStreamReader.close();
    }
    catch (IOException localIOException)
    {
      synchronized (this.c)
      {
        this.c.a(localIOException.getMessage() + '\n', "server");
      }
      cl.a(localIOException);
    }
    finally
    {
      this.d.c();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.c
 * JD-Core Version:    0.6.0
 */