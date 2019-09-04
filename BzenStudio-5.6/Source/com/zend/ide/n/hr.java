package com.zend.ide.n;

import com.zend.ide.n.td.bc;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class hr extends TextAction
{
  private boolean a;

  hr(String paramString, boolean paramBoolean)
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
      Element localElement1 = localJTextComponent.getDocument().getDefaultRootElement();
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
      int j = localElement2.getStartOffset();
      gb localgb2;
      int k;
      if (bc.b())
      {
        hb localhb = (hb)localJTextComponent;
        localgb2 = localhb.a().c(j);
        if ((localgb2 != null) && (localgb2.c()) && (localgb2.e() >= j))
        {
          k = localgb2.d();
          localElement2 = localElement1.getElement(localElement1.getElementIndex(k));
          j = localElement2.getStartOffset();
        }
      }
      if (f.c())
      {
        gb localgb1 = localElement2.getStartOffset();
        localgb2 = localgb1;
        for (k = localJTextComponent.getText(localgb1, 1).charAt(0); (k == 32) || (k == 9); k = localJTextComponent.getText(localgb1, 1).charAt(0))
          localgb1++;
        j = i == localgb1 ? localgb2 : localgb1;
      }
      if (this.a)
        localCaret.moveDot(j);
      else
        localCaret.setDot(j);
    }
    catch (BadLocationException localBadLocationException)
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hr
 * JD-Core Version:    0.6.0
 */