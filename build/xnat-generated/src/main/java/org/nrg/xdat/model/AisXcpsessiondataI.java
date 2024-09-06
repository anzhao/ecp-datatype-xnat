/*
 * GENERATED FILE
 * Created on Thu Aug 22 10:09:07 ACST 2024
 *
 */
package org.nrg.xdat.model;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author XDAT
 *
 */
public interface AisXcpsessiondataI extends XnatImagesessiondataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the image_resolution.
	 */
	public Double getImageResolution();

	/**
	 * Sets the value for image_resolution.
	 * @param v Value to Set.
	 */
	public void setImageResolution(Double v);
}
