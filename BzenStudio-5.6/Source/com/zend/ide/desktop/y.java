package com.zend.ide.desktop;

import com.zend.ide.util.cl;
import java.io.IOException;
import java.io.InputStream;

class y
  implements Runnable
{
  Process a;

  y(Process paramProcess)
  {
    this.a = paramProcess;
  }

  public void run()
  {
    try
    {
      byte[] arrayOfByte = new byte[1000];
      InputStream localInputStream = this.a.getInputStream();
      for (int i = localInputStream.read(arrayOfByte); i > 0; i = localInputStream.read(arrayOfByte));
      localInputStream = this.a.getErrorStream();
      for (i = localInputStream.read(arrayOfByte); i != -1; i = localInputStream.read(arrayOfByte));
    }
    catch (IOException localIOException)
    {
      cl.a(localIOException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.y
 * JD-Core Version:    0.6.0
 */