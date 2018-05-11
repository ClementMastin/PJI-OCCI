package orchestration;

import org.ros.RosCore;
import org.ros.internal.node.server.master.MasterServer;
import org.ros.node.NodeMainExecutor;

public class App {

	private NodeMainExecutor run;
	
	private static App instance = new App();
	
	private RosCore ros;
	
	private MasterServer server;
	
	private App() {
		this.ros = RosCore.newPublic();
		this.server = ros.getMasterServer();
		this.server.start();
	}
}
