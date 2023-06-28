package at.technikumwien.slmabschlusspruefung.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialControllerTest {

    @Test
    void getFactorial() {
        FactorialController controller = new FactorialController();
        //Arrange
        int number = 5;

        //Act
        int result = controller.getFactorial(number);

        //Assert
        assertEquals(120,result);
    }

    @Test
    void getFactorialFour() {
        FactorialController controller = new FactorialController();
        //Arrange
        int number = 4;

        //Act
        int result = controller.getFactorial(number);

        //Assert
        assertEquals(24,result);
    }

}