package com.zend.ide.d;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

class b extends KeyAdapter
{
  final bi a;

  private b(bi parambi)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 10) && (paramKeyEvent.getModifiers() == 0))
    {
      bi.c(this.a, bi.a(this.a).getText());
      bi.a(this.a).getParent().requestFocus();
    }
    else if (paramKeyEvent.getKeyCode() == 8)
    {
      bi.a(this.a).setText("");
    }
    else
    {
      int i = paramKeyEvent.getModifiers();
      int j = paramKeyEvent.getKeyCode();
      if (bi.d(i, j))
      {
        bi.a(this.a, KeyStroke.getKeyStroke(j, i));
        bi.d(this.a, bi.b(bi.n(this.a)));
        bi.a(this.a).setText(bi.q(this.a));
      }
    }
    bi.a(this.a).repaint();
    bi.m(this.a).repaint();
    paramKeyEvent.consume();
  }

  b(bi parambi, f paramf)
  {
    this(parambi);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.b
 * JD-Core Version:    0.6.0
 */