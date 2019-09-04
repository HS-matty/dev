package com.zend.ide.desktop;

import com.zend.ide.be.m;
import com.zend.ide.k.b;
import com.zend.ide.util.dr;
import com.zend.ide.util.r;
import com.zend.ide.util.s;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class fc extends s
  implements r, b, m
{
  fl h;
  final fa g;

  public fc(fa paramfa)
  {
    b();
  }

  public void b()
  {
    ActionMap localActionMap = this.g.c().getActionMap();
    this.h = new fl(this);
    a(this.h);
    Object localObject = new fg(this.g);
    localActionMap.put("deleteEntryActionKey", (Action)localObject);
    KeyStroke localKeyStroke1 = KeyStroke.getKeyStroke(127, 0);
    this.g.c().getInputMap(1).put(localKeyStroke1, "deleteEntryActionKey");
    localObject = new dr(this, new fh(this.g), this.h);
    localActionMap.put("openNextEntryActionKey", (Action)localObject);
    KeyStroke localKeyStroke2 = KeyStroke.getKeyStroke(10, 0);
    this.g.c().getInputMap(1).put(localKeyStroke2, "openSelectedEntryActionKey");
    a("keys.openNextEntry", (Action)localObject, fa.a(this.g), false);
    this.h.b((Action)localObject);
    localObject = new fi(this.g);
    localActionMap.put("openSelectedEntryActionKey", (Action)localObject);
    a("keys.openSelectedEntry", (Action)localObject, fa.a(this.g), false);
    localObject = new fe(this.g);
    localActionMap.put("clearAllKey", (Action)localObject);
    a("keys.clear", (Action)localObject, fa.a(this.g), false);
    localActionMap.put("closeMessageComponentActionKey", new ff(this.g));
  }

  public void c()
  {
    e();
  }

  public void a(String paramString)
  {
    e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.fc
 * JD-Core Version:    0.6.0
 */