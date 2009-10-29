/*******************************************************************************
 * Created with Tigerstripe(tm) Workbench v.0.5.0.200908271716NGT
 * Copyright (c) 2007 Cisco Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * DO NOT EDIT THIS FILE - Created with Tigerstripe(tm) Workbench
 *
 *******************************************************************************/
package org.tmforum.tip.samples.mep;


/**
 * 
 *
 * @tigerstripe.sessionFacade
 *		isAbstract = "false"
 *		implements = ""
 * @tigerstripe.interface package = "$artifact.IStandardSpecifics.InterfaceProperties.get("
 *      generate = "true"
 *
 *
 *
 *
 * * 
 */
public abstract class SimpleOperations
 {



    /**
     * Sample operation associated with OneWay MEP.
     * @tigerstripe.method 
     *  iteratorReturn = "false"
     *  isOptional = "false"
	 *  isAbstract = "false"
     *  isOrdered = "false"
     *  isUnique = "false"
     *  typeMultiplicity = "1"
     *  returnName = ""
     *  visibility = "public"
     *   @tigerstripe.method-arg 
	 *     name="attribute1" 
     *     isOrdered = "false"
     *     isUnique = "true"
     *     typeMultiplicity = "1"
     *     direction = "in"
	 *     ref-by = "" 
     
     *
     * @tigerstripe.stereotype st.name = "tipOperation"
     *     isIdempotent = "false"
     *     bulkTransferPattern = "NONE"
     *     isOneWay = "false"
     *     emitEvents = "false"
     *	   emittedEvents = ""	
	     *     isExtendable = "false"
     * 
     * @tigerstripe.property ts.id = "ossj.method"
     *   ts.id = "ossj.method"
     *   simple = "true"
     *   byTemplates = "false"
     *   byTemplate = "false"
     *   byTemplatesBestEffort = "false"
     *   byTemplateBestEffort = "false"
     *   simpleByKey = "false"
     *   bulkAtomic = "false"
     *   bulkBestEffort = "false"
     *   instanceMethod = "true"
     *   bulkAtomicByKeys = "false"
     *   bulkBestEffortByKeys = "false"
     *
     */
	public abstract void oneWay(
						java.lang.String attribute1
		
				)
		;

    /**
     * 
     * @tigerstripe.method 
     *  iteratorReturn = "false"
     *  isOptional = "false"
	 *  isAbstract = "false"
     *  isOrdered = "false"
     *  isUnique = "false"
     *  typeMultiplicity = "1"
     *  returnName = ""
     *  visibility = "public"
     *   @tigerstripe.method-arg 
	 *     name="inAttribute" 
     *     isOrdered = "false"
     *     isUnique = "true"
     *     typeMultiplicity = "1"
     *     direction = "in"
	 *     ref-by = "" 
     
     *   @tigerstripe.method-arg 
	 *     name="inOutAttribute" 
     *     isOrdered = "false"
     *     isUnique = "true"
     *     typeMultiplicity = "1"
     *     direction = "inOut"
	 *     ref-by = "" 
     
     *   @tigerstripe.method-arg 
	 *     name="outAttribute" 
     *     isOrdered = "false"
     *     isUnique = "true"
     *     typeMultiplicity = "1"
     *     direction = "out"
	 *     ref-by = "" 
     
     *
     * @tigerstripe.stereotype st.name = "tipOperation"
     *     isIdempotent = "false"
     *     bulkTransferPattern = "NONE"
     *     isOneWay = "false"
     *     emitEvents = "false"
     *	   emittedEvents = ""	
	     *     isExtendable = "false"
     * 
     * @tigerstripe.property ts.id = "ossj.method"
     *   ts.id = "ossj.method"
     *   simple = "true"
     *   byTemplates = "false"
     *   byTemplate = "false"
     *   byTemplatesBestEffort = "false"
     *   byTemplateBestEffort = "false"
     *   simpleByKey = "false"
     *   bulkAtomic = "false"
     *   bulkBestEffort = "false"
     *   bulkAtomicByKeys = "false"
     *   instanceMethod = "true"
     *   bulkBestEffortByKeys = "false"
     *
     */
	public abstract void requestResponse(
						java.lang.String inAttribute
		
							, 
				java.lang.String inOutAttribute
		
							, 
				java.lang.String outAttribute
		
				)
		;

}
