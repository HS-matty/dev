package com.zend.ide.p;

import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

class nb extends AbstractAction
{
  final pb a;

  nb(pb parampb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Point localPoint = pb.a(this.a).getLocation();
    if (pb.b(this.a).isSelected())
      SwingUtilities.invokeLater(new gb(this, localPoint));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.nb
 * JD-Core Version:    0.6.0
 */