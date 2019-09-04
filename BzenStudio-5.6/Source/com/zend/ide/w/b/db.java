package com.zend.ide.w.b;

import java.util.ArrayList;

public class db
  implements v
{
  private ArrayList a = new ArrayList();

  public void a(String paramString)
  {
    this.a.add(paramString);
  }

  public String c()
  {
    String str = "";
    for (int i = 0; i < this.a.size(); i++)
      str = str + this.a.get(i) + "\n";
    return str;
  }

  public String toString()
  {
    return c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.db
 * JD-Core Version:    0.6.0
 */