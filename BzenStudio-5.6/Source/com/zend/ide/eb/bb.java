package com.zend.ide.eb;

import com.zend.ide.n.gz;
import com.zend.ide.util.bi;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class bb
  implements ActionListener
{
  final l a;

  bb(l paraml)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    l.a(this.a, null);
    String str1 = this.a.d.getText();
    String str2 = this.a.e.getText();
    String str3 = this.a.f.getText();
    String str4 = bi.a("USER_NAME");
    if (str1.equals(""))
    {
      JOptionPane.showMessageDialog(this.a, ct.a(1396), ct.a(94), 0);
      return;
    }
    if (str3.equals(""))
    {
      JOptionPane.showMessageDialog(this.a, ct.a(1397), ct.a(94), 0);
      return;
    }
    l.a(this.a, new a(str1, str2, str3, str4, true));
    this.a.dispose();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.bb
 * JD-Core Version:    0.6.0
 */