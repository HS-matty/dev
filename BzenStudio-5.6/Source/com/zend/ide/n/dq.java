package com.zend.ide.n;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class dq
{
  private hk b;
  private String a;
  private int[] c;

  public dq()
  {
  }

  public dq(String paramString, hk paramhk)
  {
    this.a = paramString;
    this.b = paramhk;
  }

  public void a(hk paramhk)
  {
    this.b = paramhk;
  }

  public void a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
    int i = -1;
    while (localStringTokenizer.hasMoreTokens())
    {
      try
      {
        i = Integer.parseInt(localStringTokenizer.nextElement().toString());
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
      continue;
      localArrayList.add(new Integer(i));
    }
    this.c = new int[localArrayList.size()];
    for (int j = 0; j < localArrayList.size(); j++)
      this.c[j] = ((Integer)localArrayList.get(j)).intValue();
    b(null);
  }

  public int[] a()
  {
    return this.c;
  }

  public hk b()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.a = paramString;
  }

  public String b()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dq
 * JD-Core Version:    0.6.0
 */