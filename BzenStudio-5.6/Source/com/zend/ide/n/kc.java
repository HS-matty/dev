package com.zend.ide.n;

import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.r.d;
import com.zend.ide.r.p;
import com.zend.ide.s.bk;
import com.zend.ide.s.bl;
import com.zend.ide.s.mb;
import com.zend.ide.s.qb;
import com.zend.ide.s.vb;
import com.zend.ide.util.cl;
import javax.swing.text.Document;

public class kc
{
  private static k a = new k();
  private static r b = new r();

  public static du a(Document paramDocument)
  {
    int i = c(paramDocument);
    switch (i)
    {
    case 2:
      return new ic(paramDocument, 1);
    case 3:
      return new bp(paramDocument, com.zend.ide.s.kc.h(110));
    case 5:
      return new bp(paramDocument, com.zend.ide.s.kc.h(129));
    case 4:
      return new jc(paramDocument, 5);
    case 1:
      return new bp(paramDocument, com.zend.ide.s.kc.h(120));
    }
    return new bo(paramDocument, 0);
  }

  public static bk b(Document paramDocument)
  {
    int i = c(paramDocument);
    switch (i)
    {
    case 2:
      return qb.a(1);
    case 3:
      return com.zend.ide.s.bp.a(com.zend.ide.s.kc.h(110));
    case 4:
      return vb.a(5);
    case 1:
      return com.zend.ide.s.bp.a(com.zend.ide.s.kc.h(120));
    case 5:
      return com.zend.ide.s.bp.a(com.zend.ide.s.kc.h(129));
    }
    return mb.a(0);
  }

  private static int c(Document paramDocument)
  {
    if (!(paramDocument instanceof ho))
      return 1;
    int i = 0;
    ho localho = (ho)paramDocument;
    String str1 = localho.k();
    if ((str1 == null) || (str1.indexOf(".") == -1))
      return 1;
    int j = str1.lastIndexOf(".");
    int k = h.m.h(str1).d();
    int m = str1.lastIndexOf(k);
    String str2 = "";
    if ((j >= 0) && (j > m))
      str2 = str1.substring(j + 1);
    d locald1 = p.e().c("JavaScript files");
    d locald2 = p.e().c("XML files");
    d locald3 = p.e().c("PHP files");
    d locald4 = p.e().c("HTML files");
    d locald5 = p.e().c("CSS files");
    d locald6 = p.e().c("SQL files");
    if ((locald6 != null) && (locald6.a(str2)))
      i = 2;
    else if ((locald5 != null) && (locald5.a(str2)))
      i = 3;
    else if ((locald1 != null) && (locald1.a(str2)))
      i = 5;
    else if ((locald2 != null) && (locald2.a(str2)))
      i = 4;
    else if (((locald3 != null) && (locald3.a(str2))) || ((locald4 != null) && (locald4.a(str2))))
      i = 1;
    return i;
  }

  public static r d(Document paramDocument)
  {
    int i = c(paramDocument);
    switch (i)
    {
    case 1:
      return new k();
    case 5:
      return new k();
    }
    return new r();
  }

  public static db a(Document paramDocument)
  {
    int i = c(paramDocument);
    switch (i)
    {
    case 1:
      return new lb();
    case 5:
      return new lb();
    }
    return new db();
  }

  public static r a(ho paramho)
  {
    int i = c(paramho);
    switch (i)
    {
    case 1:
      return a;
    case 5:
      return a;
    }
    return b;
  }

  public static int a(int paramInt, ho paramho)
  {
    int i = c(paramho);
    if ((i == 1) || (i == 5) || (i == 3))
      try
      {
        bl localbl = (bl)paramho.b(paramInt);
        return localbl.c();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.kc
 * JD-Core Version:    0.6.0
 */