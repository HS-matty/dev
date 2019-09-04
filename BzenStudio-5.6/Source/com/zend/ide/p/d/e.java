package com.zend.ide.p.d;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class e extends MouseAdapter
{
  JList a;
  final bw b;

  public e(bw parambw, JList paramJList)
  {
    this.a = paramJList;
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (SwingUtilities.isLeftMouseButton(paramMouseEvent))
      if (paramMouseEvent.getClickCount() == 1)
      {
        JFileChooser localJFileChooser = this.b.getFileChooser();
        int i = this.a.locationToIndex(paramMouseEvent.getPoint());
        if (((!localJFileChooser.isMultiSelectionEnabled()) || (localJFileChooser.getSelectedFiles().length <= 1)) && (i >= 0) && (this.a.isSelectedIndex(i)) && (bw.e(this.b) == i) && (!this.b.bq))
          bw.a(this.b, i);
        else if (i >= 0)
          bw.c(this.b, i);
        else
          bw.f(this.b);
      }
      else
      {
        bw.f(this.b);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.e
 * JD-Core Version:    0.6.0
 */