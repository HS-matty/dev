package com.zend.ide.r;

import com.zend.ide.p.x;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class bs
  implements ActionListener
{
  final bp a;

  bs(bp parambp)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    boolean bool1 = bp.b(this.a);
    if (bool1)
    {
      boolean bool2;
      boolean bool3;
      int i;
      String str;
      if (bp.c(this.a) == 1)
      {
        bool2 = bp.a(this.a).isSelected();
        bool3 = (bool2) && (bp.f(this.a).isSelected());
        i = bp.d(this.a).getSelectedIndex();
        str = (i == 2) && (bp.e(this.a) != null) && (bp.e(this.a).length() > 0) ? bp.e(this.a) : "";
        bp.a(this.a, bp.f(this.a).getText(), bp.g(this.a).getText(), bool2, i, str, bool3);
        this.a.dispose();
      }
      else if (bp.c(this.a) == 0)
      {
        p.a(bp.h(this.a), bp.f(this.a).getText());
        p.b(bp.h(this.a), bp.g(this.a).getText());
        bool2 = bp.a(this.a).isSelected();
        bool3 = (bool2) && (bp.f(this.a).isSelected());
        i = bool2 ? 0 : bp.d(this.a).getSelectedIndex() != 0 ? 1 : 0;
        str = (i != 0) && (bp.e(this.a) != null) && (bp.e(this.a).length() > 0) ? bp.e(this.a) : "";
        p.b((d)bp.h(this.a), bool2);
        p.a((d)bp.h(this.a), bp.d(this.a).getSelectedIndex());
        p.c((d)bp.h(this.a), str);
        p.d((d)bp.h(this.a), bool3);
        this.a.dispose();
      }
      else if (bp.c(this.a) == 3)
      {
        p.a(bp.h(this.a), bp.f(this.a).getText());
        p.b(bp.h(this.a), bp.g(this.a).getText());
        this.a.dispose();
      }
      else
      {
        bp.a(this.a, bp.f(this.a).getText(), bp.g(this.a).getText());
        this.a.dispose();
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.bs
 * JD-Core Version:    0.6.0
 */