package com.zend.ide.w.c.b;

import java.text.MessageFormat;
import java.util.Map;

public class m extends d
  implements x
{
  public m(com.zend.ide.w.c.d paramd)
  {
    super(paramd);
  }

  public void a(Map paramMap)
    throws y
  {
    super.a(paramMap);
    String str1 = (String)paramMap.get("REPOS_URL");
    if ((str1 == null) || ("".equals(str1.trim())))
      throw new y("Missing url");
    String str2 = (String)paramMap.get("PATH");
    if ((str2 == null) || ("".equals(str2.trim())))
      throw new y("Missing path");
    String str3 = (String)paramMap.get("NEW_ENTRY_IN_REPOS");
    if ((str3 == null) || ("".equals(str3.trim())))
      throw new y("Missing new entry");
    String str4 = (String)paramMap.get("COMMIT_MESSAGE");
    if ((str4 == null) || ("".equals(str4.trim())))
      throw new y("Missing commit message");
    a(MessageFormat.format(" import --message {0} {1} {2} {3}", new Object[] { '\'' + str4 + '\'', str1, str2, str3 }));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.c.b.m
 * JD-Core Version:    0.6.0
 */