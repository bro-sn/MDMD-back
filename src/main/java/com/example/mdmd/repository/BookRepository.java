//package com.example.mdmd.repository;
//
//public class UserRepository {
//}

package com.example.mdmd.repository;

import com.example.mdmd.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
