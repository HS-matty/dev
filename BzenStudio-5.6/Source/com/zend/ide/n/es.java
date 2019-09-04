package com.zend.ide.n;

import com.zend.ide.n.b.b;
import com.zend.ide.n.b.g;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.event.DocumentEvent.EventType;
import javax.swing.event.UndoableEditEvent;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

class es extends g
{
  final cl f;

  es(cl paramcl)
  {
  }

  public void a(g paramg)
  {
    k().a(paramg);
  }

  public void undo()
  {
    AbstractDocument.DefaultDocumentEvent localDefaultDocumentEvent = cl.d(this.f).b();
    int i = localDefaultDocumentEvent.getOffset();
    if (localDefaultDocumentEvent.getType().equals(DocumentEvent.EventType.REMOVE))
      i += localDefaultDocumentEvent.getLength();
    cl.d(this.f).undo();
    this.f.b().setCaretPosition(i);
  }

  public void redo()
  {
    int i = cl.d(this.f).c().getOffset();
    this.f.b().setCaretPosition(i);
    cl.d(this.f).redo();
  }

  public void a(Action paramAction, ActionEvent paramActionEvent)
  {
    cl.d(this.f).a(paramAction, paramActionEvent);
  }

  public void b(Action paramAction, ActionEvent paramActionEvent)
  {
    cl.d(this.f).b(paramAction, paramActionEvent);
  }

  public synchronized void discardAllEdits()
  {
    cl.d(this.f).discardAllEdits();
  }

  public synchronized boolean canUndo()
  {
    g localg = cl.d(this.f);
    if (localg != null)
      return localg.canUndo();
    return false;
  }

  public synchronized boolean canRedo()
  {
    g localg = cl.d(this.f);
    if (localg != null)
      return localg.canRedo();
    return false;
  }

  public boolean addEdit(UndoableEdit paramUndoableEdit)
  {
    return cl.d(this.f).addEdit(paramUndoableEdit);
  }

  public void undoableEditHappened(UndoableEditEvent paramUndoableEditEvent)
  {
    cl.d(this.f).undoableEditHappened(paramUndoableEditEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.es
 * JD-Core Version:    0.6.0
 */