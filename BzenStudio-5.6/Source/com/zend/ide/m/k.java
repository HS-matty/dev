package com.zend.ide.m;

import com.zend.ide.n.dz;
import com.zend.ide.n.ho;
import com.zend.ide.n.sb;
import com.zend.ide.n.tb;
import com.zend.ide.s.kc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class k
{
  private static final Pattern a = Pattern.compile("(/[*])|(//)");
  private static final Pattern b = Pattern.compile("[*]/");
  private static final Pattern c = Pattern.compile("function\\s", 2);
  private static final Pattern d = Pattern.compile("(class|interface)\\s", 2);

  public static sb a(int paramInt, bf parambf, dz paramdz, boolean paramBoolean)
  {
    int i = bg.a(paramInt, parambf);
    if (i > paramInt)
      i = paramInt;
    sb localsb = tb.a((ho)paramdz.getDocument(), i, paramInt - i);
    int j = localsb.length();
    for (int k = j - 1; k > 0; k--)
    {
      int m = localsb.charAt(k);
      if ((m != 59) && (m != 123) && (m != 125))
        continue;
      int n = tb.a(localsb, k);
      if (!kc.e(n))
        continue;
      localsb = localsb.a(k + 1, localsb.length());
      break;
    }
    if (paramBoolean)
      localsb = a(localsb);
    localsb = localsb.a(b(localsb, 0), localsb.length());
    return localsb;
  }

  private static sb a(sb paramsb)
  {
    int i;
    while (true)
    {
      i = b(paramsb);
      if (i <= -1)
        break label116;
      String str = paramsb.subSequence(i, i + 2).toString();
      if (!str.equals("/*"))
        break;
      Matcher localMatcher = b.matcher(paramsb);
      boolean bool = localMatcher.find(i);
      if (bool)
      {
        int k = localMatcher.end();
        paramsb = paramsb.b(i, k);
        continue;
      }
      break label116;
    }
    for (int j = i + 2; j < paramsb.length(); j++)
    {
      if (paramsb.charAt(j) != '\n')
        continue;
      paramsb = paramsb.b(i, j);
    }
    label116: return paramsb;
  }

  private static int b(sb paramsb)
  {
    Matcher localMatcher = a.matcher(paramsb);
    for (int i = 0; localMatcher.find(i); i = localMatcher.start() + 2)
    {
      int j = tb.a(paramsb, localMatcher.start());
      if ((!kc.c(j)) && (!kc.d(j)))
        return localMatcher.start();
    }
    return -1;
  }

  public static int a(sb paramsb)
  {
    Matcher localMatcher = c.matcher(paramsb);
    while (localMatcher.find())
    {
      int i = localMatcher.start();
      if ((i != 0) && (Character.isJavaIdentifierStart(paramsb.charAt(i - 1))))
        continue;
      int j = tb.a(paramsb, i + 1);
      if (j == kc.h(132))
      {
        for (int k = localMatcher.end(); k < paramsb.length(); k++)
        {
          if (paramsb.charAt(k) != ')')
            continue;
          j = tb.a(paramsb, k);
          if (j == kc.h(132))
            break;
        }
        if (k == paramsb.length())
          return i;
      }
    }
    return -1;
  }

  public static int d(sb paramsb)
  {
    Matcher localMatcher = d.matcher(paramsb);
    while (localMatcher.find())
    {
      int i = localMatcher.start();
      if ((i != 0) && (Character.isJavaIdentifierStart(paramsb.charAt(i - 1))))
        continue;
      int j = tb.a(paramsb, i + 1);
      if (j == kc.h(132))
      {
        int k = localMatcher.end();
        for (int m = k; m < paramsb.length(); m++)
        {
          if (paramsb.charAt(m) != '}')
            continue;
          j = tb.a(paramsb, m);
          if (j == kc.h(132))
            break;
        }
        if (m == paramsb.length())
          return k;
      }
    }
    return -1;
  }

  public static int a(sb paramsb, int paramInt, boolean paramBoolean)
  {
    while (paramInt > 0)
    {
      char c1 = paramsb.charAt(paramInt - 1);
      if ((!Character.isLetterOrDigit(c1)) && (c1 != '_'))
        break;
      paramInt--;
    }
    if ((paramBoolean) && (paramInt > 0) && (paramsb.charAt(paramInt - 1) == '$'))
      paramInt--;
    return paramInt;
  }

  public static int b(sb paramsb, int paramInt, boolean paramBoolean)
  {
    int i = paramsb.length();
    if ((paramBoolean) && (paramInt < i) && (paramsb.charAt(paramInt) == '$'))
      paramInt++;
    while (paramInt < i)
    {
      char c1 = paramsb.charAt(paramInt);
      if ((!Character.isLetterOrDigit(c1)) && (c1 != '_'))
        break;
      paramInt++;
    }
    return paramInt;
  }

  public static int a(sb paramsb, int paramInt)
  {
    for (int i = paramInt; (i > 0) && (Character.isWhitespace(paramsb.charAt(i - 1))); i--);
    return i;
  }

  public static int b(sb paramsb, int paramInt)
  {
    for (int i = paramInt; (i < paramsb.length()) && (Character.isWhitespace(paramsb.charAt(i))); i++);
    return i;
  }

  public static int c(sb paramsb, int paramInt)
  {
    for (int i = paramInt; (i > 0) && (!Character.isWhitespace(paramsb.charAt(i - 1))); i--);
    return i;
  }

  public static int d(sb paramsb, int paramInt)
  {
    for (int i = paramInt; i > 0; i--)
    {
      int j = paramsb.charAt(i - 1);
      if ((j == 34) || (j == 39))
        break;
    }
    return i;
  }

  public static int e(sb paramsb, int paramInt)
  {
    int i = paramInt;
    int j = 0;
    while (i > 0)
    {
      char c1 = paramsb.charAt(i - 1);
      if ((!Character.isLetterOrDigit(c1)) && (c1 != '_') && ((!Character.isWhitespace(c1)) || (c1 == '\n')) && ((c1 != '$') || (i < 3) || (paramsb.charAt(i - 2) != ':') || (paramsb.charAt(i - 3) != ':')))
        switch (c1)
        {
        case '(':
        case '[':
        case '{':
          j--;
          if (j >= 0)
            break;
          return -1;
        case ')':
        case ']':
        case '}':
          j++;
          break;
        case ':':
          if ((j != 0) || (i < 2) || (paramsb.charAt(i - 2) != ':'))
            break;
          return i - 2;
        case '>':
          if ((j != 0) || (i < 2) || (paramsb.charAt(i - 2) != '-'))
            break;
          return i - 2;
        case '\n':
          return -1;
        default:
          if (j != 0)
            break;
          return -1;
        }
      i--;
    }
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.k
 * JD-Core Version:    0.6.0
 */