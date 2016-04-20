package org.geogebra.common.gui.dialog.handler;

import org.geogebra.common.kernel.commands.AlgebraProcessor;
import org.geogebra.common.main.App;
import org.geogebra.common.util.AsyncOperation;

/**
 * Handler of a number, with possibility of changing the sign
 * 
 * @author mathieu
 * 
 */
public class NumberChangeSignInputHandler extends NumberInputHandler {
	public NumberChangeSignInputHandler(AlgebraProcessor algebraProcessor, AsyncOperation callback, App app, boolean oldVal) {
		super(algebraProcessor, callback, app, oldVal);
	}
	
  /**
   * If (changeSign==true), change sign of the number handled
   * 
   * @param inputString
   * @param changeSign
   * @return number handled
   */
	public void processInput(String inputString, boolean changeSign,
			AsyncOperation<Boolean> callback) {
		if (changeSign) {
			StringBuilder sb = new StringBuilder();
			sb.append("-(");
			sb.append(inputString);
			sb.append(")");
			processInput(sb.toString(), callback);
		} else {

			processInput(inputString, callback);
    }
  }
}
