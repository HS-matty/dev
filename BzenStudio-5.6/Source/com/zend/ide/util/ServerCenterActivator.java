package com.zend.ide.util;

import com.zend.ide.desktop.bm;
import com.zend.ide.p.e.f;
import com.zend.ide.y.b;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ServerCenterActivator
  implements cu
{
  private String a = b.a("debugging.serverHost").c().toString().trim();
  private String b = bi.a("ZEND_STUDIO_SERVER_GUI", "ZendServerCenter/index.php");

  public ServerCenterActivator()
  {
    while (true)
    {
      if (this.a.indexOf("Server_Address") != -1)
      {
        this.a = b();
        if (this.a == null)
          System.exit(0);
      }
      if ((!this.a.endsWith("/")) && (!this.a.endsWith("\\")))
        this.a += '/';
      try
      {
        URL localURL = new URL(this.a + this.b);
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
        if (localHttpURLConnection.getResponseCode() == 200)
        {
          com.zend.ide.bd.c.b().e().a(this.a + this.b, false);
          System.exit(0);
        }
        else
        {
          a();
        }
      }
      catch (Exception localException)
      {
        a();
      }
    }
  }

  private void a()
  {
    JFrame localJFrame = com.zend.ide.bd.c.b().h();
    if (localJFrame == null)
    {
      localJFrame = new JFrame();
      localJFrame.setIconImage(cv.b("application32.gif").getImage());
    }
    int i = JOptionPane.showConfirmDialog(localJFrame, ct.a(1534, this.a), ct.a(464), 0);
    if (i == 1)
      System.exit(0);
    this.a = b();
    if (this.a == null)
      System.exit(0);
  }

  private String b()
  {
    this.a = JOptionPane.showInputDialog(null, ct.a(1533), ct.a(399), 3);
    if (this.a != null)
    {
      if (this.a.indexOf("://") == -1)
        this.a = ("http://" + this.a);
      b.a("debugging.serverHost").a(new bv(this.a));
    }
    else
    {
      return null;
    }
    return this.a;
  }

  public static void main(String[] paramArrayOfString)
  {
    f.h().e();
    bm.b();
    new ServerCenterActivator();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ServerCenterActivator
 * JD-Core Version:    0.6.0
 */