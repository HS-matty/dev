package com.zend.ide.fb;

import com.jniwrapper.win32.gdi.Icon;
import java.awt.Dimension;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

class b extends Icon
{
  final db a;

  public b(db paramdb, String paramString)
    throws IOException, MalformedURLException
  {
    URL localURL1 = new URL(paramString);
    URL localURL2 = new URL(localURL1.getProtocol(), localURL1.getHost(), "/favicon.ico");
    load(localURL2.openStream(), new Dimension(16, 16));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.b
 * JD-Core Version:    0.6.0
 */