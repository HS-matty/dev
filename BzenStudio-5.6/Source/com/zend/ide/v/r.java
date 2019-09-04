package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.ho;
import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class r
{
  private static r a = new r();
  private d b;
  private e c;
  private PropertyChangeListener d = new gb(this, null);
  private boolean e = false;

  private r()
  {
    a();
  }

  private void a()
  {
    f localf = new f();
    localf.a("editing.stripSpaces", this.d);
    this.c = new e(localf);
    this.c.a("editing.stripSpaces");
  }

  public static r b()
  {
    return a;
  }

  public void a(d paramd)
  {
    this.b = paramd;
  }

  public void a(dz paramdz)
  {
    if (!this.e)
      return;
    bw localbw = null;
    try
    {
      localbw = b(paramdz);
      int i = localbw.d();
      int j = localbw.b();
      localbw.e().getCaret().setVisible(false);
      com.zend.ide.s.db.g = true;
      ho localho = (ho)localbw.getDocument();
      Element localElement = localho.getDefaultRootElement();
      for (int k = 0; k < localElement.getElementCount(); k++)
      {
        int m = localElement.getElement(k).getStartOffset();
        int n = localElement.getElement(k).getEndOffset();
        String str = localho.getText(m, n - m);
        int i1 = str.lastIndexOf("\n");
        if (i1 <= 0)
          continue;
        str = str.substring(0, i1);
        int i2 = a(str);
        paramdz.getDocument().remove(m + i1 - i2, i2);
      }
      localbw.a(i, false);
      localbw.b(j + 1);
    }
    catch (Exception localException3)
    {
      cl.a(localException2);
    }
    finally
    {
      try
      {
        com.zend.ide.s.db.g = false;
        if (localbw != null)
        {
          localbw.e().getCaret().setVisible(true);
          localbw.repaint();
        }
      }
      catch (Exception localException4)
      {
        cl.a(localException4);
      }
    }
  }

  private bw b(dz paramdz)
  {
    String str = paramdz.k();
    bw[] arrayOfbw = this.b.v();
    for (int i = 0; i < arrayOfbw.length; i++)
    {
      dz[] arrayOfdz = arrayOfbw[i].c(str);
      for (int j = 0; j < arrayOfdz.length; j++)
        if ((arrayOfdz[j].k().equals(str)) && ((arrayOfdz[j] instanceof bw)))
          return (bw)arrayOfdz[j];
    }
    return null;
  }

  private int a(String paramString)
  {
    int i = 0;
    for (int j = paramString.length() - 1; j >= 0; j--)
    {
      int k = paramString.charAt(j);
      if ((k != 32) && (k != 9))
        break;
      i++;
    }
    return i;
  }

  static boolean a(r paramr, boolean paramBoolean)
  {
    return paramr.e = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.r
 * JD-Core Version:    0.6.0
 */