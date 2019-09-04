package com.zend.ide.d;

import com.zend.ide.p.bb;
import com.zend.ide.p.w;
import com.zend.ide.util.cm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class sb
  implements ActionListener
{
  final pd a;

  sb(pd parampd)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bb localbb = (bb)paramActionEvent.getSource();
    pd.a(this.a).a(paramActionEvent.getActionCommand());
    od.h(this.a.k).setText(paramActionEvent.getActionCommand());
    if (localbb.getText().equals(pd.b(this.a)))
    {
      pd.a(this.a).a(true);
      od.h(this.a.k).setEditable(true);
      pd.c(this.a).setEnabled(true);
      od.h(this.a.k).requestFocus();
      od.h(this.a.k).selectAll();
    }
    else
    {
      od.h(this.a.k).setEditable(false);
      pd.c(this.a).setEnabled(false);
      pd.a(this.a).a(false);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.sb
 * JD-Core Version:    0.6.0
 */