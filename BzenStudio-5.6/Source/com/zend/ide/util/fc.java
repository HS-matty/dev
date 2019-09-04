package com.zend.ide.util;

import com.zend.ide.util.f.a;
import com.zend.ide.util.f.f;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Hashtable;

class fc
  implements Runnable
{
  final df a;

  fc(df paramdf)
  {
  }

  public void run()
  {
    dd.e().clear();
    f localf = a.a.c();
    DatagramSocket localDatagramSocket = null;
    try
    {
      localDatagramSocket = new DatagramSocket();
      localDatagramSocket.setReceiveBufferSize(64);
      localDatagramSocket.setSoTimeout(20);
      DatagramPacket localDatagramPacket1 = new DatagramPacket(new byte[12], 12);
      InetAddress[] arrayOfInetAddress = dd.f();
      for (int i = 0; (arrayOfInetAddress != null) && (i < arrayOfInetAddress.length); i++)
      {
        if (arrayOfInetAddress[i] == null)
          continue;
        localDatagramPacket1.setAddress(arrayOfInetAddress[i]);
        localDatagramPacket1.setPort(4321);
        DatagramPacket localDatagramPacket2 = new DatagramPacket(new byte[64], 64);
        localDatagramPacket2.setPort(4321);
        dd.b(localDatagramSocket, localDatagramPacket1, localDatagramPacket2, localf);
      }
    }
    catch (IOException localException2)
    {
      cl.a(localIOException);
    }
    finally
    {
      if (localDatagramSocket != null)
        try
        {
          localDatagramSocket.close();
        }
        catch (Exception localException3)
        {
        }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.fc
 * JD-Core Version:    0.6.0
 */