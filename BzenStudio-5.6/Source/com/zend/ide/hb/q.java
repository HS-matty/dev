package com.zend.ide.hb;

import com.zend.ide.p.db;
import java.awt.Component;
import javax.swing.ComboBoxEditor;
import javax.swing.text.JTextComponent;

class q
  implements Runnable
{
  final c a;

  q(c paramc)
  {
  }

  public void run()
  {
    qb.d(this.a.a).getEditor().getEditorComponent().requestFocusInWindow();
    ((JTextComponent)qb.d(this.a.a).getEditor().getEditorComponent()).selectAll();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.q
 * JD-Core Version:    0.6.0
 */