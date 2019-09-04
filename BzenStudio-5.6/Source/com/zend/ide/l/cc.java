package com.zend.ide.l;

import com.zend.ide.util.cv;
import java.util.concurrent.Callable;

class cc
  implements Callable
{
  final String a;
  final String b;

  cc(String paramString1, String paramString2)
  {
  }

  public String a()
  {
    cv.c(this.a, this.a + "_" + this.b + "_backup");
    return null;
  }

  public Object call()
    throws Exception
  {
    return a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.cc
 * JD-Core Version:    0.6.0
 */