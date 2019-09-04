package com.zend.ide.f;

import com.zend.ide.util.cl;
import com.zend.ide.y.c;
import java.io.IOException;
import java.io.Reader;

public class r
{
  private e a;
  private boolean b = true;
  private boolean c;
  private nc d = new nc(this, null);

  public r()
  {
    com.zend.ide.y.b.a(this.d, "desktop.phpVersion");
  }

  public void a(Reader paramReader, String paramString, bn parambn)
    throws IOException
  {
    if (this.b)
    {
      this.c = com.zend.ide.y.b.a("desktop.phpVersion").c().toString().equals("PHP5");
      this.b = false;
      this.a = null;
    }
    Object localObject1;
    if (this.c)
      localObject1 = new gc(paramReader);
    else
      localObject1 = new fc(paramReader);
    ((bi)localObject1).a(parambn);
    if (this.a == null)
    {
      if (this.c)
        this.a = new ac((com.b.a.b)localObject1);
      else
        this.a = new zb((com.b.a.b)localObject1);
    }
    else
      this.a.a((com.b.a.b)localObject1);
    this.a.a(parambn);
    parambn.d(paramString);
    try
    {
      this.a.n();
    }
    catch (IOException localIOException)
    {
      throw localIOException;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    finally
    {
      parambn.a(this.a.w(), this.a.u());
      paramReader.close();
    }
  }

  static boolean a(r paramr, boolean paramBoolean)
  {
    return paramr.b = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.r
 * JD-Core Version:    0.6.0
 */