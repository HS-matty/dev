package com.zend.ide.desktop.b;

import com.zend.ide.t.g;
import com.zend.ide.t.h;
import com.zend.ide.t.o;
import com.zend.ide.util.cl;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class f
  implements i, h
{
  private DataInputStream a;
  private g b;

  public g a(InputStream paramInputStream, Object paramObject)
  {
    this.a = ((DataInputStream)paramInputStream);
    try
    {
      this.b = ((o)paramObject);
      ((o)paramObject).a(this);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return this.b;
  }

  public void a(c paramc)
    throws IOException
  {
    String str = a();
    paramc.a(str);
  }

  private String a()
    throws IOException
  {
    byte[] arrayOfByte = new byte[this.a.readInt()];
    this.a.readFully(arrayOfByte);
    return new String(arrayOfByte);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.f
 * JD-Core Version:    0.6.0
 */