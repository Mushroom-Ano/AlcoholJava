package com.drink.alcohol;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class AlcoholParameterResolver implements ParameterResolver {

    //    Determine if this resolver supports resolution of an argument for the Parameter in the supplied ParameterContext for the supplied ExtensionContext
    //    supportsParameter() – returns true if the parameter’s type is supported (BankAccount in this example)
        @Override
        public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return parameterContext.getParameter().getType() == Alcohol.class;
        }

    //    Resolve an argument for the Parameter in the supplied ParameterContext for the supplied ExtensionContext
    //    resolveParameter() – serves up an object of the correct type (a new BankAccount instance in this example),
    //    which will then be injected into your test method
        @Override
        public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return new Alcohol("name",0f,0f,0f, false, "brand" );
        }
    }
