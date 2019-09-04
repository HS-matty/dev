package com.zend.ide.l;

import com.zend.ide.p.bw;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;

class ob extends AbstractAction
{
  final tb a;

  public ob(tb paramtb)
  {
    super(ct.a(310));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int[] arrayOfInt = tb.b(this.a).getSelectedIndices();
    for (int i = 0; i < arrayOfInt.length; i++)
      sb.b(this.a.g).removeElementAt(arrayOfInt[i] - i);
    tb.b(this.a).repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.ob
 * JD-Core Version:    0.6.0
 */