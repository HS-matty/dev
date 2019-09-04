package com.zend.ide.bf;

import com.zend.ide.s.dh;
import com.zend.ide.util.cl;
import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class s extends dn
{
  final m b;

  private s(m paramm, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = (JTextComponent)paramActionEvent.getSource();
    int i = localJTextComponent.getCaret().getDot();
    int j = localJTextComponent.getCaret().getMark();
    int k = Math.min(i, j);
    try
    {
      if (m.a(this.b, k))
      {
        m.a(this.b, true);
        p localp1 = m.a(this.b);
        Document localDocument = localJTextComponent.getDocument();
        int m = localDocument.getLength();
        super.actionPerformed(paramActionEvent);
        int n = localDocument.getLength();
        int i1 = m - n;
        localp1.d -= i1;
        if (localp1.d < 0)
        {
          m.b(this.b);
          return;
        }
        int i2 = k - localp1.b;
        int i3 = i1;
        int i4 = i3;
        for (int i5 = m.d(this.b) + 1; i5 < m.e(this.b).size(); i5++)
        {
          p localp2 = (p)m.e(this.b).get(i5);
          localp2.b -= i3;
          if (!localp1.a.equals(localp2.a))
            continue;
          localp2.d = localp1.d;
          i3 += i4;
          ((dh)d()).a(true);
          if ((i1 == 1) && (i2 > 0))
            localDocument.remove(localp2.b + i2 - 1, i1);
          else
            localDocument.remove(localp2.b + i2, i1);
        }
        m.a(this.b, localp1.b, localp1.b + localp1.d);
      }
      else
      {
        m.b(this.b);
        super.actionPerformed(paramActionEvent);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    finally
    {
      m.a(this.b, false);
      ((dh)d()).a(false);
    }
  }

  s(m paramm, Action paramAction, n paramn)
  {
    this(paramm, paramAction);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.s
 * JD-Core Version:    0.6.0
 */