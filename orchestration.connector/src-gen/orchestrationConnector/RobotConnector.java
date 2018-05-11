/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Fri Apr 20 14:04:07 CEST 2018 from platform:/resource/orchestration/model/orchestration.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package orchestrationConnector;

import org.ros.RosRun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import orchestration.impl.RobotImpl;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/orchestration#
 * - term: robot
 * - title: 
 */
public class RobotConnector extends orchestration.impl.RobotImpl
{
	/**
	 * Initialize the logger.
	 * 
	 *
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RobotConnector.class);

	
	private RobotImpl robot;
	
	
	// Start of user code Robotconnector_constructor
	/**
	 * Constructs a robot connector.
	 */
	RobotConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		this.robot = new RobotImpl();
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code RobotocciCreate
	/**
	 * Called when this Robot instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		try {
		}catch(Exception e) {
			LOGGER.debug("Exception");
		}
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Robot_occiRetrieve_method
	/**
	 * Called when this Robot instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Robot_occiUpdate_method
	/**
	 * Called when this Robot instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code RobotocciDelete_method
	/**
	 * Called when this Robot instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Robot actions.
	//

	// Start of user code Robot_Kind_parler_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/orchestration/robot/action#
     * - term: parler
     * - title: 
	 */
	@Override
	public void parler()
	{
		LOGGER.debug("Action parler() called on " + this);
		this.robot.parler();

		// TODO: Implement how to parler this robot.
	}
	// End of user code
		


}	
