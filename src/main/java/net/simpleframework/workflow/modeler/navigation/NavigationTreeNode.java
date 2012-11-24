package net.simpleframework.workflow.modeler.navigation;

import javax.swing.tree.TreePath;

import net.simpleframework.workflow.modeler.Application;
import net.simpleframework.workflow.modeler.utils.TreeNodeEx;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public abstract class NavigationTreeNode extends TreeNodeEx {

	public NavigationTree getTree() {
		return Application.get().getMainPane().getNavigationTree();
	}

	public void expand() {
		getTree().expandPath(new TreePath(getPath()));
	}
}
