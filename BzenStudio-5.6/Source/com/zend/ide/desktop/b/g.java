package com.zend.ide.desktop.b;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class g
  implements Runnable
{
  final b a;

  g(b paramb)
  {
  }

  public void run()
  {
    try
    {
      b.a(this.a, b.a(this.a).accept());
      b.a(this.a, new DataInputStream(b.b(this.a).getInputStream()));
      b.a(this.a, new DataOutputStream(b.b(this.a).getOutputStream()));
      b.b(this.a, b.c(this.a));
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.g
 * JD-Core Version:    0.6.0
 */