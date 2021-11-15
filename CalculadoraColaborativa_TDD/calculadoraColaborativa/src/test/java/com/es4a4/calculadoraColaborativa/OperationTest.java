package com.es4a4.calculadoraColaborativa;

import static org.junit.Assert.assertEquals;

import com.es4a4.calculadoraColaborativa.services.Operations;
import org.junit.Test;

public class OperationTest {

    @Test
    public void testarRaiz() {
        assertEquals(5, Operations.raiz(25), 0.1);
    }
}
