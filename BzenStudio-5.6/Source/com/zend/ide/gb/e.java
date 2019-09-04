package com.zend.ide.gb;

import java.util.ArrayList;
import java.util.HashMap;

public class e
{
  private ArrayList a = new ArrayList();
  private ArrayList b = new ArrayList();
  private static e c;

  private e()
  {
    a();
  }

  private void a()
  {
    a("xsd");
    a("xsd", "integer");
    a("xsd", "string");
    a("xsd", "boolean");
    a("xsd", "float");
    a("xsd", "double");
  }

  public static e b()
  {
    if (c == null)
      c = new e();
    return c;
  }

  public void a(String paramString)
  {
    if (this.a.contains(paramString))
      return;
    this.a.add(paramString);
    this.b.add(new HashMap());
  }

  public void a(String paramString1, String paramString2)
  {
    int i = this.a.indexOf(paramString1);
    if (i == -1)
    {
      a(paramString1);
      i = this.a.indexOf(paramString1);
    }
    HashMap localHashMap = (HashMap)this.b.get(i);
    localHashMap.put(paramString2, paramString2);
  }

  public String b(String paramString)
  {
    for (int i = 0; i < this.b.size(); i++)
    {
      HashMap localHashMap = (HashMap)this.b.get(i);
      if (localHashMap.get(paramString) != null)
        return (String)this.a.get(i);
    }
    return "";
  }

  public void c()
  {
    while (this.a.size() != 1)
    {
      this.a.remove(1);
      this.b.remove(1);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.e
 * JD-Core Version:    0.6.0
 */