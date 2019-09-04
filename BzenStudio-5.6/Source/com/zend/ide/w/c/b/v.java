package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class v extends d
  implements x
{
  public v(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    String str1 = (String)paramMap.get("URL");
    if ((str1 == null) || ("".equals(str1.trim())))
      throw new y("Missing URL");
    String str2 = (String)paramMap.get("PATH");
    if ((str2 == null) || ("".equals(str2.trim())))
      throw new y("Missing path");
    String str3 = (String)paramMap.get("REVISION");
    if ((str3 != null) && (!"".equals(str3.trim())))
      str3 = "-r " + str3;
    else
      str3 = "";
    Boolean localBoolean = (Boolean)paramMap.get("NONRECURSIVE");
    String str4;
    if (Boolean.TRUE.equals(localBoolean))
      str4 = "-N";
    else
      str4 = "";
    a(MessageFormat.format(" switch {0} {1} {2} {3} --non-interactive", new Object[] { str3, str4, str1, str2 }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.v
 * JD-Core Version:    0.6.0
 */