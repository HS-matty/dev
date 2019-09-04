package com.zend.ide.o.n;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;

public class b extends Exception
  implements cu
{
  private String a;

  public b(String paramString)
  {
    if (paramString.indexOf("200 OK") != -1)
      this.a = ct.a(1436);
    else
      this.a = (ct.a(1436) + "\n" + ct.a(1444) + ": \"" + paramString + "\".");
  }

  public String a()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.n.b
 * JD-Core Version:    0.6.0
 */