package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.m.ba;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.g;
import com.zend.ide.m.k;
import com.zend.ide.m.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.n.sb;
import com.zend.ide.n.tb;
import com.zend.ide.s.z;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class ob extends cj
{
  private qb R = new qb(this, null);

  public ob()
  {
    this.c = new pb(this);
  }

  public z b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return null;
  }

  protected void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    bf localbf = u.a(d().k());
    if (localbf == null)
      return;
    int i = 0;
    try
    {
      i = d().getLineStartOffset(d().getLineOfOffset(paramInt2));
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    sb localsb = tb.a((ho)d().getDocument(), i, paramInt2 - i);
    int j = localsb.length();
    int k = k.a(localsb, j);
    int m = k.a(localsb, k, true);
    String str = localsb.subSequence(m, k).toString();
    boolean bool = j != k;
    if (a(localsb, paramInt2, str, bool))
      return;
    if (a(localbf, paramInt1, paramInt2, str, paramBoolean, bool))
      return;
  }

  private boolean a(CharSequence paramCharSequence, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      return false;
    int i = paramCharSequence.length() - paramString.length();
    if (paramCharSequence.charAt(i - 1) != '@')
      return false;
    i--;
    int j = 0;
    while (i > 0)
    {
      if (!Character.isWhitespace(paramCharSequence.charAt(i - 1)))
      {
        if ((j != 0) || (paramCharSequence.charAt(i - 1) != '*'))
          break;
        j = 1;
      }
      i--;
    }
    if (i != 0)
      return true;
    d[] arrayOfd = nb.a(paramString);
    this.R.a(paramInt, arrayOfd, paramString);
    this.y = this.R;
    return true;
  }

  private boolean a(bf parambf, int paramInt1, int paramInt2, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
      return false;
    if (paramString.startsWith("$"))
    {
      paramString = paramString.substring(1);
      vb localvb = bl.a(parambf, paramInt2);
      d[] arrayOfd1 = u.a(d().k(), localvb, paramString, true);
      v[] arrayOfv = parambf.c();
      int i = 0;
      d[] arrayOfd2;
      for (int j = 0; j < arrayOfv.length; j++)
      {
        d locald = a(arrayOfv[j], paramInt2);
        if (locald == null)
          continue;
        localvb = bl.a(locald);
        arrayOfd2 = u.a(d().k(), localvb, paramString, false);
        arrayOfd1 = a(arrayOfd1, arrayOfd2);
        i = 1;
        break;
      }
      if (i == 0)
      {
        bh[] arrayOfbh = parambf.d();
        for (int k = 0; k < arrayOfbh.length; k++)
        {
          if (!a(arrayOfbh[k], paramInt2))
            continue;
          localvb = bl.a(arrayOfbh[k]);
          arrayOfd2 = u.a(d().k(), localvb, paramString, false);
          arrayOfd1 = a(arrayOfd1, arrayOfd2);
          break;
        }
      }
      this.y = this.v;
      this.y.a(paramInt2, arrayOfd1, paramString);
      return true;
    }
    return false;
  }

  private d a(v paramv, int paramInt)
  {
    if (a(paramv, paramInt))
      return paramv;
    bh[] arrayOfbh = paramv.h();
    for (int i = 0; i < arrayOfbh.length; i++)
      if (a(arrayOfbh[i], paramInt))
        return arrayOfbh[i];
    return null;
  }

  private d[] a(d[] paramArrayOfd1, d[] paramArrayOfd2)
  {
    d[] arrayOfd = new d[paramArrayOfd1.length + paramArrayOfd2.length];
    System.arraycopy(paramArrayOfd1, 0, arrayOfd, 0, paramArrayOfd1.length);
    System.arraycopy(paramArrayOfd2, 0, arrayOfd, paramArrayOfd1.length, paramArrayOfd2.length);
    return arrayOfd;
  }

  private boolean a(ba paramba, int paramInt)
  {
    return paramba.a() != null ? paramba.a().c(paramInt) : false;
  }

  static bw a(ob paramob)
  {
    return paramob.d();
  }

  static bw b(ob paramob)
  {
    return paramob.d();
  }

  static char a(ob paramob, Document paramDocument, int paramInt1, int paramInt2, char[] paramArrayOfChar)
  {
    return paramob.a(paramDocument, paramInt1, paramInt2, paramArrayOfChar);
  }

  static void e(Document paramDocument, int paramInt, String paramString)
    throws BadLocationException
  {
    a(paramDocument, paramInt, paramString);
  }

  static bw c(ob paramob)
  {
    return paramob.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ob
 * JD-Core Version:    0.6.0
 */