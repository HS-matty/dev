package com.zend.ide.i;

import com.zend.ide.p.bb;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

class q
  implements DocumentListener
{
  final s a;

  q(s params)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
    if (this.a.i.isSelected())
      return;
    try
    {
      ((JTextField)this.a.f.getEditor().getEditorComponent()).setText(paramDocumentEvent.getDocument().getText(0, paramDocumentEvent.getDocument().getLength()));
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
    if (this.a.i.isSelected())
      return;
    try
    {
      ((JTextField)this.a.f.getEditor().getEditorComponent()).setText(paramDocumentEvent.getDocument().getText(0, paramDocumentEvent.getDocument().getLength()));
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
  }

  private void b()
  {
    if (this.a.e.getEditor().getItem().toString().equals(""))
      this.a.o.setEnabled(false);
    else
      this.a.o.setEnabled(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.q
 * JD-Core Version:    0.6.0
 */