package com.ptit.customproperties.exception;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class UrlNotAccessFailAnalyser extends AbstractFailureAnalyzer<UrlAccessException> {


    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, UrlAccessException cause) {
        return new FailureAnalysis("URL is not accessible"+ cause.getUrl(),"Ensure the URL it is accessible",cause);

    }
}
