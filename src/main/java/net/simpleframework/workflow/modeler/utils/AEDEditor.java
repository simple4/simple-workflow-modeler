package net.simpleframework.workflow.modeler.utils;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public abstract class AEDEditor extends OkCancelDialog {

	protected Object rowData;

	public AEDEditor(final String title, final Object... element) {
		super(title, element);
	}

	public Object getRowData() {
		return rowData;
	}

	public void setRowData(final Object rowData) {
		this.rowData = rowData;
	}
}
