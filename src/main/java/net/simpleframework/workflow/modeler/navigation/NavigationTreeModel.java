package net.simpleframework.workflow.modeler.navigation;

import javax.swing.tree.DefaultTreeModel;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class NavigationTreeModel extends DefaultTreeModel {

	public NavigationTreeModel() {
		super(new NodeRoot());
	}

	@Override
	public NodeRoot getRoot() {
		return (NodeRoot) super.getRoot();
	}
}
