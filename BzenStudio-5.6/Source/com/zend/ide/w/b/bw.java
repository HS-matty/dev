package com.zend.ide.w.b;

import com.zend.ide.n.gz;
import java.awt.event.FocusEvent;
import javax.swing.text.DefaultCaret;

class bw extends DefaultCaret
{
  final bf a;

  public bw(bf parambf)
  {
    setBlinkRate(500);
  }

  public void focusGained(FocusEvent paramFocusEvent)
  {
    if (bf.a(this.a).isEnabled())
    {
      setVisible(true);
      setSelectionVisible(true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bw
 * JD-Core Version:    0.6.0
 */