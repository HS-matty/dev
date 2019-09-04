package com.zend.ide.l;

import com.zend.ide.p.w;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class hb
  implements DocumentListener
{
  int a;
  String b;
  String c;
  String d = ".zpj";
  final bw e;

  hb(bw parambw)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    a();
    if (!bw.d(this.e).isEnabled())
    {
      bw.d(this.e).setEnabled(true);
      bw.e(this.e).setEnabled(true);
    }
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    a();
    if (bw.e(this.e).getText().equals(""))
    {
      bw.d(this.e).setEnabled(false);
      bw.e(this.e).setEnabled(false);
    }
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  private void a()
  {
    this.a = (bw.f(this.e).getText().lastIndexOf(File.separator) + 1);
    this.b = bw.f(this.e).getText().substring(0, this.a);
    this.c = bw.e(this.e).getText();
    bw.f(this.e).setText(this.b + this.c + this.d);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.hb
 * JD-Core Version:    0.6.0
 */