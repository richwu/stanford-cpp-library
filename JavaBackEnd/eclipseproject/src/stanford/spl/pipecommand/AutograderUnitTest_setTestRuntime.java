package stanford.spl.pipecommand;

import stanford.spl.AutograderUnitTestGUI;
import stanford.spl.JBECommand;
import stanford.spl.JavaBackEnd;
import stanford.spl.SplPipeDecoder;
import acm.util.TokenScanner;

public class AutograderUnitTest_setTestRuntime extends JBECommand {

	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		String testName = SplPipeDecoder.readAndDecode(paramTokenScanner);
		paramTokenScanner.verifyToken(",");
		int runtime = nextInt(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		AutograderUnitTestGUI gui = AutograderUnitTestGUI.getInstance(paramJavaBackEnd);
		gui.setTestRuntime(testName, runtime);
	}
}
