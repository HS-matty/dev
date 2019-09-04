package com.zend.ide.bc;

import com.zend.ide.bd.c;
import com.zend.ide.util.bi;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.help.CSH;
import javax.help.CSH.DisplayHelpAfterTracking;
import javax.help.CSH.DisplayHelpFromSource;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class a
  implements cu
{
  private static final String e = bi.a("HELP_PATH");
  private static HelpBroker a;
  private static HelpSet b;
  private static Action f = new b();
  private static Map g = new HashMap();

  private static void b()
  {
    ClassLoader localClassLoader = a.class.getClassLoader();
    try
    {
      URL localURL = HelpSet.findHelpSet(localClassLoader, e);
      b = new HelpSet(null, localURL);
      a = new f(b);
      Iterator localIterator1 = g.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        ArrayList localArrayList = (ArrayList)g.get(str);
        Iterator localIterator2 = localArrayList.iterator();
        while (localIterator2.hasNext())
        {
          Component localComponent = (Component)localIterator2.next();
          a.enableHelpKey(localComponent, str, b);
        }
      }
    }
    catch (Exception localException)
    {
      com.zend.ide.util.a.b.a(new dj(ct.a(1261)));
      cl.a(localException);
      ((JComponent)c.b().h().getContentPane()).getActionMap().put("error", f);
      ((JComponent)c.b().h().getContentPane()).getInputMap(2).put(KeyStroke.getKeyStroke("F1"), "error");
      return;
    }
  }

  private static HelpBroker c()
  {
    if (a == null)
      b();
    return a;
  }

  public static void a(Component paramComponent, String paramString)
  {
    if (g.get(paramString) == null)
      g.put(paramString, new ArrayList());
    ((ArrayList)g.get(paramString)).add(paramComponent);
    Component[] arrayOfComponent = null;
    if ((paramComponent instanceof JComponent))
      arrayOfComponent = ((JComponent)paramComponent).getComponents();
    else if ((paramComponent instanceof JDialog))
      arrayOfComponent = ((JDialog)paramComponent).getComponents();
    if (arrayOfComponent != null)
      for (int i = 0; i < arrayOfComponent.length; i++)
        a(arrayOfComponent[i], paramString);
    if (a == null)
      return;
    a.enableHelpKey(paramComponent, paramString, b);
  }

  public static boolean a()
  {
    return a != null;
  }

  public static boolean a(Component paramComponent)
  {
    Iterator localIterator = g.values().iterator();
    while (localIterator.hasNext())
    {
      ArrayList localArrayList = (ArrayList)localIterator.next();
      if (localArrayList.contains(paramComponent))
        return true;
    }
    return false;
  }

  public static void a(ActionEvent paramActionEvent)
  {
    if (c() == null)
      return;
    new CSH.DisplayHelpFromSource(c()).actionPerformed(paramActionEvent);
  }

  public static void a(String paramString, ActionEvent paramActionEvent)
  {
    if (c() == null)
      return;
    new CSH.DisplayHelpFromSource(c()).actionPerformed(paramActionEvent);
    c().setCurrentID(paramString);
  }

  public static void a(Component paramComponent, ActionEvent paramActionEvent)
  {
    if (c() == null)
      return;
    String str = CSH.getHelpIDString(paramComponent);
    if ((str == null) || (str.equals("")))
      return;
    new CSH.DisplayHelpFromSource(c()).actionPerformed(paramActionEvent);
    c().setCurrentID(str);
  }

  public static void b(ActionEvent paramActionEvent)
  {
    if (c() == null)
      return;
    new CSH.DisplayHelpAfterTracking(c()).actionPerformed(paramActionEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bc.a
 * JD-Core Version:    0.6.0
 */