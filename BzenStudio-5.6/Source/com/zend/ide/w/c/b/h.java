package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class h extends d
  implements x
{
  public h(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    String str = (String)paramMap.get("TARGETS");
    if ((str == null) || ("".equals(str.trim())))
      throw new y("Missing target(s)");
    a(MessageFormat.format(" cleanup {0}", new Object[] { str }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.h
 * JD-Core Version:    0.6.0
 */