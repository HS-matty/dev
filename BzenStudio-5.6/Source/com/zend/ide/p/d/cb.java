package com.zend.ide.p.d;

import javax.swing.JComboBox;

class cb extends JComboBox
{
  final bw a;

  public cb(bw parambw)
  {
    setModel(new w(parambw));
    setRenderer(new ba(parambw));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.cb
 * JD-Core Version:    0.6.0
 */