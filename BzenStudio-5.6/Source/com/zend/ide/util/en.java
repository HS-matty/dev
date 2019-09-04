package com.zend.ide.util;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class en extends JTabbedPane
  implements bn, cu
{
  protected bs a = new bt(this);
  protected u c;
  private String d = "";

  public en()
  {
    this("TabbedPaneContext");
  }

  public en(String paramString)
  {
    super(3);
    setFocusable(false);
    setFocusCycleRoot(true);
    addContainerListener(new h(this));
    addChangeListener(new by(this));
    this.d = paramString;
    e();
  }

  protected void p()
  {
    Component localComponent = getSelectedComponent();
    if (localComponent != null)
      localComponent.requestFocus();
    else
      requestFocus();
  }

  protected void fireStateChanged()
  {
    try
    {
      super.fireStateChanged();
    }
    catch (RuntimeException localRuntimeException)
    {
      cl.a("Exception from ITabbedPane.fireStateChanged(internal java exception): " + localRuntimeException.getMessage());
    }
  }

  public bs t()
  {
    return this.a;
  }

  protected u d()
  {
    return new u(this);
  }

  protected void e()
  {
    this.c = d();
    this.c.b();
  }

  public int a(Component paramComponent)
  {
    int i = getTabCount();
    for (int j = 0; j < i; j++)
    {
      JComponent localJComponent = (JComponent)getComponentAt(j);
      if (((localJComponent != null) && ((localJComponent.equals(paramComponent)) || (localJComponent.isAncestorOf(paramComponent)))) || ((localJComponent == null) && (localJComponent == paramComponent)))
        return j;
    }
    return -1;
  }

  public boolean a(int paramInt, boolean paramBoolean)
  {
    Component localComponent = getComponentAt(paramInt);
    boolean bool = true;
    if ((paramBoolean) && ((localComponent instanceof cu)))
      bool = ((cu)localComponent).d(false);
    if (bool)
      removeTabAt(paramInt);
    return bool;
  }

  public boolean a(Component paramComponent, boolean paramBoolean)
  {
    return a(a(paramComponent), paramBoolean);
  }

  public void removeTabAt(int paramInt)
  {
    Component localComponent1 = getComponentAt(paramInt);
    Component localComponent2 = getSelectedComponent();
    super.removeTabAt(paramInt);
    int i = getSelectedIndex();
    if ((localComponent1 == localComponent2) && ((i == -1) || (i == paramInt)))
      fireStateChanged();
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public boolean d(boolean paramBoolean)
  {
    return a(!paramBoolean);
  }

  public boolean a(boolean paramBoolean)
  {
    while ((getComponentCount() > 0) && (a(0, paramBoolean)));
    if (getComponentCount() == 0);
    return this.a.d(!paramBoolean);
  }

  public boolean b(boolean paramBoolean)
  {
    boolean bool = true;
    Component localComponent = getSelectedComponent();
    Component[] arrayOfComponent = getComponents();
    for (int i = 0; i < arrayOfComponent.length; i++)
    {
      if (arrayOfComponent[i] == localComponent)
        continue;
      bool &= a(arrayOfComponent[i], paramBoolean);
    }
    return bool;
  }

  public bb q()
  {
    return this.c;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.d = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.d;
  }

  public void a(bn parambn)
  {
    this.c.a(parambn.q());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.en
 * JD-Core Version:    0.6.0
 */