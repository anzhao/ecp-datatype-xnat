/*
 * GENERATED FILE
 * Created on Fri Sep 22 16:32:18 ACST 2023
 *
 */
package org.nrg.xdat.turbine.modules.screens;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.modules.screens.SecureReport;
import org.nrg.xdat.XDAT;
import org.nrg.xdat.model.XnatExperimentdataShareI;
import org.nrg.xdat.security.helpers.Permissions;
import java.util.List;

/**
 * @author XDAT
 *
 */
public class XDATScreen_report_ais_miSessionData extends SecureReport {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_report_ais_miSessionData.class);
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void finalProcessing(RunData data, Context context) {
		try{
			org.nrg.xdat.om.AisMisessiondata om = new org.nrg.xdat.om.AisMisessiondata(item);
			context.put("om",om);
			System.out.println("Loaded om object (org.nrg.xdat.om.AisMisessiondata) as context parameter 'om'.");
			context.put("subject",om.getSubjectData());
			System.out.println("Loaded subject object (org.nrg.xdat.om.XnatSubjectdata) as context parameter 'subject'.");
			if(context.get("project")==null) {
				String proj = om.getProject();
				if (!Permissions.canReadProject(XDAT.getUserDetails(), proj)) {
					// If user cannot read that project, look through the projects that session is shared into. If user
					// can view the data in one of those projects they should view this session from that project's context.
					List<XnatExperimentdataShareI> list = om.getSharing_share();
					for (XnatExperimentdataShareI exptShare : list) {
						if (Permissions.canReadProject(XDAT.getUserDetails(), exptShare.getProject())) {
							proj = exptShare.getProject();
							break;
						}
					}
				}
				context.put("project", proj);
			}
		} catch(Exception e){}
	}}
