package stanford.spl.pipecommand;

import stanford.spl.GSlider;
import stanford.spl.JBECommand;
import stanford.spl.JavaBackEnd;
import stanford.spl.SplPipeDecoder;
import acm.graphics.GObject;
import acm.util.TokenScanner;

public class GSlider_getPaintLabels extends JBECommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		String interactorID = nextString(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		boolean result = false;
		GObject localGObject = paramJavaBackEnd.getGObject(interactorID);
		if (localGObject != null && localGObject instanceof GSlider) {
			result = ((GSlider) localGObject).getPaintLabels();
		}
		SplPipeDecoder.writeResult(result);
	}
}
