package com.zend.ide.w.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class cb extends ab
{
  public List a(String paramString, boolean paramBoolean)
    throws bj
  {
    paramString = paramString.substring(0, paramString.lastIndexOf('\n'));
    a();
    String[] arrayOfString = paramString.split("\n*\r*\n+\r*");
    int i = 0;
    if (paramBoolean)
      i = a(arrayOfString);
    if (i < arrayOfString.length)
    {
      for (String str = arrayOfString[i]; (str.length() == 0) || ((str.length() > 0) && (str.charAt(0) != '@') && (i < arrayOfString.length)); str = arrayOfString[i])
        i++;
      ArrayList localArrayList = new ArrayList(arrayOfString.length - i + 1);
      for (int j = i; j < arrayOfString.length; j++)
        localArrayList.add(arrayOfString[j]);
      a(localArrayList);
    }
    return this.a;
  }

  private int a(String[] paramArrayOfString)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      if (!paramArrayOfString[i].startsWith("---"))
        continue;
      char[] arrayOfChar = paramArrayOfString[i].toCharArray();
      StringBuffer localStringBuffer = new StringBuffer();
      int j = 0;
      for (int k = arrayOfChar.length - 1; k >= 0; k--)
        if (arrayOfChar[k] == ')')
        {
          j = 1;
        }
        else
        {
          if (arrayOfChar[k] == '(')
          {
            localStringBuffer.reverse();
            this.d = localStringBuffer.toString();
            break;
          }
          if (j == 0)
            continue;
          localStringBuffer.append(arrayOfChar[k]);
        }
      localStringBuffer.delete(0, localStringBuffer.length());
      k--;
      while (k >= 0)
      {
        if (arrayOfChar[k] != '/')
        {
          localStringBuffer.append(arrayOfChar[k]);
        }
        else
        {
          localStringBuffer.reverse();
          this.c = localStringBuffer.toString();
          break;
        }
        k--;
      }
    }
    i++;
    return i;
  }

  private void a(List paramList)
  {
    for (int i = 0; (i < paramList.size()) && (((String)paramList.get(i)).charAt(0) != '@'); i++);
    eb localeb = null;
    while (i < paramList.size())
    {
      String str = (String)paramList.get(i);
      if (str.length() > 0)
        if (str.charAt(0) == '@')
        {
          if (localeb != null)
            a(localeb);
          localeb = new eb(this, str);
        }
        else if (localeb != null)
        {
          localeb.b(str);
        }
      i++;
    }
    if (localeb != null)
      a(localeb);
  }

  private void a(eb parameb)
  {
    List localList = parameb.a();
    int i = parameb.c - 1;
    int j = parameb.a - 1;
    int k = i;
    int m = j;
    ArrayList localArrayList = new ArrayList(localList.size());
    int n = 0;
    int i1 = 0;
    for (int i2 = 0; i2 < localList.size(); i2++)
    {
      String str = (String)localList.get(i2);
      int i3 = str.charAt(0);
      if (i3 == 45)
      {
        i++;
        if (localArrayList.isEmpty())
          k = i;
        localArrayList.add(str.substring(1));
      }
      else if (i3 == 43)
      {
        j++;
        if ((n == 0) && (!localArrayList.isEmpty()))
        {
          n = 1;
          m = j;
        }
        if ((n != 0) || (i1 != 0))
          continue;
        i1 = 1;
        m = j;
        k = i;
      }
      else
      {
        if (i3 != 32)
          continue;
        if (n != 0)
        {
          a(1, m, j, k, i, localArrayList);
          n = 0;
        }
        else if (i1 != 0)
        {
          i = Math.max(i, 0);
          k = i;
          a(0, m, j, k, i, localArrayList);
          i1 = 0;
        }
        else if (!localArrayList.isEmpty())
        {
          j = Math.max(j, 0);
          m = j;
          a(2, m, j, k, i, localArrayList);
        }
        i++;
        j++;
      }
    }
    if (n != 0)
    {
      a(1, m, j, k, i, localArrayList);
    }
    else if (i1 != 0)
    {
      i = Math.max(i, 0);
      k = i;
      a(0, m, j, k, i, localArrayList);
    }
    else if (!localArrayList.isEmpty())
    {
      j = Math.max(j, 0);
      m = j;
      a(2, m, j, k, i, localArrayList);
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List paramList)
  {
    f localf = new f(paramInt1);
    localf.a(paramInt2, paramInt3);
    localf.b(paramInt4, paramInt5);
    db localdb = new db();
    for (int i = 0; i < paramList.size(); i++)
      localdb.a((String)paramList.get(i));
    this.a.add(localf);
    this.b.put(localf, localdb);
    paramList.clear();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.cb
 * JD-Core Version:    0.6.0
 */