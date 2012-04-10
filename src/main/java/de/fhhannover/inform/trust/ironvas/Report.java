/*
 * Project: ironvas
 * Package: main.java.de.fhhannover.inform.trust.ironvas
 * File:    Report.java
 *
 * Copyright (C) 2011-2012 Fachhochschule Hannover
 * Ricklinger Stadtweg 118, 30459 Hannover, Germany 
 *
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.fhhannover.inform.trust.ironvas;

import java.util.List;

/**
 * Simple POJO to store information related to a report of an OpenVAS
 * task.
 * 
 * @author Ralf Steuerwald
 *
 */
public class Report {
	
	public final String taskId;
	public final List<Vulnerability> vulnerabilities;
	
	public Report(String taskId, List<Vulnerability> vulnerabilities) {
		super();
		this.taskId = taskId;
		this.vulnerabilities = vulnerabilities;
	}
}