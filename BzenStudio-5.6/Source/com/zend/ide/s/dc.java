package com.zend.ide.s;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.v.x;
import javax.swing.ActionMap;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;

class dc extends x
{
  final db b;

  private dc(db paramdb)
  {
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    JTextComponent localJTextComponent = ((bw)paramdz).e();
    localJTextComponent.addFocusListener(new i(this));
    localJTextComponent.addHierarchyListener(new zb(this));
    localJTextComponent.addAncestorListener(new ac(this));
    localJTextComponent.addCaretListener(new cc(this));
    Keymap localKeymap = localJTextComponent.getKeymap();
    localKeymap.setDefaultAction(new di(this.b, localKeymap.getDefaultAction(), null));
    ActionMap localActionMap = localJTextComponent.getActionMap();
    int i = 4;
    dh localdh1 = new dh(this.b, localActionMap.get("caret-up"), i);
    localActionMap.put("caret-up", localdh1);
    i = 5;
    dh localdh2 = new dh(this.b, localActionMap.get("caret-down"), i);
    localActionMap.put("caret-down", localdh2);
    i = 2;
    dh localdh3 = new dh(this.b, localActionMap.get("caret-backward"), i);
    localActionMap.put("caret-backward", localdh3);
    i = 3;
    dh localdh4 = new dh(this.b, localActionMap.get("caret-forward"), i);
    localActionMap.put("caret-forward", localdh4);
    i = 6;
    dh localdh5 = new dh(this.b, localActionMap.get("page-up"), i);
    localActionMap.put("page-up", localdh5);
    i = 7;
    dh localdh6 = new dh(this.b, localActionMap.get("page-down"), i);
    localActionMap.put("page-down", localdh6);
    i = 8;
    dh localdh7 = new dh(this.b, localActionMap.get("caret-begin-line"), i);
    localActionMap.put("caret-begin-line", localdh7);
    i = 9;
    dh localdh8 = new dh(this.b, localActionMap.get("caret-end-line"), i);
    localActionMap.put("caret-end-line", localdh8);
    i = 12;
    dh localdh9 = new dh(this.b, localActionMap.get("delete-previous"), i);
    localActionMap.put("delete-previous", localdh9);
    i = 10;
    dh localdh10 = new dh(this.b, localActionMap.get("insert-break"), i);
    localActionMap.put("insert-break", localdh10);
    i = 11;
    dh localdh11 = new dh(this.b, localActionMap.get("insert-tab"), i);
    localActionMap.put("insert-tab", localdh11);
    i = 13;
    dh localdh12 = new dh(this.b, localActionMap.get("caret-begin"), i);
    localActionMap.put("caret-begin", localdh12);
    i = 14;
    dh localdh13 = new dh(this.b, localActionMap.get("caret-end"), i);
    localActionMap.put("caret-end", localdh13);
  }

  public void a(dz paramdz)
  {
    db.a(this.b).j();
  }

  dc(db paramdb, cm paramcm)
  {
    this(paramdb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.dc
 * JD-Core Version:    0.6.0
 */