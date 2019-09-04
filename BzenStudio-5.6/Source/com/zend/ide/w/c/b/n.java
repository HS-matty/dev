package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class n extends d
{
  public n(com.zend.ide.w.c.d paramd)
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
    a(MessageFormat.format(" info {0}", new Object[] { str }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.n
 * JD-Core Version:    0.6.0
 */