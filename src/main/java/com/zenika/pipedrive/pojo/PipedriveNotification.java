package com.zenika.pipedrive.pojo;

import java.util.HashMap;

/**
 * PipedriveNotification
 */
public class PipedriveNotification {
	public Meta meta;
	public HashMap<String, String> current;

	public class Meta {
		public String host;
		public String object;
	}

}