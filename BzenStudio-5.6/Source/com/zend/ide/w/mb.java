package com.zend.ide.w;

import com.zend.ide.h.bl;
import com.zend.ide.n.hk;
import com.zend.ide.util.d.a;
import com.zend.ide.util.es;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.util.HashMap;
import javax.swing.JTree;

class mb extends bl
{
  final fb a;

  mb(fb paramfb)
  {
  }

  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    Component localComponent = super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    if (!this.a.f)
      return localComponent;
    es locales = (es)paramObject;
    Object localObject = locales.getUserObject();
    if ((localObject instanceof File))
    {
      File localFile = (File)localObject;
      String str = localFile.getPath();
      if ((localFile.isDirectory()) && (!this.a.c.k(str)))
        return fb.a(this.a).getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
      if ((!localFile.isDirectory()) && (!this.a.c.k(localFile.getParent())))
        return fb.a(this.a).getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
      hk localhk = null;
      if ((!localFile.isDirectory()) && (this.a.c.i(str)))
      {
        localhk = (hk)fb.b(this.a).get(str);
        if (localhk == null)
        {
          localhk = (hk)this.a.a.b(this.a.d.a(((File)localObject).getPath(), null));
          fb.b(this.a).put(str, localhk);
        }
      }
      else if ((localFile.isDirectory()) && (this.a.c.j(str)))
      {
        localhk = (hk)this.a.a.b(3);
      }
      if (localhk == null)
        localhk = (hk)this.a.a.b(0);
      setOpaque(false);
      setBackground(null);
      Font localFont;
      if (localhk != null)
      {
        if (this.selected)
        {
          setForeground(localComponent.getForeground());
        }
        else
        {
          setForeground(localhk.b());
          if (localhk.d())
          {
            setOpaque(true);
            setBackground(localhk.c());
          }
        }
        localFont = getFont();
        if (localFont.getStyle() != localhk.e())
          setFont(localFont.deriveFont(localhk.e()));
      }
      else
      {
        localFont = getFont();
        setFont(localFont.deriveFont(0));
      }
    }
    return localComponent;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.mb
 * JD-Core Version:    0.6.0
 */