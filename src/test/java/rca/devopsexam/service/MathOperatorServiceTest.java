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
        double operator1 = 4;
        double operator2 = 9;
        String operation = "+";
        double expectedResult = 13.0; // Replace this with the expected result of the operation

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
}