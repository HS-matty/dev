package com.zend.ide.desktop.b;

import com.zend.ide.t.j;
import com.zend.ide.t.o;
import com.zend.ide.util.cl;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class a extends j
  implements i
{
  private DataOutputStream a;

  public void a(Object paramObject, OutputStream paramOutputStream)
  {
    this.a = ((DataOutputStream)paramOutputStream);
    try
    {
      ((o)paramObject).a(this);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void a(c paramc)
    throws IOException
  {
    a((String)paramc.b());
  }

  private void a(String paramString)
    throws IOException
  {
    byte[] arrayOfByte = paramString.getBytes();
    this.a.writeInt(arrayOfByte.length);
    this.a.write(arrayOfByte);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.a
 * JD-Core Version:    0.6.0
 */