package com.zend.ide.p.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

class j
  implements ActionListener
{
  JFileChooser a;
  final bw b;

  j(bw parambw, JFileChooser paramJFileChooser)
  {
    this.a = paramJFileChooser;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JToggleButton localJToggleButton = (JToggleButton)paramActionEvent.getSource();
    JPanel localJPanel = bw.d(this.b);
    if (localJToggleButton == bw.b(this.b))
    {
      if (bw.e(this.b) == null)
      {
        bw.b(this.b, this.b.g(this.a));
        bw.e(this.b).setPreferredSize(bw.a());
      }
      bw.a(this.b, bw.e(this.b));
    }
    else
    {
      bw.a(this.b, bw.c(this.b));
    }
    if (bw.d(this.b) != localJPanel)
    {
      bw.f(this.b).remove(localJPanel);
      bw.f(this.b).add(bw.d(this.b), "Center");
      bw.f(this.b).revalidate();
      bw.f(this.b).repaint();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.j
 * JD-Core Version:    0.6.0
 */