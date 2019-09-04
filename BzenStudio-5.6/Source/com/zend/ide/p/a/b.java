package com.zend.ide.p.a;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.event.DocumentEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position.Bias;
import javax.swing.text.TabExpander;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class b extends View
  implements TabExpander
{
  protected View a;

  public b()
  {
    super(null);
  }

  public void a(View paramView)
  {
    this.a = paramView;
  }

  public View getParent()
  {
    return this.a.getParent();
  }

  public boolean isVisible()
  {
    return this.a.isVisible();
  }

  public float getPreferredSpan(int paramInt)
  {
    return this.a.getPreferredSpan(paramInt);
  }

  public float getMinimumSpan(int paramInt)
  {
    return this.a.getMinimumSpan(paramInt);
  }

  public float getMaximumSpan(int paramInt)
  {
    return this.a.getMaximumSpan(paramInt);
  }

  public void preferenceChanged(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a.preferenceChanged(paramView, paramBoolean1, paramBoolean2);
  }

  public float getAlignment(int paramInt)
  {
    return this.a.getAlignment(paramInt);
  }

  public void paint(Graphics paramGraphics, Shape paramShape)
  {
    this.a.paint(paramGraphics, paramShape);
  }

  public void setParent(View paramView)
  {
    this.a.setParent(paramView);
  }

  public int getViewCount()
  {
    return this.a.getViewCount();
  }

  public View getView(int paramInt)
  {
    return this.a.getView(paramInt);
  }

  public void removeAll()
  {
    this.a.removeAll();
  }

  public void remove(int paramInt)
  {
    this.a.remove(paramInt);
  }

  public void insert(int paramInt, View paramView)
  {
    this.a.insert(paramInt, paramView);
  }

  public void append(View paramView)
  {
    this.a.append(paramView);
  }

  public void replace(int paramInt1, int paramInt2, View[] paramArrayOfView)
  {
    this.a.replace(paramInt1, paramInt2, paramArrayOfView);
  }

  public int getViewIndex(int paramInt, Position.Bias paramBias)
  {
    return this.a.getViewIndex(paramInt, paramBias);
  }

  public Shape getChildAllocation(int paramInt, Shape paramShape)
  {
    return this.a.getChildAllocation(paramInt, paramShape);
  }

  public int getNextVisualPositionFrom(int paramInt1, Position.Bias paramBias, Shape paramShape, int paramInt2, Position.Bias[] paramArrayOfBias)
    throws BadLocationException
  {
    return this.a.getNextVisualPositionFrom(paramInt1, paramBias, paramShape, paramInt2, paramArrayOfBias);
  }

  public Shape modelToView(int paramInt, Shape paramShape, Position.Bias paramBias)
    throws BadLocationException
  {
    return this.a.modelToView(paramInt, paramShape, paramBias);
  }

  public Shape modelToView(int paramInt1, Position.Bias paramBias1, int paramInt2, Position.Bias paramBias2, Shape paramShape)
    throws BadLocationException
  {
    return this.a.modelToView(paramInt1, paramBias1, paramInt2, paramBias2, paramShape);
  }

  public int viewToModel(float paramFloat1, float paramFloat2, Shape paramShape, Position.Bias[] paramArrayOfBias)
  {
    return this.a.viewToModel(paramFloat1, paramFloat2, paramShape, paramArrayOfBias);
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    this.a.insertUpdate(paramDocumentEvent, paramShape, paramViewFactory);
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    this.a.removeUpdate(paramDocumentEvent, paramShape, paramViewFactory);
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory)
  {
    this.a.changedUpdate(paramDocumentEvent, paramShape, paramViewFactory);
  }

  public Document getDocument()
  {
    return this.a.getDocument();
  }

  public int getStartOffset()
  {
    return this.a.getStartOffset();
  }

  public int getEndOffset()
  {
    return this.a.getEndOffset();
  }

  public Element getElement()
  {
    return this.a.getElement();
  }

  public Graphics getGraphics()
  {
    return this.a.getGraphics();
  }

  public AttributeSet getAttributes()
  {
    return this.a.getAttributes();
  }

  public View breakView(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    return this.a.breakView(paramInt1, paramInt2, paramFloat1, paramFloat2);
  }

  public View createFragment(int paramInt1, int paramInt2)
  {
    return this.a.createFragment(paramInt1, paramInt2);
  }

  public int getBreakWeight(int paramInt, float paramFloat1, float paramFloat2)
  {
    return this.a.getBreakWeight(paramInt, paramFloat1, paramFloat2);
  }

  public int getResizeWeight(int paramInt)
  {
    return this.a.getResizeWeight(paramInt);
  }

  public void setSize(float paramFloat1, float paramFloat2)
  {
    this.a.setSize(paramFloat1, paramFloat2);
  }

  public Container getContainer()
  {
    return this.a.getContainer();
  }

  public ViewFactory getViewFactory()
  {
    return this.a.getViewFactory();
  }

  public String getToolTipText(float paramFloat1, float paramFloat2, Shape paramShape)
  {
    return this.a.getToolTipText(paramFloat1, paramFloat2, paramShape);
  }

  public int getViewIndex(float paramFloat1, float paramFloat2, Shape paramShape)
  {
    return this.a.getViewIndex(paramFloat1, paramFloat2, paramShape);
  }

  public float nextTabStop(float paramFloat, int paramInt)
  {
    return ((TabExpander)this.a).nextTabStop(paramFloat, paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.a.b
 * JD-Core Version:    0.6.0
 */