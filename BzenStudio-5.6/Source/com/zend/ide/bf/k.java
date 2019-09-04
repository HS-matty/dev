package com.zend.ide.bf;

import com.zend.ide.bf.b.f;
import com.zend.ide.n.gz;
import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

class k
  implements ActionListener
{
  final z a;

  k(z paramz)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    f localf = (f)ba.i(this.a.d).getSelectedItem();
    try
    {
      ba.f(this.a.d).getDocument().insertString(ba.f(this.a.d).getCaretPosition(), localf.b(), null);
      ba.f(this.a.d).requestFocus();
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.k
 * JD-Core Version:    0.6.0
 */