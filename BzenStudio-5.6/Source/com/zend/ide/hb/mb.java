package com.zend.ide.hb;

import com.zend.ide.p.bc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.KeyStroke;
import javax.swing.ListModel;

class mb extends KeyAdapter
{
  KeyStroke a = KeyStroke.getKeyStroke(40, 0);
  KeyStroke b = KeyStroke.getKeyStroke(38, 0);
  KeyStroke c = KeyStroke.getKeyStroke(34, 0);
  KeyStroke d = KeyStroke.getKeyStroke(33, 0);
  final wc e;

  mb(wc paramwc)
  {
  }

  public void keyPressed(KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    case 40:
      wc.b(this.e).d().getActionForKeyStroke(this.a).actionPerformed(new ActionEvent(wc.b(this.e).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 38:
      wc.b(this.e).d().getActionForKeyStroke(this.b).actionPerformed(new ActionEvent(wc.b(this.e).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 34:
      wc.b(this.e).d().getActionForKeyStroke(this.c).actionPerformed(new ActionEvent(wc.b(this.e).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 33:
      wc.b(this.e).d().getActionForKeyStroke(this.d).actionPerformed(new ActionEvent(wc.b(this.e).d(), paramKeyEvent.getID(), paramKeyEvent.paramString()));
      break;
    case 35:
      wc.b(this.e).d().setSelectedIndex(wc.b(this.e).d().getModel().getSize() - 1);
      wc.b(this.e).d().ensureIndexIsVisible(wc.b(this.e).d().getModel().getSize() - 1);
      break;
    case 36:
      wc.b(this.e).d().setSelectedIndex(0);
      wc.b(this.e).d().ensureIndexIsVisible(0);
    case 37:
    case 39:
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.mb
 * JD-Core Version:    0.6.0
 */