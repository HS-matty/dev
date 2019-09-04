package com.zend.ide.w.a;

import com.zend.ide.w.b.ab;
import com.zend.ide.w.b.bj;
import com.zend.ide.w.b.f;
import com.zend.ide.w.b.j;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class t extends ab
{
  public List a(String paramString, boolean paramBoolean)
    throws bj
  {
    paramString = paramString.substring(0, paramString.lastIndexOf('\n'));
    a();
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, "\n\r", false);
    if (paramBoolean)
      a(localStringTokenizer);
    int i = 1;
    while (localStringTokenizer.hasMoreTokens())
    {
      String str = localStringTokenizer.nextToken();
      if (i != 0)
      {
        while ((str.length() > 0) && (!Character.isDigit(str.charAt(0))) && (localStringTokenizer.hasMoreTokens()))
          str = localStringTokenizer.nextToken();
        i = 0;
      }
      if (str.length() > 0)
      {
        char c = str.charAt(0);
        if (c != '\\')
          if (Character.isDigit(c))
            try
            {
              a(str, localStringTokenizer);
            }
            catch (bj localbj)
            {
              throw localbj;
            }
          else
            throw new bj("Wrong diff-output structure - line: " + str);
      }
    }
    return this.a;
  }

  private void a(StringTokenizer paramStringTokenizer)
  {
    for (int i = 0; (paramStringTokenizer.hasMoreTokens()) && (i < 5); i++)
    {
      String str1 = paramStringTokenizer.nextToken().trim();
      String str2 = str1.toLowerCase();
      if ((!str2.startsWith("cvs server: i know")) && (!str2.startsWith("cvs [server aborted]: no such directory")))
        switch (i)
        {
        case 0:
          this.c = str1.substring(str1.indexOf(' '));
          break;
        case 3:
          this.d = str1.substring(str1.indexOf(' '));
        }
    }
  }

  private void a(String paramString, StringTokenizer paramStringTokenizer)
    throws bj
  {
    j localj = a(paramString);
    b localb;
    switch (localj.f())
    {
    case 0:
      localb = new b(paramStringTokenizer, localj.c());
      break;
    case 1:
      localb = new b(paramStringTokenizer, localj.c() + localj.b());
      break;
    case 2:
      localb = new b(paramStringTokenizer, localj.b());
      break;
    default:
      throw new bj("No such element type - " + localj.f());
    }
    this.a.add(localj);
    this.b.put(localj, localb);
  }

  private j a(String paramString)
    throws bj
  {
    char[] arrayOfChar = paramString.toCharArray();
    f localf = null;
    int i = -1;
    for (int j = 0; (j < arrayOfChar.length) && (i == -1); j++)
    {
      int k = Character.toLowerCase(arrayOfChar[j]);
      switch (k)
      {
      case 97:
        localf = new f(0);
        i = j;
        break;
      case 99:
        localf = new f(1);
        i = j;
        break;
      case 100:
        localf = new f(2);
        i = j;
      case 98:
      }
    }
    if (localf == null)
      throw new bj("Element key not found in line: " + paramString);
    String str1 = new String(arrayOfChar, 0, i);
    String str2 = new String(arrayOfChar, i + 1, arrayOfChar.length - i - 1);
    StringTokenizer localStringTokenizer = new StringTokenizer(str1, ",", false);
    int m = -1;
    int n = -1;
    while (localStringTokenizer.hasMoreTokens())
    {
      if (m == -1)
      {
        m = Integer.parseInt(localStringTokenizer.nextToken());
        n = m;
        continue;
      }
      n = Integer.parseInt(localStringTokenizer.nextToken());
    }
    localf.b(m, n);
    localStringTokenizer = new StringTokenizer(str2, ",", false);
    m = -1;
    n = -1;
    while (localStringTokenizer.hasMoreTokens())
    {
      if (m == -1)
      {
        m = Integer.parseInt(localStringTokenizer.nextToken());
        n = m;
        continue;
      }
      n = Integer.parseInt(localStringTokenizer.nextToken());
    }
    localf.a(m, n);
    return localf;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.t
 * JD-Core Version:    0.6.0
 */