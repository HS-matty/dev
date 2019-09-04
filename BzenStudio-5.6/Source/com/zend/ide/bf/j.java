package com.zend.ide.bf;

import com.zend.ide.bf.b.f;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

class j
  implements ActionListener
{
  final z a;

  j(z paramz)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ((DefaultComboBoxModel)ba.i(this.a.d).getModel()).removeAllElements();
    f[] arrayOff = r.b().b(ba.h(this.a.d).getSelectedItem());
    z.a(this.a, arrayOff);
    arrayOff = r.b().b("general");
    z.a(this.a, arrayOff);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.j
 * JD-Core Version:    0.6.0
 */