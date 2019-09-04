package com.zend.ide.util;

import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.util.c.h;
import com.zend.ide.util.f.f;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.zip.CRC32;

public class dd
{
  private static boolean a = true;
  private static Hashtable b = new Hashtable();

  public static void g()
  {
    de localde = new de();
    h.c().a(localde, true);
  }

  public static boolean b()
  {
    return a;
  }

  public static void c()
  {
    df localdf = new df();
    h.c().a(localdf, true);
  }

  private static void a(DatagramSocket paramDatagramSocket, DatagramPacket paramDatagramPacket1, DatagramPacket paramDatagramPacket2, f paramf)
  {
    try
    {
      paramDatagramSocket.send(paramDatagramPacket1);
      paramDatagramSocket.receive(paramDatagramPacket2);
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramDatagramPacket2.getData(), 0, paramDatagramPacket2.getLength());
      DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
      StringTokenizer localStringTokenizer = new StringTokenizer(localDataInputStream.readUTF(), ",");
      String str1 = localStringTokenizer.nextToken().trim();
      String str2 = localStringTokenizer.nextToken().trim();
      if (a(str1, str2, paramf))
        a(paramf);
    }
    catch (Exception localException)
    {
    }
  }

  private static boolean a(String paramString1, String paramString2, f paramf)
  {
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(paramf.b.toLowerCase().getBytes());
    int i = (int)localCRC32.getValue();
    String str = Integer.toHexString(i);
    if (!str.equals(paramString1))
      return false;
    b.put(paramString2, paramString2);
    return true;
  }

  private static void a(f paramf)
  {
    int i = paramf.e;
    if (i == 0)
      i = 1;
    if (b.size() > i)
    {
      a = false;
      String str = i > 1 ? ct.a(618, "" + i, "" + i) : ct.a(619);
      str = str + '\n' + ct.a(620);
      bi.b("USER_NAME", "");
      bi.b("LICENSE_KEY", "");
      ba.a(c.b().h(), str);
      System.exit(0);
    }
  }

  private static InetAddress[] d()
  {
    InetAddress localInetAddress;
    try
    {
      localInetAddress = InetAddress.getLocalHost();
    }
    catch (UnknownHostException localUnknownHostException1)
    {
      return null;
    }
    byte[] arrayOfByte = localInetAddress.getAddress();
    int[] arrayOfInt = new int[4];
    for (int i = 0; i < 4; i++)
      arrayOfByte[i] &= 255;
    String str = arrayOfInt[0] + "." + arrayOfInt[1] + "." + arrayOfInt[2] + ".";
    InetAddress[] arrayOfInetAddress = new InetAddress[256];
    for (int j = 0; j < 256; j++)
      try
      {
        arrayOfInetAddress[j] = InetAddress.getByName(str + j);
      }
      catch (UnknownHostException localUnknownHostException2)
      {
      }
    return arrayOfInetAddress;
  }

  static Hashtable e()
  {
    return b;
  }

  static InetAddress[] f()
  {
    return d();
  }

  static void b(DatagramSocket paramDatagramSocket, DatagramPacket paramDatagramPacket1, DatagramPacket paramDatagramPacket2, f paramf)
  {
    a(paramDatagramSocket, paramDatagramPacket1, paramDatagramPacket2, paramf);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dd
 * JD-Core Version:    0.6.0
 */