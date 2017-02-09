package hello;

/**
 * Created by tanzeelrana on 2/2/2017.
 */

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface  AddressBookRepository extends PagingAndSortingRepository<AddressBook, Long>{
    List<AddressBook> findById(@Param("id") String id);
}
