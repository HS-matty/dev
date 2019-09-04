package com.zend.ide.desktop.sb;

import com.zend.ide.bd.c;
import com.zend.ide.eb.k;
import com.zend.ide.n.bw;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class b extends AbstractAction
{
  final a a;

  public b(a parama)
  {
    super("snippetsAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (a.a(this.a) == null)
      a.a(this.a, new k(c.b().h(), a.b(this.a)));
    if ((a.b(this.a).getText() == null) || (a.b(this.a).getText().length() == 0))
    {
      a.a(this.a).b("");
    }
    else
    {
      int i;
      if (a.b(this.a).getSelectedText() == null)
      {
        i = ba.a(c.b().h(), ct.a(1398), ct.a(1399), 1, 3);
        if (i == 0)
          a.a(this.a).b(a.b(this.a).getText());
        else if (i == 1)
          a.a(this.a).b("");
        else
          return;
      }
      else
      {
        i = ba.a(c.b().h(), ct.a(1398), ct.a(1399), 1, 3, null, new String[] { ct.a(1400), ct.a(1401), ct.a(1402), ct.a(1067) }, null);
        switch (i)
        {
        case 0:
          a.a(this.a).b(a.b(this.a).getSelectedText());
          return;
        case 1:
          a.a(this.a).b(a.b(this.a).getText());
          return;
        case 2:
          a.a(this.a).b("");
          return;
        }
        return;
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.sb.b
 * JD-Core Version:    0.6.0
 */