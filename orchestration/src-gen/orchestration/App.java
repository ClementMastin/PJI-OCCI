package orchestration;

import java.net.URI;
import java.net.URISyntaxException;

import org.ros.RosCore;
import org.ros.RosRun;
import org.ros.internal.node.server.master.MasterServer;
import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeConfiguration;
import org.ros.node.NodeMainExecutor;


import orchestration.impl.RobotROS;

public class App {

	private NodeMainExecutor run;
	private NodeConfiguration config;
	private RobotROS robot;
	
	private static App instance = new App();
	
	private RosCore ros;
	
	private MasterServer server;
	
	private App()  {
		/*this.ros = RosCore.newPublic();
		this.server = ros.getMasterServer();
		this.server.start();
		this.ros.start();
		System.err.println(this.ros.getUri());*/
		this.robot = new RobotROS();
		String[] arg = {"RobotROS"};
		try{RosRun.main(arg);}
		catch(Exception e) {}
		//this.run = DefaultNodeMainExecutor.newDefault();
		//try {
		//this.config = NodeConfiguration.newPublic("169.254.0.0"/*, new URI("http://dkm-VirtualBox:46504/")*/);
		//}catch(Exception e) {}
		//this.run.execute(robot, this.config);
	}
	
	public static void parler() {
		instance.robot.parler();
	}
}
