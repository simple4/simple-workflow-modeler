package net.simpleframework.workflow.modeler.navigation;

import static net.simpleframework.common.I18n.$m;

import javax.swing.Icon;
import javax.swing.JPopupMenu;

import net.simpleframework.workflow.modeler.ApplicationActions;
import net.simpleframework.workflow.modeler.process.ModelNewAction;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class NodeProcessModels extends NavigationTreeNode {

	@Override
	public Icon getIcon() {
		return ApplicationActions.processModelIcon;
	}

	public NodeConnection getNodeConnection() {
		return (NodeConnection) getParent();
	}

	@Override
	public JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(new ModelNewAction(this));
		}
		return popupMenu;
	}

	@Override
	public String toString() {
		return $m("NodeProcessModels.0");
	}
}
