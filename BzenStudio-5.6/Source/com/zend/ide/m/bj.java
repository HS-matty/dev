package com.zend.ide.m;

public class bj
{
  public static boolean c(int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }

  public static boolean d(int paramInt)
  {
    return (paramInt & 0x4) != 0;
  }

  public static boolean b(int paramInt)
  {
    return (paramInt & 0x8) != 0;
  }

  public static boolean a(int paramInt)
  {
    return (paramInt & 0x200) != 0;
  }

  public static String a(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if ((paramInt & 0x1) != 0)
      localStringBuffer.append("public ");
    if ((paramInt & 0x4) != 0)
      localStringBuffer.append("protected ");
    if ((paramInt & 0x2) != 0)
      localStringBuffer.append("private ");
    if ((paramInt & 0x400) != 0)
      localStringBuffer.append("abstract ");
    if ((paramInt & 0x8) != 0)
      localStringBuffer.append("static ");
    if ((paramInt & 0x10) != 0)
      localStringBuffer.append("final ");
    if ((paramInt & 0x200) != 0)
      localStringBuffer.append("interface ");
    int i;
    if ((i = localStringBuffer.length()) > 0)
      return localStringBuffer.toString().substring(0, i - 1);
    return "";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.bj
 * JD-Core Version:    0.6.0
 */