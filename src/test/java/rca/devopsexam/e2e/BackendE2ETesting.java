package rca.devopsexam.e2e;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import rca.devopsexam.v1.dtos.DoMathRequestDto;
import rca.devopsexam.v1.payload.ApiResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackendE2ETesting {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDoMathOperation_E2E() {
        // Given
        DoMathRequestDto dto = new DoMathRequestDto(2, 5, "+");

        // When
        ResponseEntity<ApiResponse> response = restTemplate.postForEntity("/api/v1/do_math", dto, ApiResponse.class);

        // Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(true, response.getBody().getSuccess());
        assertEquals("Success", response.getBody().getMessage());
        assertEquals(7.0, response.getBody().getData()); // Adjust based on your actual response structure
    }
    }
