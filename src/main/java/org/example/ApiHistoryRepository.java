
package org.example;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApiHistoryRepository
        extends MongoRepository<ApiHistory, String> {
}
