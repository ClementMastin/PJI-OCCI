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

/**
 * Connector EFactory for the OCCI extension:
 * - name: orchestration
 * - scheme: http://occiware.org/orchestration#
 */
public class ConnectorFactory extends orchestration.impl.OrchestrationFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://occiware.org/orchestration#
	 * - term: robot
	 * - title: 
	 */
	@Override
	public orchestration.Robot createRobot() {
		return new RobotConnector();
	}

}
