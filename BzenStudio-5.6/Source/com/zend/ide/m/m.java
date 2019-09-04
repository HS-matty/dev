package com.zend.ide.m;

import com.zend.ide.b.d;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.ho;
import com.zend.ide.n.ob;
import com.zend.ide.n.qb;
import com.zend.ide.n.sb;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class m
  implements qb
{
  private static final s a = bp.d().b();
  private static final Pattern b = Pattern.compile("\\Wextends\\W", 2);
  private static final Pattern c = Pattern.compile("\\Wimplements", 2);
  private static final Pattern d = Pattern.compile("\\Wcatch\\s[^{]*", 2);
  private bw e;
  private ob f;

  public m(bw parambw)
  {
    this.e = parambw;
    this.f = null;
  }

  public ob a(dz paramdz, int paramInt)
  {
    this.f = null;
    Document localDocument = paramdz.getDocument();
    int i;
    try
    {
      i = ((bl)((ho)localDocument).b(paramInt)).c();
    }
    catch (BadLocationException localBadLocationException1)
    {
      return null;
    }
    if ((kc.c(i)) || (i == kc.h(142)))
      return null;
    char c1 = ' ';
    try
    {
      while (paramInt < localDocument.getLength())
      {
        char c2 = localDocument.getText(paramInt, 1).charAt(0);
        if ((!Character.isLetterOrDigit(c2)) && (c2 != '_'))
          break;
        paramInt++;
      }
      for (int j = paramInt; j < localDocument.getLength(); j++)
      {
        char c3 = localDocument.getText(paramInt, 1).charAt(0);
        if (Character.isWhitespace(c3))
          continue;
        c1 = c3;
        break;
      }
    }
    catch (BadLocationException localBadLocationException2)
    {
      cl.a(localBadLocationException2);
    }
    a(paramdz, paramInt, c1, i);
    return this.f;
  }

  private void a(dz paramdz, int paramInt1, char paramChar, int paramInt2)
  {
    bf localbf = a.a(paramdz.k());
    if (localbf == null)
      return;
    sb localsb = k.a(paramInt1, localbf, paramdz, true);
    int i = k.a(localsb, localsb.length(), true);
    if (i == localsb.length())
      return;
    String str1 = localsb.subSequence(i, localsb.length()).toString();
    if (k.a(localsb) != -1)
      return;
    if (a(localsb, paramInt1))
      return;
    if (b(localsb, paramInt1))
      return;
    int j = localsb.length();
    int k = k.a(localsb, j);
    int m = k.a(localsb, k, true);
    String str2 = localsb.subSequence(m, k).toString();
    boolean bool = j != k;
    if (a(localsb, paramInt1, str2, m, bool, paramChar))
      return;
    k = k.a(localsb, m);
    m = k.a(localsb, k, true);
    String str3 = localsb.subSequence(m, k).toString();
    if (a(str3, str1, paramInt1, paramInt2))
      return;
    a(str2, paramInt1, paramInt2);
  }

  private boolean a(d paramd, int paramInt, String paramString)
  {
    if ((paramd != null) && (paramd.e()))
    {
      this.f = new n(paramInt - paramString.length(), paramInt, paramd.f(), this.e);
      return true;
    }
    return false;
  }

  private boolean a(d[] paramArrayOfd, int paramInt, String paramString1, String paramString2)
  {
    int i = 0;
    if ((paramArrayOfd != null) && (paramArrayOfd.length > 0))
    {
      d locald = null;
      for (int j = 0; j < paramArrayOfd.length; j++)
      {
        if (!paramArrayOfd[j].e())
          continue;
        locald = paramArrayOfd[j];
        if (!locald.f().c().equals(paramString2))
          continue;
        a(locald, paramInt, paramString1);
        return true;
      }
      if (locald != null)
      {
        a(locald, paramInt, paramString1);
        return true;
      }
    }
    return i;
  }

  private void a(String paramString, int paramInt)
  {
    v localv = a.a(this.e.k(), paramString, false);
    if (localv == null)
      localv = a.b(this.e.k(), paramString);
    a(localv, paramInt, paramString);
  }

  private void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString.charAt(0) == '$')
    {
      if (paramString.equals("$this"))
        a(a(paramInt1), paramInt1, paramString);
      return;
    }
    if (kc.d(paramInt2))
      return;
    if (paramString.equals("self"))
    {
      a(a(paramInt1), paramInt1, paramString);
      return;
    }
    if (paramString.equals("parent"))
    {
      v localv1 = a(paramInt1);
      if (localv1 != null)
      {
        localObject = ((v)localv1).c().a();
        localv1 = a.a(this.e.k(), (String)localObject, false);
        if (localv1 == null)
          localv1 = a.b(this.e.k(), (String)localObject);
        a(localv1, paramInt1, paramString);
      }
      return;
    }
    Object localObject = a.d(paramString);
    if (a(localObject, paramInt1, paramString, this.e.k()))
      return;
    if (a(a.a(paramString), paramInt1, paramString))
      return;
    v localv2 = a.a(this.e.k(), paramString, false);
    if (localv2 == null)
      localv2 = a.b(this.e.k(), paramString);
    a(localv2, paramInt1, paramString);
  }

  private boolean a(sb paramsb, int paramInt)
  {
    int i = k.d(paramsb);
    if (i == -1)
      return false;
    paramsb = paramsb.a(i, paramsb.length());
    for (int j = 0; (j < paramsb.length()) && (Character.isLetterOrDigit(paramsb.charAt(j))); j++);
    if (j == paramsb.length())
      return true;
    paramsb = paramsb.a(j, paramsb.length());
    int k = paramsb.length();
    int m = k.a(paramsb, k, false);
    String str1 = paramsb.subSequence(m, k).toString();
    boolean bool1 = b.matcher(paramsb).find();
    boolean bool2 = c.matcher(paramsb).find();
    if ((!bool1) && (!bool2))
      return true;
    k = k.a(paramsb, m);
    int n = k > 0 ? 0 : paramsb.charAt(k - 1) == ',' ? 1 : 0;
    if (n != 0)
    {
      a(str1, paramInt);
      return true;
    }
    m = k.a(paramsb, k, true);
    String str2 = paramsb.subSequence(m, k).toString();
    if ((str2.equalsIgnoreCase("extends")) || (str2.equalsIgnoreCase("implements")))
    {
      a(str1, paramInt);
      return true;
    }
    if ((bool1) && (bool2) && (str1.length() > 0))
      a(str1, paramInt);
    return true;
  }

  private boolean b(sb paramsb, int paramInt)
  {
    Matcher localMatcher = d.matcher(paramsb);
    int i = paramsb.length();
    while (localMatcher.find())
    {
      if (paramsb.length() != localMatcher.end())
        continue;
      i = localMatcher.start() + 1;
    }
    if (i == paramsb.length())
      return false;
    int j = i + 5;
    paramsb = paramsb.a(j, paramsb.length());
    for (int k = 0; (k < paramsb.length()) && (paramsb.charAt(k) != '('); k++);
    if (k == paramsb.length())
      return true;
    k = k.b(paramsb, k + 1);
    int m = k.b(paramsb, k, false);
    String str = paramsb.subSequence(k, m).toString();
    if (m == paramsb.length())
      a(str, paramInt);
    return true;
  }

  private boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (kc.d(paramInt2))
      return false;
    if ((paramString1.equalsIgnoreCase("instanceof")) || (paramString1.equalsIgnoreCase("new")))
    {
      a(paramString2, paramInt1);
      return true;
    }
    return false;
  }

  private boolean a(sb paramsb, int paramInt1, String paramString, int paramInt2, boolean paramBoolean, char paramChar)
  {
    paramInt2 = k.a(paramsb, paramInt2);
    if (paramInt2 <= 2)
      return false;
    int i = 0;
    String str1 = paramsb.subSequence(paramInt2 - 2, paramInt2).toString();
    if (!str1.equals("->"))
      if (str1.equals("::"))
        i = 1;
      else
        return false;
    String str2 = a(paramsb, paramInt2, paramInt1);
    if (str2 == null)
      str2 = "";
    if ((paramBoolean) && (paramString.length() > 0))
      return a(str2, paramString);
    String str3 = this.e.k();
    if (i != 0)
      b(str3, paramInt1, str2, paramString, paramChar);
    else
      a(str3, paramInt1, str2, paramString, paramChar);
    return true;
  }

  private String a(sb paramsb, int paramInt1, int paramInt2)
  {
    paramInt1 = k.a(paramsb, paramInt1);
    boolean bool = false;
    String str1 = paramsb.subSequence(paramInt1 - 2, paramInt1).toString();
    if (!str1.equals("->"))
      if (str1.equals("::"))
        bool = true;
      else
        return null;
    int i = k.a(paramsb, paramInt1 - 2);
    int j = k.e(paramsb, i);
    if (j == -1)
      return a(paramsb, i, bool, paramInt2);
    int k = k.b(paramsb, j + 2);
    String str2 = paramsb.subSequence(k, i).toString();
    String str3 = a(paramsb, k, paramInt2);
    int m = str2.indexOf('(');
    if (m == -1)
      return a(this.e.k(), str3, str2);
    String str4 = str2.substring(0, m).trim();
    return b(this.e.k(), str3, str4);
  }

  private String a(sb paramsb, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = k.a(paramsb, paramInt1, true);
    String str1 = paramsb.subSequence(i, paramInt1).toString();
    if (paramBoolean)
    {
      v localv1;
      if (str1.equals("self"))
      {
        localv1 = a(paramInt2);
        if (localv1 != null)
          return localv1.a();
      }
      else if (str1.equals("parent"))
      {
        localv1 = a(paramInt2);
        if (localv1 != null)
          return a.c(this.e.k(), localv1.a());
      }
      return str1;
    }
    int j;
    if ((str1.length() > 0) && (str1.charAt(0) == '$'))
    {
      j = paramInt2 - paramsb.length();
      return bg.a(this.e, str1, j, a, true);
    }
    if (paramsb.charAt(paramInt1 - 1) == ')')
    {
      j = a(paramsb, paramInt1 - 1);
      int k = k.a(paramsb, j, false);
      String str2 = paramsb.subSequence(k, j).toString();
      v localv2 = a(paramInt2);
      if (localv2 != null)
        return b(this.e.k(), localv2.a(), str2);
      bf localbf = a.a(this.e.k());
      bh[] arrayOfbh = localbf.d();
      for (int m = 0; m < arrayOfbh.length; m++)
      {
        bh localbh = arrayOfbh[m];
        if (localbh.a().equals(str2))
          return localbh.d();
      }
    }
    return null;
  }

  private int a(sb paramsb, int paramInt)
  {
    if (paramsb.charAt(paramInt) != ')')
      return 0;
    int i = paramInt;
    int j = 1;
    while ((j != 0) && (i >= 0))
    {
      i--;
      if (paramsb.charAt(i) == ')')
      {
        j++;
        continue;
      }
      if (paramsb.charAt(i) != '(')
        continue;
      j--;
    }
    return i;
  }

  private String a(String paramString1, String paramString2, String paramString3)
  {
    d locald = a.a(paramString1, paramString2, paramString3, true);
    if (locald != null)
    {
      if ((locald instanceof z))
        return ((z)locald).c();
      return null;
    }
    v localv = a.a(paramString1, paramString2, true);
    if (localv == null)
      return null;
    y localy = localv.c();
    if (localy == null)
      return null;
    return a(paramString1, localy.a(), paramString3);
  }

  private String b(String paramString1, String paramString2, String paramString3)
  {
    d locald = a.a(paramString1, paramString2, paramString3);
    if (locald != null)
    {
      if ((locald instanceof bh))
        return ((bh)locald).d();
      return null;
    }
    v localv = a.a(paramString1, paramString2, false);
    if (localv == null)
      return null;
    String str = null;
    y localy = localv.c();
    if (localy != null)
      str = b(paramString1, localy.a(), paramString3);
    Object localObject1;
    if (str == null)
    {
      localObject1 = a.a(paramString1);
      bh[] arrayOfbh = ((bf)localObject1).d();
      for (int j = 0; j < arrayOfbh.length; j++)
      {
        bh localbh = arrayOfbh[j];
        if ((!localbh.a().equals(paramString3)) || (!(localbh instanceof bh)))
          continue;
        str = ((bh)localbh).d();
      }
    }
    if (str == null)
    {
      localObject1 = a.c();
      for (int i = 0; i < localObject1.length; i++)
      {
        Object localObject2 = localObject1[i];
        if ((!localObject2.a().equals(paramString3)) || (!(localObject2 instanceof bh)))
          continue;
        str = ((bh)localObject2).d();
      }
    }
    return (String)str;
  }

  private void a(String paramString1, int paramInt, String paramString2, String paramString3, char paramChar)
  {
    if (paramChar == '(')
    {
      locald = a.a(paramString1, paramString2, paramString3);
      if (a(locald, paramInt, paramString3))
        return;
    }
    d locald = a.a(paramString1, paramString2, paramString3, false);
    if (a(locald, paramInt, paramString3))
      return;
    locald = a.a(paramString1, paramString2, paramString3);
    a(locald, paramInt, paramString3);
  }

  private void b(String paramString1, int paramInt, String paramString2, String paramString3, char paramChar)
  {
    if (paramChar == '(')
    {
      locald = a.a(paramString1, paramString2, paramString3);
      if (a(locald, paramInt, paramString3))
        return;
    }
    d locald = a.c(paramString1, paramString2, paramString3);
    if (a(locald, paramInt, paramString3))
      return;
    locald = a.a(paramString1, paramString2, paramString3, false);
    if ((locald != null) && (bj.b(((z)locald).d())))
    {
      this.f = new n(paramInt - paramString3.length(), paramInt, locald.f(), this.e);
      return;
    }
    locald = a.a(paramString1, paramString2, paramString3);
    a(locald, paramInt, paramString3);
  }

  private v a(int paramInt)
  {
    bf localbf = a.a(this.e.k());
    return bg.a(localbf, paramInt);
  }

  private boolean a(String paramString1, String paramString2)
  {
    d locald = a.a(this.e.k(), paramString1, paramString2);
    return locald != null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.m
 * JD-Core Version:    0.6.0
 */