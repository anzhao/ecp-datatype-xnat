/*
 * GENERATED FILE
 * Created on Fri Sep 22 16:32:18 ACST 2023
 *
 */
package org.nrg.xdat.turbine.modules.screens;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.utils.TurbineUtils;
import org.nrg.xft.ItemI;
import org.nrg.xft.XFTItem;

/**
 * @author XDAT
 *
 */
public class XDATScreen_edit_ais_miSessionData extends org.nrg.xnat.turbine.modules.screens.EditSubjectAssessorScreen {
	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_edit_ais_miSessionData.class);
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.EditScreenA#getElementName()
	 */
	public String getElementName() {
	    return "xnat:xcpSessionData";
	}
	
	public ItemI getEmptyItem(RunData data) throws Exception
	{
		return super.getEmptyItem(data);
	}
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void finalProcessing(RunData data, Context context) {
		super.finalProcessing(data,context);
	}}
