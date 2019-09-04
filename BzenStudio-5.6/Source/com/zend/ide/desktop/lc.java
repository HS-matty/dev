package com.zend.ide.desktop;

import com.zend.ide.p.b.e;
import com.zend.ide.p.b.f;
import com.zend.ide.util.g;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

class lc extends Thread
{
  private String a;
  private String b;
  final ct c;

  lc(ct paramct)
  {
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public void run()
  {
    int i = 1;
    try
    {
      f.a(ct.a(this.c));
      if (ct.b(this.c) != null)
        ct.b(this.c).a(com.zend.ide.util.ct.a(1443, this.a));
      URL localURL = new URL(this.a);
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
      if (localHttpURLConnection.getResponseCode() == 200)
      {
        if (ct.b(this.c) != null)
          ct.b(this.c).d();
        i = 0;
        cj.a(this.c.a).e().a(this.a, true);
      }
      else
      {
        if ((!this.b.endsWith("\\")) && (!this.b.endsWith("/")))
          this.b += "/";
        localURL = new URL(this.b + "ZendPlatform/server/index.php?frame=studio");
        localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
        if (localHttpURLConnection.getResponseCode() == 200)
        {
          if (ct.b(this.c) != null)
            ct.b(this.c).d();
          i = 0;
          cj.a(this.c.a).e().a(localURL.toString(), true);
        }
      }
    }
    catch (Exception localException)
    {
    }
    finally
    {
      if (ct.b(this.c) != null)
        ct.b(this.c).d();
      if (i != 0)
        JOptionPane.showMessageDialog(this.c.a.o, com.zend.ide.util.ct.a(463) + this.b, com.zend.ide.util.ct.a(464), 0);
    }
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.lc
 * JD-Core Version:    0.6.0
 */