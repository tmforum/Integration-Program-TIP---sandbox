/*******************************************************************************
 * Created with Tigerstripe(tm) Workbench v.0.4.5.v200901141537
 * Copyright (c) 2007 Cisco Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * DO NOT EDIT THIS FILE - Created with Tigerstripe(tm) Workbench
 *
 *******************************************************************************/
package org.tmforum.tip.common.events;


/**
 * This is the abstract definition used for all TMF Interface events.
 *
 * @tigerstripe.event
 *      isSingleExtensionType="false"
 *		isAbstract = "true"
 *		implements = ""
 *
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("
 *      generate = "true"
 *
 * @tigerstripe.stereotype st.name = "version"
 *    major = "00"
 *    minor = "01"
 *    revision = ""
 * 
 */
public class BaseEvent
 {




    /**
     * The uniqueness and the sequence of the notificationId are not guaranteed.
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "true"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public int notificationId;


    /**
     * The time at which the event was reported by the source system (NE, EMS or OS).
     * @tigerstripe.field 
     *  isOptional = "false"
     *  isReadOnly = "false"
     *  isOrdered = "false"
     *  isUnique = "true"
     *  typeMultiplicity = "1"
     *   ref-by = "value"
     *
     *
     * 
     */
	public primitive.time sourceTime;

}