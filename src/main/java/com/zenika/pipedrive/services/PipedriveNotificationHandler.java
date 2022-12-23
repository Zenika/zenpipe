package com.zenika.pipedrive.services;

import static com.zenika.pipedrive.config.PipedriveConfigProperties.DEAL_FIELD_DATALINK_AMT_ID;
import static com.zenika.pipedrive.config.PipedriveConfigProperties.DEAL_FIELD_DATALINK_CT_ID;

import java.io.Reader;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.google.gson.Gson;
import com.zenika.pipedrive.pojo.PipedriveNotification;

@ApplicationScoped
public class PipedriveNotificationHandler {

	@ConfigProperty(name = DEAL_FIELD_DATALINK_AMT_ID)
	String dealAmtDatalink;

	@ConfigProperty(name = DEAL_FIELD_DATALINK_CT_ID)
	String dealCtDatalink;

	public PipedriveTrainingDealJob handle(Reader httpRequest) {
		PipedriveNotification notification = new Gson().fromJson(httpRequest, PipedriveNotification.class);
		Boolean needsProcessing = notification.current.get("org_id") != null
				&& !(notification.current.get(dealAmtDatalink.toString()) != null
						&& notification.current.get(dealCtDatalink.toString()) != null);

		return new PipedriveTrainingDealJob(notification, needsProcessing);
	}

}
