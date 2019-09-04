package com.zend.ide.n;

import com.zend.ide.n.td.a.s;
import com.zend.ide.n.td.bc;
import java.beans.PropertyChangeEvent;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTextAreaUI;
import javax.swing.text.Caret;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;
import javax.swing.text.View;

public class ha extends BasicTextAreaUI
{
  private static final EditorKit a = new hg();
  private static boolean b = bc.b();
  protected View c;

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new ha();
  }

  public View create(Element paramElement)
  {
    if (this.c == null)
      this.c = a(paramElement);
    boolean bool1 = ((gx)getComponent()).getLineWrap();
    if (bool1)
    {
      boolean bool2 = ((gx)getComponent()).getWrapStyleWord();
      ((ih)this.c).a(paramElement, bool2);
    }
    else
    {
      ((ih)this.c).a(paramElement);
    }
    return this.c;
  }

  protected View a(Element paramElement)
  {
    if (b)
      return null;
    return new ih();
  }

  public void a(boolean paramBoolean)
  {
    if ((this.c instanceof s))
      ((s)this.c).a(paramBoolean);
    else if ((this.c instanceof ih))
      ((ih)this.c).a(paramBoolean);
  }

  public EditorKit getEditorKit(JTextComponent paramJTextComponent)
  {
    return a;
  }

  protected void installKeyboardActions()
  {
    super.installKeyboardActions();
    EditorKit localEditorKit = getEditorKit(getComponent());
    Action[] arrayOfAction = localEditorKit.getActions();
    ActionMap localActionMap = getComponent().getActionMap();
    for (int i = 0; i < arrayOfAction.length; i++)
    {
      localObject = arrayOfAction[i];
      localActionMap.put(((Action)localObject).getValue("Name"), (Action)localObject);
    }
    Keymap localKeymap = getComponent().getKeymap();
    Object localObject = JTextComponent.addKeymap(null, localKeymap);
    getComponent().setKeymap((Keymap)localObject);
  }

  protected void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    super.propertyChange(paramPropertyChangeEvent);
    if (paramPropertyChangeEvent.getPropertyName().equals("tabSize"))
      modelChanged();
  }

  protected Caret createCaret()
  {
    return new hb();
  }

  static
  {
    UIManager.getDefaults().put("PHPEditorPaneBasicUI", ha.class.getName());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ha
 * JD-Core Version:    0.6.0
 */