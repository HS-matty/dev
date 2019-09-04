package com.zend.ide.w.a;

import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.cx;
import com.zend.ide.w.bb;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

class cd extends Thread
{
  private StringBuffer a;
  private InputStreamReader b;
  private Object c;
  private cx d;
  private boolean f;
  final ca e;

  public cd(ca paramca, InputStream paramInputStream, StringBuffer paramStringBuffer, cx paramcx, Object paramObject, boolean paramBoolean)
  {
    this.a = paramStringBuffer;
    try
    {
      this.b = new InputStreamReader(paramInputStream, bh.a().c());
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      cl.a(localUnsupportedEncodingException);
    }
    this.c = paramObject;
    this.d = paramcx;
    this.f = paramBoolean;
  }

  public void run()
  {
    ca.a(this.e, false);
    try
    {
      int i;
      while (-1 != (i = this.b.read()))
      {
        this.a.append("" + (char)i);
        if (((char)i != '\n') && ((char)i != '\r'))
          continue;
        if (ca.c(this.a.toString()))
        {
          ca.a(this.e, true);
          synchronized (ca.a(this.e))
          {
            if (this.c.equals("err"))
              ca.a(this.e).a(this.a.toString() + '\n', "server");
          }
          this.a.delete(0, this.a.length());
          break;
        }
        if ((!this.f) || (!ca.d(this.a.toString())))
          continue;
        String str = this.c.equals("err") ? "server" : "regular";
        synchronized (ca.a(this.e))
        {
          ca.a(this.e).a(this.a.toString(), str);
        }
        this.a.delete(0, this.a.length());
      }
    }
    catch (Exception localException)
    {
      ca.a(this.e).a("\nRead error:" + localException.getMessage(), "regular");
      cl.a(localException);
    }
    if (this.d != null)
      this.d.a(this.c, false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.cd
 * JD-Core Version:    0.6.0
 */