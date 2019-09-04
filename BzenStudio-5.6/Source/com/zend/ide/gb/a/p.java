package com.zend.ide.gb.a;

import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.util.ct;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class p
  implements DocumentListener
{
  int a;
  String b;
  String c;
  String d = ".wsdl";
  final pb e;

  p(pb parampb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    if (!pb.e(this.e))
    {
      String str = ct.a(686);
      pb.b(this.e, pb.c(this.e).getText().equals(str));
    }
    a();
    this.e.b();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    if (!pb.e(this.e))
    {
      String str = ct.a(686);
      pb.b(this.e, pb.c(this.e).getText().equals(str));
    }
    a();
    this.e.b();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  private void a()
  {
    int i = h.m.h(pb.d(this.e).getText()).d();
    this.a = (pb.d(this.e).getText().lastIndexOf(i) + 1);
    this.b = pb.d(this.e).getText().substring(0, this.a);
    this.c = pb.c(this.e).getText();
    int j = this.c.lastIndexOf(".");
    if (j == -1)
    {
      pb.d(this.e).setText(this.b + this.c + this.d);
    }
    else if (j == this.c.length() - 1)
    {
      this.c = this.c.substring(0, this.c.length() - 1);
      pb.d(this.e).setText(this.b + this.c + this.d);
    }
    else
    {
      pb.d(this.e).setText(this.b + this.c);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.p
 * JD-Core Version:    0.6.0
 */