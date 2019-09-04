package com.zend.ide.cb.a;

import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JList;

class jb extends AbstractAction
{
  final s a;

  public jb(s params)
  {
    super(ct.a(310));
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int[] arrayOfInt = s.b(this.a).getSelectedIndices();
    for (int i = arrayOfInt.length - 1; i >= 0; i--)
      s.a(this.a).removeElementAt(arrayOfInt[i]);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.jb
 * JD-Core Version:    0.6.0
 */