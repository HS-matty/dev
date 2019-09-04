package com.zend.ide.m;

import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class h
{
  private static h a;
  private static Pattern b = Pattern.compile("\n");

  public static h a()
  {
    if (a == null)
      a = new h();
    return a;
  }

  public static int a(bw parambw, g paramg, int paramInt, boolean paramBoolean)
  {
    return c(parambw, paramg, paramInt, paramBoolean).indexOf(paramg.a());
  }

  public void b(bw parambw, g paramg, int paramInt, boolean paramBoolean)
  {
    try
    {
      String str = c(parambw, paramg, paramInt, paramBoolean);
      parambw.e().getDocument().insertString(paramInt, str, null);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  private static String c(bw parambw, g paramg, int paramInt, boolean paramBoolean)
  {
    String str1 = a(parambw, paramInt);
    String str2 = a(paramg, str1);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramg.d() == 0)
      localStringBuffer.append("\n" + str1);
    localStringBuffer.append("/**\n");
    if (!paramg.a().equals(""))
    {
      localStringBuffer.append(str1 + " * " + paramg.a() + "\n");
      localStringBuffer.append(str1 + " *\n");
    }
    String str3 = paramg.b().replaceAll(b.pattern(), "\n" + str1 + " * ");
    if (!str3.equals(""))
    {
      localStringBuffer.append(str1 + " * " + str3 + "\n");
      localStringBuffer.append(str1 + " *" + "\n");
    }
    localStringBuffer.append(str2);
    localStringBuffer.append(str1 + " */");
    if (paramBoolean)
      localStringBuffer.append("\n" + str1);
    return localStringBuffer.toString();
  }

  private static String a(bw parambw, int paramInt)
  {
    String str = "";
    try
    {
      int i = parambw.getLineOfOffset(paramInt);
      int j = parambw.getLineStartOffset(i);
      str = parambw.getText(j, paramInt - j);
      for (int k = 0; k < str.length(); k++)
      {
        if (Character.isWhitespace(str.charAt(k)))
          continue;
        str = str.substring(0, k);
        break;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      localBadLocationException.printStackTrace();
    }
    return str;
  }

  public static String b(bw parambw, int paramInt)
  {
    String str = "";
    try
    {
      int i = parambw.getLineOfOffset(paramInt);
      int j = parambw.getLineStartOffset(i);
      str = parambw.getText(j, paramInt - j);
      for (int k = str.length() - 1; k > 0; k--)
      {
        if (!Character.isWhitespace(str.charAt(k)))
          continue;
        str = str.substring(k + 1, str.length());
        break;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      localBadLocationException.printStackTrace();
    }
    return str;
  }

  private static String a(g paramg, String paramString)
  {
    Iterator localIterator = paramg.c();
    j localj;
    for (String str = ""; (localIterator != null) && (localIterator.hasNext()); str = str + paramString + " * " + localj.toString() + "\n")
      localj = (j)localIterator.next();
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.m.h
 * JD-Core Version:    0.6.0
 */