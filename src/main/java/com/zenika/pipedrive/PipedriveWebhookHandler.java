package com.zenika.pipedrive;

import java.io.Writer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.zenika.pipedrive.services.PipedriveNotificationHandler;
import com.zenika.pipedrive.services.PipedriveTrainingDealJob;

@ApplicationScoped
public class PipedriveWebhookHandler implements HttpFunction {

    @Inject
    PipedriveNotificationHandler handler;

    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
        PipedriveTrainingDealJob job = handler.handle(httpRequest.getReader());
        Writer writer = httpResponse.getWriter();
        writer.write("Is processable ? " + job.needsProcessing);
    }
}