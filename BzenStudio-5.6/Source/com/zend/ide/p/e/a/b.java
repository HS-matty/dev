package com.zend.ide.p.e.a;

import com.zend.ide.util.cr;
import com.zend.ide.util.cv;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.UIDefaults.LazyInputMap;

public class b extends com.zend.ide.p.e.c
{
  public static final Color b = Color.lightGray;
  public static final Color c = Color.white;
  public static final Color d = new Color(0, 0, 102);
  public static final Color e = Color.white;
  public static final Color f = Color.black;

  protected void d()
  {
    super.d();
    UIDefaults localUIDefaults = b();
    localUIDefaults.put("MenuItemUI", r.class.getName());
    localUIDefaults.put("MenuUI", n.class.getName());
    localUIDefaults.put("TreeUI", j.class.getName());
    localUIDefaults.put("CheckBoxUI", h.class.getName());
    localUIDefaults.put("ButtonUI", g.class.getName());
    localUIDefaults.put("ScrollBarUI", e.class.getName());
    localUIDefaults.put("TabbedPaneUI", c.class.getName());
    localUIDefaults.put("ScrollBar.width", new Integer(14));
    Font localFont = cv.e();
    localUIDefaults.put("MenuItem.borderPainted", new Boolean(false));
    localUIDefaults.put("MenuItem.font", localFont);
    localUIDefaults.put("MenuItem.selectionForeground", e);
    localUIDefaults.put("MenuItem.selectionBackground", d);
    localUIDefaults.put("MenuItem.acceleratorSelectionForeground", e);
    localUIDefaults.put("MenuItem.acceleratorForeground", d);
    localUIDefaults.put("MenuBar.windowBindings", new Object[0]);
    localUIDefaults.put("MenuBar.selectionBackground", d);
    localUIDefaults.put("MenuBar.selectionForeground", e);
    localUIDefaults.put("Menu.borderPainted", new Boolean(false));
    localUIDefaults.put("Menu.font", localFont);
    localUIDefaults.put("Menu.selectionBackground", d);
    localUIDefaults.put("Menu.selectionForeground", e);
    localUIDefaults.put("Menu.acceleratorSelectionForeground", e);
    localUIDefaults.put("Menu.acceleratorForeground", d);
    localUIDefaults.put("PopupMenue.selectionBackground", d);
    localUIDefaults.put("PopupMenue.selectionForeground", e);
    localUIDefaults.put("ComboBox.selectionForeground", e);
    localUIDefaults.put("ComboBox.selectionBackground", d);
    localUIDefaults.put("ComboBox.font", localFont);
    localUIDefaults.put("Tree.selectionBackground", d);
    localUIDefaults.put("Tree.selectionBorderColor", d);
    localUIDefaults.put("Tree.selectionForeground", e);
    localUIDefaults.put("Tree.line", d);
    localUIDefaults.put("Tree.hash", com.zend.ide.p.e.b.c);
    localUIDefaults.put("Tree.font", localFont);
    localUIDefaults.put("Tree.collapsedIcon", cv.b("plus.gif"));
    localUIDefaults.put("Tree.expandedIcon", cv.b("minus.gif"));
    localUIDefaults.put("Table.selectionForeground", e);
    localUIDefaults.put("Table.selectionBackground", d);
    localUIDefaults.put("Table.font", localFont);
    localUIDefaults.put("List.selectionBackground", d);
    localUIDefaults.put("List.selectionForeground", e);
    localUIDefaults.put("List.font", localFont);
    localUIDefaults.put("TextField.selectionBackground", b);
    localUIDefaults.put("TextField.selectionForeground", c);
    localUIDefaults.put("TextField.font", localFont);
    localUIDefaults.put("TabbedPane.focus", f);
    localUIDefaults.put("TabbedPane.font", localFont);
    localUIDefaults.put("TabbedPane.ancestorInputMap", new UIDefaults.LazyInputMap(new Object[] { "ctrl TAB", "navigateRight", "ctrl shift TAB", "navigateLeft" }));
    localUIDefaults.put("ToolTip.background", new Color(254, 255, 225));
    localUIDefaults.put("ToolTip.font", localFont);
    localUIDefaults.put("FileChooser.upFolderIcon", cv.b("upfolder16.gif"));
    localUIDefaults.put("FileChooser.newFolderIcon", cv.b("explorer/closedfolder16.gif"));
    localUIDefaults.put("FileChooser.homeFolderIcon", cv.b("home16.gif"));
    localUIDefaults.put("FileChooser.font", localFont);
    localUIDefaults.put("PasswordField.selectionBackground", b);
    localUIDefaults.put("PasswordField.selectionForeground", c);
    localUIDefaults.put("EditorPane.selectionBackground", b);
    localUIDefaults.put("EditorPane.selectionForeground", c);
    localUIDefaults.put("TextPane.selectionBackground", b);
    localUIDefaults.put("TextPane.selectionForeground", c);
    localUIDefaults.put("Label.foreground", f);
    localUIDefaults.put("Label.font", localFont);
    localUIDefaults.put("Button.font", localFont);
    localUIDefaults.put("Button.focusInputMap", new UIDefaults.LazyInputMap(new Object[] { "ENTER", "pressed", "released ENTER", "released", "SPACE", "pressed", "released SPACE", "released" }));
    localUIDefaults.put("TitledBorder.font", localFont);
    localUIDefaults.put("TitledBorder.titleColor", f);
    localUIDefaults.put("CheckBox.font", localFont);
    localUIDefaults.put("RadioButton.font", localFont);
    localUIDefaults.put("TextArea.selectionBackground", b);
    localUIDefaults.put("TextArea.selectionForeground", c);
    localUIDefaults.put("TextArea.font", localFont);
    localUIDefaults.put("TableHeader.font", localFont);
    localUIDefaults.put("ToggleButton.font", localFont);
    UIDefaults.LazyInputMap localLazyInputMap1 = new UIDefaults.LazyInputMap(new Object[] { "ctrl C", "copy-to-clipboard", "ctrl V", "paste-from-clipboard", "ctrl X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift KP_LEFT", "selection-backward", "shift RIGHT", "selection-forward", "shift KP_RIGHT", "selection-forward", "ctrl LEFT", "caret-previous-word", "ctrl KP_LEFT", "caret-previous-word", "ctrl RIGHT", "caret-next-word", "ctrl KP_RIGHT", "caret-next-word", "ctrl shift LEFT", "selection-previous-word", "ctrl shift KP_LEFT", "selection-previous-word", "ctrl shift RIGHT", "selection-next-word", "ctrl shift KP_RIGHT", "selection-next-word", "HOME", "caret-begin-line", "END", "caret-end-line", "shift HOME", "selection-begin-line", "shift END", "selection-end-line", "UP", "caret-up", "KP_UP", "caret-up", "DOWN", "caret-down", "KP_DOWN", "caret-down", "PAGE_UP", "page-up", "PAGE_DOWN", "page-down", "shift PAGE_UP", "selection-page-up", "shift PAGE_DOWN", "selection-page-down", "ctrl shift PAGE_UP", "selection-page-left", "ctrl shift PAGE_DOWN", "selection-page-right", "shift UP", "selection-up", "shift KP_UP", "selection-up", "shift DOWN", "selection-down", "shift KP_DOWN", "selection-down", "ENTER", "insert-break", "BACK_SPACE", "delete-previous", "shift BACK_SPACE", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "TAB", "insert-tab", "ctrl BACK_SLASH", "unselect", "ctrl HOME", "caret-begin", "ctrl END", "caret-end", "ctrl shift HOME", "selection-begin", "ctrl shift END", "selection-end", "ctrl T", "next-link-action", "ctrl shift T", "previous-link-action", "ctrl SPACE", "activate-link-action" });
    UIDefaults.LazyInputMap localLazyInputMap2 = new UIDefaults.LazyInputMap(new Object[] { "ctrl C", "copy-to-clipboard", "ctrl V", "paste-from-clipboard", "ctrl X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift KP_LEFT", "selection-backward", "shift RIGHT", "selection-forward", "shift KP_RIGHT", "selection-forward", "ctrl LEFT", "caret-previous-word", "ctrl KP_LEFT", "caret-previous-word", "ctrl RIGHT", "caret-next-word", "ctrl KP_RIGHT", "caret-next-word", "ctrl shift LEFT", "selection-previous-word", "ctrl shift KP_LEFT", "selection-previous-word", "ctrl shift RIGHT", "selection-next-word", "ctrl shift KP_RIGHT", "selection-next-word", "HOME", "caret-begin-line", "END", "caret-end-line", "shift HOME", "selection-begin-line", "shift END", "selection-end-line", "BACK_SPACE", "delete-previous", "shift BACK_SPACE", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "ENTER", "notify-field-accept", "ctrl BACK_SLASH", "unselect" });
    localUIDefaults.put("TextArea.focusInputMap", localLazyInputMap1);
    localUIDefaults.put("TextPane.focusInputMap", localLazyInputMap1);
    localUIDefaults.put("EditorPane.focusInputMap", localLazyInputMap1);
    localUIDefaults.put("TextField.focusInputMap", localLazyInputMap2);
    localUIDefaults.put("PasswordField.focusInputMap", localLazyInputMap2);
    localUIDefaults.put("FormattedTextField.focusInputMap", new UIDefaults.LazyInputMap(new Object[] { "ctrl C", "copy-to-clipboard", "ctrl V", "paste-from-clipboard", "ctrl X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift KP_LEFT", "selection-backward", "shift RIGHT", "selection-forward", "shift KP_RIGHT", "selection-forward", "ctrl LEFT", "caret-previous-word", "ctrl KP_LEFT", "caret-previous-word", "ctrl RIGHT", "caret-next-word", "ctrl KP_RIGHT", "caret-next-word", "ctrl shift LEFT", "selection-previous-word", "ctrl shift KP_LEFT", "selection-previous-word", "ctrl shift RIGHT", "selection-next-word", "ctrl shift KP_RIGHT", "selection-next-word", "HOME", "caret-begin-line", "END", "caret-end-line", "shift HOME", "selection-begin-line", "shift END", "selection-end-line", "BACK_SPACE", "delete-previous", "shift BACK_SPACE", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "ENTER", "notify-field-accept", "ctrl BACK_SLASH", "unselect", "ESCAPE", "reset-field-edit", "UP", "increment", "KP_UP", "increment", "DOWN", "decrement", "KP_DOWN", "decrement" }));
    if (cr.c() == 3)
      a(localUIDefaults);
  }

  protected void a(UIDefaults paramUIDefaults)
  {
    UIDefaults.LazyInputMap localLazyInputMap1 = new UIDefaults.LazyInputMap(new Object[] { "meta C", "copy-to-clipboard", "meta V", "paste-from-clipboard", "meta X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift KP_LEFT", "selection-backward", "shift RIGHT", "selection-forward", "shift KP_RIGHT", "selection-forward", "alt LEFT", "caret-previous-word", "alt KP_LEFT", "caret-previous-word", "alt RIGHT", "caret-next-word", "alt KP_RIGHT", "caret-next-word", "alt shift LEFT", "selection-previous-word", "alt shift KP_LEFT", "selection-previous-word", "alt shift RIGHT", "selection-next-word", "alt shift KP_RIGHT", "selection-next-word", "meta A", "select-all", "meta LEFT", "caret-begin-line", "meta RIGHT", "caret-end-line", "meta shift LEFT", "selection-begin-line", "meta shift RIGHT", "selection-end-line", "typed \b", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "ENTER", "notify-field-accept", "meta BACK_SLASH", "unselect", "control shift O", "toggle-componentOrientation" });
    UIDefaults.LazyInputMap localLazyInputMap2 = new UIDefaults.LazyInputMap(new Object[] { "meta C", "copy-to-clipboard", "meta V", "paste-from-clipboard", "meta X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift KP_LEFT", "selection-backward", "shift RIGHT", "selection-forward", "shift KP_RIGHT", "selection-forward", "alt LEFT", "caret-previous-word", "alt KP_LEFT", "caret-previous-word", "alt RIGHT", "caret-next-word", "alt KP_RIGHT", "caret-next-word", "alt shift LEFT", "selection-previous-word", "alt shift KP_LEFT", "selection-previous-word", "alt shift RIGHT", "selection-next-word", "alt shift KP_RIGHT", "selection-next-word", "meta A", "select-all", "meta LEFT", "caret-begin-line", "meta RIGHT", "caret-end-line", "meta shift LEFT", "selection-begin-line", "meta shift RIGHT", "selection-end-line", "UP", "caret-up", "KP_UP", "caret-up", "DOWN", "caret-down", "KP_DOWN", "caret-down", "PAGE_UP", "page-up", "PAGE_DOWN", "page-down", "shift PAGE_UP", "selection-page-up", "shift PAGE_DOWN", "selection-page-down", "meta shift PAGE_UP", "selection-page-left", "meta shift PAGE_DOWN", "selection-page-right", "shift UP", "selection-up", "shift KP_UP", "selection-up", "shift DOWN", "selection-down", "shift KP_DOWN", "selection-down", "ENTER", "insert-break", "typed \b", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "TAB", "insert-tab", "meta BACK_SLASH", "unselect", "HOME", "caret-begin", "END", "caret-end", "shift HOME", "selection-begin", "shift END", "selection-end", "meta T", "next-link-action", "meta shift T", "previous-link-action", "meta SPACE", "activate-link-action", "control shift O", "toggle-componentOrientation" });
    UIDefaults.LazyInputMap localLazyInputMap3 = new UIDefaults.LazyInputMap(new Object[] { "SPACE", "pressed", "released SPACE", "released" });
    Object[] arrayOfObject = { "CheckBox.focusInputMap", localLazyInputMap3, "ComboBox.ancestorInputMap", new UIDefaults.LazyInputMap(new Object[] { "ESCAPE", "hidePopup", "PAGE_UP", "pageUpPassThrough", "PAGE_DOWN", "pageDownPassThrough", "HOME", "homePassThrough", "END", "endPassThrough", "ENTER", "enterPressed" }), "EditorPane.focusInputMap", localLazyInputMap2, "FormattedTextField.focusInputMap", new UIDefaults.LazyInputMap(new Object[] { "ctrl C", "copy-to-clipboard", "ctrl V", "paste-from-clipboard", "ctrl X", "cut-to-clipboard", "COPY", "copy-to-clipboard", "PASTE", "paste-from-clipboard", "CUT", "cut-to-clipboard", "shift LEFT", "selection-backward", "shift KP_LEFT", "selection-backward", "shift RIGHT", "selection-forward", "shift KP_RIGHT", "selection-forward", "ctrl LEFT", "caret-previous-word", "ctrl KP_LEFT", "caret-previous-word", "ctrl RIGHT", "caret-next-word", "ctrl KP_RIGHT", "caret-next-word", "ctrl shift LEFT", "selection-previous-word", "ctrl shift KP_LEFT", "selection-previous-word", "ctrl shift RIGHT", "selection-next-word", "ctrl shift KP_RIGHT", "selection-next-word", "ctrl A", "select-all", "HOME", "caret-begin-line", "END", "caret-end-line", "shift HOME", "selection-begin-line", "shift END", "selection-end-line", "typed \b", "delete-previous", "DELETE", "delete-next", "RIGHT", "caret-forward", "LEFT", "caret-backward", "KP_RIGHT", "caret-forward", "KP_LEFT", "caret-backward", "ENTER", "notify-field-accept", "ctrl BACK_SLASH", "unselect", "control shift O", "toggle-componentOrientation", "ESCAPE", "reset-field-edit", "UP", "increment", "KP_UP", "increment", "DOWN", "decrement", "KP_DOWN", "decrement" }), "InternalFrame.windowBindings", { "shift ESCAPE", "showSystemMenu", "ctrl SPACE", "showSystemMenu", "ESCAPE", "hideSystemMenu" }, "OptionPane.windowBindings", { "ESCAPE", "close" }, "PasswordField.focusInputMap", localLazyInputMap1, "RadioButton.focusInputMap", localLazyInputMap3, "ScrollBar.focusInputMap", new UIDefaults.LazyInputMap(new Object[] { "RIGHT", "positiveUnitIncrement", "KP_RIGHT", "positiveUnitIncrement", "DOWN", "positiveUnitIncrement", "KP_DOWN", "positiveUnitIncrement", "PAGE_DOWN", "positiveBlockIncrement", "LEFT", "negativeUnitIncrement", "KP_LEFT", "negativeUnitIncrement", "UP", "negativeUnitIncrement", "KP_UP", "negativeUnitIncrement", "PAGE_UP", "negativeBlockIncrement", "HOME", "minScroll", "END", "maxScroll" }), "ScrollBar.focusInputMap.RightToLeft", new UIDefaults.LazyInputMap(new Object[] { "RIGHT", "negativeUnitIncrement", "KP_RIGHT", "negativeUnitIncrement", "LEFT", "positiveUnitIncrement", "KP_LEFT", "positiveUnitIncrement" }), "Slider.focusInputMap", new UIDefaults.LazyInputMap(new Object[] { "RIGHT", "positiveUnitIncrement", "KP_RIGHT", "positiveUnitIncrement", "DOWN", "negativeUnitIncrement", "KP_DOWN", "negativeUnitIncrement", "PAGE_DOWN", "negativeBlockIncrement", "LEFT", "negativeUnitIncrement", "KP_LEFT", "negativeUnitIncrement", "UP", "positiveUnitIncrement", "KP_UP", "positiveUnitIncrement", "PAGE_UP", "positiveBlockIncrement", "HOME", "minScroll", "END", "maxScroll" }), "Slider.focusInputMap.RightToLeft", new UIDefaults.LazyInputMap(new Object[] { "RIGHT", "negativeUnitIncrement", "KP_RIGHT", "negativeUnitIncrement", "LEFT", "positiveUnitIncrement", "KP_LEFT", "positiveUnitIncrement" }), "Spinner.ancestorInputMap", new UIDefaults.LazyInputMap(new Object[] { "UP", "increment", "KP_UP", "increment", "DOWN", "decrement", "KP_DOWN", "decrement" }), "TextArea.focusInputMap", localLazyInputMap2, "TextField.focusInputMap", localLazyInputMap1, "TextPane.focusInputMap", localLazyInputMap2, "ToggleButton.focusInputMap", localLazyInputMap3 };
    paramUIDefaults.putDefaults(arrayOfObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.b
 * JD-Core Version:    0.6.0
 */