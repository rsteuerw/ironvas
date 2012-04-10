/*
 * Project: ironvas
 * Package: test.java.de.fhhannover.inform.trust.ironvas
 * File:    NvtTest.java
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

import org.junit.Before;
import org.junit.Test;

import de.fhhannover.inform.trust.ironvas.Nvt;
import de.fhhannover.inform.trust.ironvas.RiskfactorLevel;
import static org.junit.Assert.*;

public class NvtTest {

	private Nvt n1Equalsn2;
	private Nvt n2Equalsn1;
	private Nvt n3;
	
	@Before
	public void setUp() {
		n1Equalsn2 = new Nvt(
				"1.3.6.1.4.1.25623.1.0.800615",
				"Cscope putstring Multiple Buffer Overflow vulnerability",
				9.3f,
				RiskfactorLevel.Critical,
				"CVE-2009-1577",
				"NOBID");
		n2Equalsn1 = new Nvt(
				"1.3.6.1.4.1.25623.1.0.800615",
				"Cscope putstring Multiple Buffer Overflow vulnerability",
				9.3f,
				RiskfactorLevel.Critical,
				"CVE-2009-1577",
				"NOBID");
		n3 = new Nvt(
				"3.3.6.1.4.1.25623.1.0.800615",
				"Cscope putstring Multiple Buffer Overflow vulnerability",
				9.3f,
				RiskfactorLevel.Critical,
				"CVE-2009-1577",
				"NOBID");
	}

	@Test
	public void testEquals() {
		assertEquals(n1Equalsn2, n2Equalsn1);
		assertFalse(n1Equalsn2.equals(n3));
	}
	
	public void testHashCode() {
		assertEquals(n1Equalsn2.hashCode(), n2Equalsn1.hashCode());
		assertFalse(n1Equalsn2.hashCode() == n3.hashCode());
	}
	
	
}