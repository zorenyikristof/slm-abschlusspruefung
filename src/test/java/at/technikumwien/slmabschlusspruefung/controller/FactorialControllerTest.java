package at.technikumwien.slmabschlusspruefung.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialControllerTest {

    @Test
    void getInitialTotal() {
        FactorialController controller = new FactorialController();
        //Arrange


        //Act
        int result = controller.getTotalFactorial();

        //Assert
        assertEquals(0,result);
    }
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

    @Test
    void getTotal() {
        FactorialController controller = new FactorialController();
        //Arrange
        controller.getFactorial(5);
        controller.getFactorial(4);
        //Act
        int result = controller.getTotalFactorial();

        //Assert
        assertEquals(144,result);
    }
}