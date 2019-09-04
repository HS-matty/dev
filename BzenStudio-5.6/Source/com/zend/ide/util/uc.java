package com.zend.ide.util;

import com.zend.ide.p.w;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class uc
  implements DocumentListener
{
  final w a;
  final wc b;

  uc(wc paramwc, w paramw)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    this.a.setEnabled((wc.c(this.b).getText().length() > 0) && (wc.d(this.b).getText().length() > 0));
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    this.a.setEnabled((wc.c(this.b).getText().length() > 0) && (wc.d(this.b).getText().length() > 0));
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.uc
 * JD-Core Version:    0.6.0
 */