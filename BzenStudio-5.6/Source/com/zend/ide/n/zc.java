package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.s.kc;
import com.zend.ide.util.cl;
import javax.swing.text.Document;
import javax.swing.text.Segment;

class zc extends n
{
  private String[] c = { "area", "base", "br", "col", "frame", "hr", "img", "input", "link", "meta", "option", "param" };
  final k d;

  private zc(k paramk)
  {
  }

  public ef a(gx paramgx, char paramChar, StringBuffer paramStringBuffer)
  {
    paramStringBuffer.append(paramChar);
    int i = paramgx.getSelectionStart();
    if (i == 0)
      return r.f;
    try
    {
      if (paramgx.getText(i - 1, 1).equals("/"))
        return r.f;
      paramgx.insert(" ", i);
      bl localbl = (bl)r.a(paramgx.getDocument(), i + 1);
      paramgx.getDocument().remove(i, 1);
      if (localbl.c() != kc.h(121))
        return r.f;
      if (paramgx.getDocument().getLength() > i)
      {
        char c1 = paramgx.getText(i, 1).charAt(0);
        if (!a(c1))
          return r.f;
      }
      Segment localSegment = new Segment();
      String str = "";
      paramgx.getDocument().getText(0, paramgx.getSelectionStart(), localSegment);
      int j = 0;
      for (int k = localSegment.count - 1; k >= 0; k--)
      {
        switch (localSegment.array[k])
        {
        case '>':
          localbl = (bl)r.a(paramgx.getDocument(), k);
          if (!kc.a(localbl.c()))
            break;
          return r.f;
        case '<':
          if ((localSegment.array[(k + 1)] == '?') || (localSegment.array[(k + 1)] == '!'))
            break;
          localbl = (bl)r.a(paramgx.getDocument(), k);
          if (!kc.a(localbl.c()))
            break;
          for (int m = k + 1; m < localSegment.count; m++)
          {
            if (!a(localSegment.array[m]))
              continue;
            localbl = (bl)r.a(paramgx.getDocument(), m);
            if (kc.a(localbl.c()))
              break;
          }
          str = new String(localSegment.array, k + 1, m - k - 1);
          j = 1;
          break;
        default:
          break;
        }
        if (j != 0)
          break;
      }
      if ((!str.equals("")) && (!a(str)))
      {
        paramStringBuffer.append("</");
        paramStringBuffer.append(str);
        paramStringBuffer.append(">");
        return new ef(i + 1, null);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
      throw new RuntimeException(localException.getMessage());
    }
    return r.f;
  }

  private boolean a(String paramString)
  {
    for (int i = 0; i < this.c.length; i++)
      if (paramString.equalsIgnoreCase(this.c[i]))
        return true;
    return false;
  }

  private boolean a(char paramChar)
  {
    return (paramChar == ' ') || (paramChar == '\n') || (paramChar == '\t') || (paramChar == '\r');
  }

  zc(k paramk, mc parammc)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.zc
 * JD-Core Version:    0.6.0
 */