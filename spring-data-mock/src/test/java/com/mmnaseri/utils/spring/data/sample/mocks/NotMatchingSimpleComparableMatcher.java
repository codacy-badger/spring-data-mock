package com.mmnaseri.utils.spring.data.sample.mocks;

import com.mmnaseri.utils.spring.data.domain.impl.matchers.AbstractSimpleComparableMatcher;

/**
 * @author Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (4/12/16, 7:00 PM)
 */
public class NotMatchingSimpleComparableMatcher extends AbstractSimpleComparableMatcher {

    @Override
    protected boolean matches(Comparable actual, Comparable pivot) {
        return false;
    }

}
