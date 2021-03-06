package stanford.spl.pipecommand;

import stanford.spl.JBECommand;
import stanford.spl.JavaBackEnd;
import acm.util.TokenScanner;

public class JBEConsole_setExitOnClose extends JBECommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		boolean bool = nextString(paramTokenScanner).equals("true");
		paramTokenScanner.verifyToken(")");
		paramJavaBackEnd.setExitOnConsoleClose(bool);
	}
}
