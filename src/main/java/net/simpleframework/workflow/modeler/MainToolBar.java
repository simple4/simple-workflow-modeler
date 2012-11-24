package net.simpleframework.workflow.modeler;

import net.simpleframework.workflow.modeler.ApplicationActions.AboutAction;
import net.simpleframework.workflow.modeler.ApplicationActions.NewConnectionAction;
import net.simpleframework.workflow.modeler.utils.JToolBarEx;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class MainToolBar extends JToolBarEx {

	@Override
	protected void createActions(final Object... objects) {
		add(new NewConnectionAction());
		add(new AboutAction());
		addSeparator();
		add(new AboutAction());
	}
}
