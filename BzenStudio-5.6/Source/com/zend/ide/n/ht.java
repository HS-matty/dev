package com.zend.ide.n;

import com.zend.ide.n.td.bc;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class ht extends TextAction
{
  private boolean a;

  ht(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent == null)
      return;
    try
    {
      Caret localCaret = localJTextComponent.getCaret();
      int i = localCaret.getDot();
      Point localPoint = localJTextComponent.modelToView(i).getLocation();
      localPoint.x = 2147483647;
      Element localElement1 = localJTextComponent.getDocument().getDefaultRootElement();
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
      int j = localElement2.getEndOffset() - 1;
      if (bc.b())
      {
        hb localhb = (hb)localJTextComponent;
        gb localgb = localhb.a().c(j);
        if ((localgb != null) && (localgb.c()) && (localgb.d() <= j))
          j = localgb.e() + 1;
      }
      if (this.a)
        localCaret.moveDot(j);
      else
        localCaret.setDot(j);
      localCaret.setMagicCaretPosition(localPoint);
    }
    catch (BadLocationException localBadLocationException)
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ht
 * JD-Core Version:    0.6.0
 */