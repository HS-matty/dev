package com.zend.ide.db;

import javax.swing.DefaultListModel;
import javax.swing.JList;

class ib extends JList
{
  final x a;

  public ib(x paramx, DefaultListModel paramDefaultListModel)
  {
    super(paramDefaultListModel);
    addKeyListener(new ab(this, paramx));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.ib
 * JD-Core Version:    0.6.0
 */