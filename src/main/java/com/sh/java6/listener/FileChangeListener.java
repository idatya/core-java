package com.sh.java6.listener;

/**
 * @author Rafael Steil
 * @version $Id: FileChangeListener.java,v 1.4 2006/08/23 02:13:44 rafaelsteil Exp $
 */
public interface FileChangeListener
{
	/**
	 * Invoked when a file changes
	 * 
	 * @param filename Name of the changed file
	 */
	public void fileChanged(String filename);
}
