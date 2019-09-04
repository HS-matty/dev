package com.zend.ide.util;

import com.zend.ide.util.f.a;
import com.zend.ide.util.f.f;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.zip.CRC32;

public class dg
{
  public dg(int paramInt)
  {
    try
    {
      DatagramSocket localDatagramSocket = new DatagramSocket(paramInt);
      while (true)
      {
        DatagramPacket localDatagramPacket = a(localDatagramSocket);
        a(localDatagramSocket, localDatagramPacket);
      }
    }
    catch (IOException localIOException)
    {
    }
  }

  private DatagramPacket a(DatagramSocket paramDatagramSocket)
    throws IOException
  {
    byte[] arrayOfByte = new byte[256];
    DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
    paramDatagramSocket.receive(localDatagramPacket);
    return localDatagramPacket;
  }

  private void a(DatagramSocket paramDatagramSocket, DatagramPacket paramDatagramPacket)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    CRC32 localCRC32 = new CRC32();
    String str1 = a.a.c().b;
    localCRC32.update(str1.toLowerCase().getBytes());
    int i = (int)localCRC32.getValue();
    String str2 = Integer.toHexString(i);
    localCRC32.update(InetAddress.getLocalHost().toString().getBytes());
    i = (int)localCRC32.getValue();
    String str3 = Integer.toHexString(i);
    localDataOutputStream.writeUTF(str2 + " , " + str3);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, paramDatagramPacket.getAddress(), paramDatagramPacket.getPort());
    paramDatagramSocket.send(localDatagramPacket);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dg
 * JD-Core Version:    0.6.0
 */