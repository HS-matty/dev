package com.zend.ide.n;

import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

class gs extends MouseInputAdapter
{
  final dm a;

  private gs(dm paramdm)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    this.a.grabFocus();
    if ((!this.a.c().isFocusOwner()) && (!this.a.e().isFocusOwner()))
      return;
    try
    {
      int i = this.a.u().getLineOfOffset(this.a.e().viewToModel(paramMouseEvent.getPoint()));
      boolean bool = (paramMouseEvent.isPopupTrigger()) || (SwingUtilities.isRightMouseButton(paramMouseEvent));
      this.a.w().a(i, paramMouseEvent.getClickCount(), bool);
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }

  gs(dm paramdm, iq paramiq)
  {
    this(paramdm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gs
 * JD-Core Version:    0.6.0
 */