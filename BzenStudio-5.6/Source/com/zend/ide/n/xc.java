package com.zend.ide.n;

import com.zend.ide.b.m;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.m.ba;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.o;
import com.zend.ide.m.v;
import com.zend.ide.m.z;
import com.zend.ide.p.a.a;
import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Reader;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

public class xc extends n
{
  private boolean f = true;
  private boolean c = true;
  private PropertyChangeListener d = new od(this, null);
  private PropertyChangeListener g = new jf(this, null);
  private e e;

  public xc()
  {
    f localf = new f();
    this.e = new e(localf);
    localf.a("editing.generateStub", this.d);
    localf.a("editing.docBlocInsertion", this.g);
    this.e.a("editing.generateStub");
    this.e.a("editing.docBlocInsertion");
  }

  public ef a(gx paramgx, int paramInt, StringBuffer paramStringBuffer)
  {
    if (!this.f)
      return r.f;
    Document localDocument = paramgx.getDocument();
    Element localElement1 = localDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt));
    int i = localElement2.getStartOffset();
    int j = paramgx.getSelectionEnd();
    try
    {
      String str1 = localDocument.getText(i, j - i);
      String str2 = str1.trim();
      if (str2.startsWith("/**"))
      {
        int k = str1.indexOf("/**");
        bl localbl = b(localDocument, i + k);
        if (localbl.c() == kc.h(132))
          return b(paramgx, paramInt, paramStringBuffer);
        return r.f;
      }
      if ((str2.length() > 0) && (str2.charAt(0) == '*'))
        paramStringBuffer.append("* ");
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return r.f;
  }

  private ef b(gx paramgx, int paramInt, StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(' ');
    String str1 = paramStringBuffer.toString();
    paramStringBuffer.append("* ");
    int i = paramInt + paramStringBuffer.length();
    Document localDocument = paramgx.getDocument();
    int j = paramgx.getSelectionEnd();
    if (a(localDocument, j))
      return r.f;
    try
    {
      Element localElement1 = localDocument.getDefaultRootElement();
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(paramInt));
      int k = localElement2.getStartOffset();
      String str2 = localDocument.getText(k, paramInt - k);
      k += str2.indexOf("/**");
      String str3 = str2.substring(str2.indexOf("/**") + 3).trim();
      i = k + 3 + paramStringBuffer.length();
      int m = j;
      Object localObject;
      if (j < localElement2.getEndOffset())
      {
        localElement2 = localElement1.getElement(localElement1.getElementIndex(j));
        localObject = localDocument.getText(j, localElement2.getEndOffset() - j);
        if (((String)localObject).length() > 0)
        {
          int n = 0;
          char c1 = ((String)localObject).charAt(0);
          n = 0;
          while ((n < ((String)localObject).length()) && (Character.isWhitespace(c1)) && (c1 != '\n'))
          {
            n++;
            c1 = ((String)localObject).charAt(n);
          }
          m += n;
        }
      }
      if (this.c)
      {
        localDocument.remove(k, m - k);
        try
        {
          localObject = new a(localDocument);
          bp.d().a((Reader)localObject, ((ho)localDocument).k());
          if (str3.equals(""))
            str3 = null;
          if (a(paramgx, k, str3))
          {
            paramStringBuffer.setLength(0);
            return r.f;
          }
        }
        catch (IOException localIOException)
        {
          cl.a(localIOException);
        }
        paramStringBuffer.insert(0, "/**");
      }
      else
      {
        k += 3;
        localDocument.remove(k, m - k);
      }
      if ((str3 != null) && (!str3.equals("")))
      {
        paramStringBuffer.append(str3);
        i = k + paramStringBuffer.length();
      }
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    paramStringBuffer.append(str1 + "*/");
    return (ef)new ef(i, null);
  }

  private boolean a(Document paramDocument, int paramInt)
  {
    Segment localSegment = new Segment();
    try
    {
      paramDocument.getText(paramInt, paramDocument.getLength() - paramInt, localSegment);
      int j;
      for (int i = localSegment.first(); i != 65535; i = j)
      {
        j = localSegment.next();
        if ((i == 42) && (j == 47))
          return true;
        if ((i == 47) && (j == 42))
          return false;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return false;
  }

  private boolean a(gx paramgx, int paramInt, String paramString)
  {
    Document localDocument = paramgx.getDocument();
    if ((!(localDocument instanceof ho)) || (!(paramgx instanceof gz)))
      return false;
    bf localbf = bp.d().b().a(((ho)localDocument).k());
    if (localbf == null)
      return false;
    ba localba = a(localDocument, localbf, paramInt);
    if (localba == null)
      return false;
    o.a(localba, (gz)paramgx, paramString, paramInt, false);
    return true;
  }

  private ba a(Document paramDocument, bf parambf, int paramInt)
  {
    Object localObject = null;
    int i = paramDocument.getLength();
    v[] arrayOfv = parambf.c();
    int i1;
    for (int j = 0; j < arrayOfv.length; j++)
    {
      v localv = arrayOfv[j];
      int m = localv.f().d();
      if (m < paramInt)
      {
        i1 = localv.f().e();
        if (i1 > paramInt)
          return a(paramDocument, localv, paramInt);
      }
      else
      {
        if (m >= i)
          continue;
        i = m;
        localObject = localv;
      }
    }
    bh[] arrayOfbh = parambf.d();
    int i2;
    for (int k = 0; k < arrayOfbh.length; k++)
    {
      bh localbh = arrayOfbh[k];
      i1 = localbh.f().d();
      if (i1 < paramInt)
      {
        i2 = localbh.f().e();
        if (i2 > paramInt)
          return null;
      }
      else
      {
        if (i1 >= i)
          continue;
        i = i1;
        localObject = localbh;
      }
    }
    bd[] arrayOfbd = parambf.k();
    for (int n = 0; n < arrayOfbd.length; n++)
    {
      bd localbd = arrayOfbd[n];
      i2 = localbd.f().d();
      if (i2 < paramInt)
      {
        int i3 = localbd.f().e();
        if (i3 > paramInt)
          return null;
      }
      else
      {
        if (i2 >= i)
          continue;
        i = i2;
        localObject = localbd;
      }
    }
    if ((localObject != null) && (b(paramDocument, paramInt, i)))
      return localObject;
    return null;
  }

  private ba a(Document paramDocument, v paramv, int paramInt)
  {
    Object localObject = null;
    int i = paramDocument.getLength();
    bh[] arrayOfbh = paramv.h();
    int i1;
    for (int j = 0; j < arrayOfbh.length; j++)
    {
      bh localbh = arrayOfbh[j];
      int m = localbh.f().d();
      if (m < paramInt)
      {
        i1 = localbh.f().e();
        if (i1 > paramInt)
          return null;
      }
      else
      {
        if (m >= i)
          continue;
        i = m;
        localObject = localbh;
      }
    }
    c[] arrayOfc = paramv.a();
    int i2;
    for (int k = 0; k < arrayOfc.length; k++)
    {
      c localc = arrayOfc[k];
      i1 = localc.f().d();
      if (i1 < paramInt)
      {
        i2 = localc.f().e();
        if (i2 > paramInt)
          return null;
      }
      else
      {
        if (i1 >= i)
          continue;
        i = i1;
        localObject = localc;
      }
    }
    z[] arrayOfz = paramv.g();
    for (int n = 0; n < arrayOfz.length; n++)
    {
      z localz = arrayOfz[n];
      i2 = localz.f().d();
      if (i2 < paramInt)
      {
        int i3 = localz.f().e();
        if (i3 > paramInt)
          return null;
      }
      else
      {
        if (i2 >= i)
          continue;
        i = i2;
        localObject = localz;
      }
    }
    if ((localObject != null) && (b(paramDocument, paramInt, i)))
      return localObject;
    return null;
  }

  private boolean b(Document paramDocument, int paramInt1, int paramInt2)
  {
    Segment localSegment = new Segment();
    try
    {
      paramDocument.getText(paramInt1, paramInt2 - paramInt1, localSegment);
      int i = localSegment.first();
      for (int k = 0; i != 65535; k++)
      {
        if (!Character.isWhitespace(i))
        {
          bl localbl = b(paramDocument, paramInt1 + k);
          if (localbl.c() == kc.h(132))
            if (i == 47)
            {
              int m = localSegment.next();
              k++;
              if (m != 47)
                return false;
            }
            else
            {
              return false;
            }
        }
        int j = localSegment.next();
      }
      return true;
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return false;
  }

  private bl b(Document paramDocument, int paramInt)
    throws BadLocationException
  {
    return (bl)((ho)paramDocument).b(paramInt);
  }

  private void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  private void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  static void a(xc paramxc, boolean paramBoolean)
  {
    paramxc.a(paramBoolean);
  }

  static void b(xc paramxc, boolean paramBoolean)
  {
    paramxc.b(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.xc
 * JD-Core Version:    0.6.0
 */