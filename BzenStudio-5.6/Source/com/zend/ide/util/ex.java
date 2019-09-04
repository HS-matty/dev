package com.zend.ide.util;

import com.zend.ide.o.n.o;
import com.zend.ide.y.b;
import com.zend.ide.y.c;

public class ex
{
  public static String a(int paramInt)
  {
    return a(paramInt, false);
  }

  public static String a(int paramInt, boolean paramBoolean)
  {
    String str = "start_debug=1";
    str = str + "&debug_port=" + paramInt;
    if (paramBoolean)
      str = str + "&debug_passive=1";
    Boolean localBoolean = (Boolean)(Boolean)b.a("debugging.encryptedData").c();
    if (localBoolean.booleanValue())
      str = str + "&use_ssl=1";
    str = str + "&debug_fastfile=1";
    return str;
  }

  public static String b(int paramInt)
  {
    return b(paramInt, false);
  }

  public static String b(int paramInt, boolean paramBoolean)
  {
    if (o.a().g())
    {
      int i = o.a().e();
      String str2 = a(i, paramBoolean);
      str2 = str2 + "&debug_host=" + ew.c();
      return str2;
    }
    String str1 = a(paramInt, paramBoolean);
    str1 = str1 + ew.b();
    return str1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.ex
 * JD-Core Version:    0.6.0
 */