package com.zend.ide.n;

import com.zend.ide.s.bk;
import com.zend.ide.s.mb;
import com.zend.ide.util.cl;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Segment;

class bo
  implements du
{
  private Document a;
  private AbstractDocument.AbstractElement b;
  private boolean c = false;
  private bk d;
  private Object e;
  private int g;
  private transient Segment f = new Segment();

  public bo(Document paramDocument, int paramInt)
  {
    this.a = paramDocument;
    this.g = paramInt;
    this.b = ((AbstractDocument.AbstractElement)paramDocument.getDefaultRootElement());
    this.d = d(paramInt);
    this.e = this.d.b();
    c();
  }

  protected bk d(int paramInt)
  {
    return mb.a(paramInt);
  }

  public bk b()
  {
    return this.d;
  }

  public void c()
  {
    Element localElement = this.b.getElement(0);
    ((cw)localElement).a(this.e);
    a(0, true);
  }

  public void d()
  {
    this.c = false;
  }

  public void e()
  {
    this.c = true;
  }

  public void a(DocumentEvent paramDocumentEvent)
  {
    if (this.c)
      return;
    DocumentEvent.ElementChange localElementChange = paramDocumentEvent.getChange(this.b);
    int i;
    if (localElementChange != null)
    {
      Element[] arrayOfElement = localElementChange.getChildrenRemoved();
      for (int j = 0; j < arrayOfElement.length; j++)
        ((cw)arrayOfElement[j]).a(null);
      i = localElementChange.getChildrenAdded()[0].getStartOffset();
    }
    else
    {
      i = paramDocumentEvent.getOffset();
    }
    a(i, false);
  }

  public synchronized int a(int paramInt)
    throws BadLocationException
  {
    Element localElement = this.b.getElement(this.b.getElementIndex(paramInt));
    Object localObject = ((cw)localElement).b();
    int i = localElement.getStartOffset();
    int j = localElement.getEndOffset() - i;
    this.a.getText(i, j, this.f);
    b().a(this.f);
    b().a(localObject);
    int k = paramInt - i;
    return b().a(k);
  }

  public synchronized Object b(int paramInt)
    throws BadLocationException
  {
    int i = this.b.getElementIndex(paramInt);
    Element localElement = this.b.getElement(i);
    int j = localElement.getStartOffset();
    if (paramInt == j)
      return ((cw)localElement).b();
    if (paramInt == localElement.getEndOffset())
    {
      localObject = (AbstractDocument.AbstractElement)this.b.getChildAt(i + 1);
      if (localObject != null)
        return ((cw)localObject).b();
    }
    Object localObject = ((cw)localElement).b();
    this.a.getText(j, paramInt - j, this.f);
    b().a(this.f);
    b().a(localObject);
    return b().c();
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    int i = this.b.getElementIndex(paramInt);
    Object localObject1 = (AbstractDocument.AbstractElement)this.b.getElement(i);
    Object localObject2 = ((cw)localObject1).b();
    b().a(localObject2);
    Object localObject3;
    do
    {
      ((cw)localObject1).a(localObject2);
      i++;
      AbstractDocument.AbstractElement localAbstractElement = (AbstractDocument.AbstractElement)this.b.getChildAt(i);
      if (localAbstractElement == null)
        return true;
      localObject3 = ((cw)localAbstractElement).b();
      int j = ((AbstractDocument.AbstractElement)localObject1).getStartOffset();
      int k = localAbstractElement.getStartOffset();
      if (j > 0)
        j--;
      try
      {
        this.a.getText(j, k - j, this.f);
      }
      catch (Exception localException)
      {
        cl.a(localException);
        return false;
      }
      b().a(this.f);
      localObject2 = b().c();
      localObject1 = localAbstractElement;
    }
    while ((!localObject2.equals(localObject3)) || (paramBoolean));
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bo
 * JD-Core Version:    0.6.0
 */