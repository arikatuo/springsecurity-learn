package com.hy.security.util;

/**
 * Created by sumimasah on 2017/12/28.
 */
public interface UrlMatcher {
    Object compile(String paramString);

    boolean pathMatchesUrl(Object paramObject, String paramString);

    String getUniversalMatchPattern();

    boolean requiresLowerCaseUrl();
}
