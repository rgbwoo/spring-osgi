/*
 * Copyright 2002-2006 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.osgi.test.platform;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

/**
 * @author Costin Leau
 * 
 */
public class FelixPlatformTest extends AbstractOsgiPlatformTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.osgi.test.platform.AbstractOsgiPlatformTest#assertCorrectPlatform(org.osgi.framework.BundleContext)
	 */
	protected void assertCorrectPlatform(BundleContext context) {
		assertSame("Apache Software Foundation", context.getProperty(Constants.FRAMEWORK_VENDOR));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.osgi.test.platform.AbstractOsgiPlatformTest#createOsgiPlatform()
	 */
	protected OsgiPlatform createOsgiPlatform() {
		return new FelixPlatform();
	}

}