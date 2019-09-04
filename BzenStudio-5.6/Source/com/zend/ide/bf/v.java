package com.zend.ide.bf;

import com.zend.ide.util.cl;
import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class v extends dn
{
  final m b;

  private v(m paramm, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = ((JTextComponent)paramActionEvent.getSource()).getCaret().getDot();
    int j = ((JTextComponent)paramActionEvent.getSource()).getCaret().getMark();
    int k = Math.min(i, j);
    int m = Math.abs(i - j);
    if (m <= 0)
      m = 1;
    try
    {
      if (m.a(this.b, k + 1))
      {
        m.a(this.b, true);
        p localp1 = m.a(this.b);
        localp1.d -= m;
        super.actionPerformed(paramActionEvent);
        if (localp1.d < 0)
        {
          m.b(this.b);
          return;
        }
        m.a(this.b, localp1.b, localp1.b + localp1.d);
        int n = k - localp1.b;
        int i1 = m;
        int i2 = i1;
        for (int i3 = m.d(this.b) + 1; i3 < m.e(this.b).size(); i3++)
        {
          p localp2 = (p)m.e(this.b).get(i3);
          localp2.b -= i1;
          if (!localp1.a.equals(localp2.a))
            continue;
          ((JTextComponent)paramActionEvent.getSource()).getDocument().remove(localp2.b + n, m);
          localp2.d = localp1.d;
          i1 += i2;
        }
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
    m.a(this.b, false);
  }

  v(m paramm, Action paramAction, n paramn)
  {
    this(paramm, paramAction);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.v
 * JD-Core Version:    0.6.0
 */