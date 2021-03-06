/* 
 * PROJECT: FLARToolkit
 * --------------------------------------------------------------------------------
 * This work is based on the original ARToolKit developed by
 *   Hirokazu Kato
 *   Mark Billinghurst
 *   HITLab, University of Washington, Seattle
 * http://www.hitl.washington.edu/artoolkit/
 *
 * The FLARToolkit is Java version ARToolkit class library.
 * Copyright (C)2008 R.Iizuka
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this framework; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * For further information please contact.
 *	http://nyatla.jp/nyatoolkit/
 *	<airmail(at)ebony.plala.or.jp>
 * 
 */
package org.libspark.flartoolkit.core.raster;

import org.libspark.flartoolkit.core.rasterreader.IFLARBufferReader;
import org.libspark.flartoolkit.core.rasterreader.FLARBufferReader;
import org.libspark.flartoolkit.core.types.*;

public final class FLARGlayscaleRaster extends FLARRaster_BasicClass
{

	protected int[][] _ref_buf;
	private IFLARBufferReader _buffer_reader;
	
	public FLARGlayscaleRaster(int i_width, int i_height)
	{
		super(new FLARIntSize(i_width,i_height));
		this._ref_buf = new int[i_height][i_width];
		this._buffer_reader=new FLARBufferReader(this._ref_buf,IFLARBufferReader.BUFFERFORMAT_INT2D_GLAY_8);
	}
	public IFLARBufferReader getBufferReader()
	{
		return this._buffer_reader;
	}
}
