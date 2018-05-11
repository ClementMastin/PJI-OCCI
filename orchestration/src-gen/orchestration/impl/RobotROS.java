package orchestration.impl;

import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;
import org.ros.message.MessageListener;

public class RobotROS extends AbstractNodeMain {

	
	private Publisher<std_msgs.String> publi;
	private Subscriber<std_msgs.String> subs;
	
	@Override
	public GraphName getDefaultNodeName() {
		// TODO Auto-generated method stub
		return GraphName.of("rosjava/chatter");	}
	
	public RobotROS() {
		super();
	}
	
	public void onStart(final ConnectedNode node) {
		System.err.println("J'entre dans la fontion onStart");
		final Publisher<std_msgs.String>  p = node.newPublisher("chatter", std_msgs.String._TYPE);
		this.publi = p;
		this.subs = node.newSubscriber("chatter", std_msgs.String._TYPE);
		this.subs.addMessageListener(new Listener());
	}
	
	public void parler() {
		std_msgs.String mes = publi.newMessage();
		mes.setData("Hello World!");
		publi.publish(mes);
	}

	
	private class Listener implements MessageListener<std_msgs.String>{
		public void onNewMessage(std_msgs.String message) {
			System.out.println(message.getData());
		}
	}
	
}
