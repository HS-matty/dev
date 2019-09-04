package com.zend.ide.util;

public class Registration
  implements cu
{
  public static native int listenListener(String paramString1, String paramString2, String paramString3);

  static
  {
    try
    {
      System.loadLibrary("Listener");
    }
    catch (Throwable localThrowable)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.Registration
 * JD-Core Version:    0.6.0
 */