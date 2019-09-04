package com.zend.ide.db;

import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

class s extends Thread
{
  private StringBuffer a;
  private InputStreamReader b;
  final o c;

  public s(o paramo, InputStream paramInputStream, StringBuffer paramStringBuffer)
  {
    this.a = paramStringBuffer;
    if (cr.c() == 3)
      try
      {
        this.b = new InputStreamReader(paramInputStream, "UTF-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        cl.a(localUnsupportedEncodingException);
        this.b = new InputStreamReader(paramInputStream);
      }
    else
      this.b = new InputStreamReader(paramInputStream);
  }

  public void run()
  {
    char[] arrayOfChar = new char[1000];
    try
    {
      int i;
      while ((i = this.b.read(arrayOfChar)) != -1)
      {
        this.a.append(arrayOfChar, 0, i);
        synchronized (this.c.c())
        {
          this.c.c().a(this.a.toString());
        }
        this.a.delete(0, this.a.length());
      }
    }
    catch (Exception localException)
    {
      this.c.c().a("\nRead error:" + localException.getMessage());
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.s
 * JD-Core Version:    0.6.0
 */