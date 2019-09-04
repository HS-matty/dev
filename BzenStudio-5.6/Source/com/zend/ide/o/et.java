package com.zend.ide.o;

import java.net.URL;
import java.net.URLConnection;

class et
  implements Runnable
{
  final URL a;

  et(URL paramURL)
  {
  }

  public void run()
  {
    try
    {
      URLConnection localURLConnection = this.a.openConnection();
      String str = localURLConnection.getHeaderFieldKey(1);
      if (str == null)
        return;
      for (int i = 1; ((str = localURLConnection.getHeaderFieldKey(i)) != null) && (!str.startsWith("X-Zend-Debug-Server")); i++);
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.et
 * JD-Core Version:    0.6.0
 */