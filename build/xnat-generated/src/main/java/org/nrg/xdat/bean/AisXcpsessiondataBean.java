/*
 * GENERATED FILE
 * Created on Thu Aug 22 10:09:07 ACST 2024
 *
 */
package org.nrg.xdat.bean;
import org.apache.log4j.Logger;
import org.nrg.xdat.bean.base.BaseElement;

import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE 
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public class AisXcpsessiondataBean extends XnatImagesessiondataBean implements java.io.Serializable, org.nrg.xdat.model.AisXcpsessiondataI {
	public static final Logger logger = Logger.getLogger(AisXcpsessiondataBean.class);
	public static final String SCHEMA_ELEMENT_NAME="ais:xcpSessionData";

	public String getSchemaElementName(){
		return "xcpSessionData";
	}

	public String getFullSchemaElementName(){
		return "ais:xcpSessionData";
	}

	//FIELD

	private Double _ImageResolution=null;

	/**
	 * @return Returns the image_resolution.
	 */
	public Double getImageResolution() {
		return _ImageResolution;
	}

	/**
	 * Sets the value for image_resolution.
	 * @param v Value to Set.
	 */
	public void setImageResolution(Double v){
		_ImageResolution=v;
	}

	/**
	 * Sets the value for image_resolution.
	 * @param v Value to Set.
	 */
	public void setImageResolution(String v)  {
		_ImageResolution=formatDouble(v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("image_resolution")){
			setImageResolution(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("image_resolution")){
			return getImageResolution();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("image_resolution")){
			return BaseElement.field_data;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("image_resolution");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<ais:xcpSessionData");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:ais","http://australian-imaging-service.github.io/");
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:icr","http://icr.ac.uk/icr");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</ais:xcpSessionData>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM xcpSessionData -> imageSessionData
		if (_ImageResolution!=null){
			writer.write("\n" + createHeader(header++) + "<ais:image_resolution");
			writer.write(">");
			writer.write(ValueParser(_ImageResolution,"float"));
			writer.write("</ais:image_resolution>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<ais:image_resolution");
			writer.write("/>");
			header--;
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_ImageResolution!=null) return true;
		return true;//REQUIRED image_resolution
	}
}
