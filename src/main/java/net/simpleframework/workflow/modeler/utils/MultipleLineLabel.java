package net.simpleframework.workflow.modeler.utils;

import javax.swing.JTextArea;
import javax.swing.LookAndFeel;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
@SuppressWarnings("serial")
public class MultipleLineLabel extends JTextArea {

	public MultipleLineLabel() {
		this(null);
	}

	public MultipleLineLabel(final String title) {
		super();
		setEditable(false);
		setLineWrap(true);
		setWrapStyleWord(true);
		setText(title);
	}

	@Override
	public void updateUI() {
		LookAndFeel.installBorder(this, "Label.border");
		LookAndFeel.installColorsAndFont(this, "Label.background", "Label.foreground", "Label.font");
		super.updateUI();
		LookAndFeel.installColorsAndFont(this, "Label.background", "Label.foreground", "Label.font");
	}
}
