package com.zend.ide.o.c;

import com.zend.ide.util.bh;
import java.io.ByteArrayInputStream;

class c extends ByteArrayInputStream
{
  private c(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }

  private char a()
  {
    int i;
    do
    {
      int j = super.read();
      if (j == -1)
        return ' ';
      i = (char)j;
    }
    while ((i == 59) || (i == 58) || (i == 123) || (i == 125));
    return i;
  }

  private String b()
  {
    StringBuffer localStringBuffer = new StringBuffer(6);
    char c;
    do
      c = (char)super.read();
    while ((c == ';') || (c == ':'));
    while ((c != ';') && (c != ':'))
    {
      localStringBuffer.append(c);
      c = (char)super.read();
    }
    return localStringBuffer.toString();
  }

  private String c()
  {
    int i = d();
    while ((char)super.read() != '"');
    byte[] arrayOfByte = new byte[i];
    read(arrayOfByte, 0, i);
    super.read();
    bh localbh = bh.a();
    String str = bh.a(arrayOfByte, localbh);
    return str;
  }

  public int d()
  {
    int i = 0;
    int j = 0;
    char c;
    do
    {
      c = (char)super.read();
      if (c != '-')
        continue;
      j = 1;
    }
    while (!Character.isDigit(c));
    do
    {
      i *= 10;
      i += Character.getNumericValue(c);
      mark(1);
    }
    while (Character.isDigit(c = (char)super.read()));
    if (j != 0)
      i *= -1;
    return i;
  }

  private boolean e()
  {
    reset();
    int i = (char)super.read();
    return i == 59;
  }

  c(byte[] paramArrayOfByte, i parami)
  {
    this(paramArrayOfByte);
  }

  static char a(c paramc)
  {
    return paramc.a();
  }

  static String b(c paramc)
  {
    return paramc.b();
  }

  static String c(c paramc)
  {
    return paramc.c();
  }

  static boolean d(c paramc)
  {
    return paramc.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.c
 * JD-Core Version:    0.6.0
 */