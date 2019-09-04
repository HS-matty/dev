package com.zend.ide.w.a;

import com.zend.ide.w.b.v;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b
  implements v
{
  private ArrayList a;
  private StringTokenizer b;
  private int c;

  public b(StringTokenizer paramStringTokenizer, int paramInt)
  {
    this.b = paramStringTokenizer;
    this.c = paramInt;
    this.a = new ArrayList(5);
    a();
  }

  private void a()
  {
    int i = 0;
    while (i < this.c)
    {
      String str = this.b.nextToken();
      i++;
      if (str.startsWith("<"))
        this.a.add(a(str));
      else if (!str.startsWith(">"))
        i--;
    }
  }

  public String c()
  {
    String str = "";
    for (int i = 0; i < this.a.size(); i++)
      str = str + this.a.get(i) + "\n";
    return str;
  }

  private static String a(String paramString)
  {
    if ((paramString.startsWith(">")) || (paramString.startsWith("<")))
      return paramString.substring(2);
    if (paramString.startsWith("---"))
      return "";
    return paramString;
  }

  public String toString()
  {
    return c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.b
 * JD-Core Version:    0.6.0
 */