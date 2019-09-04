package com.zend.ide.n.a;

import com.zend.ide.n.dz;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentEvent.ElementChange;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.MutableAttributeSet;

public class d
  implements DocumentListener
{
  final b a;

  protected d(b paramb)
  {
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    a(paramDocumentEvent);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    a(paramDocumentEvent);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  protected void a(DocumentEvent paramDocumentEvent)
  {
    Document localDocument = paramDocumentEvent.getDocument();
    DocumentEvent.ElementChange localElementChange = paramDocumentEvent.getChange(localDocument.getDefaultRootElement());
    if (localElementChange != null)
      a(localDocument, localElementChange);
    else
      a(localDocument, paramDocumentEvent);
  }

  protected void a(Document paramDocument, DocumentEvent paramDocumentEvent)
  {
    int i = paramDocumentEvent.getOffset();
    Element localElement1 = paramDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
    e locale = (e)localElement2.getAttributes().getAttribute(this.a.c());
    if ((locale != null) && (i == localElement2.getStartOffset()))
      this.a.a(locale, locale.b());
  }

  protected void a(Document paramDocument, DocumentEvent.ElementChange paramElementChange)
  {
    dz localdz = (dz)paramDocument;
    int i = paramElementChange.getIndex();
    Element[] arrayOfElement1 = paramElementChange.getChildrenAdded();
    Element[] arrayOfElement2 = paramElementChange.getChildrenRemoved();
    int j = arrayOfElement1.length;
    Vector localVector = null;
    for (int k = j - 1; k >= 0; k--)
    {
      localObject1 = (e)arrayOfElement1[k].getAttributes().getAttribute(this.a.c());
      if (localObject1 == null)
        continue;
      if (localVector == null)
        localVector = new Vector();
      if (!localVector.contains(localObject1))
      {
        ((e)localObject1).a(i + k);
        localVector.add(localObject1);
      }
      else
      {
        ((MutableAttributeSet)arrayOfElement1[k].getAttributes()).removeAttribute(this.a.c());
      }
    }
    for (k = 0; k < arrayOfElement2.length; k++)
    {
      localObject1 = (e)arrayOfElement2[k].getAttributes().getAttribute(this.a.c());
      if (localObject1 == null)
        continue;
      this.a.b((e)localObject1);
    }
    k = arrayOfElement1.length - arrayOfElement2.length;
    Object localObject1 = localdz.k();
    Iterator localIterator = this.a.b((String)localObject1).iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = (e)localIterator.next();
      int m = ((e)localObject2).b() + k;
      if (m > i + j - 1)
        this.a.a((e)localObject2, m);
    }
    if (localVector != null)
    {
      localObject2 = localVector.elements();
      while (((Enumeration)localObject2).hasMoreElements())
      {
        e locale = (e)((Enumeration)localObject2).nextElement();
        this.a.a(locale);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.d
 * JD-Core Version:    0.6.0
 */