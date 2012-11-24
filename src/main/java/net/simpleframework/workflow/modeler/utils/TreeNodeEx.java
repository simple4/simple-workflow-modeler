package net.simpleframework.workflow.modeler.utils;

import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JPopupMenu;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public abstract class TreeNodeEx extends DefaultMutableTreeNode {
	public abstract Icon getIcon();

	protected JPopupMenu popupMenu;

	public JPopupMenu getPopupMenu() {
		return popupMenu;
	}

	public boolean isExpanded() {
		return false;
	}

	public void mouseDbClicked(final MouseEvent e) {
	}

	public void valueChanged(final TreeSelectionEvent e) {
	}
}
