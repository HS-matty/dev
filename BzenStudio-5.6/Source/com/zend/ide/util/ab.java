package com.zend.ide.util;

import com.zend.ide.j.h;
import com.zend.ide.u.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ab
{
  private static String a = "<?php @Zend;";
  private static String b = "";

  public static boolean a(String paramString, InputStream paramInputStream)
  {
    try
    {
      File localFile = h.m.g(paramString);
      if ((localFile == null) || (!localFile.exists()))
      {
        bool = false;
        return bool;
      }
      if ((!b(paramInputStream)) || (paramInputStream == null))
        paramInputStream = h.m.f(paramString);
      bool = a(paramInputStream);
      return bool;
    }
    catch (Exception localException)
    {
      cl.a(localException);
      boolean bool = false;
      return bool;
    }
    finally
    {
      if (paramInputStream != null)
        try
        {
          paramInputStream.close();
        }
        catch (IOException localIOException4)
        {
          cl.a(localIOException4);
        }
    }
    throw localObject;
  }

  public static boolean a(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[15];
    try
    {
      if (b(paramInputStream))
        ((g)paramInputStream).a(arrayOfByte, 0, arrayOfByte.length);
      else
        paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      String str = new String(arrayOfByte);
      if ((str.startsWith(a)) || (str.startsWith(b)))
        return true;
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return false;
  }

  private static boolean b(InputStream paramInputStream)
  {
    return paramInputStream instanceof g;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ab
 * JD-Core Version:    0.6.0
 */