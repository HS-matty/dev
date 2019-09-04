package com.zend.ide.n.b;

import com.zend.ide.util.dc;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.undo.CompoundEdit;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class g extends UndoManager
  implements dc
{
  private c a = new d();
  private b b;
  private boolean c;
  private boolean d;

  public g()
  {
    super.addEdit(new h(null));
    setLimit(250);
  }

  protected b k()
  {
    if (this.b == null)
      this.b = new b(this);
    return this.b;
  }

  public void a(a parama)
  {
    k().a(parama);
  }

  public synchronized void discardAllEdits()
  {
    super.discardAllEdits();
    super.addEdit(new h(null));
    g();
  }

  public boolean addEdit(UndoableEdit paramUndoableEdit)
  {
    CompoundEdit localCompoundEdit = (CompoundEdit)lastEdit();
    if (!localCompoundEdit.isInProgress())
      super.addEdit(new h(null));
    boolean bool = super.addEdit(paramUndoableEdit);
    if (bool)
      f();
    return bool;
  }

  public void undo()
  {
    CompoundEdit localCompoundEdit = (CompoundEdit)lastEdit();
    if (localCompoundEdit.isInProgress())
      localCompoundEdit.end();
    super.undo();
    d();
  }

  public AbstractDocument.DefaultDocumentEvent b()
  {
    h localh = (h)editToBeUndone();
    if (localh != null)
      return (AbstractDocument.DefaultDocumentEvent)localh.c();
    return null;
  }

  public AbstractDocument.DefaultDocumentEvent c()
  {
    h localh = (h)editToBeRedone();
    if (localh != null)
      return (AbstractDocument.DefaultDocumentEvent)localh.b();
    return null;
  }

  public void redo()
  {
    super.redo();
    e();
  }

  public synchronized boolean canUndo()
  {
    CompoundEdit localCompoundEdit = (CompoundEdit)editToBeUndone();
    return localCompoundEdit != null;
  }

  public synchronized boolean canRedo()
  {
    CompoundEdit localCompoundEdit = (CompoundEdit)editToBeRedone();
    return localCompoundEdit != null;
  }

  public void a(Action paramAction, ActionEvent paramActionEvent)
  {
    if (this.a.a(paramAction, paramActionEvent))
      ((CompoundEdit)lastEdit()).end();
  }

  public void b(Action paramAction, ActionEvent paramActionEvent)
  {
    this.a.b(paramAction, paramActionEvent);
  }

  private void d()
  {
    if (!canUndo())
    {
      this.c = false;
      k().c(this.c);
    }
    if (!this.d)
    {
      this.d = true;
      k().d(this.d);
    }
  }

  private void e()
  {
    if (!this.c)
    {
      this.c = true;
      k().c(this.c);
    }
    if (!canRedo())
    {
      this.d = false;
      k().d(this.d);
    }
  }

  private void f()
  {
    if (!this.c)
    {
      this.c = true;
      k().c(this.c);
    }
    if (this.d)
    {
      this.d = false;
      k().d(this.d);
    }
  }

  private void g()
  {
    if (this.c)
    {
      this.c = false;
      k().c(this.c);
    }
    if (this.d)
    {
      this.d = false;
      k().d(this.d);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.b.g
 * JD-Core Version:    0.6.0
 */