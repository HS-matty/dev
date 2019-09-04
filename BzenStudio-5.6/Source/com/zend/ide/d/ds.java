package com.zend.ide.d;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JColorChooser;

class ds
  implements ActionListener, Serializable
{
  JColorChooser a;
  Color b;

  public ds(JColorChooser paramJColorChooser)
  {
    this.a = paramJColorChooser;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.b = this.a.getColor();
  }

  public Color b()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ds
 * JD-Core Version:    0.6.0
 */