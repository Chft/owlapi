package org.semanticweb.owlapi.model;

import javax.annotation.Nonnull;

/** Convert to OWLNamedIndividual interface. */
public interface AsOWLNamedIndividual {

    /**
     * A convenience method that determines if this entity is an
     * OWLNamedIndividual.
     * 
     * @return {@code true} if this entity is an OWLNamedIndividual, otherwise
     *         {@code false}
     */
    default boolean isOWLNamedIndividual() {
        return false;
    }

    /**
     * A convenience method that obtains this entity as an OWLNamedIndividual
     * (in order to avoid explicit casting).
     * 
     * @return The entity as an OWLNamedIndividual.
     * @throws OWLRuntimeException
     *         if this entity is not an OWLIndividual (check with the
     *         isOWLIndividual method first).
     */
    @Nonnull
    default OWLNamedIndividual asOWLNamedIndividual() {
        throw new ClassCastException(getClass().getName()
                + "is not an OWLNamedIndividual");
    }
}