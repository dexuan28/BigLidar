/*
 * Copyright 2017 Marcel Reutegger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.gmu.stc;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LASTest {

    private static final String LAZ_NAME = "Bmore_XYZIRGB333.las";
   

    private static File target = new File("target");
    private static File laz = new File(target, LAZ_NAME);

        
        public static void main(String[] args){ 
        	LASReader reader = new LASReader(laz);
            LASHeader header = reader.getHeader();
            long numPoints = 0;
            System.out.println(header);
            for (LASPoint p : reader.getPoints()) {
                numPoints++;
                //System.out.println("For"+numPoints+"th point, X value= "+p.getX()+", Y value= "+p.getY()+", Z value= "+p.getZ());
        }
}
}

	