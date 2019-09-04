package com.zend.ide.desktop;

import java.awt.AWTKeyStroke;
import java.awt.Component;
import java.awt.Container;
import java.awt.DefaultKeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Set;
import javax.swing.JTabbedPane;

class mc extends DefaultKeyboardFocusManager
{
  public void focusNextComponent(Component paramComponent)
  {
    Container localContainer = paramComponent.getFocusCycleRootAncestor();
    if ((localContainer instanceof JTabbedPane))
    {
      JTabbedPane localJTabbedPane = (JTabbedPane)localContainer;
      int i = (localJTabbedPane.getSelectedIndex() + 1) % localJTabbedPane.getTabCount();
      localJTabbedPane.setSelectedIndex(i);
      localJTabbedPane.getSelectedComponent().requestFocus();
      return;
    }
    super.focusNextComponent(paramComponent);
  }

  public void focusPreviousComponent(Component paramComponent)
  {
    Container localContainer = paramComponent.getFocusCycleRootAncestor();
    if ((localContainer instanceof JTabbedPane))
    {
      JTabbedPane localJTabbedPane = (JTabbedPane)localContainer;
      int i = localJTabbedPane.getSelectedIndex() - 1;
      if (i < 0)
        i = localJTabbedPane.getTabCount() - 1;
      localJTabbedPane.setSelectedIndex(i);
      return;
    }
    super.focusPreviousComponent(paramComponent);
  }

  public void processKeyEvent(Component paramComponent, KeyEvent paramKeyEvent)
  {
    if ((paramComponent.getFocusTraversalKeysEnabled()) && (!paramKeyEvent.isConsumed()))
    {
      AWTKeyStroke localAWTKeyStroke1 = AWTKeyStroke.getAWTKeyStrokeForEvent(paramKeyEvent);
      AWTKeyStroke localAWTKeyStroke2 = AWTKeyStroke.getAWTKeyStroke(localAWTKeyStroke1.getKeyCode(), localAWTKeyStroke1.getModifiers(), !localAWTKeyStroke1.isOnKeyRelease());
      Set localSet = paramComponent.getFocusTraversalKeys(0);
      boolean bool1 = localSet.contains(localAWTKeyStroke1);
      boolean bool2 = localSet.contains(localAWTKeyStroke2);
      if ((bool1) || (bool2))
      {
        if (bool1)
          focusNextComponent(paramComponent);
        paramKeyEvent.consume();
        return;
      }
      localSet = paramComponent.getFocusTraversalKeys(1);
      bool1 = localSet.contains(localAWTKeyStroke1);
      bool2 = localSet.contains(localAWTKeyStroke2);
      if ((bool1) || (bool2))
      {
        if (bool1)
          focusPreviousComponent(paramComponent);
        paramKeyEvent.consume();
        return;
      }
      localSet = paramComponent.getFocusTraversalKeys(2);
      bool1 = localSet.contains(localAWTKeyStroke1);
      bool2 = localSet.contains(localAWTKeyStroke2);
      if ((bool1) || (bool2))
      {
        if (bool1)
          upFocusCycle(paramComponent);
        paramKeyEvent.consume();
        return;
      }
      if ((!(paramComponent instanceof Container)) || (!((Container)paramComponent).isFocusCycleRoot()))
        return;
      localSet = paramComponent.getFocusTraversalKeys(3);
      bool1 = localSet.contains(localAWTKeyStroke1);
      bool2 = localSet.contains(localAWTKeyStroke2);
      if ((bool1) || (bool2))
      {
        if (bool1)
          downFocusCycle((Container)paramComponent);
        paramKeyEvent.consume();
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.mc
 * JD-Core Version:    0.6.0
 */