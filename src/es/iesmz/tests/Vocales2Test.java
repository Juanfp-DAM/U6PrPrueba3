package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @org.junit.jupiter.api.Test
    void sinVocales() {
        //ARRANGE
        String hola="Hola Mundo";
        //ACT
        String holaSinVocales=Vocales2.sinVocales(hola);
        //ASSERT
        assertEquals("Hl Mnd", holaSinVocales);
    }

    
}