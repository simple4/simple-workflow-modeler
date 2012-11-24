package net.simpleframework.workflow.modeler.process;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.common.coll.KVMap;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class EndNodeEditor extends AbstractEditorDialog {

	public EndNodeEditor(final ModelGraph modelGraph, final TaskCell cell) {
		super($m("EndNodeEditor.0"), modelGraph, cell);
	}

	@Override
	protected KVMap getTabbedComponents() {
		return null;
	}
}
