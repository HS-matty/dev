package com.zend.ide.bf;

import com.zend.ide.n.gz;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class l
  implements ActionListener
{
  final z a;

  l(z paramz)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    z.a(this.a, null);
    String str1 = (String)ba.h(this.a.d).getSelectedItem();
    String str2 = ba.k(this.a.d).getText();
    String str3 = ba.m(this.a.d).getText();
    String str4 = ba.f(this.a.d).getText();
    if (str2.equals(""))
    {
      JOptionPane.showMessageDialog(this.a, ct.a(1237), ct.a(94), 0);
      return;
    }
    if (str4.equals(""))
    {
      JOptionPane.showMessageDialog(this.a, ct.a(1238), ct.a(94), 0);
      return;
    }
    if (str3 != null)
    {
      z.a(this.a, new c(str2, str1, str3, str4, true));
      this.a.dispose();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.l
 * JD-Core Version:    0.6.0
 */