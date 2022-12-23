package com.zenika.pipedrive.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.StringReader;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PipedriveNotificationHandlerTest {
	String validRawJson = """
					{
						"meta": {"host": "test.pipedrive.com","object": "deal"},
						"current": {
							"id": 456123,
							"pipeline_id": 2,
							"amt_datalink": "5454",
							"org_id": 123
						}
					}
			""";

	@Inject
	private PipedriveNotificationHandler handler;

	@Test
	public void testConstruction() {
		handler.handle(new StringReader(validRawJson));
	}

	@Test
	public void testValidatingTheNotification() {
		// Given the valid notification
		// When
		PipedriveTrainingDealJob job = handler.handle(new StringReader(validRawJson));
		// Then
		assertThat(job.needsProcessing, is(true));
	}

	@Test
	public void whenOrgIsMissingDoNotProcess() {
		// Given
		String notif = """
				{"current": {"pipeline_id": 2}}
				""";
		// When
		PipedriveTrainingDealJob job = handler.handle(new StringReader(notif));

		// Then
		assertThat(job.needsProcessing, is(false));
	}

	@Test
	public void whenAMTandCTareAlreadyPresent() {
		// Given
		String notif = """
				{"current": {"pipeline_id": 2, "org_id": 1, "amt_datalink": 32,"ct_datalink": 123 }}
				""";
		// When
		PipedriveTrainingDealJob job = handler.handle(new StringReader(notif));

		// Then
		assertThat(job.needsProcessing, is(false));
	}

}
