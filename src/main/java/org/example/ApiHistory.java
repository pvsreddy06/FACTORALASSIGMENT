
package org.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "api_history")
public class ApiHistory {

    @Id
    private String id;

    private String operation;
    private String input;
    private String result;
    private LocalDateTime createdAt;

    public ApiHistory() {
    }

    public ApiHistory(String operation, String input, String result) {
        this.operation = operation;
        this.input = input;
        this.result = result;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() { return id; }
    public String getOperation() { return operation; }
    public String getInput() { return input; }
    public String getResult() { return result; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
