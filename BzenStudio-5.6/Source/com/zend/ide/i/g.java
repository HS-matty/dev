package com.zend.ide.i;

import com.zend.ide.p.bb;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;

class g
  implements ActionListener
{
  final p a;

  g(p paramp)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    bb localbb = (bb)paramActionEvent.getSource();
    p.a(this.a, localbb.equals(this.a.i));
    if (localbb.equals(this.a.i))
      this.a.f.getEditor().getEditorComponent().requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.g
 * JD-Core Version:    0.6.0
 */