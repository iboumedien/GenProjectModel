/*******************************************************************************
 * // Copyright ==========
 * Copyright (c) 2008-2014 G Rosenberg.
 * // Copyright ==========
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 * // Contributor ==========
 *		G Rosenberg - initial API and implementation
 * // Contributor ==========
 *
 * Versions:
 * // Version ==========
 * 		1.0 - 2014.03.26: First release level code
 * 		1.1 - 2014.08.26: Updates, add Tests support
 * // Version ==========
 *******************************************************************************/
// IDescriptorClass ==========
package net.certiv.json.converter;

public interface IDescriptor {

	public void initialize();

	public Value processOnEntry();

	public Value processOnExit();

	public Value process(String property);

	public Value process();

	public void setCollectComments(boolean collect);

	public boolean getCollectComments();

	public void setLeftComment(String comment);

	public void setRightComment(String comment);

	public String getLeftComment();

	public String getRightComment();

	public String toString();
}

// IDescriptorClass ==========
