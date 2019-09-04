package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class p extends d
  implements x
{
  public p(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    String str1 = (String)paramMap.get("SOURCE1");
    if ((str1 == null) || ("".equals(str1.trim())))
      throw new y("Missing first source");
    String str2 = (String)paramMap.get("SOURCE2");
    if ((str2 == null) || ("".equals(str2.trim())))
      throw new y("Missing second source");
    String str3 = (String)paramMap.get("TARGETS");
    if ((str3 == null) || ("".equals(str3.trim())))
      throw new y("Missing target");
    Boolean localBoolean1 = (Boolean)paramMap.get("NONRECURSIVE");
    String str4;
    if (Boolean.TRUE.equals(localBoolean1))
      str4 = "-N";
    else
      str4 = "";
    Boolean localBoolean2 = (Boolean)paramMap.get("DRY_RUN");
    String str5;
    if (Boolean.TRUE.equals(localBoolean2))
      str5 = "--dry-run";
    else
      str5 = "";
    a(MessageFormat.format(" merge {0} {1} {2} {3} {4} --non-interactive", new Object[] { str4, str5, str1, str2, str3 }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.p
 * JD-Core Version:    0.6.0
 */