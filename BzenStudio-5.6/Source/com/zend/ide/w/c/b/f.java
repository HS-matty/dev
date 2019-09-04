package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class f extends d
{
  public f(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    String str1 = (String)paramMap.get("TARGETS");
    if ((str1 == null) || ("".equals(str1.trim())))
      throw new y("Missing target(s)");
    String str2 = (String)paramMap.get("REVISION");
    if ((str2 != null) && (!"".equals(str2)))
      str2 = "-r " + str2;
    else
      str2 = "";
    a(MessageFormat.format(" cat {0} {1}", new Object[] { str2, str1 }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.f
 * JD-Core Version:    0.6.0
 */