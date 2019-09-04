package com.zend.ide.hb;

import com.zend.ide.util.bx;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.JTextComponent;

public class y
{
  private static Pattern a = Pattern.compile("\\\\|\\^|\\{|\\}|\\[|\\]|\\(|\\)|\\*|\\+|\\?|\\$|\\.|\\|");
  private static Pattern b = Pattern.compile("\\\\n");
  private static Pattern c = Pattern.compile("\\\\r");
  private static Pattern d = Pattern.compile("\\\\t");
  private static Pattern e = Pattern.compile("\\\\b");

  public db a(JTextComponent paramJTextComponent, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return null;
    CharSequence localCharSequence = bx.a(paramJTextComponent.getDocument(), 0, paramInt2);
    Matcher localMatcher = a(localCharSequence, paramString, paramBoolean1, paramBoolean2);
    return a(localCharSequence, localMatcher, paramInt1, paramInt2, paramBoolean3, paramBoolean4);
  }

  public db[] a(CharSequence paramCharSequence, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Vector localVector = new Vector();
    int i = 0;
    Matcher localMatcher = a(paramCharSequence, paramString, paramBoolean1, paramBoolean2);
    db localdb;
    while ((localdb = a(paramCharSequence, localMatcher, i, paramCharSequence.length() - 1, paramBoolean3, true)) != null)
    {
      localVector.add(localdb);
      i = localdb.f();
    }
    db[] arrayOfdb = new db[localVector.size()];
    localVector.toArray(arrayOfdb);
    return arrayOfdb;
  }

  public boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Matcher localMatcher = a(paramString1, paramString2, paramBoolean1, paramBoolean2);
    db localdb = a(paramString1, localMatcher, paramInt1, paramInt2, paramBoolean3, true);
    return (localdb != null) && (localdb.b() == paramInt1) && (localdb.f() == paramInt2);
  }

  public static String a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean1)
      return paramString3;
    Pattern localPattern;
    if (paramBoolean2)
      localPattern = Pattern.compile(paramString2, 8);
    else
      localPattern = Pattern.compile(paramString2, 74);
    paramString3 = a(paramString3);
    return localPattern.matcher(paramString1).replaceFirst(paramString3);
  }

  private static String a(String paramString)
  {
    paramString = b.matcher(paramString).replaceAll("\n");
    paramString = c.matcher(paramString).replaceAll("\r");
    paramString = d.matcher(paramString).replaceAll("\t");
    paramString = e.matcher(paramString).replaceAll("\b");
    return paramString;
  }

  private static Matcher a(CharSequence paramCharSequence, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramBoolean1)
      paramString = a.matcher(paramString).replaceAll("\\\\$0");
    Pattern localPattern;
    if (paramBoolean2)
      localPattern = Pattern.compile(paramString, 8);
    else
      localPattern = Pattern.compile(paramString, 74);
    return localPattern.matcher(paramCharSequence);
  }

  private db a(CharSequence paramCharSequence, Matcher paramMatcher, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramMatcher == null)
      return null;
    if (paramBoolean2)
      return b(paramCharSequence, paramMatcher, paramInt1, paramInt2, paramBoolean1);
    return a(paramCharSequence, paramMatcher, paramInt1, paramInt2, paramBoolean1);
  }

  private db a(CharSequence paramCharSequence, Matcher paramMatcher, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = null;
    while (paramInt1 < paramInt2)
    {
      db localdb = b(paramCharSequence, paramMatcher, paramInt1, paramInt2, paramBoolean);
      if (localdb == null)
        break;
      if (localdb.f() == paramInt2)
      {
        localObject = localdb;
        break;
      }
      if ((localObject == null) || (localObject.f() < localdb.f()))
      {
        localObject = localdb;
        paramInt1 = localObject.b();
      }
      else
      {
        paramInt1++;
      }
      paramInt1++;
    }
    return localObject;
  }

  private db b(CharSequence paramCharSequence, Matcher paramMatcher, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramMatcher.find(paramInt1))
    {
      if (a(paramCharSequence, paramMatcher, paramInt2, paramBoolean))
        return a(paramMatcher.start(), paramMatcher.end(), paramMatcher.group());
      return b(paramCharSequence, paramMatcher, paramMatcher.start() + 1, paramInt2, paramBoolean);
    }
    return null;
  }

  private static boolean a(CharSequence paramCharSequence, Matcher paramMatcher, int paramInt, boolean paramBoolean)
  {
    if (!paramBoolean)
      return true;
    int i = paramMatcher.start();
    if ((i > 0) && (a(paramCharSequence.charAt(i))) && (a(paramCharSequence.charAt(i - 1))))
      return false;
    int j = paramMatcher.end();
    return (j >= paramInt) || (!a(paramCharSequence.charAt(j))) || (!a(paramCharSequence.charAt(j - 1)));
  }

  private static boolean a(char paramChar)
  {
    return (Character.isLetterOrDigit(paramChar)) || (paramChar == '_');
  }

  private static db a(int paramInt1, int paramInt2, String paramString)
  {
    return new z(paramInt1, paramInt2, paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.y
 * JD-Core Version:    0.6.0
 */