package com.zend.ide.p.e.b;

import com.zend.ide.p.e.c;
import com.zend.ide.util.cr;
import com.zend.ide.util.cv;
import javax.swing.UIDefaults;
import javax.swing.UIDefaults.LazyInputMap;
import javax.swing.UIDefaults.ProxyLazyValue;

public class b extends c
{
  protected void d()
  {
    super.d();
    int i = cr.a().indexOf("XP") != -1 ? 1 : 0;
    UIDefaults localUIDefaults = b();
    localUIDefaults.put("FileChooser.homeFolderIcon", cv.b("home16.gif"));
    localUIDefaults.put("Button.showMnemonics", Boolean.TRUE);
    localUIDefaults.put("MenuUI", l.class.getName());
    localUIDefaults.put("MenuItemUI", j.class.getName());
    localUIDefaults.put("ProgressBarUI", n.class.getName());
    localUIDefaults.put("CheckBoxUI", e.class.getName());
    localUIDefaults.put("ButtonUI", d.class.getName());
    localUIDefaults.put("TabbedPaneUI", m.class.getName());
    Integer localInteger1 = new Integer(0);
    Integer localInteger2 = new Integer(12);
    UIDefaults.ProxyLazyValue localProxyLazyValue = new UIDefaults.ProxyLazyValue("javax.swing.plaf.FontUIResource", null, new Object[] { "Dialog", localInteger1, localInteger2 });
    localUIDefaults.put("FontsLabelUI", a.class.getName());
    localUIDefaults.put("TextArea.font", localProxyLazyValue);
    if (i == 0)
      localUIDefaults.put("ToggleButtonUI", h.class.getName());
    localUIDefaults.put("MenuBar.windowBindings", new Object[0]);
    UIDefaults.LazyInputMap localLazyInputMap = new UIDefaults.LazyInputMap(new Object[] { "control C", "copy-to-clipboard", "control V", "paste-from-clipboard", "control X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "control INSERT", "copy-to-clipboard", "shift INSERT", "paste-from-clipboard", "shift DELETE", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift RIGHT", "selection-forward", "control LEFT", "caret-previous-word", "control RIGHT", "caret-next-word", "control shift LEFT", "selection-previous-word", "control shift RIGHT", "selection-next-word", "control A", "select-all", "control BACK_SLASH", "unselect", "HOME", "caret-begin-line", "END", "caret-end-line", "shift HOME", "selection-begin-line", "shift END", "selection-end-line", "control HOME", "caret-begin", "control END", "caret-end", "control shift HOME", "selection-begin", "control shift END", "selection-end", "UP", "caret-up", "DOWN", "caret-down", "BACK_SPACE", "delete-previous", "shift BACK_SPACE", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "PAGE_UP", "page-up", "PAGE_DOWN", "page-down", "shift PAGE_UP", "selection-page-up", "shift PAGE_DOWN", "selection-page-down", "ctrl shift PAGE_UP", "selection-page-left", "ctrl shift PAGE_DOWN", "selection-page-right", "shift UP", "selection-up", "shift DOWN", "selection-down", "ENTER", "insert-break", "TAB", "insert-tab", "control T", "next-link-action", "control shift T", "previous-link-action", "control SPACE", "activate-link-action" });
    localUIDefaults.put("TextArea.focusInputMap", localLazyInputMap);
    localUIDefaults.put("TextPane.focusInputMap", localLazyInputMap);
    localUIDefaults.put("EditorPane.focusInputMap", localLazyInputMap);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.b
 * JD-Core Version:    0.6.0
 */