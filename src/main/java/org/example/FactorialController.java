
package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigInteger;
import java.util.Map;

@RestController
@RequestMapping("/api/math")
public class FactorialController {

    @GetMapping("/factorial/{n}")
    public Map<String, String> factorial(@PathVariable int n) {

        if (n < 0 || n > 1000) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Enter a number between 0 and 1000");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return Map.of(
                "operation", "FACTORIAL",
                "input", String.valueOf(n),
                "result", result.toString(),
                "message", "Success"
        );
    }
}
