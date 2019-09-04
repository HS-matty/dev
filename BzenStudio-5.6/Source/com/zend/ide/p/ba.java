package com.zend.ide.p;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Window;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

public class ba extends JOptionPane
{
  public ba(Object paramObject, int paramInt1, int paramInt2)
  {
    super(paramObject, paramInt1, paramInt2);
    a(this);
  }

  public ba(Object paramObject, int paramInt1, int paramInt2, Icon paramIcon)
  {
    super(paramObject, paramInt1, paramInt2, paramIcon);
    a(this);
  }

  public ba(Object paramObject, int paramInt)
  {
    super(paramObject, paramInt);
    a(this);
  }

  public ba()
  {
    a(this);
  }

  public static String a(Component paramComponent, Object paramObject1, Object paramObject2)
  {
    return JOptionPane.showInputDialog(paramComponent, paramObject1, paramObject2);
  }

  public static String c(Component paramComponent, Object paramObject, String paramString, int paramInt)
  {
    return JOptionPane.showInputDialog(paramComponent, paramObject, paramString, paramInt);
  }

  public static Object a(Component paramComponent, Object paramObject1, String paramString, int paramInt, Icon paramIcon, Object[] paramArrayOfObject, Object paramObject2)
  {
    return JOptionPane.showInputDialog(paramComponent, paramObject1, paramString, paramInt, paramIcon, paramArrayOfObject, paramObject2);
  }

  public static void a(Component paramComponent, Object paramObject)
  {
    JOptionPane.showMessageDialog(paramComponent, paramObject);
  }

  public static void a(Component paramComponent, Object paramObject, String paramString, int paramInt)
  {
    JOptionPane.showMessageDialog(paramComponent, paramObject, paramString, paramInt);
  }

  public static int a(Component paramComponent, Object paramObject1, String paramString, int paramInt1, int paramInt2, Icon paramIcon, Object[] paramArrayOfObject, Object paramObject2)
  {
    return JOptionPane.showOptionDialog(paramComponent, paramObject1, paramString, paramInt1, paramInt2, paramIcon, paramArrayOfObject, paramObject2);
  }

  public static int b(Component paramComponent, Object paramObject, String paramString, int paramInt)
  {
    return a(paramComponent, paramObject, paramString, paramInt, 3);
  }

  public static int a(Component paramComponent, Object paramObject, String paramString, int paramInt1, int paramInt2)
  {
    return a(paramComponent, paramObject, paramString, paramInt1, paramInt2, null, false);
  }

  public static int a(Component paramComponent, Object paramObject, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a(paramComponent, paramObject, paramString, paramInt1, paramInt2, null, paramBoolean);
  }

  public static int a(Component paramComponent, Object paramObject, String paramString, int paramInt1, int paramInt2, Icon paramIcon, boolean paramBoolean)
  {
    ba localba = new ba(paramObject.toString(), paramInt2, paramInt1, paramIcon);
    com.zend.ide.i.n localn = (com.zend.ide.i.n)localba.createDialog(paramComponent, paramString);
    a(localn);
    if (paramBoolean)
      localn.setVisible(true);
    else
      localn.setVisible(true);
    int i = -1;
    Object localObject = localba.getValue();
    if ((localObject != null) && ((localObject instanceof Integer)))
      i = ((Integer)localObject).intValue();
    return i;
  }

  private static void a(Component paramComponent)
  {
    HashMap localHashMap = new HashMap();
    Component[] arrayOfComponent = b(paramComponent);
    int i = arrayOfComponent.length;
    for (int j = 0; j < i; j++)
    {
      if (!(arrayOfComponent[j] instanceof AbstractButton))
        continue;
      AbstractButton localAbstractButton = (AbstractButton)arrayOfComponent[j];
      String str = localAbstractButton.getText();
      if (str == null)
        continue;
      char c = str.charAt(0);
      Character localCharacter = new Character(c);
      if ((c < 'A') || (c > 'Z') || (localHashMap.containsKey(localCharacter)))
        continue;
      localHashMap.put(localCharacter, localCharacter);
      localAbstractButton.setMnemonic(c);
    }
  }

  public static Component[] b(Component paramComponent)
  {
    Vector localVector = new Vector();
    a(paramComponent, localVector);
    int i = localVector.size();
    Component[] arrayOfComponent = new Component[i];
    for (int j = 0; j < i; j++)
      arrayOfComponent[j] = ((Component)localVector.elementAt(j));
    localVector.removeAllElements();
    return arrayOfComponent;
  }

  private static void a(Component paramComponent, Vector paramVector)
  {
    if (paramComponent == null)
      return;
    if ((paramComponent instanceof Container))
    {
      Component[] arrayOfComponent = ((Container)paramComponent).getComponents();
      for (int i = 0; i < arrayOfComponent.length; i++)
      {
        paramVector.addElement(arrayOfComponent[i]);
        if (!(arrayOfComponent[i] instanceof Container))
          continue;
        a(arrayOfComponent[i], paramVector);
      }
    }
  }

  static Window c(Component paramComponent)
    throws HeadlessException
  {
    if (paramComponent == null)
      return getRootFrame();
    if (((paramComponent instanceof Frame)) || ((paramComponent instanceof Dialog)))
      return (Window)paramComponent;
    return c(paramComponent.getParent());
  }

  private static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 0:
      return 4;
    case 3:
      return 7;
    case 2:
      return 8;
    case 1:
      return 3;
    case -1:
    }
    return 2;
  }

  public JDialog createDialog(Component paramComponent, String paramString)
    throws HeadlessException
  {
    int i = a(getMessageType());
    return a(paramComponent, paramString, i);
  }

  private JDialog a(Component paramComponent, String paramString, int paramInt)
    throws HeadlessException
  {
    Window localWindow = c(paramComponent);
    com.zend.ide.i.n localn;
    if ((localWindow instanceof Frame))
      localn = new com.zend.ide.i.n((Frame)localWindow, paramString, true);
    else
      localn = new com.zend.ide.i.n((Dialog)localWindow, paramString, true);
    Container localContainer = localn.getContentPane();
    localContainer.setLayout(new BorderLayout());
    localContainer.add(this, "Center");
    localn.setResizable(false);
    if (com.zend.ide.i.n.isDefaultLookAndFeelDecorated())
    {
      boolean bool = UIManager.getLookAndFeel().getSupportsWindowDecorations();
      if (bool)
      {
        localn.setUndecorated(true);
        getRootPane().setWindowDecorationStyle(paramInt);
      }
    }
    localn.pack();
    localn.B();
    localn.addWindowListener(new h(this, localn));
    localn.addComponentListener(new f(this));
    addPropertyChangeListener(new n(this, localn));
    return localn;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ba
 * JD-Core Version:    0.6.0
 */