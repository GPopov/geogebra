/* JLMSI10.java
 * =========================================================================
 * This file is part of the JLaTeXMath Library - http://forge.scilab.org/jlatexmath
 *
 * Copyright (C) 2018 DENIZET Calixte
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 *
 * Linking this library statically or dynamically with other modules
 * is making a combined work based on this library. Thus, the terms
 * and conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce
 * an executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under terms
 * of your choice, provided that you also meet, for each linked independent
 * module, the terms and conditions of the license of that module.
 * An independent module is a module which is not derived from or based
 * on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obliged to do so.
 * If you do not wish to do so, delete this exception statement from your
 * version.
 *
 */

package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.FontInfo;

final class JLMSI10 extends FontInfo {

	JLMSI10(final String ttfPath) {
		super(0, ttfPath, 0, 0.333334, 1.000003, '\u0000');
	}

	@Override
	protected final void initMetrics() {
		setInfo('\u0021', // char code: 33
				new double[] { 0.662, 0.448, 0., 0.058 }, // metrics: width,
															// height, depth,
															// italic
				null, // ligatures
				null, // kern codes
				null, // kern values
				null, '\0', // next larger
				null); // extension: top, mid, rep, bot
		setInfo('\u0024', // char code: 36
				new double[] { 0.662, 0.448, 0., 0 }, // metrics: width, height,
														// depth, italic
				null, // ligatures
				null, // kern codes
				null, // kern values
				null, '\0', // next larger
				null); // extension: top, mid, rep, bot
		setInfo('\"', // char code: 34
				new double[] { 0.441, 0.448, 0., 0.048 }, // metrics: width,
															// height, depth,
															// italic
				null, // ligatures
				null, // kern codes
				null, // kern values
				null, '\0', // next larger
				null); // extension: top, mid, rep, bot
		setInfo('\u0023', // char code: 35
				new double[] { 0.441, 0.448, 0., -0.002 }, // metrics: width,
															// height, depth,
															// italic
				null, // ligatures
				null, // kern codes
				null, // kern values
				null, '\0', // next larger
				null); // extension: top, mid, rep, bot
		setInfo('\u0025', // char code: 37
				new double[] { 1.159, 0.751, 0., 0.050 }, // metrics: width,
															// height, depth,
															// italic
				null, // ligatures
				null, // kern codes
				null, // kern values
				null, '\0', // next larger
				null); // extension: top, mid, rep, bot
		setInfo('\u0026', // char code: 38
				new double[] { 1.533, 0.751, 0., 0.050 }, // metrics: width,
															// height, depth,
															// italic
				null, // ligatures
				null, // kern codes
				null, // kern values
				null, '\0', // next larger
				null); // extension: top, mid, rep, bot
	}
}
