package com.zend.ide.hb;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

class kb
  implements CaretListener
{
  final gb a;

  private kb(gb paramgb)
  {
  }

  public void a()
  {
    boolean bool = false;
    try
    {
      String str = gb.a(this.a).getSelectedText();
      if (gb.b(this.a).a())
      {
        int i = gb.b(this.a).e();
        int j = gb.b(this.a).f();
        str = gb.a(this.a).getText(vb.a(gb.b(this.a)), j - i);
      }
      bool = (gb.c(this.a).a != null) && (gb.c(this.a).a != "") && (str != null) && (str != "") && (gb.e().a(str, 0, str.length(), gb.c(this.a).a, gb.c(this.a).g, false, false));
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    gb.d(this.a).a(bool);
  }

  public void b()
  {
    c(gb.a(this.a));
    b(gb.a(this.a));
    a();
  }

  public void c()
  {
    c(gb.a(this.a));
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    a();
  }

  public void a(JTextComponent paramJTextComponent)
  {
    if (gb.d(this.a) == null)
      return;
    c(paramJTextComponent);
    if (gb.d(this.a).isShowing())
      b(gb.a(this.a));
    a();
  }

  private void b(JTextComponent paramJTextComponent)
  {
    if (paramJTextComponent != null)
    {
      paramJTextComponent.removeCaretListener(this);
      paramJTextComponent.addCaretListener(this);
    }
  }

  private void c(JTextComponent paramJTextComponent)
  {
    if (paramJTextComponent != null)
      paramJTextComponent.removeCaretListener(this);
  }

  kb(gb paramgb, hb paramhb)
  {
    this(paramgb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.kb
 * JD-Core Version:    0.6.0
 */