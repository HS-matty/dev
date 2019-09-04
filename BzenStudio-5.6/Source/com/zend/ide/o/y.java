package com.zend.ide.o;

import com.zend.ide.bd.c;
import com.zend.ide.j.h;
import com.zend.ide.p.ba;
import com.zend.ide.util.c.f;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.f.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

class y
  implements cg
{
  final fk a;

  private y(fk paramfk)
  {
  }

  public boolean b()
  {
    if (a.a.b())
    {
      fk.b(this.a).d();
      ba.a(c.b().h(), ct.a(1544), ct.a(1545), -1, 1);
      return false;
    }
    this.a.S();
    String str1 = this.a.bg();
    File localFile = h.m.g(str1);
    if (localFile.exists())
      this.a.d = localFile.getParentFile();
    else
      this.a.d = null;
    this.a.c(de.b(str1));
    try
    {
      int i = this.a.F();
      String str2 = fk.a(this.a, x.b, i);
      URL localURL = new URL(str2);
      this.a.bl().a(fk.c(this.a));
      new Thread(new mb(this, localURL, i)).start();
      return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
      fk.b(this.a).d();
    }
    return false;
  }

  private void a(URL paramURL, int paramInt)
  {
    try
    {
      this.a.bl().h();
      long l = this.a.bm() * 1000;
      this.a.j.a(l, l);
      URLConnection localURLConnection = paramURL.openConnection();
      if (this.a.o)
        this.a.a(paramURL, paramInt);
      String str2 = localURLConnection.getHeaderFieldKey(1);
      if (str2 == null)
      {
        fk.b(this.a).d();
        return;
      }
      for (int i = 1; (str2 = localURLConnection.getHeaderFieldKey(i)) != null; i++)
      {
        if (!str2.equals("X-Zend-Debug-Server"))
          continue;
        String str3 = localURLConnection.getHeaderField(str2);
        if (str3.equals("OK"))
          break;
        a(a(localURLConnection));
        break;
      }
      InputStream localInputStream = localURLConnection.getInputStream();
      while (localInputStream.read() != -1);
    }
    catch (UnknownHostException localUnknownHostException)
    {
      a(ct.a(108));
    }
    catch (ConnectException localConnectException)
    {
      a(ct.a(110) + ct.a(111) + '"' + paramURL + '"');
    }
    catch (IOException localIOException)
    {
      String str1 = localIOException.getMessage() != null ? ct.a(110) + localIOException.getMessage() : ct.a(1259);
      a(str1);
    }
    catch (Exception localException)
    {
      a("");
    }
  }

  private void a(String paramString)
  {
    fk.b(this.a).d();
    fk.e(this.a);
    this.a.bl().b(paramString);
  }

  private String a(URLConnection paramURLConnection)
    throws IOException
  {
    StringBuffer localStringBuffer = new StringBuffer();
    char[] arrayOfChar = new char[4096];
    InputStreamReader localInputStreamReader = new InputStreamReader((InputStream)paramURLConnection.getContent());
    int i;
    while ((i = localInputStreamReader.read(arrayOfChar)) != -1)
      localStringBuffer.append(arrayOfChar, localStringBuffer.length(), i);
    localInputStreamReader.close();
    return localStringBuffer.toString();
  }

  y(fk paramfk, m paramm)
  {
    this(paramfk);
  }

  static void a(y paramy, URL paramURL, int paramInt)
  {
    paramy.a(paramURL, paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.y
 * JD-Core Version:    0.6.0
 */