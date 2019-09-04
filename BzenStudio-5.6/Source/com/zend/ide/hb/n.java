package com.zend.ide.hb;

import com.zend.ide.p.db;
import java.awt.Component;
import javax.swing.ComboBoxEditor;
import javax.swing.text.JTextComponent;

class n
  implements Runnable
{
  final b a;

  n(b paramb)
  {
  }

  public void run()
  {
    pb.g(this.a.a).getEditor().getEditorComponent().requestFocusInWindow();
    ((JTextComponent)pb.g(this.a.a).getEditor().getEditorComponent()).selectAll();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.n
 * JD-Core Version:    0.6.0
 */