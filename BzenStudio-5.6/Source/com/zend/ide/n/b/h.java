package com.zend.ide.n.b;

import java.util.Vector;
import javax.swing.undo.CompoundEdit;
import javax.swing.undo.UndoableEdit;

class h extends CompoundEdit
{
  private h()
  {
  }

  public UndoableEdit c()
  {
    return (UndoableEdit)this.edits.get(0);
  }

  public UndoableEdit b()
  {
    return (UndoableEdit)this.edits.get(0);
  }

  h(f paramf)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.b.h
 * JD-Core Version:    0.6.0
 */