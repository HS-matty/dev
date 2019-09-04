package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class j extends d
  implements x
{
  public j(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    String str1 = (String)paramMap.get("SOURCE");
    if ((str1 == null) || ("".equals(str1.trim())))
      throw new y("Missing source");
    String str2 = (String)paramMap.get("DESTINATION");
    if ((str2 == null) || ("".equals(str2.trim())))
      throw new y("Missing destination");
    String str3 = (String)paramMap.get("REVISION");
    if ((str3 != null) && (!"".equals(str3.trim())))
      str3 = "-r " + str3;
    else
      str3 = "";
    a(MessageFormat.format(" copy {0} {1} {2} --non-interactive", new Object[] { str3, str1, str2 }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.j
 * JD-Core Version:    0.6.0
 */