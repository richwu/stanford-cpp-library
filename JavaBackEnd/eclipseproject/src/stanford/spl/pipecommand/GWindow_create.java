package stanford.spl.pipecommand;

import stanford.spl.JBECommand;
import stanford.spl.JavaBackEnd;
import stanford.spl.TopCompound;
import acm.util.TokenScanner;

public class GWindow_create extends JBECommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		String str1 = nextString(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		int width = nextInt(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		int height = nextInt(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		String str2 = nextString(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		boolean visible = nextBoolean(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		paramJavaBackEnd.createWindow(str1, width, height,
				(TopCompound) paramJavaBackEnd.getGObject(str2), visible);
		paramJavaBackEnd.println("result:ok");
	}
}