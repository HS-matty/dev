package com.zend.ide.hb;

import com.zend.ide.p.bc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.KeyStroke;
import javax.swing.ListModel;

class a extends KeyAdapter
{
  KeyStroke b = KeyStroke.getKeyStroke(40, 0);
  KeyStroke c = KeyStroke.getKeyStroke(38, 0);
  KeyStroke d = KeyStroke.getKeyStroke(34, 0);
  KeyStroke e = KeyStroke.getKeyStroke(33, 0);
  final rb a;

  a(rb paramrb)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    case 40:
      rb.b(this.a).d().getActionForKeyStroke(this.b).actionPerformed(new ActionEvent(rb.b(this.a).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 38:
      rb.b(this.a).d().getActionForKeyStroke(this.c).actionPerformed(new ActionEvent(rb.b(this.a).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 34:
      rb.b(this.a).d().getActionForKeyStroke(this.d).actionPerformed(new ActionEvent(rb.b(this.a).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 33:
      rb.b(this.a).d().getActionForKeyStroke(this.e).actionPerformed(new ActionEvent(rb.b(this.a).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 35:
      rb.b(this.a).d().setSelectedIndex(rb.b(this.a).d().getModel().getSize() - 1);
      rb.b(this.a).d().ensureIndexIsVisible(rb.b(this.a).d().getModel().getSize() - 1);
      break;
    case 36:
      rb.b(this.a).d().setSelectedIndex(0);
      rb.b(this.a).d().ensureIndexIsVisible(0);
    case 37:
    case 39:
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.a
 * JD-Core Version:    0.6.0
 */