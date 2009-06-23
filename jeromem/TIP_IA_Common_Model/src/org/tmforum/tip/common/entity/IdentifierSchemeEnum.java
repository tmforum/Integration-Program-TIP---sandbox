/*******************************************************************************
 * Created with Tigerstripe(tm) Workbench v.0.4.6.v200905071426
 * Copyright (c) 2007 Cisco Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * DO NOT EDIT THIS FILE - Created with Tigerstripe(tm) Workbench
 *
 *******************************************************************************/
package org.tmforum.tip.common.entity;


/**
 * The enumeration of all the supported TIP EID schemes.
Need to be extendable.
 *
 * @tigerstripe.enum
 *		isAbstract = "false"
 *      base-type="String"
 *      extensible="false"
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("
 *      generate = "true"
 * * 
 */
public abstract class IdentifierSchemeEnum
 {


    /**
     * The OSSJ EID style.
     * @tigerstripe.label
     *  value = '"1"'
     *  
     *
     * 
     */
    public final static java.lang.String OSSJ = "1";


    /**
     * The mTOP EID style.
     * @tigerstripe.label
     *  value = '"2"'
     *  
     *
     * 
     */
    public final static java.lang.String MTOP = "2";


    /**
     * The TIP EID scheme
     * @tigerstripe.label
     *  value = '"3"'
     *  
     *
     * 
     */
    public final static java.lang.String TIP = "3";

}