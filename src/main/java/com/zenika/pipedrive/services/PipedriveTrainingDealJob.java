package com.zenika.pipedrive.services;

import com.zenika.pipedrive.pojo.PipedriveNotification;

public class PipedriveTrainingDealJob {
	public PipedriveNotification notification;
	public Boolean needsProcessing;

	public PipedriveTrainingDealJob(PipedriveNotification notification, Boolean needsProcessing) {
		this.notification = notification;
		this.needsProcessing = needsProcessing;
	}

}
