/*
 * GENERATED FILE
 * Created on Thu Aug 22 10:09:07 ACST 2024
 *
 */

/**
 * @author XDAT
 *
 */

function ais_xcpSessionData(){
this.xsiType="ais:xcpSessionData";

	this.getSchemaElementName=function(){
		return "xcpSessionData";
	}

	this.getFullSchemaElementName=function(){
		return "ais:xcpSessionData";
	}
this.extension=dynamicJSLoad('xnat_imageSessionData','generated/xnat_imageSessionData.js');

	this.ImageResolution=null;


	function getImageResolution() {
		return this.ImageResolution;
	}
	this.getImageResolution=getImageResolution;


	function setImageResolution(v){
		this.ImageResolution=v;
	}
	this.setImageResolution=setImageResolution;


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="imageSessionData"){
				return this.Imagesessiondata ;
			} else 
			if(xmlPath.startsWith("imageSessionData")){
				xmlPath=xmlPath.substring(16);
				if(xmlPath=="")return this.Imagesessiondata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Imagesessiondata!=undefined)return this.Imagesessiondata.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="image_resolution"){
				return this.ImageResolution ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			{
				return this.extension.getProperty(xmlPath);
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="imageSessionData"){
				this.Imagesessiondata=value;
			} else 
			if(xmlPath.startsWith("imageSessionData")){
				xmlPath=xmlPath.substring(16);
				if(xmlPath=="")return this.Imagesessiondata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Imagesessiondata!=undefined){
					this.Imagesessiondata.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Imagesessiondata= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Imagesessiondata= instanciateObject("xnat:imageSessionData");//omUtils.js
						}
						if(options && options.where)this.Imagesessiondata.setProperty(options.where.field,options.where.value);
						this.Imagesessiondata.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="image_resolution"){
				this.ImageResolution=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			{
				return this.extension.setProperty(xmlPath,value);
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
			this.extension.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
			return this.extension.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="image_resolution"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ais:xcpSessionData";
		xmlTxt+=this.getXMLAtts();
		xmlTxt+=" xmlns:ais=\"http://australian-imaging-service.github.io/\"";
		xmlTxt+=" xmlns:arc=\"http://nrg.wustl.edu/arc\"";
		xmlTxt+=" xmlns:cat=\"http://nrg.wustl.edu/catalog\"";
		xmlTxt+=" xmlns:icr=\"http://icr.ac.uk/icr\"";
		xmlTxt+=" xmlns:pipe=\"http://nrg.wustl.edu/pipe\"";
		xmlTxt+=" xmlns:prov=\"http://www.nbirn.net/prov\"";
		xmlTxt+=" xmlns:scr=\"http://nrg.wustl.edu/scr\"";
		xmlTxt+=" xmlns:val=\"http://nrg.wustl.edu/val\"";
		xmlTxt+=" xmlns:wrk=\"http://nrg.wustl.edu/workflow\"";
		xmlTxt+=" xmlns:xdat=\"http://nrg.wustl.edu/security\"";
		xmlTxt+=" xmlns:xnat=\"http://nrg.wustl.edu/xnat\"";
		xmlTxt+=" xmlns:xnat_a=\"http://nrg.wustl.edu/xnat_assessments\"";
		xmlTxt+=" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
		xmlTxt+=">";
		xmlTxt+=this.getXMLBody(preventComments)
		xmlTxt+="\n</ais:xcpSessionData>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = this.extension.getXMLAtts();
		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.ImageResolution!=null){
			xmlTxt+="\n<ais:image_resolution";
			xmlTxt+=">";
			xmlTxt+=this.ImageResolution;
			xmlTxt+="</ais:image_resolution>";
		}
		else{
			xmlTxt+="\n<ais:image_resolution";
			xmlTxt+="/>";
		}

		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.ImageResolution!=null) return true;
		return true;//REQUIRED image_resolution
	}
}
