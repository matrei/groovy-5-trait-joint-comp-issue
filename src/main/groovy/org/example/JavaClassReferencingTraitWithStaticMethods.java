package org.example;

public class JavaClassReferencingTraitWithStaticMethods {

    public boolean isValid(Class<?> javaClass) {
        return TraitWithStaticMethods.class.isAssignableFrom(javaClass);
    }
}
