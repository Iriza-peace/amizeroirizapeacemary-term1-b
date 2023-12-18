package rca.devopsexam.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import rca.devopsexam.v1.dtos.DoMathRequestDto;
import rca.devopsexam.v1.exceptions.InvalidOperationException;
import rca.devopsexam.v1.serviceImpls.MathOperatorImpl;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @Mock
    private MathOperatorImpl mathOperatorService;

    @Test
    public void should_create_math_operation_success() throws InvalidOperationException {
        double operator1 = 20;
        double operator2 = 9;
        String operation = "+";
        double expectedResult = 29.0;


        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    //added subtraction
    @Test
    public void should_subtract_numbers_success() throws InvalidOperationException {
        double operator1 = 20;
        double operator2 = 9;
        String operation = "-";
        double expectedResult = 11.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    //added division
    public void should_divide_numbers_success() throws InvalidOperationException {
        double operator1 = 15;
        double operator2 = 3;
        String operation = "/";
        double expectedResult = 5.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    @Test
    public void should_multiply_numbers_success() throws InvalidOperationException {
        double operator1 = 5;
        double operator2 = 7;
        String operation = "*";
        double expectedResult = 35.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }

}